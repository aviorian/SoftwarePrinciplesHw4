import java.util.Scanner;

public class SimpleProgram {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int i = scn.nextInt();
        int j = scn.nextInt();

        while(i<j-1) {
            i++;
            System.out.println(i);
        }
    }
}
