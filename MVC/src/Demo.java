import java.util.Arrays;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        float num = 0;
        float account = 1;
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                num++;
            }
            else{
                account++;
            }
        }
        System.out.printf("%.2f\n", num / account);
    }
}