/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author franc
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        League<Team<SoccerPlayer>> soccerleague = new League<>("AFL");
        Team<SoccerPlayer> CruzAzul = new Team<>("Cruz Azul");
        Team<SoccerPlayer> America = new Team<>("America");
        Team<SoccerPlayer> Necaxa = new Team<>("Necaxa");
       
        CruzAzul.matchResult(America, 3, 2);
        America.matchResult(Necaxa, 0, 4);
        
        soccerleague.addTeam(CruzAzul);
        soccerleague.addTeam(America);
        soccerleague.addTeam(Necaxa);
    }
    
}
