CREATE DATABASE communication_platform;

CREATE TABLE public.user (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INTEGER
);

INSERT INTO public.user (email, first_name, last_name, age) VALUES ('john@gmail.com', 'John', 'Fred', 25);
INSERT INTO public.user (email, first_name, last_name, age) VALUES ('frank@gmail.com', 'Frank', 'Edgar', 26);
INSERT INTO public.user (email, first_name, last_name, age) VALUES ('henry@gmail.com', 'Henry', 'Jones', 35);
INSERT INTO public.user (email, first_name, last_name, age) VALUES ('robert@gmail.com', 'Robert', 'Johnson', 33);