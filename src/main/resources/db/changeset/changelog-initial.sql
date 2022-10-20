-- liquibase formatted sql

-- changeset VoodooChild:1666284787646-1
CREATE SEQUENCE IF NOT EXISTS "hibernate_sequence" AS bigint START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1;

-- changeset VoodooChild:1666284787646-2
CREATE TABLE IF NOT EXISTS "same_data"
(
    "id"            BIGINT NOT NULL,
    "creation_date" TIMESTAMP WITHOUT TIME ZONE,
    "text"          VARCHAR(255),
    CONSTRAINT "same_data_pkey" PRIMARY KEY ("id")
);


