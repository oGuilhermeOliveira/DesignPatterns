package br.com.guilhermeoli.observer;

/**
 * @author guiol
 */
public class TV implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a noticia via TV " + subject.toString());
    }
}
