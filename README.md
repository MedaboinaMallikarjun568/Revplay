# RevPlay -- Console-Based Music Streaming Application

RevPlay is a Java console application that simulates the core experience
of a music streaming platform. It allows listeners to discover music,
manage playlists and favourites, and simulate playback. It also supports
artist accounts for managing artist profiles and music content.

## Project Overview

The application is designed with a modular structure to separate user,
artist, music-library, playlist, and playback-related operations. MySQL
is used to persist application data, with JDBC handling database
connectivity and SQL operations.

## Features

### Listener Features

-   Register and log in to an account.
-   Search songs, artists, albums, playlists, and podcasts using
    keywords.
-   Browse music by categories such as genre, artist, and album.
-   Mark songs as favourites and view the favourites list.
-   Create and manage private or public playlists.
-   Add songs to playlists and remove songs from playlists.
-   Update playlist details, including name, description, and privacy
    settings.
-   View public playlists created by other users.
-   View recently played songs and listening history.
-   Simulate music playback with play, pause, skip, and repeat controls.

### Artist Features

-   Register and log in as an artist.
-   Create and manage an artist profile, including biography, genre, and
    social links.
-   Upload and manage songs with relevant details.
-   Create albums and associate songs with albums.
-   Update or delete songs and albums.
-   View song play counts and basic engagement statistics.
-   See which users have added songs to their favourites.

## Technology Stack

| Category | Technology |
|---|---|
| Programming Language | Java |
| Database | MySQL |
| Database Connectivity | JDBC |
| Testing Framework | JUnit |
| Logging | Log4j |
| Version Control | Git |
| IDE | Eclipse (if used) |

## Application Modules

-   **Authentication:** Listener and artist registration and login.
-   **Music discovery:** Search and browse music-related content.
-   **Library management:** Manage songs, artists, albums, and podcasts.
-   **Playlist management:** Create, update, and maintain playlists.
-   **Favourites:** Save and manage favourite songs.
-   **Playback simulation:** Simulate basic music-player controls.
-   **Listening history:** Track recently played songs and listening
    activity.
-   **Artist management:** Maintain artist profiles, songs, albums, and
    statistics.

## Getting Started

### Prerequisites

Install the following before running the application:

-   Java Development Kit (JDK)
-   MySQL Server
-   Git
-   An IDE or Java development environment

### Setup

1.  Clone the repository:

    ``` bash
    git clone <YOUR_GITHUB_REPOSITORY_URL>
    cd <YOUR_REPOSITORY_DIRECTORY>
    ```

2.  Create a MySQL database for the application.

3.  Execute the database schema and any required SQL scripts included in
    the repository.

4.  Update the JDBC connection settings in the application's database
    configuration with your local MySQL URL, username, and password.

5.  Configure the required dependencies, including the MySQL JDBC
    driver, JUnit, and Log4j, using the project's existing build or
    dependency setup.

6.  Run the application's main class from your IDE or using the
    build/run instructions configured in the repository.

> **Configuration note:** Update this section with the actual database
> name, SQL script path, configuration file, main class, and exact run
> command used by this repository. Do not commit database passwords or
> other secrets.

## Testing

JUnit is used for unit testing. Run the tests using the test runner or
build command configured in the repository.


## Repository Structure

```text
Revplay/
├── .settings/
├── bin/
│   └── com/revplay/
├── src/
│   └── com/revplay/
├── .classpath
├── .project
├── Architecture revplay.png
└── README.md
```

## Application Architecture

![RevPlay Console Architecture](revplay-architecture.png)

## Project Scope

RevPlay is a console-based application. Playback controls simulate
music-player behavior; this project description does not claim
production audio streaming.

## Future Enhancements

-   Add a graphical or web-based user interface.
-   Introduce a dedicated audio playback integration.
-   Expand automated test coverage.
-   Add more detailed reporting and analytics.

## Author

**Medaboina Mallikarjuna**

Java Developer

------------------------------------------------------------------------

*Before publishing, verify that the feature list, folder structure,
database scripts, and run instructions match the current contents of
this repository.*

