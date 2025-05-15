package School;

public class Students {
    private String name;
    private int idNumbers;
    private int grades;
    private boolean hasHomerooms;
    private Homerooms homerooms;

    //students without homerooms
    Students(String name, int idNumbers){
        this.name = name;
        this.idNumbers = idNumbers;
        this.grades = (int) (Math.random() * 100) + 1;
        hasHomerooms = false;
    }

    //students with homerooms
    Students(String name, int idNumbers, Homerooms homerooms){
        this.name = name;
        this.idNumbers = idNumbers;
        this.grades = (int) (Math.random() * 100) + 1;
        hasHomerooms = true;
        this.homerooms = homerooms;
    }

    public int getGrades(){
        return grades;
    }

    public String toString(){
        String information = "name: " + name + "\n" +"idNumbers: " + idNumbers + "\n";
        return information;
    }


}
