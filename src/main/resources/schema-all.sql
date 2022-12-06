DROP TABLE IF EXISTS coffee;

CREATE TABLE coffee
(
    coffee_id       SERIAL PRIMARY KEY,
    brand           VARCHAR(20),
    origin          VARCHAR(20),
    characteristics VARCHAR(30)
);

DROP TABLE IF EXISTS people;

CREATE TABLE people
(
    person_id  SERIAL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name  VARCHAR(20)
);

CREATE TABLE TUTORIALS
(
    tutorial_id          SERIAL PRIMARY KEY,
    tutorial_author      VARCHAR(20),
    tutorial_title       VARCHAR(50),
    submission_date      VARCHAR(20),
    tutorial_icon        VARCHAR(200),
    tutorial_description VARCHAR(1000)
);