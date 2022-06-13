<!-- Pesquisar um pouco mais sobre programação orienta da objetos e programação procedural. 
Colocar com minhas palavras meu entendimento para cada uma. -->

## Comparativo

### Programação Procedural ou Programação Estruturada.
* Reduzidos a apenas três estruturas: sequência, decisão e iteração/repetição
* Não há encapsulamento
* Todo o código em um arquivo
* Mais fácil de aprender
* Mais difícil de manter

### Programação orientada a objetos
* O código retrata objetos do mundo real
* Divisão de responsabilidade
* Possibilidade de encapsulamento
* Maior escalabilidade
* Maior manutenibilidade

## Conclusão
Na programação **orientada a objetos** a cada arquivo(classe) representará uma e apenas UMA coisa do mundo real(objeto), abstraindo o que não é relevante para o meu negócio.
Cada objeto terá informações (atributos) somente referente ao que ele representa e fará coisas (métodos) somente referente ao que ele representa.
Em um programa OO eu terei N classes que conversam entre si de acordo com a sua visibilidade sem ordem definida.

Na programação estruturada, representarei todos os elementos que compõem meu negócio em um único arquivo.
Os procedimentos serão executados dentro de uma ordem pré-definida sem nenhum encapsulamento.

## Exemplo
Supondo que eu tenha um programa para exibir o estoque (nome do produto, quantidade, fornecedor, valor, etc) de uma doceria

#### Programação Procedural ou Programação Estruturada.
Em um programa estrutural eu teria todas essas informações, além de possíveis códigos relacionados à login/crud em um único arquivo gigantesco.
Caso eu precise editar um item do meu estoque, terei de localizá-lo no código e me preocupar se a alteração não quebrou o que será executado posteriormente.

#### Programação orientada a objetos
Poderei criar especializações do meu estoque de modo que cada produto tenha sua classe e guarde apenas suas próprias informações.
Desta forma qualquer manutenção que eu tenha que fazer em um produto, terei de mexer apenas em sua classe sem me preocupar com o restante do programa.
Códigos relacionados à login/clientes/etc ficam organizados em outros diretórios.

* Estoque
* _Bala
* ___ Marca A
* ___ Marca B
* _Chocolate
* ___ Marca A
* ___ Marca B
* ___ Marca C
* _Refrigerante
* ___ Marca X
* ___ Marca Y


## Fontes:
* https://terminalroot.com.br/2019/10/diferencas-entre-programacao-procedural-funcional-orientada-a-objetos-e-eventos.html - Acessado em 13/out/2021
* https://www.oficinadanet.com.br/post/14463-qual-a-diferenca-entre-programacao-estruturada-e-programacao-orientada-a-objetos - Acessado em 13/out/2021