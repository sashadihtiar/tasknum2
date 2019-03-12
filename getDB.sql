CREATE DATABASE cource;
USE cource;
CREATE TABLE dictionary(
ID INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(20),
discriminator VARCHAR(20)
);
INSERT INTO dictionary VALUES(default,"ADMIN","ROLE");
INSERT INTO dictionary VALUES(default,"USER","ROLE");