package br.com.guilhermeoli.observer;

/**
 * @author guiol
 */
public class Demo {

    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
