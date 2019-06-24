package gabriel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class SymbolDriver extends Symbol {
    @Override
    @Autowired
    @SymbolQualifier(SymbolType.DRIVER)
    void setCalculators(List<PeriodCalculator> calculators) {
        this.calculators=calculators;
    }

}