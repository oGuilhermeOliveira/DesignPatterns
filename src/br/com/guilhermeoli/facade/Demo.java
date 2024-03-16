package br.com.guilhermeoli.facade;

/**
 * @author guiol
 */
public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L, "String"));
    }
}
