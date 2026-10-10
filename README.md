# Yellow Ribbon Core

Backend application for matching patients with psychotherapists.

## Requirements

- JDK 25
- Apache Maven 3.6.3 or newer

## Run

```shell
mvn spring-boot:run
```

The application starts on `http://localhost:8080`. A basic health endpoint is available at
`GET /api/health`.

## Validate style

```shell
mvn validate
```

## Package

```shell
mvn package
```

The in-memory H2 database is configured for local development. Hibernate schema generation is set to
`validate`; add entity mappings and migrations before persisting domain data.
