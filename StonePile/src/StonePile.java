import java.util.*;

public class StonePile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> weights = new ArrayList();
        for (int i = 0; i < n; i++)
            weights.add(sc.nextInt());

        Collections.sort(weights, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        int pileOneWeight = weights.get(0), pileTwoWeight = 0;
        for (int i = 1; i < n; i++) {
            if (pileTwoWeight < pileOneWeight)
                pileTwoWeight += weights.get(i);
            else
                pileOneWeight += weights.get(i);
        }
        System.out.println(Math.abs(pileOneWeight-pileTwoWeight));
    }
}
