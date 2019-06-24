package gabriel;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@SymbolQualifier(SymbolType.DRIVER)
public class DriverPeriodCalculator01 implements PeriodCalculator {
    @Override
    public int calc() {
        return 10;
    }

    @Override
    public int sinceYear() {
        return 2018;
    }
}
