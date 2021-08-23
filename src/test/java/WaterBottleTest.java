import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.getBottleVolume());
    }

    @Test
    public void canDrinkFromBottle(){
        waterBottle.drinkFromBottle();
        assertEquals(90,waterBottle.getBottleVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getBottleVolume());
    }

    @Test
    public void canFillBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getBottleVolume());
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getBottleVolume());
    }
}
