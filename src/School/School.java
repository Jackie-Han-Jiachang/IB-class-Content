package School;

public class School {
    public static void main(String[] args) {
        Rooms rooms_801 = new Rooms(801);
        Homerooms homerooms_317 = new Homerooms(317);
        Students Gunn = new Students("Gunn",123);
        Students Sunny = new Students("Sunny", 521, homerooms_317);
        IBStudents Vivas = new IBStudents("Vivas",123);
        IBStudents Jackie = new IBStudents("Jackie", 520, homerooms_317);

        int gunnGrade = Gunn.getGrades();
        IBIO.output("gunn's grades are: " + gunnGrade);
        String sunnyInfo = Sunny.toString();
        IBIO.output("Sunny's personal info is: " + sunnyInfo);
        int jackieGrade = Jackie.getGrades();
        IBIO.output("jackie's grades are: " + jackieGrade);
        int roomNumber = rooms_801.getNumbers();
        IBIO.output("room number of that room is: " + roomNumber);
    }
}
