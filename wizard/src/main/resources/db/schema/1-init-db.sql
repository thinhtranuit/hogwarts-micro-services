CREATE TABLE wizard
(
    id     SERIAL PRIMARY KEY,
    name   VARCHAR(255) NOT NULL,
    gender CHAR(6) CHECK (gender IN ('MALE', 'FEMALE')),                   -- Enforces gender to be 'M' or 'F'
    role   VARCHAR(7) CHECK (role IN ('TEACHER', 'STUDENT', '')) -- Enforces role or leave blank
    -- You can add more columns for details like house, blood status, etc.
);
