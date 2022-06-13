package br.com.lnohara.mod16.aula02;

public interface Subject {
    void registerObserver(Observer observer);
    void removerObserver(Observer observer);
    void notifyObserver();
}
