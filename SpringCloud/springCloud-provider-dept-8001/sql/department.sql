DROP DATABASE IF EXISTS cloudDB02;
CREATE DATABASE cloudDB02 CHARACTER SET UTF8;
USE cloudDB02;
CREATE TABLE department(
	deptNo BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,  
	deptName VARCHAR(60),  
	dbSource   VARCHAR(60)
); 
INSERT INTO department(deptName,dbSource) VALUES('财务部',DATABASE());
INSERT INTO department(deptName,dbSource) VALUES('市场部',DATABASE());
INSERT INTO department(deptName,dbSource) VALUES('运维部',DATABASE()); 
SELECT * FROM dept; 

DROP DATABASE IF EXISTS cloudDB03;
CREATE DATABASE cloudDB03 CHARACTER SET UTF8;
USE cloudDB03;
CREATE TABLE deptartment(
	deptNo BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,  
	deptName VARCHAR(60),  
	dbSource   VARCHAR(60)
); 
INSERT INTO department(deptName,dbSource) VALUES('开发部',DATABASE());
INSERT INTO department(deptName,dbSource) VALUES('人事部',DATABASE());
INSERT INTO department(deptName,dbSource) VALUES('财务部',DATABASE());
INSERT INTO department(deptName,dbSource) VALUES('市场部',DATABASE());
INSERT INTO department(deptName,dbSource) VALUES('运维部',DATABASE()); 
SELECT * FROM department; 