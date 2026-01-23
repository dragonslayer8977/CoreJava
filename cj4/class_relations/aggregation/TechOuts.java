package class_relations.aggregation;


import java.util.Set;

public class TechOuts {

    Set<Interns> internsList;



    public void addInterns(Set<Interns> internsList) {
        this.internsList = internsList;
    }

    public int getInternsCnt() {
        return this.internsList.size();
    }

}
