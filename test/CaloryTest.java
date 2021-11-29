import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CaloryTest {
    Calory calory;

    @BeforeEach
    void setUp(){
        this.calory = new Calory();
    }

    @Test
    void calcCalcoryWomanTest(){
        double weight = 60;
        double height = 175;
        int age = 25;
        double expectedCalory = 1436.312;
        double actualCalory = this.calory.calcWoman(weight, height, age);

        assertEquals(expectedCalory, actualCalory, 0.001);
    }

    @Test
    void calcCalcoryManTest(){
        double weight = 90;
        double height = 190;
        int age = 30;
        double expectedCalory = 2035.892;
        double actualCalory = this.calory.calcMan(weight, height, age);

        assertEquals(expectedCalory, actualCalory, 0.001);
    }

        
}

