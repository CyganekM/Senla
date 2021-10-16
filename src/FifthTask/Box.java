package FifthTask;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private int volume;
    private int freeVolume;
    private List<Thing> things;

    public Box(int volume) {
        this.volume = volume;
        this.freeVolume = volume;
        this.things = new ArrayList<>();
    }

    public boolean add(Thing thing){
        if(this.freeVolume >= thing.getVolume()){
            this.freeVolume -= thing.getVolume();
            this.things.add(thing);
            System.out.println(thing);
        }
        if(this.freeVolume == 0) return false;
        return true;
    }

    public int getCost(){
        return things.stream().mapToInt(Thing::getCost).sum();
    }

    public int getFreeVolume() {
        return this.freeVolume;
    }

    public int getVolume() {
        return volume;
    }
}
