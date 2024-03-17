CREATE TABLE wizard
(
    id     SERIAL PRIMARY KEY,
    name   VARCHAR(255) NOT NULL,
    gender CHAR(1) CHECK (gender IN ('M', 'F')),                   -- Enforces gender to be 'M' or 'F'
    role   VARCHAR(20) CHECK (role IN ('Teacher', 'Student', '')), -- Enforces role or leave blank
    -- You can add more columns for details like house, blood status, etc.
);
