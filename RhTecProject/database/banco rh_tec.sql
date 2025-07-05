create database rh_tech;
use rh_tech;

create table funcionarios(
id int primary key not null auto_increment,
nome text not null,
email varchar(100) not null unique,
senha text not null,
cep varchar(8) not null,
endereco text not null,
numero text not null,
bairro text not null
);
alter table funcionarios add column cidade text not null;
alter table funcionarios add column estado text not null;

create table cargos(
id int primary key not null auto_increment,
nome text not null,
descricao text
); 

create table funcionario_por_cargo(
id int primary key not null auto_increment,
funcionario_id long not null,
cargo_id long not null,
detalhes text not null,
data_inicio date not null,
data_fim date
);


alter table funcionario_por_cargo modify column funcionario_id int;
alter table funcionario_por_cargo modify column cargo_id int; 
alter table funcionario_por_cargo
add constraint fk_funcionario
foreign key (funcionario_id)
references funcionarios(id);
 
															
