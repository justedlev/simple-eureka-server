<div id="header" align="center">
    <h1>Simple Eureka Server</h1>
    <h3>🚚 Service Discovery</h3>
    <div id="badges">
        <img alt="language" src="https://img.shields.io/badge/Java%2017-e6892e">
        <img alt="framework" src="https://img.shields.io/badge/Spring%20Framework%206-6cb52d">
        <img alt="framework" src="https://img.shields.io/badge/Spring%20Boot%203-6cb52d">
        <img alt="GitHub" src="https://img.shields.io/github/license/Justedlev/simple-eureka-server">
        <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/Justedlev/simple-eureka-server">
        <img alt="GitHub issues" src="https://img.shields.io/github/issues/Justedlev/simple-eureka-server">
    </div>
</div>

## 📋 About

__Simple Eureka Server__ it's a secure *Service Discovery* for easy launch and using, based on the Spring framework 6 and
eureka server.

## ▶️ Run

### 🛠️ Intellij

Clone the repository using `git clone https://github.com/Justedlev/simple-eureka-server.git` and after that run the app local,
you can use the simple [run configuration](.run%2FDefault.run.xml), that based on [.env](.env)
and [jvm options](.vmoptions)

### 🚢 Docker

I have a repository on [Docker Hub](https://hub.docker.com/repository/docker/justedlev/simple-eureka-server/general)

### 🗂️ Docker compose

Simple command to run the container: `docker compose up -d --build`

The full compose.yaml that I personally use

```yaml
name: justedlev-microservice
services:
  simple-eureka-server:
    container_name: simple-eureka-server
    image: justedlev/simple-eureka-server:1.0.0-SNAPSHOT
    build:
      context: .
    environment:
      USERNAME: "{example}"
      PASSWORD: "{example}"
    ports:
      - 8761:8761
```
