package PeopleExample;

public class Person {
    private String name;
    private boolean fatigue;
    private Cup item; //aggregation : person uses a cup

    public Cup getCup(){
        return item;
    }

    public void setName(String name){
        this.name = name;
    }

}
