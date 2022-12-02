import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> exactNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50 ; i++) {
            arrayList.add(random.nextInt(0,100) );
        if(arrayList.get(i)%2 ==0){
            evenNumbers.add(arrayList.get(i));
        }else{
            exactNumbers.add(arrayList.get(i));
        }
        }
        System.out.println("arrayList = " + arrayList);
        System.out.println("exactNumbers = " + exactNumbers);
        System.out.println("evenNumbers = " + evenNumbers);
    }
}
