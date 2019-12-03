# Dockerized-Web-App # 

This is a sample web application written using ```open-jdk-8``` and ```spring-boot```
to understand the basic docerization of a web-application.

## Prerequisets ##

* Open-JDK-8
* Maven 3.x
* Spring Boot 2.x

## How to build and run ##

* Run following command from the project-top-level.

```bash
    mvn clean install
```

* To create the ```docker-image``` for web-application run following command from project-top-level.

```bash
    docker build --file=./docker/Dockerfile.server --tag=web-server:latest --rm=true .
```

** Note : If you are trying to include it to docker-hub use following **

```bash
    docker build --file=./docker/Dockerfile.server -t <docker-hub-user-name>/web-server:latest --rm=true .
```

```bash
    docker push <docker-hub-user-name>/web-server:latest
```

* To start the container run-following command from command-line.

```bash
    docker container run -d --name simple-web-service -p 10001:10001  web-server:latest
```

* To test whether the web-application working properly go to ```http://localhost:10001/web-app/sample``` in your 
web browser.