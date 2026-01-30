package list_interface;

import java.util.ArrayList;
import java.util.List;

class Watch {
    String watchName;
    double watchCost;

    Watch(String watchName, double watchCost) {
        this.watchName = watchName;
        this.watchCost = watchCost;
    }

    public void printDetails() {
        System.out.println ("Name: " + this.watchName + " " + "Cost: " + this.watchCost);
    }
}

public class ArrayListUsage {

    public static void main(String[] args) {
        List<Watch> list = new ArrayList<> ();
        list.add(new Watch ("Casio", 1999.99));
        list.add(new Watch ("Taiwan", 999.99));
        list.add(new Watch ("Taiwan", 999.99));
        list.add(new Watch ("Seiko", 29000.00));

        list.get(2).printDetails ();
        list.remove (new Watch ("Taiwan", 999.99));

    }
}
