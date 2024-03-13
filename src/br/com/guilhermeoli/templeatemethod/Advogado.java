package br.com.guilhermeoli.templeatemethod;

/**
 * @author guiol
 */
public class Advogado extends Trabalhador{


    @Override
    protected void trabalhar() {

    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando para casa de carro");
    }

    @Override
    protected void irAoTrabalho() {
        super.irAoTrabalho();
    }

    @Override
    protected void iniciarRotina() {
        super.iniciarRotina();
    }

    @Override
    protected void levantar() {
        super.levantar();
    }
}
