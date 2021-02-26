public class MainTask3 {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.print(str);
        }
        for (String str : args) {
            System.out.print("\n");
            System.out.print(str);
        }
    }
}