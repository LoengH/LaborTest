import java.util.Scanner;

public class Testen {

    public static void main(String[] args) {
        int[] feld = new int[6];
        fill(feld);
        abc(feld);
        printSortedArray(feld);
    }

    public static void abc(int[] feld) {
        int temp;
        do {
            temp = feld[0];
            for (int j = 1; j < feld.length; j++) {
                if (feld[j] < feld[j - 1]) {
                    temp = feld[j - 1];
                    feld[j - 1] = feld[j];
                    feld[j] = temp;
                }
            }
        } while (temp != feld[0]);
    }

    public static void fill(int[] feld) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < feld.length; i++) {
            String eingabe = sc.next();
            feld[i] = Integer.parseInt(eingabe);
        }
    }

    public static void printSortedArray(int[] feld) {
        for (int i = 0; i < feld.length; i++) {
            System.out.println(feld[i]);
        }
    }
}