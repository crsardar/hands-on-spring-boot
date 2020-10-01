-- This file will be executed by SpringBoot, if it find any DB in it's class path
CREATE TABLE jdbc_person (id INT, name VARCHAR(255), dob TIMESTAMP, primary key (id));
INSERT INTO jdbc_person (id, name, dob) values (10001, 'Ganesh', sysdate());
INSERT INTO jdbc_person (id, name, dob) values (10002, 'Brambha', sysdate());
INSERT INTO jdbc_person (id, name, dob) values (10003, 'Bisnu', sysdate());
INSERT INTO jdbc_person (id, name, dob) values (10004, 'Maheswar', sysdate());
INSERT INTO jdbc_person (id, name, dob) values (10005, 'Kali', sysdate());
-- Course
INSERT INTO Course (id, name) values (11001, 'JPA Courses.');
INSERT INTO Course (id, name) values (11002, 'SpringBoot Courses.');
INSERT INTO Course (id, name) values (11003, 'Spring Courses.');
INSERT INTO Course (id, name) values (11004, 'Java Courses.');
INSERT INTO Course (id, name) values (11005, 'NodeJS Courses.');