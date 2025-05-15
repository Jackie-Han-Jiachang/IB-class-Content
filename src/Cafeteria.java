import java.util.*;


public class Cafeteria {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        LinkedList<String> allStudents = new LinkedList<>(Arrays.asList(new String[]{"A", "B", "C", "D", "E","F","G","H","I","J"}));
        //final int NUM_STEPS = 10;
        Random r = new Random();

        //for (int i=0; i<NUM_STEPS; i++) {
        while(! allStudents.isEmpty()){
            // either randomly add a student to the caff, or serve a student
            if (q.isEmpty() || r.nextBoolean()) {
                // add student
                int studentIndex = r.nextInt(0,allStudents.size());
                String stud = allStudents.remove(studentIndex);
                q.add(stud);
                System.out.println(stud + " added to queue");

            } else {
                // serve
                String stud = q.remove();
                System.out.println(stud + " ate");
            }

            try {
                Thread.sleep(500); // 1 s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while(!q.isEmpty()){
            String stud = q.remove();
            System.out.println(stud + " ate");

            try {
                Thread.sleep(500); // 1 s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    // public static void main(String[] args) {
        
    //     ArrayList<String> name = new ArrayList<>();
    //     Queue<String> nameInLine = new LinkedList<>();

    //     name.clear();
    //     nameInLine.clear();

    //     name.add("a");
    //     name.add("b");
    //     name.add("c");
    //     name.add("d");
    //     name.add("e");

    //     int size = name.size();

    //     //get one name and put them in line
    //     for(int i = 0; i < size; i++){
    //         Random r = new Random();
    //         Random getLine = new Random();
    //         Random rForLine = new Random();

    //         int index = r.nextInt(0,name.size());
    //         boolean line = getLine.nextBoolean();

    //         if (line){
    //             System.out.println(name.get(index) + " get in to the line");
    //             name.remove(index);
    //             nameInLine.add(name.get(index));
    //         }else{
    //             if (nameInLine.size() == 0){
    //                 System.out.println("no body in line!!!");
    //             }else{
    //                 System.out.println(nameInLine.remove() + " eats");
    //             }
    //         }

    //         // wait 1s
    //         try{
    //             Thread.sleep(1000);
    //         } catch (InterruptedException e){
    //             throw new RuntimeException();
    //         }
            
    //     }
    // } 
}
