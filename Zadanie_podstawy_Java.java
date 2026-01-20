import java.util.Scanner;

public class ProsteZadania {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ======================
        // ZADANIE 1
        // ======================
        System.out.println("ZADANIE 1");
        System.out.print("Podaj liczbe: ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Liczba dodatnia");
        }
        if (a < 0) {
            System.out.println("Liczba ujemna");
        }
        if (a == 0) {
            System.out.println("Zero");
        }

        if (a % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }

        // ======================
        // ZADANIE 2
        // ======================
        System.out.println("\nZADANIE 2");
        int[] tab = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbe: ");
            tab[i] = sc.nextInt();
            suma = suma + tab[i];
        }

        int min = tab[0];
        int max = tab[0];

        for (int i = 0; i < 5; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // ======================
        // ZADANIE 3
        // ======================
        System.out.println("\nZADANIE 3");
        int[][] tab2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab2D[i][j] + " ");
                suma2 = suma2 + tab2D[i][j];
            }
            System.out.println();
        }

        System.out.println("Suma elementow: " + suma2);

        // ======================
        // ZADANIE 4
        // ======================
        System.out.println("\nZADANIE 4");
        System.out.print("Podaj n: ");
        int n = sc.nextInt();

        System.out.println("Liczby od 1 do n:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nParzyste:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNieparzyste:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // ======================
        // ZADANIE 5
        // ======================
        System.out.println("\n\nZADANIE 5");
        System.out.print("Podaj rozmiar tablicy: ");
        int r = sc.nextInt();

        int[] tabU = new int[r];
        int sumaU = 0;

        for (int i = 0; i < r; i++) {
            System.out.print("Podaj liczbe: ");
            tabU[i] = sc.nextInt();
            sumaU = sumaU + tabU[i];
        }

        System.out.println("Tablica:");
        for (int i = 0; i < r; i++) {
            System.out.print(tabU[i] + " ");
        }

        System.out.println("\nOdwrotnie:");
        for (int i = r - 1; i >= 0; i--) {
            System.out.print(tabU[i] + " ");
        }

        double srednia = sumaU / (double) r;
        System.out.println("\nSrednia: " + srednia);

        sc.close();
    }
}
