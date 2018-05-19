# WeatherDemo

WeatherDemo is a demo project demonstrating skills in frontend and backend programming. This is the backend part, 
the frontend can be found [here](https://github.com/jhameenaho/weather-demo-backend).

### General info

These instructions will get you a copy of the project up and running on your local machine. There are separate frontend and backend.
The back end is an RESTful API.

### Prerequisites
*  Java 8

### Installation

In command line navigate to the respective directory. Now just simply start it:

```
$ mvn spring-boot:run
```

Backend should be responding at http://localhost:8080/ after a while.

##### Usage

Without logging in you can just search for weather info.
There are two users: user1//user1 and user2//user2
As a logged in user you can add a queried weather info to favourites, re-query it, and delete it.
Nothing is stored in local storage nor in a in-memory database so refreshing the page loses all data, 
therefore logging user out.

### TODO

- General improvements to the code
- Proper error handling
- Tests

### Built With

* [Spring Boot](https://projects.spring.io/spring-boot/)

### License

This project is licensed under the MIT License.