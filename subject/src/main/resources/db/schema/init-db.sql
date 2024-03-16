CREATE TABLE subject
(
    id           SERIAL PRIMARY KEY,
    subject_name VARCHAR(255) NOT NULL,
    description  VARCHAR(255) NOT NULL,
    teacher_id   INT NOT NULL
);