package br.com.guilhermeoli.Factory;

/**
 * @author guiol
 */
public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade))
        {
            return new CorollaCar(100, "Full", "Azul");
        } else
        {
            return new FiatCar(200, "Full", "Preto");
        }
    }
}
