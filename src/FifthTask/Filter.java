package FifthTask;

import java.util.Comparator;

public class Filter implements Comparator<Thing> {
    @Override
    public int compare(Thing o1, Thing o2) {
        return (int) ( o2.getCostV()-o1.getCostV());
    }
}