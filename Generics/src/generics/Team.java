/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Team <T extends Player> implements Comparable<Team<T>>{
    String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    ArrayList<T> members = new ArrayList<>();
    
public Team (String name){
    this.name = name;
}

public String getName(){
    return this.name;
}

public boolean addPlayer(T p){
    if(members.contains(p)){
        System.out.println("Player already in team");
        return false;
    } else{
        members.add(p);
        return true;
    }
}

   public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
    

