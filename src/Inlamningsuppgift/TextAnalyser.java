package Inlamningsuppgift;

public class TextAnalyser {

    // Attribut
    private int numberRows;
    private int numberCharacters;
    private int numberWords;
    private String longestWord;

    // Konstruktor
    public TextAnalyser() {
        //Initierar attributen med standardvärden
        numberRows = 0;
        numberCharacters = 0;
        numberWords = 0;
        longestWord = "";
    }

    // Metod Stop - Kontrollera om man har skrivit ordet "Stop"
    // Returnerar True om texten inte är Stop, returnerar False om texten är Stop
    public boolean isNotStop(String text) {
        if (text.equalsIgnoreCase("stop")) {
            return false;
        } else {
            return true;
        }
    }

    // Räknar raderna
    public void countRows(String line) {
        if (isNotStop(line)) {
            // Ökar raderna med 1
            numberRows = numberRows + 1;
        }
    }

    // Hämta antalet rader
    public int getRows() {
        return numberRows;
    }

    // Räknar tecken
    public void countCharacters(String line) {
        if (isNotStop(line)) {
            // Ökar radens längd (antal tecken)
            numberCharacters = numberCharacters + line.length();
        }
    }

    // Hämta antalet tecken
    public int getCharacters() {
        return numberCharacters;
    }

    // Räknar ord
    public void countWords(String line) {
        // Kollar om raden inte är tom (tomma rader räknar ord felaktigt)
        if (isNotStop(line) && !line.isEmpty()) {
            // Anropar Strip för att ta bort mellanslag till vänster
            // Och delar sedan upp raden i ord separerade av mellanslag
            // Resultatet är en Array av Strings som innehåller orden
            String[] words = line.strip().split(" ");
            // Ökar antalet ord
            numberWords = numberWords + words.length;
        }
    }

    // Hämta antalet ord
    public int getWords() {
        return numberWords;
    }

    //Längsta ordet
    public void checkLongestWord(String line) {
        if (isNotStop(line)) {
            // Delar raden i ord separerade av mellanslag
            // Resultatet är en Array av Strings som innehåller orden
            String[] words = line.split(" ");

            int length = words.length; // Antal ord
            for (int i = 0; i < length; i++) {

                // Om ordet vid index i är längre än det nuvarande längsta ordet
                // Ersätt det existerande
                if (words[i].length() > longestWord.length()) {
                    longestWord = words[i];
                }
            }
        }
    }

    // Hämta längsta ord
    public String getLongestWord() {
        return longestWord;
    }
}