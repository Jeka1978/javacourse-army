package gabriel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class SymbolBonus extends Symbol {

    @Override
    @Autowired
    @SymbolQualifier(SymbolType.BONUS)
    void setCalculators(List<PeriodCalculator> calculators) {
        this.calculators=calculators;
    }
}




