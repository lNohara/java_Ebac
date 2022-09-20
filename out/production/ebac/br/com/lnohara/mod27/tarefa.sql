-- criando uma sequencia auto incremental
-- DROP SEQUENCE sequence_id_produto;
CREATE SEQUENCE sequence_id_produto INCREMENT 1 START 1;
--/ 

--------------------------DDL--------------------------
-- criando a tabela produto
-- DROP TABLE tb_produto ;
CREATE TABLE tb_produto 
(
    id INTEGER PRIMARY KEY,
    nome varchar(30) not null,
    categoria varchar(10) not null,
    data_validade date not null,
    estado_origem varchar(2)
);
--/

-- aumentando o número de caracteres da coluna descricao
ALTER TABLE tb_produto
ALTER COLUMN categoria TYPE VARCHAR(40);

-- Removendo a obrigatoriedade da coluna data_validade
ALTER TABLE tb_produto
ALTER COLUMN data_validade DROP NOT NULL;

-- Adicionando a coluna fornecedor
ALTER TABLE tb_produto
ADD COLUMN fornecedor varchar(30);

-- Alterando o nome da coluna fabricante para fornecedor
ALTER TABLE tb_produto
    RENAME COLUMN fornecedor TO distribuidor;

-- Adicionando um fornecedor padrao
ALTER TABLE tb_produto
ALTER COLUMN distribuidor
SET DEFAULT 'Produto da Casa';

-- Removendo a coluna estado de Origem
ALTER TABLE tb_produto DROP COLUMN estado_origem

--------------------------DML--------------------------
-- TRUNCATE tb_produto;

-- Inserindo um produto
INSERT INTO tb_produto 
    (
        id,
        nome,
        categoria,
        data_validade,
        distribuidor
    )
VALUES 
    (
        nextval('sequence_id_produto'),
        'Coca-Cola',
        'Refrigerante de Cola',
        '2023-12-10',
        'Coca-Cola'
    );
--/

-- Inserindo um produto
INSERT INTO tb_produto
values
    (
        nextval('sequence_id_produto'),
        'Guaraná Antártica',
        'Refrigerante de Guaraná',
        '2023-10-09',
        'AmBev'
    );
--/

-- Inserindo dois produtos de uma vez
INSERT INTO tb_produto 
    (
        id,
        nome,
        categoria,
        data_validade,
        distribuidor
    )
VALUES 
    (
        nextval('sequence_id_produto'),
        'Fanta',
        'Refrigerante',
        '2024-02-19',
        'Fanta'
    ),
    (
        nextval('sequence_id_produto'),
        'Dolly',
        'Refrigerante Guaraná',
        '2023-12-10',
        'Dolly'
    ),
    (
        nextval('sequence_id_produto'),
        'Itubaina',
        'Refrigerante',
        '2021-10-18',
        'Heineken Brasil'
    );
--/

-- Deletando o registro "Doly"
DELETE FROM tb_produto
WHERE id = 4;
--/

-- Atualizando a categoria do produto Itubaina
UPDATE tb_produto
SET categoria = 'Refrigerante de Guanrá'
WHERE id = 5;
--/

-- Atualizando a categoia e distribuidor do prduto ID 3
UPDATE tb_produto
SET 
    categoria = 'Refrigerante de Laranja',
    distribuidor = 'Hideal'
where id = 3;
--/

-- Inserindo um produto sem informar o fornecedor
INSERT INTO tb_produto 
    (
        id,
        nome,
        categoria,
        data_validade
    )
VALUES 
    (
        nextval('sequence_id_produto'),
        'Refresco',
        'Refrigerante de frutas',
        '2023-12-10'
    );
--/

--------------------------DQL--------------------------

-- selecionando tudo da tabela tb_produto
select * from tb_produto ;

-- Selecionando todos os registros que a descrição contenha a palavra guaran_
SELECT *
from tb_produto
where categoria ilike '%guaran_';

select nome,
    TO_CHAR(data_validade, 'DD/MM/YYYY') AS "Data de validade",
    distribuidor
from tb_produto
where categoria ilike '%guaran_%';
-- Selecionando os produtos vencidos, data de validade menor que a data atual
SELECT id,
    nome,
    categoria,
    TO_CHAR(data_validade, 'DD/MM/YYYY') AS "data de validade"
from tb_produto
where data_validade < now();
-- selecionando os produtos não vencidos por ordem de validade
select nome,
    TO_CHAR(data_validade, 'DD/MM/YYYY')
from tb_produto
where data_validade >= now()
order by data_validade