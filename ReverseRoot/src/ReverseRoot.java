import java.util.Scanner;
import java.util.Stack;

public class ReverseRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> roots = new Stack<Double>();
        long number;

        while (sc.hasNextLong()) {
            number = sc.nextLong();
            roots.add(Math.sqrt(number));
        }

        while (!roots.empty()) {
            System.out.printf("%.4f", roots.pop());
            System.out.println();
        }
        sc.close();
    }
}
