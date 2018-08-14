drop database CareerGuidenceV1;
create database CareerGuidenceV1;
use CareerGuidenceV1;


create table categories(

	id int(10) unique not null,
    name longtext not null,
    primary key(id)

);

create table users(

	id int(10) unique not null,
    id_category int(10) not null,
    name varchar(50) not null,
    surname varchar(50) not null,
    age int(4) not null,
    email varchar(60) unique not null,
    login varchar(100) unique not null,
    the_number_of_the_test int(2),
    password varchar(50) not null,
    primary key(id),
    foreign key(id_category) references categories(id)

);

create table roles(

	id int(10) unique not null,
    name varchar(50) not null,
    primary key(id)
);

create table enterprices(

	id int(10) unique not null,
    name varchar(50) not null,
	geolocation varchar(60) ,
    phone varchar(20) not null,
    email varchar(60) unique,
    login varchar(100) unique not null,
    password varchar(50) not null,
    primary key(id)

);

create table works(

	id int(10) unique not null,
    id_category int(10) unique not null,
    name varchar(60) not null,
    primary key(id),
    foreign key(id_category) references categories(id)

);

create table questions(

	id int(10) unique not null,
    name varchar(255) not null,
    primary key(id)

);

create table answers(

	id int(10) unique not null,
    id_question int(10) not null,
    name varchar(255) not null,
    flag boolean not null,
    points int(5) not null, 
    primary key(id),
    foreign key(id_question) references questions(id)

);

create table users_has_roles(

	id_user int(10) not null,
    id_role int(10) not null,
    foreign key(id_user) references users(id),
    foreign key(id_role) references roles(id)

);

create table users_has_answers(

	id_user int(10) unique not null,
    id_answer int(10) unique not null,
	foreign key(id_user) references users(id),
    foreign key(id_answer) references answers(id)
    
);

create table enterprices_has_roles(

	id_enterprice int(10) not null,
    id_role int(10) not null,
    foreign key(id_enterprice) references enterprices(id),
    foreign key(id_role) references roles(id)

);

create table enterprices_has_works(

	id_enterprice int(10) not null,
    id_work int(10) not null,
    foreign key(id_enterprice) references enterprices(id),
    foreign key(id_work) references works(id)

);