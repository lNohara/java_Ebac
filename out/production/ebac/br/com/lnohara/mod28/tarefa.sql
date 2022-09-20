/*
    Criar um banco de dados com 3 tabelas,
    - produto
    - cliente
    - venda/nf
    Fazer o relacionamento entre elas
    Fazer inserção
    Fazer alguns SELECTs com JOINs
    Tirar prints e boa srte
*/

------------------------------------------------------------------------------
----------------------------- CRIANDO SEQUENCIAS -----------------------------
-- DROP SEQUENCE sequence_id_produto;
CREATE SEQUENCE sequence_id_cliente INCREMENT 1 START 1;

-- DROP SEQUENCE sequence_id_venda;
CREATE SEQUENCE sequence_id_venda INCREMENT 1 START 5688;

-- DROP SEQUENCE sequence_id_produto;
CREATE SEQUENCE sequence_id_produto INCREMENT 4 START 120;

---------------------------- FIM CRIANDO SEQUENCIAS ---------------------------
------------------------------------------------------------------------------

------------------------------------------------------------------------------
-------------------------------- TIPO ENDERECO -------------------------------

-- DROP TYPE tp_endereco cascade
CREATE TYPE tp_endereco AS (
    cep integer,
    endereco varchar(200),
    bairro varchar(100),
    cidade varchar(80),
    estado varchar(2),
    numero varchar(15),
    complemento varchar(30),
    ponto_referencia varchar(100)
);

-- ADICIONANDO OS ATRIBUTOS OBRIGATÓRIOS PARA O ENDERECO
-- DROP domain domain_tp_endereco
CREATE domain domain_tp_endereco AS tp_endereco 
check (
  (value).cep is not null and 
  (value).endereco is not null and
  (value).bairro is not null and
  (value).cidade is not null and
  (value).estado is not null
);
------------------------------ FIM TIPO ENDERECO -----------------------------
------------------------------------------------------------------------------

------------------------------------------------------------------------------
------------------------------- TABELA CLIENTE -------------------------------

-- DROP TABLE tb_cliente
CREATE TABLE tb_cliente
(
    id INTEGER PRIMARY KEY,
    nome_completo varchar(200) not null,
    CPF varchar(11) not null UNIQUE,
    sexo char(1),
    num_celular varchar(11),
    mail varchar(80) not null,
    item tp_endereco not null
);

-- truncate tb_cliente cascade
INSERT INTO tb_cliente VALUES 
(
    nextval('sequence_id_cliente'),
    'Shigeru Miyamoto',
    '12345678909',
    'M',
    '11912311231',
    'supermario@mail.com.br',
    ROW
    (
        25959200, 
        'Rua Renato de Miranda', 
        'Carlos Guinle', 
        'Teresópolis', 
        'RJ', 
        '136A', 
        'Casa 2', 
        'Avenida 123'
    )
);

INSERT INTO tb_cliente VALUES 
(
    nextval('sequence_id_cliente'),
    'Toru Iwatani',
    '12345678901',
    'M',
    '1198989898',
    'pac-man@hotmail.com.br',
    ROW
    (
        77020107, 
        'Quadra 108 Sul Alameda 7', 
        'Plano Diretor Sul', 
        'Palmas', 
        'TO', 
        '1509', 
        'Torre 2- Apto 2016', 
        'Ao lado do boteco do Seu Zé'
    )
);
INSERT INTO tb_cliente VALUES 
(
    nextval('sequence_id_cliente'),
    'Maria Aparecida de Fátima',
    '12345678902',
    'F',
    '1198989899',
    'mariazinha_f_99@mi.com',
    ROW
    (
        68035140, 
        'Rua Maguari', 
        'Maracanã', 
        'Santarém', 
        'PA', 
        '123', 
        'Casa', 
        'Próximo das lojas Mel'
    )
);
INSERT INTO tb_cliente VALUES 
(
    nextval('sequence_id_cliente'),
    'Regina Souza Gomes de Paula',
    '12345678903',
    'F',
    '1198989100',
    'dr.reginadepaula_1212',
    ROW
    (
        49080580, 
        'Travessa Porto Aegre I', 
        'América', 
        'Aracaju', 
        'SE', 
        '598B', 
        'Torre B', 
        'Ao lado da academia blue fit'
    )
);
----------------------------- FIM TABELA CLIENTE -----------------------------
------------------------------------------------------------------------------

