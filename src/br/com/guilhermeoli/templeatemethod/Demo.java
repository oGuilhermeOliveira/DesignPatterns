package br.com.guilhermeoli.templeatemethod;

/**
 * @author guiol
 */
public class Demo {

    public static void main(String[] args) {
        Trabalhador t = new Advogado();
        t.executarRotina();

        System.out.println(" ");

        Trabalhador t1 = new Policial();
        t1.executarRotina();
    }
}
