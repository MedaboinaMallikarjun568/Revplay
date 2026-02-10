package com.revplay.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music {
	private Player player;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	 private String filePath;
	    private long pauseLocation;
	    private long songLength;
	    private boolean paused = false;


	    private boolean repeat = false;

	    public Music(String filePath) {
	        this.filePath = filePath;
	    }

	    public void play() {
	        try {
	            if (paused) {
	                resume();
	                paused = false;
	                return;
	            }

	            fis = new FileInputStream(filePath);
	            bis = new BufferedInputStream(fis);
	            songLength = fis.available();
	            player = new Player(bis);

	            new Thread(() -> {
	                try {
	                    player.play();
	                    if (repeat) play();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                    System.err.println(e.getMessage());
	                }
	            }).start();

	        } catch (Exception e) {
	            e.printStackTrace();
	            System.err.println(e.getMessage());
	        }
	    }


	    public void pause() {
	        try {
	            pauseLocation = fis.available();
	            player.close();
	            paused = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.err.println(e.getMessage());
	        }
	    }

	    public void resume() {
	        try {
	            fis = new FileInputStream(filePath);
	            bis = new BufferedInputStream(fis);
	            player = new Player(bis);
	            fis.skip(songLength - pauseLocation);

	            new Thread(() -> {
	                try {
	                    player.play();
	                    if (repeat) play();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                    System.err.println(e.getMessage());
	                }
	            }).start();

	        } catch (Exception e) {
	            e.printStackTrace();
	            System.err.println(e.getMessage());
	        }
	    }

	    public void stop() {
	        repeat = false;
	        paused = false;
	        if (player != null) player.close();
	    }


	    public void repeat(boolean value) {
	        this.repeat = value;
	    }

}
