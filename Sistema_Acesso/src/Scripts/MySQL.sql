/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  CASA
 * Created: 30/11/2018
 */

create database sistemapoo;

use sistemapoo;

create table funcionario(
identificador bigint not null  auto_increment,
nome varchar(255) not null,
numerodocumento varchar (9) not null,
numerocpf varchar(11) not null,
datanascimento date,
email varchar(35) not null,
cargo varchar(20) not null,
empresa varchar (30) not null,
horaentrada timestamp,
primary key (identificador)
);

select * from funcionario;

create table visitante(
identificador bigint not null  auto_increment,
nome varchar(255) not null,
numerodocumento varchar (9) not null,
numerocpf varchar(11) not null,
datanascimento date,
email varchar(35) not null,
empresa varchar (30) not null,
departamento varchar(30) not null,
horaentrada timestamp,
primary key (identificador)
);
