package score_sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Players{
    private String name;
    private int score;

    public Players(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "\nPlayers [name=" + name + ", score=" + score + "]";
    }
}


class MyIdDesc implements Comparator<Players>{

    @Override
    public int compare(Players o1, Players o2) {   
        if((o2.getScore()-o1.getScore())==0){
            return o1.getName().compareTo(o2.getName());
        }else{
            return o2.getScore()-o1.getScore();
        }
    }
}


public class SortingScore {
    public static void main(String[] args) {
        

        LinkedList<Players> player =new LinkedList<>();

        player.add(new Players("Aman", 5));
        player.add(new Players("Anmol", 5));
        player.add(new Players("Avinash", 2));


        System.out.println(player);

        Collections.sort(player, new MyIdDesc());
        
        System.out.println(player);
    }
}
