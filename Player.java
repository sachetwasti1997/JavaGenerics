package gamescopy;

public abstract class Player {

    String playerName;

    public Player(String playerName){
        this.playerName = playerName;
    }

    public String getplayerName(){
        return playerName;
    }

}
