// Név: Lehoczki Patrícia
// Dátum: 2021.11.29
// Osztály: Szoft II/N

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class CaloryTest {
    Calory calory;

    @BeforeEach
    void setUp(){
        this.calory = new Calory();
    }


    @Test
    @DisplayName("normál kalóriszámolás nőknél")
    void calcCalcoryWomanTest(){
        double weight = 60;
        double height = 175;
        int age = 25;
        double expectedCalory = 1436.312;
        double actualCalory = this.calory.calcWoman(weight, height, age);

        assertEquals(expectedCalory, actualCalory, 0.001);
    }

    @Test
    @DisplayName("normál kalóriszámolás férfiaknál")
    void calcCalcoryManTest(){
        double weight = 90;
        double height = 190;
        int age = 30;
        double expectedCalory = 2035.892;
        double actualCalory = this.calory.calcMan(weight, height, age);

        assertEquals(expectedCalory, actualCalory, 0.001);
    }

    @Test
    @DisplayName("kivétel ellenőrzés nőknél")
    void testExceptedExceptionWoman() {
 
        assertThrows(IllegalArgumentException.class, ()->{
            this.calory.calcWoman(-10, 50, 50);
        });
    }

    @Test
    @DisplayName("kivétel ellenőrzés nőknél")
    void testExceptedExceptionMan() {
 
        assertThrows(IllegalArgumentException.class, ()->{
            this.calory.calcMan(-10, 50, 50);
        });
    }

        
}

