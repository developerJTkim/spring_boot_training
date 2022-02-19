drop table user if exists;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table user (id bigint not null, email varchar(255), password varchar(255), username varchar(255), primary key (id));


drop table lunch if exists;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table lunch (id bigint not null, name varchar(255), location varchar(255), user_id varchar(255), primary key (id));

