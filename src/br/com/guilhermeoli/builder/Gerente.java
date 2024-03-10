package br.com.guilhermeoli.builder;

/**
 * @author guiol
 */
public class Gerente {

    BurgerBuilder builder;

    public Gerente(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
