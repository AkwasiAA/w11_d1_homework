public class WaterBottle {

    private int volume;

//    constructor
    public WaterBottle(){
        this.volume = 100;
    }

    public int getBottleVolume(){
        return this.volume;
    }

    public void drinkFromBottle(){
        this.volume -= 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void fillBottle(){
        this.volume = 100;
    }
}
