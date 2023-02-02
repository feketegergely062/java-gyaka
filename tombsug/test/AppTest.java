import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

// -----> importálni kell a test funkciót
public class AppTest {
    @Test
       public void calcRadiusTest(){
       double radius =  App.calcRadius(30, 35);
       assertEquals(8.60364654526569, radius);

    }
    @Test
    public void testSecundCalcRadius(){
        double expectedRadius = 29.53918647207887;
        double actualRadius = App.calcRadius(103, 35);
        assertEquals(expectedRadius, actualRadius);
    }
}
