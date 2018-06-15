create database if not exists clube;
use clube;

create table if not exists jogador(
	id smallint primary key auto_increment,
    nome varchar(100),
    peso double,
    estatura double,
    salario decimal(10,2),
    validade_contrato date,
    perna_dominante char,
    velocidade tinyint,
    resistencia tinyint,
    habilidade tinyint,
    posicao varchar(20)
    ) Engine = InnoDB;