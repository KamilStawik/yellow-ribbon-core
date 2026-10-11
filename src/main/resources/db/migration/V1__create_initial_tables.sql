CREATE TABLE users (
    uuid UUID PRIMARY KEY,
    "firstName" VARCHAR(100) NOT NULL,
    "lastName" VARCHAR(100) NOT NULL
);

CREATE TABLE customers (
    uuid UUID PRIMARY KEY,
    "firstName" VARCHAR(100) NOT NULL,
    "lastName" VARCHAR(100) NOT NULL
);

CREATE TABLE appointments (
    uuid UUID PRIMARY KEY,
    "userUuid" UUID NOT NULL REFERENCES users (uuid),
    "customerUuid" UUID NOT NULL REFERENCES customers (uuid),
    "date" TIMESTAMP NOT NULL
);
