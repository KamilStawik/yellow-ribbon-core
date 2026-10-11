# Yellow Ribbon Core

Backend application for matching patients with psychotherapists.

## Requirements

- JDK 25
- Apache Maven 3.6.3 or newer

## Run

Start PostgreSQL in Docker:

```shell
docker compose up -d
```

Then start the application:

```shell
mvn spring-boot:run
```

The application starts on `http://localhost:8080`. A basic health endpoint is available at
`GET /api/health`. All appointments are available at `GET /api/appointments`.

Flyway creates the initial `users`, `customers`, and `appointments` tables on startup. The default
database credentials are intended for local development and can be overridden with `DB_HOST`,
`DB_PORT`, `DB_NAME`, `DB_USER`, and `DB_PASSWORD` environment variables.

## Validate style

```shell
mvn validate
```

## Package

```shell
mvn package
```

Hibernate schema generation is set to `validate`; use Flyway migrations for schema changes.
