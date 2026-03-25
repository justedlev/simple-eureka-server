# 📦 Changelog

All notable changes to this project will be documented in this file.

This project uses **[Conventional Commits](https://www.conventionalcommits.org/)** and is powered by **[release-please](https://github.com/googleapis/release-please)**.

## [2.1.1](https://github.com/justedlev/simple-eureka-server/compare/v2.1.0...v2.1.1) (2026-03-25)


### 🔧 CI/CD

* **release-please:** add `README.md` to `exclude-paths` ([6a527b5](https://github.com/justedlev/simple-eureka-server/commit/6a527b508e8dc088df4cb8c707ebae3c94d4f376))
* **workflow:** add `README.md` to `paths-ignore` in `workflows/release-please.yml` ([09612b8](https://github.com/justedlev/simple-eureka-server/commit/09612b8ddbbab3ea4e40794e25f4d755af1b103d))

## [2.1.0](https://github.com/justedlev/simple-eureka-server/compare/v2.0.0...v2.1.0) (2026-03-25)


### 🚀 Features

* add constants ([dd80cd1](https://github.com/justedlev/simple-eureka-server/commit/dd80cd1b1d85977e0b31d489e4f24ce54b663ef6))
* add org.springframework.boot.autoconfigure.AutoConfiguration.imports ([818da83](https://github.com/justedlev/simple-eureka-server/commit/818da831c19b063374b2d2491009709ad44551bd))
* add ServiceRegistryOAuth2ResourceServerAutoConfiguration.java ([572f228](https://github.com/justedlev/simple-eureka-server/commit/572f228b6fd6fc1139b4c175dd5b57d1ecc9374e))
* add ServiceRegistryRabbitMQAutoConfiguration.java ([4e47651](https://github.com/justedlev/simple-eureka-server/commit/4e47651f524d6cbb569144cbd61aea7932870d3b))


### 🐛 Bug Fixes

* **props:** exclude autoconfig on default profile ([c93a7ab](https://github.com/justedlev/simple-eureka-server/commit/c93a7ab43c79760f93c2f9f75fb206718c102f11))
* **props:** fix deprecated properties ([2cdbc5a](https://github.com/justedlev/simple-eureka-server/commit/2cdbc5a9ddfadb36996b794f99b5de85b379a542))
* **props:** use correct package name ([8221c1d](https://github.com/justedlev/simple-eureka-server/commit/8221c1d86f7cf50dc22fe3c1a1b6f50789d9b809))


### ♻️ Refactoring

* rename root package ([2ad0d7d](https://github.com/justedlev/simple-eureka-server/commit/2ad0d7de1943ff3f887f0d5b3c8de82b3bcc14d7))
* rename SecurityConfiguration.java to ServiceRegistrySecurityConfiguration.java ([e6b1f8f](https://github.com/justedlev/simple-eureka-server/commit/e6b1f8f3ddbdf6ea395a97b5d114bb5d09c0d5ea))
* rename SecurityProperties.java to ServiceRegistrySecurityConfigurationProperties.java ([bc9250d](https://github.com/justedlev/simple-eureka-server/commit/bc9250d4e8079d6e228b1ffd5bf59e03a970c92d))
* use ServiceRegistrySecurityConfigurationProperties.SCOPE_PREFIX constant as DEFAULT_AUTHORITY_PREFIX ([4a02039](https://github.com/justedlev/simple-eureka-server/commit/4a020399e0c0c4a9e48f2782ae377f0c2ced2d28))

## [2.0.0](https://github.com/justedlev/simple-eureka-server/compare/v1.7.0...v2.0.0) (2026-03-25)


### ⚠ BREAKING CHANGES

* **deps:** bump eclipse-temurin to 21-jdk-jammy in /docker
* bump java to 21
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies to 2025.1.1
* **deps:** bump org.springframework.boot:spring-boot-starter-parent to 4.0.4

### 🐛 Bug Fixes

* **config:** use correct imports ([9668f5c](https://github.com/justedlev/simple-eureka-server/commit/9668f5c425632139bd6d6fbf5b664e05ec3cbb04))


### ♻️ Refactoring

* **config:** method never thrown exception ([36f6e27](https://github.com/justedlev/simple-eureka-server/commit/36f6e2712a18b609648d073f0f78c10dcb26fb25))


### 🔧 CI/CD

* **gha:** update `release-please-config.json` ([205220c](https://github.com/justedlev/simple-eureka-server/commit/205220ce65415de11a0f60555bdd358c9eab533d))


### 🛠️ Build

* bump java to 21 ([7a48cf7](https://github.com/justedlev/simple-eureka-server/commit/7a48cf75e0ade1155c5df08a1a35dd383375a8cc))
* **deps:** bump eclipse-temurin to 21-jdk-jammy in /docker ([147d7bd](https://github.com/justedlev/simple-eureka-server/commit/147d7bdbeb36ce7746ad25202d4928e7a413a39d))
* **deps:** bump org.springframework.boot:spring-boot-starter-parent to 4.0.4 ([cfa68ec](https://github.com/justedlev/simple-eureka-server/commit/cfa68ec72c58fc6d60020ec06ecc601753ae8780))
* **deps:** bump org.springframework.cloud:spring-cloud-dependencies to 2025.1.1 ([395da72](https://github.com/justedlev/simple-eureka-server/commit/395da722212801bc164316932cf80c2f66c27ee5))

## [1.7.0](https://github.com/justedlev/simple-eureka-server/compare/v1.6.0...v1.7.0) (2025-08-31)


### 🚀 Features

* **config:** add ui login flow ([b85b4f8](https://github.com/justedlev/simple-eureka-server/commit/b85b4f8231f972326b3cbc0593857870785e0b56))
* **config:** extract separate `config-client` properties config ([ba2b478](https://github.com/justedlev/simple-eureka-server/commit/ba2b478c5ff87fa32eb205b27560159f4229a9c8))
* **config:** extract separate `management` profile ([bc67d1f](https://github.com/justedlev/simple-eureka-server/commit/bc67d1fe301b9f4da2e98f064b192d25356a78fa))
* **config:** extract separate `oauth2` properties config ([88c838c](https://github.com/justedlev/simple-eureka-server/commit/88c838c3283c124be0a7780f0c12c3057fb22e67))
* **config:** update `lite` prifile ([aaa7ae7](https://github.com/justedlev/simple-eureka-server/commit/aaa7ae7907f0d8d014d040d859d3ff5b1c7e6bd1))


### 🐛 Bug Fixes

* use `client_credentials` ([0e6d648](https://github.com/justedlev/simple-eureka-server/commit/0e6d6482f19de3c38b729581f3d7f9d42ca4c410))


### ♻️ Refactoring

* **config:** add default user name ([366cfc6](https://github.com/justedlev/simple-eureka-server/commit/366cfc60304e297544c481cee0c04652a1564f95))
* **config:** enable self initiation ([3145c5e](https://github.com/justedlev/simple-eureka-server/commit/3145c5e91e4d176e42c6826637e6d711efb6a2b2))
* **config:** extract property PREFIX constant ([aef3f42](https://github.com/justedlev/simple-eureka-server/commit/aef3f42d463fffaf54b774c52dd5bd9f6d1ba134))
* **config:** move config props to one main file ([f477da5](https://github.com/justedlev/simple-eureka-server/commit/f477da5718ac8968468647b4e8bebed6d15808e3))
* update SecurityConfiguration.java ([78c3fc0](https://github.com/justedlev/simple-eureka-server/commit/78c3fc0d98fb383ed0d04e670674a7bd5d516fdf))

## [1.6.0](https://github.com/justedlev/simple-eureka-server/compare/v1.5.0...v1.6.0) (2025-08-26)


### 🚀 Features

* **security:** improve security configuration ([5f8ff57](https://github.com/justedlev/simple-eureka-server/commit/5f8ff577e6ae544c5fd14560d57d680545095a9c))


### ♻️ Refactoring

* **config:** remove `javax.net.ssl` ([c4a578e](https://github.com/justedlev/simple-eureka-server/commit/c4a578ec9a14267db6dd239d07042a56adb18aa8))
* **config:** remove `logging.file` props ([7403e59](https://github.com/justedlev/simple-eureka-server/commit/7403e5977d1e25b11cbb8e8bb40d97a830f513b0))
* **config:** remove `logging.threshold` props ([34bed75](https://github.com/justedlev/simple-eureka-server/commit/34bed75cd633f63e808cbf7d6751e53ed575bf36))
* **config:** use fixed app name ([fc68b74](https://github.com/justedlev/simple-eureka-server/commit/fc68b7462a5d3d0819f4fc175b080868218f318e))

## [1.5.0](https://github.com/justedlev/simple-eureka-server/compare/v1.4.1...v1.5.0) (2025-08-17)


### 🚀 Features

* add oauth2 config ([ca0480d](https://github.com/justedlev/simple-eureka-server/commit/ca0480dd79dd96945ebb7322eaa6164c9d01f0ae))


### ♻️ Refactoring

* **config:** remove ssl config ([6993e33](https://github.com/justedlev/simple-eureka-server/commit/6993e339d818ef62dcfb1140a77246a9a59105fc))
* **config:** update `.env` ([5db8a15](https://github.com/justedlev/simple-eureka-server/commit/5db8a1578dadf970d936adf9952e7f26b3bf71d2))
* remove extra whitelist paths ([203c207](https://github.com/justedlev/simple-eureka-server/commit/203c207d0f3288aac7644f049a0ae8328b3810b8))

## [1.4.1](https://github.com/justedlev/simple-eureka-server/compare/v1.4.0...v1.4.1) (2025-05-16)


### 📚 Documentation

* add `CHANGELOG.md` ([d9f2ea2](https://github.com/justedlev/simple-eureka-server/commit/d9f2ea2a9a333ff4e04cefd2f913c348efe58f04))
* add `PULL_REQUEST_TEMPLATE.md` ([0218b34](https://github.com/justedlev/simple-eureka-server/commit/0218b34e1ba9c9c9de85e7c4b4b45c73f6528db1))
* add `SECURITY.md` ([25c71a1](https://github.com/justedlev/simple-eureka-server/commit/25c71a13bc8f260820958e8819a3a58792d91a7a))

## [Unreleased]

_Changes that are in progress but not yet released._

<!-- RELEASE PLEASE INSERT CHANGELOG HERE -->
