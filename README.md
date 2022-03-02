# songr

## Songr

### Contributor: Joshua McCluskey

### Overview:

- Create hello route display hello world on page
- Create capitalize route display words from path name in all caps
- Create Splash page and style with CSS
- Create Album class
- Create albums route with 3 instances of album that can be hard coded for today's lab

#### Stretch Goals
- Modify your /hello route to allow users to specify their name with a query parameter, like /hello?name=Joe, and get a custom hello message back.
- Modify your /hello route to expect a POST request instead of a GET request. Use Postman for manual testing.
- Create a route that takes in a number, and then makes a request to the Numbers API to get a fact about that number. Return the fact.
- Create a route that tells the user information about their computer. For example, it might tell them what browser they’re using, what OS they’re using, what their IP address is, and other such information. (Hint: This information is in the headers of the request that comes in to the server, so you may want to look at the request headers.)

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

- Update Album model to be saved into database
- An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
- A user should be able to see information about all the albums on the site.
- A user should be able to add albums to the site.

### Stretch Goals
- A user should be able to update information about albums on the site.
- A user should be able to delete albums on the site. 

### Methods


Work Time: TBD
