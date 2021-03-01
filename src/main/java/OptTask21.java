import java.util.*;
public class OptTask21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк / столбцов:");
        int n = scanner.nextInt();
        System.out.println("Введите минимальное значение в матрице:");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное значение в матрице:");
        int max = scanner.nextInt();
        int diff = max - min;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Random random = new Random();
                int randomNum = random.nextInt(diff + 1);
                randomNum += min;
                System.out.print(randomNum + " ");
            }
            System.out.println();
        }
    }
}