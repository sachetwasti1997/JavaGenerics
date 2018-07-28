package gamescopy;

public class Main {

    public static void main(String[]ar){
        FootBallPlayer joe = new FootBallPlayer("Joe");
        SoccerPlayer pat = new SoccerPlayer("Pat");
        BasballPlayer sachet = new BasballPlayer("Sachet");
        FootBallPlayer jhon = new FootBallPlayer("Jhon");
        SoccerPlayer pinki = new SoccerPlayer("Pinki");
        BasballPlayer tinku = new BasballPlayer("Tinku");

        FootBallPlayer rajib = new FootBallPlayer("Rajib");
        SoccerPlayer rinku = new SoccerPlayer("Rinku");
        BasballPlayer tika = new BasballPlayer("Tika");
        FootBallPlayer saya = new FootBallPlayer("Saya");
        SoccerPlayer madhu = new SoccerPlayer("Madhu");
        BasballPlayer pushpa = new BasballPlayer("Pushpa");


        Team <FootBallPlayer>team = new Team<>("footballTeam");
        Team <SoccerPlayer> team1 = new Team<>("soccerTeam");
        Team <BasballPlayer> team2 = new Team<>("baseballTeam");

        Team <FootBallPlayer>teami = new Team<>("footballTeami");
        Team <SoccerPlayer> team1i = new Team<>("soccerTeami");
        Team <BasballPlayer> team2i = new Team<>("baseballTeami");



        team.addPlayer(joe);
        team.addPlayer(jhon);
        team1.addPlayer(pat);
        team1.addPlayer(pinki);
        team2.addPlayer(sachet);
        team2.addPlayer(tinku);

        teami.addPlayer(rajib);
        teami.addPlayer(saya);
        team1i.addPlayer(rinku);
        team1i.addPlayer(madhu);
        team2i.addPlayer(pushpa);
        team2i.addPlayer(tika);

        System.out.println("Number of players in the football team "+team.playerNum());
        System.out.println("Number of players in the baseball team "+team2.playerNum());
        System.out.println("Number of players in the soccer team "+team1.playerNum());
        System.out.println();
        System.out.println("Number of players in the footballi team "+teami.playerNum());
        System.out.println("Number of players in the baseballi team "+team2i.playerNum());
        System.out.println("Number of players in the socceri team "+team1i.playerNum());
        System.out.println();
        team.matchResult(teami,2,1);
        team1.matchResult(team1i,1,2);
        team2.matchResult(team2i,2,2);
        System.out.println();
        System.out.println(team.getTeamName()+" ; "+team.Ranking());
        System.out.println(team1.getTeamName()+" ; "+team1.Ranking());
        System.out.println(team2.getTeamName()+" ; "+team2.Ranking());
        System.out.println();
        System.out.println(teami.getTeamName()+" ; "+teami.Ranking());
        System.out.println(team1i.getTeamName()+" ; "+team1i.Ranking());
        System.out.println(team2i.getTeamName()+" ; "+team2i.Ranking());

        System.out.println(team.compareTo(teami));
        System.out.println(team1.compareTo(team1i));
        System.out.println(team2.compareTo(team2i));
        /*Here we cannot define any other types of teams as Integer, String or so on, because they cannot be casted to Player as we did in
        * Team class.*/
        /*Team<String> bb = new Team<>();*///-->this declaration provides us with error..
    }

}
