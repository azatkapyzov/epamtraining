import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer toll = new StringBuffer(vvod.nextLine());
            toll.reverse();
            System.out.println(toll.toString());
        }
    }
}