CREATE DATABASE IF NOT EXISTS cursodb;
USE cursodb;

drop table if exists curso;
drop table if exists profesor;

create table profesor (id int primary key auto_increment, nombre varchar(25));

insert into profesor (nombre) values ('Pablo del Álamo');
insert into profesor (nombre) values ('María Gutierrez');
insert into profesor (nombre) values ('Ada Lovelace');
insert into profesor (nombre) values ('Larry Page ');


create table curso (
	id int auto_increment,
    titulo varchar(25) not null,
    activo varchar(6) not null,
    nivel varchar(20) not null,
    horas int not null,
    idProfesor int not null,
    primary key (id),
    foreign key (idProfesor) references profesor(id));


insert into curso (titulo, activo, nivel, horas, idProfesor) values ('Java', 'true', 'básico', 10,3);
insert into curso (titulo, activo, nivel, horas, idProfesor) values ('Mongo', 'false', 'intermedio', 35,1);
insert into curso (titulo, activo, nivel, horas, idProfesor) values ('Cassandra', 'true', 'experto', 75,4);
insert into curso (titulo, activo, nivel, horas, idProfesor) values ('Android', 'true', 'básico', 2,1);
insert into curso (titulo, activo, nivel, horas, idProfesor) values ('IOS', 'false', 'intermedio', 50,2);
insert into curso (titulo, activo, nivel, horas, idProfesor) values ('Spark', 'true', 'experto', 150,2);
