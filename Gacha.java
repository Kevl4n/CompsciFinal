package pkg;
import java.util.*;

public class Gacha {
    Random rand = new Random();
    public int pull;
    public int chance;
    public int threeStar;
    public int fourStar;
    public int fiveStar;
    public ArrayList<String> unit;

    public Gacha(){
        unit = new ArrayList<String>();
        pull = 0;
        threeStar = 0;
        fourStar = 0;
        fiveStar = 0;
    }
    public void getBuh(ArrayList<String> a){
        for(int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));
        
    }
    public void summon(int a){
        for(int i =0; i < a; i++){
            pull = rand.nextInt(100)+1;
            if(pull == 1){
                unit.add("Mr. Poole");
            } else if(pull ==2){
                unit.add("Dr. Neat");
            } else if(pull > 2 && pull < 5){
                fiveStar();
            } else if(pull > 4 && pull < 21){
                fourStar();
            } else if(pull > 20){
                threeStar();
            }
        }
        getBuh(unit);
    }
    public void fiveStar(){
        fiveStar = rand.nextInt(3)+1;
        if(fiveStar == 1){
            unit.add("Omegalul");
        } else if(fiveStar == 2){
            unit.add("BOOBA");
        } else if(fiveStar == 3){
            unit.add("KEKW");
        }
    }
    public void fourStar(){
        fourStar = rand.nextInt(3)+1;
        if(fourStar == 1){
            unit.add("KEKWait");
        } else if(fourStar == 2){
            unit.add("PepeHands");
        } else if(fourStar == 3){
            unit.add("COPIUM");
        }
    }
    public void threeStar(){
        threeStar = rand.nextInt(9)+1;
        if(threeStar == 1){
            unit.add("forsenCD");
        } else if(threeStar == 2){
            unit.add(":tf:");
        } else if(threeStar == 3){
            unit.add("ppL");
        } else if(threeStar == 4){
            unit.add("ppLarge");
        } else if(threeStar == 5){
            unit.add("pepeSus");
        } else if(threeStar == 6){
            unit.add("Pepega");
        } else if(threeStar == 7){
            unit.add("donkSad");
        } else if(threeStar == 8){
            unit.add("Gayge");
        }
    }
}
