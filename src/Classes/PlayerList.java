package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerList {
    ArrayList<Players>playerListArray = new ArrayList<>();

    public PlayerList(){
        playerListArray.add(new Players("David Degea"));
        playerListArray.add(new Players("Dean Henderson"));
        playerListArray.add(new Players("Harry Maguire"));
        playerListArray.add(new Players("Macus Rashford"));
        playerListArray.add(new Players("Bruno Fernandez"));
    }
    public void sort(){
        Collections.sort(playerListArray);
    }
    public class Players implements Comparable<Players>{
        String playerName = null;
        public Players(){}
        public Players(String name){
            this.playerName= name;
        }

        public String getPlayerName() {
            return playerName;
        }

        @Override
        public String toString() {
            return "Players{" +
                    "playerName='" + playerName + '\'' +
                    '}';
        }


        @Override
        public int compareTo(Players players) {
            return this.getPlayerName().compareTo(players.getPlayerName());
        }
    }
}
