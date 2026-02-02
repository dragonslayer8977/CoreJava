package custom_sorting;

// comparator is an interface that is used to define multiple sorting logics
// if you want to sort players by age
// if you want to sort players by performance
// if you want to sort players by gender
// override compare() method with sorting logic, similar to compareTo()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ComparatorTeam {

    public static void main(String[] args) {

        ArrayList<Player> playerList = new ArrayList<> ();

        playerList.add(new Player ("ronaldo", 99, 54, 'm'));
        playerList.add(new Player ("messi", 97, 55, 'm'));
        playerList.add(new Player ("Mbappe", 100, 65, 'm'));
        playerList.add(new Player ("nemor", 98, 47, 'm'));

        Collections.sort (playerList, new Comparator<Player> () {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.name.compareTo(o2.name);
            }
        }); // sorts players by their names in lexical order
        for(Player p : playerList) {
            p.printPlayer ();
        }

        System.out.println ();

        Collections.sort (playerList, new Comparator<Player> () {
            @Override
            public int compare(Player o1, Player o2) {
                if(o2.performanceScore == o1.performanceScore) {
                    return o2.gender - o1.gender;
                }
                return o2.performanceScore - o1.performanceScore;
            }
        }); // sorts by performance score if they are equal then compares gender
        for(Player p : playerList) {
            p.printPlayer ();
        }


    }

}
