CREATE TABLE IF NOT EXISTS performance (
    id INT PRIMARY KEY,
    text VARCHAR NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    surname VARCHAR NOT NULL,
    name VARCHAR NOT NULL,
    middle_name VARCHAR,
    birthdate DATE NOT NULL,
    performance_id INT,
    CONSTRAINT students_fk FOREIGN KEY (performance_id)
        REFERENCES performance(id)
        ON UPDATE CASCADE
        ON DELETE SET NULL
);

INSERT INTO performance (id, text) VALUES
    (2, 'неуд'), (3, 'уд'),
    (4, 'хор'),
    (5, 'отл');

INSERT INTO students (surname, name, middle_name, birthdate, performance_id) VALUES
    ('Иванов', 'Иван', 'Иванович', '2000-08-08', 4),
    ('Петров', 'Петр', 'Олегович', '1994-04-02', 5);