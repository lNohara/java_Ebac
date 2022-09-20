CREATE TABLE tb_pessoa(id bigint, nome varchar(50), idade integer, sexo varchar(1));

INSERT INTO tb_pessoa (id, nome, idade, sexo)
VALUES (1, 'Rodrigo', 36, 'M');

INSERT INTO tb_pessoa values (2, 'Rodriog', 36, 'M');

-- UPDATE
UPDATE tb_pessoa SET nome = 'Luana', idade = 30, sexo = 'F' where id = 2;

-- DELETE (com where baby)
DELETE FROM tb_pessoa delete from tb_pessoa where id = 1;

TRUNCATE tb_pessoa;
select * from tb_pessoa ;