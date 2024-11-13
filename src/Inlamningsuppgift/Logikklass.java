package Inlamningsuppgift;

public class Logikklass {

    //Atributo
    private int numberLines;
    private int numberCharacters;
    private int numberWord;
    private String longestWord;

    //Konstruktor
    public Logikklass (){
        numberLines = 0;
        numberCharacters = 0;
        numberWord = 0;
        longestWord = "";
    }

   //Metod Stop
    public boolean isNotStop (String text) {
        if (text.equalsIgnoreCase("stop")){
            return false;
        } else {
            return true;
        }
   }

//Metod- Räknar raderna - (funcao) - Incrementando linha a linha
    public void countLine(String line) {
        if (isNotStop(line)) {
            numberLines = numberLines + 1;
        }

    }
    public int getLines() {
        return numberLines;
    }

    //Räknar tecken - countCharacters

    public void countCharacters (String line) {
        if (isNotStop(line)){
            numberCharacters = numberCharacters + line.length();
        }

    }
    //getCharacters
    public int getCharacters() {
        return numberCharacters;
    }

    //Räknar ord - countWord
    public void countWord (String line) {
        if (isNotStop(line)){
            String[] words = line.strip().split(" ");
            numberWord = numberWord + words.length;

        }
    }

    //getWord
    public int getWord() {
        return numberWord;
    }

        //Längsta ordet
    public void checkLongestWord (String line) {
        if (isNotStop(line)) {
            String[] words = line.split(" ");

            int length = words.length; //quantidade de palavras
            for (int i = 0; i < length; i++) {

                //i eh o indice dentro do Array
               if (words[i].length() > longestWord.length()) {
                   longestWord = words[i];
               }
            }

        }
    }

//getLongestWord
    public String getLongestWord() {
        return longestWord;

    }
}



