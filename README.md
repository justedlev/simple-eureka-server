<div id="header" align="center">
    <h1>Simple Eureka Server</h1>
    <h3>🚚 Service Discovery</h3>
</div>

<div id="badges" align="center">

[![language](https://img.shields.io/badge/Java%2017-e6892e.svg?logo=openjdk&logoColor=white)](https://github.com/justedlev/simple-eureka-server)
[![framework](https://img.shields.io/badge/Spring%20Boot%203-6DB33F.svg?logo=springboot&logoColor=white)](https://docs.spring.io/spring-boot/index.html)
[![Docker Image Version](https://img.shields.io/docker/v/justedlev/simple-eureka-server?logo=docker&label=simple-eureka-server)](https://hub.docker.com/repository/docker/justedlev/simple-eureka-server)
[![license](https://img.shields.io/github/license/justedlev/simple-eureka-server)](https://www.apache.org/licenses/LICENSE-2.0.txt)
[![stars](https://img.shields.io/github/stars/justedlev/simple-eureka-server)](https://github.com/justedlev/simple-eureka-server/star)
[![issues](https://img.shields.io/github/issues/justedlev/simple-eureka-server)](https://github.com/justedlev/simple-eureka-server/issues)

</div>

## 📋 About

__Simple Eureka Server__ it's a secure `Service Discovery` for easy launch and using, based on the `Spring Boot 3` and
`Eureka Server`.

## ▶️ Run

### 🛠️ Intellij

To run the app you can use simple run configuration, that based on [.env](.env)
and [jvm options](.vmoptions)

```xml
<component name="ProjectRunConfigurationManager">
  <configuration default="false" name="Default" type="SpringBootApplicationConfigurationType" factoryName="Spring Boot">
    <option name="envFilePaths">
      <option value="$PROJECT_DIR$/.env" />
    </option>
    <module name="simple-eureka-server" />
    <selectedOptions>
      <option name="environmentVariables" />
    </selectedOptions>
    <option name="SPRING_BOOT_MAIN_CLASS" value="io.justedlev.msrv.ssr.SimpleEurekaServerApplication" />
    <option name="VM_PARAMETERS" value="@.vmoptions" />
    <method v="2">
      <option name="Make" enabled="true" />
    </method>
  </configuration>
</component>

```

### 🚢 Docker

I have a repository on [Docker Hub](https://hub.docker.com/repository/docker/justedlev/simple-eureka-server/general)

### 🗂️ Docker compose

Simple command to run the container: `docker compose up -d --build`

The full compose.yaml that I personally use with the [.env](.env)

```yaml
name: justedlev-msrv
services:
  service-registry:
    container_name: ${SPRING_APPLICATION_NAME}
    image: justedlev/simple-eureka-server:latest
    build:
      context: docs
    env_file:
      - .env
    ports:
      - "8761:${SERVER_PORT}"
    healthcheck:
      interval: 5s
      timeout: 3s
      test: [ "CMD", "curl", "-f", "http://localhost:${SERVER_PORT}/actuator/health", "||", "exit 1" ]
    volumes:
      - ./logs:${LOGGING_FILE_PATH}
```
