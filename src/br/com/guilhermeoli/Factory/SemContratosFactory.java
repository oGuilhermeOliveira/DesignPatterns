package br.com.guilhermeoli.Factory;

/**
 * @author guiol
 */
public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade))
        {
            return new BrasiliaCar(100, "Full", "Amarela");
        } else
        {
            return new GolCar(-50, "Empty", "Preto");
        }
    }
}
