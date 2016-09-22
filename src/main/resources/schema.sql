create table Spittle (
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	message varchar(140) not null,
	created_at timestamp not null,
	latitude double,
	longitude double,
	PRIMARY KEY (id)
);

create table Spitter (
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	email varchar(30) not null,
	PRIMARY KEY (id)
);