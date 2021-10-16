package FifthTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(40);
        List<Thing> thingList = new ArrayList<>();
        thingList.add(new Thing(5, 7));
        thingList.add(new Thing(3, 100));
        thingList.add(new Thing(600, 10000));
        thingList.add(new Thing(11, 7));
        thingList.add(new Thing(2, 4));
        thingList.add(new Thing(9, 8));
        thingList.add(new Thing(7, 7));
        thingList.add(new Thing(1, 2));
        thingList.add(new Thing(3, 2));
        thingList.add(new Thing(2, 1));
        thingList.stream().sorted();
        List<Thing> sort = thingList.stream().sorted(new Filter()).collect(Collectors.toList());
        for (Thing t : sort) {
            if (!box.add(t)) break;
        }

        System.out.println();
        System.out.println("Cost = " + box.getCost() + ", volume: " + box.getVolume() + ", free volume: " + box.getFreeVolume());
    }
}
