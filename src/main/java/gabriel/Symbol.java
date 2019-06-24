package gabriel;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public abstract class Symbol {
    protected List<PeriodCalculator> calculators;

    abstract void setCalculators(List<PeriodCalculator> calculators);

    @PostConstruct
    private void sortCalculators() {
        calculators.sort((o1, o2) -> o2.sinceYear() - o1.sinceYear());
        System.out.println();
    }

    public int calcPeriod(int year) {
        PeriodCalculator calculator = getCurrentCalculator(year);
        return calculator.calc();
    }

    private PeriodCalculator getCurrentCalculator(int year) {
        for (PeriodCalculator calculator : calculators) {
            if (year >= calculator.sinceYear()) {
                return calculator;
            }
        }
        throw new UnsupportedOperationException(year + " not supported");
    }
}
