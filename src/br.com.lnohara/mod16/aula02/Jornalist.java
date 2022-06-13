package br.com.lnohara.mod16.aula02;

import java.util.ArrayList;
import java.util.List;

public class Jornalist implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String title, summary, image, text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void publish(String title, String summary, String image, String text){
        this.title = title;
        this.summary = summary;
        this.image = image;
        this.text = text;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public String toString() {
        return "Jornalist{" +
                "observers=" + observers +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
