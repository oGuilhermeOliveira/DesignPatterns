package br.com.guilhermeoli.templeatemethod;

/**
 * @author guiol
 */
public class Bombeiro extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }
}
