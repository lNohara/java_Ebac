----------------------------------- < CLIENTE > -----------------------------------

-- DROP SEQUENCE SQ_CLIENTE_2 ;
CREATE SEQUENCE SQ_CLIENTE_2 ;

-- DROP TABLE tb_cliente_2 ;
CREATE TABLE tb_cliente_2 (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(50),
    codigo VARCHAR(50)
) ;


-- TRUNCATE tb_cliente_2 ;
INSERT INTO tb_cliente_2
(
    id,
    codigo,
    nome
)
VALUES
(
    nextval('SQ_CLIENTE_2'),
    500,
    'Maria da Luz'
),
(
    nextval('SQ_CLIENTE_2'),
    501,
    'Pedro Henrique'
),
(
    nextval('SQ_CLIENTE_2'),
    502,
    'Glória Cruz'
) ;


select * from tb_cliente_2 ;


----------------------------------- < PRODUTO > -----------------------------------

-- DROP SEQUENCE SQ_PRODUTO_2 ;
CREATE SEQUENCE SQ_PRODUTO_2 ;

-- DROP TABLE TB_PRODUTO2 ;
CREATE TABLE TB_PRODUTO2 (
    id integer PRIMARY KEY,
    nome varchar (100) not null,
    codigo_de_barras integer not null,
    preco float
) ;

INSERT INTO tb_produto2 VALUES
(
    nextval('SQ_PRODUTO_2'),
    'Guaraná Zero Lata, 350ml',
    111111111,
    4.50
),
(
    nextval('SQ_PRODUTO_2'),
    'Tubaína Pet, 600ML',
    22222222,
    7.80
) ;

select * from tb_produto2 ;

