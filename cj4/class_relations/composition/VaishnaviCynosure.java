package class_relations.composition;


import java.util.HashSet;
import java.util.Set;

public class VaishnaviCynosure {

    Set<Office> companiesList;

    public int getCnt() {
        return this.companiesList.size();
    }

    public void addOffice(Set<Office> companiesList) {
        this.companiesList = companiesList;
    }

    public void printOffices() {

        this.companiesList.stream().forEach(e -> {
            System.out.println("Office: " + e.company + " " + "Employee count: " + e.employeeCnt);
        });
    }

}
