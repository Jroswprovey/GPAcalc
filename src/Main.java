import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int holder = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your grades in this formant: 100,68,32,87 etc ");
        String GradesStringInput = input.next();

        String StringGradeArr[] = GradesStringInput.split(",");
        ArrayList<Integer> IntGradeArr = new ArrayList<Integer>();

        for(String i : StringGradeArr){
            IntGradeArr.add(Integer.parseInt(i));
        }

        for (int i : IntGradeArr){
            holder =+ i;
        }

        int result;

        result = holder/IntGradeArr.size();

        System.out.println(result);



    }
}
