package School;

public class IBStudents extends Students{
    private int grades = (int) (Math.random() * 7) + 1;;

    IBStudents(String name, int idNumbers){
        super(name, idNumbers);
    }

    IBStudents(String name, int idNumbers, Homerooms homerooms){
        super(name, idNumbers, homerooms);
    }

    public int getGrades(){
        return grades;
    }
}
