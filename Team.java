package gamescopy;
import java.util.*;


public class Team<T extends Player> implements Comparable<Team<T>>{/*Here Player is said to be the upper bound of T. T is a bounded parameter.*/
    /*If we use any other class not derived from player as a parameter then we will get an error*/
    private String teamName;

    public Team(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    private int lost=0;
    private int win = 0;
    private int played = 0;
    private int tie = 0;

    private List<T> member = new ArrayList<>();

    public boolean addPlayer(T player){
        if(member.contains(player)){
            System.out.println("The player "+((Player)player).getplayerName()+" is already present in the team "+teamName);
            return false;
        }else{
            member.add(player);
            System.out.println("The player "+((Player)player).getplayerName()+" added to the team "+teamName);
            return true;
        }
    }

    public int playerNum(){
        return member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message = "";
        if(ourScore>theirScore){
            win++;
            System.out.println(this.teamName+" win");
            message = " wins from ";
        }else if(theirScore == ourScore){
            tie++;
            System.out.println(this.teamName+" ties");
            message = " ties ";
        }else{
            lost++;
            System.out.println(this.teamName+" lost");
            message = " lost to ";
        }
        played++;
        if(opponent != null){
          //  System.out.println(this.teamName+message+opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int Ranking(){return (this.win*2)+this.tie;}

    public int compareTo(Team<T> team){
        if(this.Ranking() > team.Ranking()) return -1;
        else if(this.Ranking() < team.Ranking()) return 1;
        else return 0;
    }

}
