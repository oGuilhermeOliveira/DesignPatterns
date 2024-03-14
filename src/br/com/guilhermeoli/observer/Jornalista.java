package br.com.guilhermeoli.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guiol
 */
public class Jornalista implements Subject{

    private String titulo;

    public List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String titulo) {
        this.titulo = titulo;
        for (Observer ob : this.observers) {
            ob.update(this);
        }
    }
}
