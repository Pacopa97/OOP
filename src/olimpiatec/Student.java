package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Student {
    private String name;
    private String ID;
    private String career;
    private ArrayList<Sport> sport;
    
    
public Student(String name, String ID, String career){
    this.name=name;
    this.ID=ID;
    this.career=career;
    this.sport= new ArrayList();
}


public Student(String career){
    this.career=career;
}

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getCareer() {
        return career;
    }
    
public boolean addSport(Sport sport){
    for(Sport temp: this.sport){
        if(temp.getName().equalsIgnoreCase(sport.getName())){
        return false;
    }
    }
    this.sport.add(sport);
    return true;
}

public boolean removeSport(Sport sport){
    for(Sport temp:this.sport){
        if(temp.getName().equalsIgnoreCase(sport.getName())){
            this.sport.remove(temp);
        }
    }
    return false;    
}

public String listSports(){
    String list= toString()+", Sports: ";
    for(Sport temp: this.sport){
        list += temp.getName()+", ";
    }
    list = list.substring(0, list.length()-1);
    return list;
}

@Override
public String toString(){
     
    return "Name = "+this.name+", ID = "+this.ID+", Career = "+this.career  ;
}


    
}
