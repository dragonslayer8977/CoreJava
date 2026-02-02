package custom_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableTeam {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<> ();

        playerList.add(new Player ("ronaldo", 99, 54, 'm'));
        playerList.add(new Player ("messi", 99, 55, 'm'));
        playerList.add(new Player ("Mbappe", 100, 65, 'm'));
        playerList.add(new Player ("nemor", 98, 47, 'm'));

        Iterator<Player> i = playerList.iterator ();

        System.out.println ("Before ordering");
        while(i.hasNext ()) {
            i.next ().printPlayer ();
        }

        System.out.println ();
        System.out.println ("after ordering");
        Collections.sort (playerList); // first sorts by score if two players have same score then checks the name
        for(Player p : playerList) {
            p.printPlayer ();
        }

    }

}
