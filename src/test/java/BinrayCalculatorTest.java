import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinrayCalculatorTest {

    BinrayCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new BinrayCalculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void binaryAdd() {
        assertEquals(  "101", calculator.binaryAdd( "11", "10"));
    }

    @Test
    void binarySubtract() {
        assertEquals("11", calculator.binarySubtract("110", "11"));
    }

    @Test
    void binaryMultiply() {
        assertEquals("100", calculator.binaryMultiply("10","10"));
    }

    @Test
    void binaryDivide() throws DivisonByZeroException {
        assertEquals("11", calculator.binaryDivide("1001","11"));
    }

    @Test
    void divisionByZero(){
        assertThrows(DivisonByZeroException.class, () ->
        {
            calculator.binaryDivide("1", "0" );
        });
    }
}