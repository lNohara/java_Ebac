package br.com.lnohara.mod13.aula02;

public class Programa {

    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setCpf("1");
        assalariado.setNome("Assalariado");
        assalariado.setSobrenome("Pires");
        assalariado.setSalario(1000d);
        imprimir(assalariado);
        imprimirCast(assalariado);
        assalariado.imprimirValores();
        assalariado.imprimirSobrenome();

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("1");
        comissionado.setNome("Comissionado");
        comissionado.setSobrenome("Pires");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);
        imprimirCast(comissionado);
        comissionado.imprimirValores();
        comissionado.imprimirSobrenome();

        Horista horista = new Horista();
        horista.setCpf("1");
        horista.setNome("Horista");
        horista.setSobrenome("Pires");
        horista.setPrecoHora(100d);
        horista.setTotalHorasTrabalhadas(60d);
        imprimir(horista);
        imprimirCast(horista);
        horista.imprimirValores();
        horista.imprimirSobrenome();
    }

    public static void imprimir(Empregado empregado){
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
    }

    public static void imprimirCast(Empregado empregado){
        if (empregado instanceof Horista){
            System.out.println("Preço da hora: " + ((Horista) empregado).getPrecoHora());
            System.out.println("Horas trabalhadas: " + ((Horista) empregado).getTotalHorasTrabalhadas());
        } else if(empregado instanceof Comissionado){
            System.out.println("Total de vendas: " + ((Comissionado) empregado).getTotalVenda());
            System.out.println("Comissao: " + ((Comissionado) empregado).getTotalComissao());
        }
    }
}
