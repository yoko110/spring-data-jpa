CREATE TABLE IF NOT EXISTS employee (
    no INTEGER PRIMARY KEY,
    birthday DATE,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    mail_address VARCHAR(30),
    sex VARCHAR(10)
);