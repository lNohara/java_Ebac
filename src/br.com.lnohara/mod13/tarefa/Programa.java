package br.com.lnohara.mod13.tarefa;

public class Programa {
    public static void main(String[] args) {
        /**
         * Criando uma pessoa fisica na mão
         */
        PessoaFisica paulo = new PessoaFisica();
        paulo.setNome("Paulo de Lima");
        paulo.setEndereco("Rua do Beija-Flor, casa 8");
        paulo.setIdade(30);
        paulo.fazerAniversario(paulo.getIdade()); // A idade final do paulo sera 31
        paulo.setCpf("123.123.123-12");
        paulo.setEstadoCivil("Casado");
        System.out.println(paulo.toString());
        paulo.pagarImposto();

        divider();

        PessoaFisica manu = criarPessoaFisica("Manuella", 9, "Rua da Alegria, 34", "999.888.777-65", "solteira");
        manu.fazerAniversario(manu.getIdade()); // a indade da manu passa a ser 10
        manu.fazerAniversario(manu.getIdade()); // a indade da manu passa a ser 11
        System.out.println(manu.toString());
        manu.pagarImposto();

        divider();

        PessoaFisica rafa = criarPessoaFisica("Rafael", 50, "Avenidade Prado, bloco 3", "111.222.333-44", "divorciado");
        System.out.println(rafa.toString());
        rafa.pagarImposto();

        divider();
        divider();

        /**
         * Criando uma pessoa juridica na mao
         */
        PessoaJuridica amazon = new PessoaJuridica();
        amazon.setNome("Amazon");
        amazon.setEndereco("Rua das Amazonas, 999");
        amazon.setIdade(68);
        amazon.fazerAniversario(amazon.getIdade());
        amazon.setCnpj("12.134.532/0001");
        amazon.setRamoDeAtividade("e-commerce");
        System.out.println(amazon.toString());
        amazon.pagarImposto();

        divider();

        PessoaJuridica cocaCola = criarPessoaJuridica("Coca-Cola", 129, "Atlanta, Geórgia, EUA", "123-123-123/0011", "bebida não alcoólica");
        System.out.println(cocaCola.toString());
        cocaCola.pagarImposto();

        divider();

        PessoaJuridica riotGames = criarPessoaJuridica("Rito Gomes", 15, "Santa Mônica, Califórnia, EUA", "123-345-456/1234", "games");
        System.out.println(riotGames.toString());
        riotGames.pagarImposto();
    }
    public static void divider(){
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    /**
     * Metodo para cirar pessoa fisica por meio de seu construtor
     * @param nome
     * @param idade
     * @param endereco
     * @param cpf
     * @param estadoCivil
     * @return
     */
    private static PessoaFisica criarPessoaFisica(String nome, int idade, String endereco, String cpf, String estadoCivil){
        return new PessoaFisica(nome, idade, endereco, cpf, estadoCivil);
    }

    /**
     * Metodo para cirar pessoa juridica por meio de seu construtor
     * @param nome
     * @param idade
     * @param endereco
     * @param cnpj
     * @param ramoDeAtividade
     * @return
     */
    private static PessoaJuridica criarPessoaJuridica(String nome, int idade, String endereco, String cnpj, String ramoDeAtividade){
        return new PessoaJuridica(nome, idade, endereco, cnpj, ramoDeAtividade);
    }
}
