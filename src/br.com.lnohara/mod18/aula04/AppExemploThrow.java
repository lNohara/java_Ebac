package br.com.lnohara.mod18.aula04;

public class AppExemploThrow {

    public static void main(String args[]){
        exception();
    }

    private static void runtimeException(){
        ExemploThrow.saqueRuntimeException(500);
    }

    private static void exception(){
        try {
            ExemploThrow.saque(500);
        } catch (NullPointerException e ){
            System.out.println("Exemplo nullPointer");
        } catch (LimiteSaqueException e ){
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            System.out.println("Fechando conexão com o banco de dados");
        }
    }
}
