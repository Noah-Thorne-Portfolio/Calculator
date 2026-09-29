import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class basicLogicTest {
    @Test
    public void testAdd() {
        int resulti = 8;
        double resultf = 8.0;
        int result = Logic.add(3,5);
        double result2 = Logic.addf(3.0,5.0);

        assertEquals(resulti, result,"working1");
        assertEquals(resultf, result2,"working2");
    }

    @Test
    public void testSubtract() {
        int resulti = -2;
        double resultf = -2.0;
        int result = Logic.subtract(3,5);
        double result2 = Logic.subtractf(3.0,5.0);

        assertEquals(resulti, result,"working1");
        assertEquals(resultf, result2, "working2");
    }

    @Test
    public void testMultiply() {
        int resulti = 15;
        double resultf = 15.0;
        int result = Logic.multiply(3,5);
        double result2 = Logic.multiplyf(3.0,5.0);

        assertEquals(resulti, result,"working1");
        assertEquals(resultf, result2, "working2");
    }

    @Test
    public void testDivide() {
        int resulti = 2;
        double resultf = 2.0;
        int result = Logic.divide(10,5);
        double result2 = Logic.dividef(10.0,5.0);

        assertEquals(resulti, result,"working1");
        assertEquals(resultf, result2, "working2");
    }
}
