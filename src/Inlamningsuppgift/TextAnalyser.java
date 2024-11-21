package Inlamningsuppgift;

public class TextAnalyser {

    //Attribut
    private int numberRows;
    private int numberCharacters;
    private int numberWords;
    private String longestWord;

    //Konstruktor
    public TextAnalyser() {
        //Inicializa os atributos com valor padrao
        numberRows = 0;
        numberCharacters = 0;
        numberWords = 0;
        longestWord = "";
    }

    //Metod Stop - Kontrollera om man har skrivit ordet Stop
    //Retorna True se o texto nao for stop, retorna falso caso seja Stop
    public boolean isNotStop(String text) {
        if (text.equalsIgnoreCase("stop")) {
            return false;
        } else {
            return true;
        }
    }

    //Räknar raderna
    public void countRows(String line) {
        if (isNotStop(line)) {
            //Ökar raderna med 1
            numberRows = numberRows + 1;
        }
    }

    //Hämta antalet rader
    public int getRows() {
        return numberRows;
    }

    //Räknar tecken
    public void countCharacters(String line) {
        if (isNotStop(line)) {
            //adera incrementa soma o comprimento da linha (numero de caracteres)
            numberCharacters = numberCharacters + line.length();
        }
    }

    //Hämta antalet tecken
    public int getCharacters() {
        return numberCharacters;
    }

    //Räknar ord
    public void countWords(String line) {
        //Kolla se a linha nao eh vazia - linhas vazias contam palavras erroneamente
        if (isNotStop(line) && !line.isEmpty()) {
            //Anropa Strip para remover os espacos a esquerda
            // em seguida divide a linha em palavras separadas por espacos
            //Resultado eh uma Array de Strings contendo as palavras
            String[] words = line.strip().split(" ");
            //incrementa a quantidade de palavras
            numberWords = numberWords + words.length;
        }
    }

    //Hämta antalet ord
    public int getWords() {
        return numberWords;
    }

    //Längsta ordet
    public void checkLongestWord(String line) {
        if (isNotStop(line)) {
            //divide a linha em palavras separadas por espacos
            //Resultado eh um Array de Strings contendo as palavras
            String[] words = line.split(" ");

            int length = words.length; //quantidade de palavras
            for (int i = 0; i < length; i++) {

                // Se a palavra do indice i for maior que a maior palavra atual
                // substitui a existente
                if (words[i].length() > longestWord.length()) {
                    longestWord = words[i];
                }
            }
        }
    }

    // Hämta länsta ord
    public String getLongestWord() {
        return longestWord;
    }
}