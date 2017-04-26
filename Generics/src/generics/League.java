/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author franc
 */
public class League <T extends Team>  {
    
    String name;
    ArrayList<T> league = new ArrayList<>();
    
public League (String name){
    this.name = name;
}

public String getName(){
    return this.name;
}

public boolean addTeam(T t){
    if(league.contains(t)){
        System.out.println("Team already in league");
        return false;
    } else{
        league.add(t);
        return true;
    }
}

public void showLeagueTable(){
    Collections.sort(league);
    for(T t : league){
        System.out.println(t.getName()+": "+ t.ranking());
    }
}
    
}
