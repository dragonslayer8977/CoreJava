package class_relations.association;

import java.util.List;

public class Computer {

    List<Peripherals> components;

    public void addPeripherals(List<Peripherals> components) {
        this.components = components;
    }
}
