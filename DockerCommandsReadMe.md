# Basic Docker commands
```
docker image ls
docker container ls
docker stop <container ID>
```
## Run docker image
```

docker run -p 9090:8080 spring-boot-docker.jar
docker run -p 9090:8080 sankethacr/spring-boot-docker.jar
docker run -p 9091:8080 jenkinsci/blueocean

docker run -p 8080:8080 -d -p 50000:50000 -v jenkins-volume:/var/jenkins_home jenkinsci/blueocean
docker run --tty --publish 8082:8080 springboot-docker-image:0.0.1-SNAPSHOT

```

## Login to Docker hub

```
docker login https://hub.docker.com/r
sankethacr
Password

```
## tag and Push to docker hub
```

docker tag <image name> <username>/<image name>
docker tag spring-boot-docker.jar sankethacr/spring-boot-docker.jar 
docker tag springboot-docker-image:0.0.1-SNAPSHOT sankethacr/springboot-docker-image:0.0.1-SNAPSHOT

docker image ls
docker push sankethacr/spring-boot-docker.jar
docker push sankethacr/springboot-docker-image

```
## Pull from docker hub
```
docker pull sankethacr/spring-boot-docker.jar

```