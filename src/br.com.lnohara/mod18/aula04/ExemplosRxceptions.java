package br.com.lnohara.mod18.aula04;

public class ExemplosRxceptions {
    public static void main(String[] args) {
        //semTratamentoException();
        //comTratamentoException();
        lancarRuntimeException();
    }

    private static void lancarRuntimeException(){
        try {
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        } catch (Exception e){
            throw new RuntimeException("parando o sistema");
        }
        System.out.println("Teste");
    }

    private static void semTratamentoException(){
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + frase);
    }
    private static void comTratamentoException(){
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();

            // Lembra que não devemos tratar o nullpointer pois ele herda de rumTimeException
            // Aqui foi só um exemplo didático
        } catch (NullPointerException e){
            // TRATAMENTO DA EXCEÇÃO
            System.out.println("A frase inicial está nula, para solucionar tal problema foi atribuida uma String à variável");
            frase = "Frase Vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
