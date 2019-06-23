package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalcTest {

    @Test
    public void withMaam() {
        TaxCalc taxCalc = new TaxCalc();

        MaamResolver maamResolverMock = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolverMock.getMaam()).thenReturn(0.10);
//        taxCalc.setMaamResolver(maamResolverMock);


        double answer = taxCalc.withMaam(100);
        Assert.assertEquals(110,answer,0.000001);
    }
}







