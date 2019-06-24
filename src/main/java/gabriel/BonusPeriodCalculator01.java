package gabriel;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@SymbolQualifier(SymbolType.BONUS)
public class BonusPeriodCalculator01 implements PeriodCalculator {
    @Override
    public int calc() {
        return 100;
    }

    @Override
    public int sinceYear() {
        return 2018;
    }
}
