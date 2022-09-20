CREATE TABLE tb_pessoa_2 (
    id bigint not null,
    nome varchar(50) no null,
    idade integer not null constraint check_idade CHECK (idade > 0 and indade < 120),
    sexo varchar(1) not null CHECK (sexo in('M', 'F')),
    id_estado bigint,
    cpf bigint on null,
    constraint pk_id_pessoa primary key(id),
    -- constraint fk_id_estado_pessoa foreign key(id_estado) references tb_estado(id)
);


CREATE TABLE tb_pessoa_3(
    id bigint not null,
    nome varchar(50) not null,
    idade integer constraint check_idade
    CHECK (idade > 0 and idade < 120),
    sexo VARCHAR(1),
    id_estado bigint,
    cpf bigint,
    CONSTRAINT check_idade_pessoa CHECK (idade > 0 and idade < 100),
    CONSTRAINT check_sexo_pessoa CHECK (sexo = 'M' or sexo = 'F'),
    CONSTRAINT uq_cpf_pessoa unique (cpf),
    CONSTRAINT pk_id_pesssoa primary key (id),
    CONSTRAINT fk_id_estado_pessoa foreign key (id_estado) references tb_estado(id)
);

alter table tb_pessoa
add constraint uq_cpf_pessoa unique (cpf);

-- sequence
select currval('sq_pessoa2');