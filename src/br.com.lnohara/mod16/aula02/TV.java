package br.com.lnohara.mod16.aula02;

public class TV implements Observer{

    @Override
    public void update(Subject subject) {
        if(subject instanceof Jornalist){
            Jornalist jornalist = (Jornalist) subject;
        System.out.println("Notificando mensagem pela TV: " + jornalist.toString());
        }
    }
}
