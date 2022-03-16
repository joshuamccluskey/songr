# songr

## Songr

### Contributor: Joshua McCluskey

### Implementation

- Please adjust postgres url, username, password to access your local database on the following link [Postgres Properties](src/main/resources/application.properties)
- Build and run app from root songr/ on IDE or using the following in the command line/ terminal
- See link and run from the file [Run App from this file in IDE](src/main/java/com/joshuamccluskey/songr/SongrApplication.java)
- Link to browser [See App in Browser](http://localhost:8080/)
- For integration testing, run command Line/terminal  : `./gradlew test`
- For build, input in command Line/terminal : `./gradle build`
- To run app, input in command line/terminal: `./gradle bootRun`
- Click on "See Albums" link or click image on splash page or click the following link [Albums Page](http://localhost:8080/albums)


### Overview:
- Files:
- [HelloWorldCOntoller](src/main/java/com/joshuamccluskey/songr/controller/HelloWorldController.java)
- [CapitalizeController](src/main/java/com/joshuamccluskey/songr/controller/CapitalizeController.java)
- [SplashController](src/main/java/com/joshuamccluskey/songr/controller/SplashController.java)
- [Hello World HTML](src/main/resources/templates/hello-world.html)
- [Capitalize HTML](src/main/resources/templates/capitalize-words.html)
- [Index Splash HTML](src/main/resources/templates/index.html)


Created Spring app that contains a page for hello world. You can add words after /capitalize/example words route and it 
it will capitalize all the words EXAMPLE WORDS on the page. Splash Page is styled with CSS. Album class and objects properties
defined. # albums were created.



### Methods:

- albumsGenerator(): creates albums route and generates 3 hard coded instances of album. Gets HTML template for albums
- capitalize(): creates capitalize route and capitalizes all words in pathname. Gets HTML template for capitalize
- helloWorld(): creates hello route and displays Hello World! Gets HTML template for hello
- splashPageController(): gets HTML template for splash page

Work Time: 5 Hours

## Spring RESTful Routing

## Songr Day 2

### Contributor: Joshua McCluskey

### Overview:

- Files
- [AlbumController](src/main/java/com/joshuamccluskey/songr/controller/AlbumController.java)
- [Album Model](src/main/java/com/joshuamccluskey/songr/model/Album.java)
- [AlbumRepository](src/main/java/com/joshuamccluskey/songr/repository/AlbumRepository.java)
- [Albums HTML](src/main/resources/templates/albums.html)


Be able to create albums with a form and display the albums on the site. The form will post it into the database and the album cover
and info displays to the user in order that they were entered. This is an example of setting PostgreSQL Database and 
posting and persisting data/


### Methods
- albumsGenerator(): integrates with album repository creates attribute
to be used in albums template.

- addAlbum(): creates an album and refreshes albums page updating with new album information 
Form uses this method to save album data to postgreSQL database and render information on albums page.

Album findById(long id): Repo method that allows us to fing the album by its unique ID

Work Time: 7 Hours

## Related Resources and Integration Testing

## Songr Day 3

### Contributor: Joshua McCluskey

### Overview:
- Files
- [SongController file](src/main/java/com/joshuamccluskey/songr/controller/SongController.java)
- [SongModel File](src/main/java/com/joshuamccluskey/songr/controller/SongController.java)
- Integration Tests
- [Integration Tests](src/test/java/com/joshuamccluskey/songr/SongrApplicationTests.java)
- [SongRepository](src/main/java/com/joshuamccluskey/songr/repository/SongRepository.java)
- [Songs HTML](src/main/resources/templates/songs.html)

Be able to create a list of songs. The user fills the form and enters the information into the database. After submission
the song is displayed to only for that album. The album songs are a display of a one to many relationship. One album can have many
songs associated with it. The integration tests were created to test various pages and strings or actual HTML depending on the page. 
 
### Testing

Integration testing: 

- testHelloWorld() - Tests for the strings Hello World and HTML for  Hello World!
- testIndexPage() - Individual Tests for the strings in the headers Welcome to Vibe and Chill
- testAlbumsPage() - Tests for the strings Albums and HTML for  Albums!
- testSongsPage() - Tests for the string Song in dynamic header

- [Integration Tests](src/test/java/com/joshuamccluskey/songr/SongrApplicationTests.java)



- Completed stretch goal, add integration testing for the routes you’ve created today.
 
### Methods

- songsGenerator() : Gets the route for songs page associated by the album and its unique id. There is a form there and list of signs

- addSong(): Post a song to the database with it associated with the album it was added. It is added into database on PostgreSQL and persists.

Work Time: 3 hours


### Refactor 03/11/2022

- Fixed bug to display list of  songs for each album
- Built dynamic song header for each album
- Built integration tests for pages HelloWorld, Index Page, Albums Page
- Overhauled README File with implementation instructions and links to all files

Work Time: 2.5 Hours

### Refactor 03/15/2022

- Troubleshoot to find and reproduce error
- Fixed bug on add Album
- Fixed error on bad running integration test causing bad test build
- Added links to go between pages
- Modified View Songs Link
- Implementation instructions include command line and IDE instructions

Work Time: 2.5 Hours