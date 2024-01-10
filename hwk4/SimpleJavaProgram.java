import java.util.Scanner;

public class SimpleProgram {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int i = 1;
        int j = 10;

        while(i<j-1) {
            i++;
            if(i%2==1) {
               System.out.println(i); 
            }
            
        }
    }
}