------------------------------------------------------------------------------
-------------------------------- TABELA VENDA --------------------------------
-- DROP TABLE tb_venda
CREATE TABLE tb_venda
(
    id_venda INTEGER PRIMARY KEY,
    id_cliente integer,
    data TIMESTAMP,
    CONSTRAINT fk_cliente FOREIGN KEY(id_cliente) REFERENCES tb_cliente(id)
);

-- truncate tb_venda cascade
INSERT INTO tb_venda VALUES
(
    nextval('sequence_id_venda'),
    2,
    '2022-03-19 18:45:59'
),
(
    nextval('sequence_id_venda'),
    2,
    '2022-05-26 08:25:23'
),
(
    nextval('sequence_id_venda'),
    2,
    '2022-05-30 16:55:40'
),
(
    nextval('sequence_id_venda'),
    3,
    '2022-02-10 02:00:11'
),
(
    nextval('sequence_id_venda'),
    3,
    '2022-08-18 00:54:55'
),
(
    nextval('sequence_id_venda'),
    5,
    '2022-04-10 22:14:33'
);
----------------------------- FIM TABELA VENNDA ------------------------------
------------------------------------------------------------------------------

------------------------------------------------------------------------------
------------------------------- TABELA PRODUTO -------------------------------
-- DROP TABLE tb_produto
CREATE TABLE tb_produto
(
    id INTEGER PRIMARY KEY,
    nome varchar(200) not null,
    referencia varchar(100) not null,
    categoria varchar (100),
    fonecedor varchar (80) not null,
    preco numeric
)

INSERT INTO tb_produto VALUES
(
    nextval('sequence_id_produto'),
    'Caderno capa dura universitário 10 matérias',
    'caderno-uni-200f-broch-tili',
    'Caderno aspiral',
    'Tilibra',
    49.59
),
(
    nextval('sequence_id_produto'),
    'Bloco anotações post-it colorido',
    'bloco-autoAdesivo-4cor-tili-100f',
    'Bloco de Anotações',
    'Tilibra',
    19.99
),
(
    nextval('sequence_id_produto'),
    'Lápis de Cor Aquarelado',
    'Lápis-cor-24uni-faber-aquarela',
    'Lápis de cor',
    'Faber Castell',
    60.08
),
(
    nextval('sequence_id_produto'),
    'Caneta Esferográfica BIC Azul',
    'bic-azul-canetaEsferografica-padrao',
    'Caneta Esferográfica',
    'BIC',
    2.50
),
(
    nextval('sequence_id_produto'),
    'Tinta Guache - 6 cores - Faber',
    'Guache-6cores-faberCastel-comPincelBrinde',
    'Tinta Guache',
    'Faber Castell',
    9.99
),
(
    nextval('sequence_id_produto'),
    'Tinta Nankin - preta - 20ml',
    'nankin-preto-20ml-faber-bisnaga',
    'Tinta Namkin',
    'Faber Castell',
    9.99
),
(
    nextval('sequence_id_produto'),
    'Agenda 2023 - Turma da Mônica',
    'agenda2023-turmaDaMonica-200f-tilo',
    'Agenda 2023',
    'Tilibra',
    59.99
),
(
    nextval('sequence_id_produto'),
    'Estojo Universitário Preto',
    'portaCaneta-Preto-comZiper-Simples',
    'Estojo',
    'Tilibra',
    25.00
);
------------------------------------------------------------------------------
---------------------- TABELA ASSOCIATIVA VENDA PRODUTO ----------------------
-- DROP TABLE tb_associacao_venda_produto
CREATE TABLE tb_associacao_venda_produto
(
    id_venda INTEGER,
    id_produto INTEGER,
    CONSTRAINT fk_venda FOREIGN KEY(id_venda) REFERENCES tb_venda(id_venda),
    CONSTRAINT fk_produto FOREIGN KEY(id_produto) REFERENCES tb_produto(id)
);

