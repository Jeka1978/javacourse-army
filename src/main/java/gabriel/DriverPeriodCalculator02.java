package gabriel;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@SymbolQualifier(SymbolType.DRIVER)
public class DriverPeriodCalculator02 implements PeriodCalculator {
    @Override
    public int calc() {
        return 15;
    }

    @Override
    public int sinceYear() {
        return 2019;
    }
}
