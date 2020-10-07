-- This file will be executed by SpringBoot, if it find any DB in it's class path
CREATE TABLE jdbc_person (id INT, name VARCHAR(255), dob TIMESTAMP, primary key (id));
INSERT INTO jdbc_person (id, name, dob) VALUES (10001, 'Ganesh', sysdate());
INSERT INTO jdbc_person (id, name, dob) VALUES (10002, 'Brambha', sysdate());
INSERT INTO jdbc_person (id, name, dob) VALUES (10003, 'Bisnu', sysdate());
INSERT INTO jdbc_person (id, name, dob) VALUES (10004, 'Maheswar', sysdate());
INSERT INTO jdbc_person (id, name, dob) VALUES (10005, 'Kali', sysdate());
-- Course
INSERT INTO Course (id, name, creation_time, last_update_time) VALUES (11001, 'JPA Courses.', sysdate(), sysdate());
INSERT INTO Course (id, name, creation_time, last_update_time) VALUES (11002, 'SpringBoot Courses.', sysdate(), sysdate());
INSERT INTO Course (id, name, creation_time, last_update_time) VALUES (11003, 'Spring Courses.', sysdate(), sysdate());
INSERT INTO Course (id, name, creation_time, last_update_time) VALUES (11004, 'Java Courses.', sysdate(), sysdate());
INSERT INTO Course (id, name, creation_time, last_update_time) VALUES (11005, 'NodeJS Courses.', sysdate(), sysdate());

-- Passport
INSERT  INTO Passport (id, number) VALUES (40001, 'C1001');
INSERT  INTO Passport (id, number) VALUES (40002, 'A2002');
INSERT  INTO Passport (id, number) VALUES (40003, 'S3003');

-- Student
INSERT INTO Student (id, name, passport_id) VALUES (20001, 'Chitta', '40001');
INSERT INTO Student (id, name) VALUES (20002, 'Anand');
INSERT INTO Student (id, name) VALUES (20003, 'Shiva');

-- Review
INSERT  INTO Review (id, rating, description) VALUES (50001, '5', 'Great Course');
INSERT  INTO Review (id, rating, description) VALUES (50002, '5', 'Woderful Course');
INSERT  INTO Review (id, rating, description) VALUES (50003, '5', 'Awasome Course');
INSERT  INTO Review (id, rating, description) VALUES (50004, '5', 'Fabolus Course');
INSERT  INTO Review (id, rating, description) VALUES (50005, '5', 'Amazing Course');