INSERT INTO tb_associacao_venda_produto VALUES
(
    5694,
    124
),
(
    5694,
    124
),
(
    5694,
    128
),
(
    5695,
    152
),
(
    5696,
    132
),
(
    5696,
    136
),
(
    5696,
    140
),
(
    5697,
    136
),
(
    5697,
    136
),
(
    5697,
    136
),
(
    5697,
    136
),
(
    5697,
    136
),
(
    5698,
    144
),
(
    5698,
    124
),
(
    5699,
    136
);
-------------------- FIM TABELA ASSOCIATIVA VENDA PRODUTO --------------------
------------------------------------------------------------------------------

------------------------------------------------------------------------------
----------------------------------- SELECT -----------------------------------

SELECT * FROM tb_cliente
SELECT * FROM tb_venda
SELECT * FROM tb_produto
SELECT * FROM tb_associacao_venda_produto

-- Usando o JOIN para pegar apenas os clientes que já compraram
-- A cliente Maria Aparecida de Fátima não deve aparecer
SELECT 
    id, 
    nome_completo
FROM 
    tb_cliente c
    JOIN tb_venda v ON v.id_cliente = c.id

-- Selecionando os clientes e suas compras
-- utilizando o LEFT JOIN para trazer até quem nunca comprou nada
SELECT id, nome_completo
FROM tb_cliente c
LEFT JOIN tb_venda v ON v.id_cliente = c.id

-- Contando quantas compras cada cliente fez
-- ordenando do que comprou mais para quem comprou menos
SELECT c.nome_completo, COUNT(v.id_venda) AS qtd_compras FROM
tb_venda v
RIGHT JOIN tb_cliente c ON c.id = v.id_cliente
GROUP BY c.nome_completo
ORDER BY qtd_compras DESC

-- Utilizando o COUNT e HAVING para DESCobrir qual cliente nunca comprou
SELECT c.nome_completo, COUNT(v.id_venda) AS qtd_compras FROM
tb_venda v
RIGHT JOIN tb_cliente c ON c.id = v.id_cliente
GROUP BY c.nome_completo
HAVING COUNT(v.id_venda) = 0
-- Vendo todos os produtos comprados por cada cliente
SELECT 
    c.nome_completo AS "Nome do Cliente", 
    v.id_venda AS "Número do Pedido",
    p.nome AS "Nome do Produto",
    p.preco AS "Preço unitário"
FROM 
    tb_cliente c
    JOIN tb_venda v ON v.id_cliente = c.id
    JOIN tb_associacao_venda_produto avp ON avp.id_venda = v.id_venda
    JOIN tb_produto p ON p.id = avp.id_produto
ORDER BY 
    c.id

-- Agrupando os intes de cadas venda com a função ARRAY_AGG
SELECT 
    c.nome_completo AS "Nome do Cliente", 
    v.id_venda AS "Número do Pedido",
    ARRAY_AGG(p.nome) AS "Nome do Produto"
FROM 
    tb_cliente c
    JOIN tb_venda v ON v.id_cliente = c.id
    JOIN tb_associacao_venda_produto avp ON avp.id_venda = v.id_venda
    JOIN tb_produto p ON p.id = avp.id_produto
GROUP BY
    c.nome_completo,
    v.id_venda

-- vendo o total  de itens e valor de cada pedido
    c.nome_completo AS "Nome do Cliente", 
    v.id_venda AS "Número do Pedido",
    COUNT(avp.id_produto),
    SUM(p.preco)
FROM 
    tb_cliente c
    JOIN tb_venda v ON v.id_cliente = c.id
    JOIN tb_associacao_venda_produto avp ON avp.id_venda = v.id_venda
    JOIN tb_produto p ON p.id = avp.id_produto
GROUP BY
    c.nome_completo,
    v.id_venda
ORDER BY v.id_venda

-- utilizando subquery para DESCobrir qual produto nunca foi vendido
SELECT * FROM 
tb_produto
WHERE id NOT IN (SELECT id_produto FROM tb_associacao_venda_produto)

-- Usando COUNT, order DESC e limit para saber qual é o produto mais vendido
SELECT p.nome, p.preco, COUNT(avp.id_produto) AS "quantidade vendida"
FROM tb_associacao_venda_produto avp
JOIN tb_produto p ON p.id = avp.id_produto
GROUP BY p.nome, p.preco
ORDER BY "quantidade vendida" DESC
limit 1