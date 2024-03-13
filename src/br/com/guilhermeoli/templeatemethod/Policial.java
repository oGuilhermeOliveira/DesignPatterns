package br.com.guilhermeoli.templeatemethod;

/**
 * @author guiol
 */
public class Policial extends Trabalhador{


    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como policial");
    }
}
