package tdd;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class TaxCalc {


    double withMaam(double price) {
        return price * MaamResolverSingleton.getInstance().getMaam()+price;
    }
}








