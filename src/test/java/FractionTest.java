import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void ReduceTest() {
        Fraction f1 = new Fraction(2, 4);
        f1 = f1.reduce(f1);
        assertEquals(f1.getNumerator(), 1);
        assertEquals(f1.getDenominator(), 2);
    }

}
