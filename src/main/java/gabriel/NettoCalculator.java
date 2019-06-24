package gabriel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class NettoCalculator {
    @Autowired
    private SymbolBonus symbolBonus;

    @Autowired
    private SymbolDriver symbolDriver;


    public void printCalculation(int year) {
        int netto = symbolDriver.calcPeriod(year) * 10 + symbolBonus.calcPeriod(year);
        System.out.println("netto = " + netto);
    }

}
