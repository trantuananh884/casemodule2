package Classes;

import java.util.ArrayList;


public class Fixtures {
    ArrayList<Tickets>fixtureList = new ArrayList<>();
    public Fixtures(){
        fixtureList.add(new Tickets("Mancity","00:30 Sun 13 Dec","H","EPL",10,1));
        fixtureList.add(new Tickets("Sheff Utd","03:00 Fri 18 Dec","A","EPL",10,2));
        fixtureList.add(new Tickets("Leeds","23:30 Sun 20 Dec", "H","EPL",10,3));
        fixtureList.add(new Tickets("Everton","03:00 Thu 24 Dec","A","Leaguage cup",10,4));
    }
    public void showFixtures(){
        for (Tickets tickets : fixtureList){
            System.out.println(tickets.toStringfixtures());
        }
    }
    public void showTickets(){
        for (Tickets tickets : fixtureList){
            System.out.println(tickets.toStringtickets());
        }
    }

    public class Tickets extends Goods{
        String opponent;
        String timeandate;
        String homeoraway;
        String leaguage;



        public Tickets(String opponent, String timeandate, String homeoraway,String leaguage,int stock,int id){
            this.opponent = opponent;
            this.timeandate=timeandate;
            this.homeoraway = homeoraway;
            this.stock = stock;
            this.available = stock;
            this.leaguage= leaguage;
            this.id = id;
        }


        public String toStringfixtures() {
            return "Fixtures{" +
                    "opponent='" + opponent + '\'' +
                    ", timeandate='" + timeandate + '\'' +
                    ", homeoraway='" + homeoraway + '\'' +
                    ", leaguage='" + leaguage + '\'' +
                    ", stock=" + stock +
                    ", available=" + available +
                    '}';
        }


        public String toStringtickets() {
            return "Tickets{" +
                    "opponent='" + opponent + '\'' +
                    ", timeandate='" + timeandate + '\'' +
                    ", homeoraway='" + homeoraway + '\'' +
                    ", leaguage='" + leaguage + '\'' +
                    ", stock=" + stock +
                    ", available=" + available +
                    '}';
        }


    }
}
