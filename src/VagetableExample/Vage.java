package VagetableExample;

public class Vage {
    private String name;
    private int num;

    Vage(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
    
}
