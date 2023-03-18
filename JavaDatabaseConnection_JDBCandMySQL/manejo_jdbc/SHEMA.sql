create database if not exists demo;

use demo;

drop table if exists employees;

CREATE TABLE employees (
	id int(11) not null auto_increment,
    last_name varchar(64) default null,
    first_name varchar(64) default null,
    email varchar(64) default null,
    department varchar(64) default null,
    salary decimal(10,2) default null,
    primary key (id)
) engine=InnoDB auto_increment=1 default charset=latin1;

insert into employees (id, last_name, first_name, email, department, salary) values
(1, 'Parra', 'Rigo', 'pr@gmail.com', 'Huila', 55000.00),
(2, 'Munoz', 'Herib', 'mh@gmail.com', 'Valle', 75000.00),
(3, 'Escobar', 'Gus', 'g@gmail.com', 'Cauca', 100000.00),
(4, 'Perez', 'Jaime', 'jp@gmail.com', 'Bolivar', 80000.00),
(5, 'Rojas', 'Luis', 'rl@gmail.com', 'Caqueta', 45000.00),
(6, 'Cardozo', 'Ruben', 'cr@gmail.com', 'Meta', 11000.00),
(7, 'Saenz', 'Alejo', 'sa@gmail.com', 'Tolima', 19000.00);

SELECT * FROM demo.employees;