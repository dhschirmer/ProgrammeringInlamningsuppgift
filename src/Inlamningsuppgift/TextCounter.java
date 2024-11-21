package Inlamningsuppgift;

import java.util.Scanner;

public class TextCounter {
    public static void main(String[] args) {
        // Objekt
        TextAnalyser analyser = new TextAnalyser();

        // Läs in en text
        Scanner scan = new Scanner(System.in);
        String text = ""; // Används för att lagra användarens text

        // Kontrollloop - avslutas när användaren skriver "Stop"
        // Anropar metoden "isNotStop" från objektet analyser – "text" är parametern
        while (analyser.isNotStop(text)) {
            System.out.println("Skriv en mening eller skriv 'stop' för att avsluta: ");
            text = scan.nextLine(); // Hämtar nästa text som skrivs av användaren

            // Bearbetar användarens text
            analyser.countRows(text);
            analyser.countCharacters(text);
            analyser.countWords(text);
            analyser.checkLongestWord(text);
        }

        // Skriver ut hur många rader
        System.out.println("Antalet rader är: " + analyser.getRows());

        // Skriver ut antal tecken
        System.out.println("Antalet tecken är: " + analyser.getCharacters());

        // Skriver ut antalet ord
        System.out.println("Antalet ord är: " + analyser.getWords());

        // Skriver ut längsta ordet
        System.out.println("Längsta ord är: " + analyser.getLongestWord());
    }
}
