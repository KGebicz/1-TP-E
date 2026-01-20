import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Zmienne prymitywne
        int wiek = 20;
        double waga = 65.5;
        char litera = 'J';
        String l="sad";
        boolean prawda = true;

        System.out.println("Wiek: " + wiek);
        System.out.println("Waga: " + waga);
        System.out.println("Litera: " + litera);
        System.out.println("Prawda: " + prawda);

        // 2. Pobieranie danych od użytkownika
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.next();

        System.out.print("Podaj swój ulubiony numer: ");
        int liczba = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Cześć " + imie + ", Twój numer to " + liczba);

        // 3. Instrukcje warunkowe
        if (liczba > 0) {
            System.out.println("Twój numer jest dodatni");
        } else if (liczba < 0) {
            System.out.println("Twój numer jest ujemny");
        } else {
            System.out.println("Twój numer to zero");
        }

        // 4. Pętle
        System.out.println("Pętla for od 0 do 4:");
        for (int i = 0; i < 5; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("Pętla while od 0 do 4:");
        int j = 0;
        boolean j= true;
        while (j) {
            System.out.println("j = " + j);
            j++;
            if(j<5){
                j=f
            }
        }

        System.out.println("Pętla do-while od 0 do 4:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // 5. Tablice jednowymiarowe
        int[] liczby = {1, 2, 3, 4, 5};
        System.out.println("Tablica 1D:");
        for (int x : liczby) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 6. Tablice dwuwymiarowe
        int[][] macierz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Tablica 2D:");
        for (int i = 0; i < macierz.length; i++) {
            for (int j2 = 0; j2 < macierz[i].length; j2++) {
                System.out.print(macierz[i][j2] + " ");
            }
            System.out.println();
        }

        // 7. Wczytywanie tablicy od użytkownika
        System.out.println("Tworzymy tablicę 1D od użytkownika");
        System.out.print("Podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();
        int[] tablicaUzytkownika = new int[rozmiar];

        for (int i = 0; i < rozmiar; i++) {
            System.out.print("Podaj element " + i + ": ");
            tablicaUzytkownika[i] = scanner.nextInt();
        }

        System.out.println("Twoja tablica:");
        for (int el : tablicaUzytkownika) {
            System.out.print(el + " ");
        }
        System.out.println();

        // Zamknięcie scanner
        scanner.close();
    }
}
