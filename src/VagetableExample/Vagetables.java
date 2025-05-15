package VagetableExample;
import java.util.*;


public class Vagetables {
    public static void main(String[] args) {
        TreeSet<Vage> allVeggies = new TreeSet<>(Comparator.comparing(Vage :: getName));
        TreeSet<Vage> numVeggies = new TreeSet<>(Comparator.comparing(Vage :: getNum).reversed());
        Random r = new Random();
        final int ITERATION_TIME = 10;
        Vage tomato = new Vage("Tomato", 0);
        Vage potato = new Vage("Potato", 0);
        Vage carrot = new Vage("Carrot", 0);
        Vage celery = new Vage("Celery", 0);

        int tomatoCounter = 0;
        int potatoCounter = 0;
        int carrotCounter = 0;
        int celeryCounter = 0;

        allVeggies.add(tomato);
        allVeggies.add(potato);
        allVeggies.add(carrot);
        allVeggies.add(celery);

        int size = allVeggies.size();
        Vage[] allVeggiesArray = new Vage[size];

        allVeggiesArray = allVeggies.toArray(allVeggiesArray);
        
        for(int i = 0; i < ITERATION_TIME; i++){
            int index = r.nextInt(size);

            if(allVeggiesArray[index].getName().equals("Tomato")){
                tomatoCounter++;
                allVeggiesArray[index].setNum(tomatoCounter);
            } else if(allVeggiesArray[index].getName().equals("Potato")){
                potatoCounter++;
                allVeggiesArray[index].setNum(potatoCounter);
            } else if(allVeggiesArray[index].getName().equals("Carrot")){
                carrotCounter++;
                allVeggiesArray[index].setNum(carrotCounter);
            } else if(allVeggiesArray[index].getName().equals("Celery")){
                celeryCounter++;
                allVeggiesArray[index].setNum(celeryCounter);
            } 
        }

        for(Vage v : allVeggiesArray){
            numVeggies.add(v);
        }

        for (Vage v : numVeggies) {
            System.out.println("Name: "+ v.getName() + "; Amount: " + v.getNum());
        }
    }

}
