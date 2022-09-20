ALTER TABLE tb_pessoa ADD CONSTRAINT check_idade CHECK (idade > 0 and idade < 100);

TRUNCATE tb_pessoa;
INSERT INTO tb_pessoa values (1, 'Rodrigo', 36, 'M');
INSERT INTO tb_pessoa values (2, 'Maria', 20, 'F');
INSERT INTO tb_pessoa values (3, 'José', 101, 'M');
INSERT INTO tb_pessoa values (4, 'Rosa', -2, 'F');

-- Criando a tabela com as de finicoes
TRUNCATE tb_pessoa;
DROP TABLE tb_pessoa ;

CREATE TABLE tb_pessoa (
    id BIGINT NOT NULL,
    nome varchar(50) not null,
    idade INTEGER constraint check_idade check (idade > 0 and idade < 100),
    sexto varchar(1) not null
);

INSERT INTO tb_pessoa values (5, 'Carlos', 22);

--like
select * from tb_pessoa where nome like 'Rodrigo';
select * from tb_pessoa where nome like 'R%';
select * from tb_pessoa where nome like 'R______';
select * from tb_pessoa where nome like 'R_d__g_';
select * from tb_pessoa where nome like '_o%';
select * from tb_pessoa where nome not like 'Rodrigo';