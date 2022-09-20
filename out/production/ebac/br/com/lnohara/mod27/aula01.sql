CREATE TABLE tb_pessoa(id bigint, nome varchar(50), idade integer);

ALTER TABLE tb_pessoa add COLUMN sexo varchar(1);
ALTER TABLE tb_pessoa DROP COLUMN sexo;

ALTER TABLE tb_pessoa ADD COLUMN nome_m VARCHAR(50);
ALTER TABLE tb_pessoa RENAME COLUMN nome_m TO nome_mae;
ALTER TABLE tb_pessoa ALTER COLUMN nome_mae TYPE VARCHAR(30);

ALTER TABLE tb_pessoa ALTER COLUMN nome_mae SET DEFAULT 'Nulo';
ALTER TABLE tb_pessoa ALTER COLUMN nome_mae DROP DEFAULT ;

ALTER TABLE tb_pessoa ALTER COLUMN nome_mae SET NOT NULL;
ALTER TABLE tb_pessoa ALTER COLUMN nome_mae DROP NOT NULL;

ALTER TABLE tb_pessoa ADD CHECK (idade > 0 and idade < 100);

ALTER TABLE tb_pessoa RENAME TO tb_pessoa_1;

-- Limpar os dados da tabela
TRUNCATE tb_pessoa;

DROP TABLE tb_pessoa;

select * from tb_pessoa ;