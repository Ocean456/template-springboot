create database template;

use template;

create table user(
                     id int auto_increment primary key ,
                     username varchar(20) not null ,
                     password varchar(20) not null ,
                     status int default 0
);

insert into user(username,password) values('admin','admin');
insert into user(username,password) values('user','user');
insert into user(username,password) values('guest','guest');