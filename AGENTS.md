# Project instructions

## Stack and layout

- Use Java 25, Spring Boot, Maven, PostgreSQL, and JPA/Hibernate as configured in `pom.xml`.
- Keep application code under `pl.yellowribbon.core` and use the existing layer packages: `controllers`,
  `services`, `repositories`, `entities`, `dto`, `mappers`, `config`, and `exceptions`.
- Keep HTTP handling in controllers, business operations in services, persistence queries in Spring Data repositories,
  and API contracts in DTOs.
- Use constructor injection for Spring dependencies.

## Date and time

- Every date-time value in the application and API must include a UTC offset. Use `OffsetDateTime` for date-time
  fields; do not use `LocalDateTime` for persisted or API date-times.
- Persist offset-aware date-times in PostgreSQL as `TIMESTAMP WITH TIME ZONE`.
- Accept and return ISO 8601 date-time values with an explicit offset, for example `2026-10-11T14:30:00Z` or
  `2026-10-11T16:30:00+02:00`.
- PostgreSQL `TIMESTAMP WITH TIME ZONE` stores the instant, not the original named time zone. Do not assume a zone
  such as `Europe/Warsaw` can be recovered after persistence.

## Persistence and mapping

- Model persisted data as JPA entities. Use UUID primary keys and Lombok `@Getter` / `@Setter` for entity accessors.
- Do not return JPA entities directly from HTTP endpoints. Define response DTOs and map entity data with MapStruct
  mappers registered as Spring beans (`componentModel = "spring"`).
- Add schema changes as new, versioned Flyway migrations under `src/main/resources/db/migration`.
  Treat applied migrations as immutable; add a follow-up migration instead of editing an existing one.
- Keep Hibernate schema generation set to `validate`; Flyway owns database schema creation and updates.
- Use the PostgreSQL service in `compose.yaml` for local development. Read connection settings from the environment
  as configured in `application.yml`.

## Java style

- Follow `config/checkstyle/checkstyle.xml`: Java lines are at most 120 characters, avoid wildcard imports, and use
  braces and whitespace consistently.
- Keep imports explicit; do not use star imports.

## Workspace architecture

- The parent yellow-ribbon directory contains three separate repositories: yellow-ribbon-core is the backend for the application, yellow-ribbon-back-office is the frontend for managing appointments and therapists, and yellow-ribbon-ui is the frontend patients use to book appointments.
- Treat this repository as the backend source of truth for server-side behavior and API contracts.
- Keep changes scoped to the repository relevant to the task. Coordinate API contract changes with both frontend repositories when a task spans the full application.
