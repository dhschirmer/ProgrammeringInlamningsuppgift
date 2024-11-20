package Inlamningsuppgift;

import java.util.Scanner;

public class TextCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Objeto - Instanciando a classe logica
        TextAnalyser analyser = new TextAnalyser();

        String text = "";

        while (analyser.isNotStop(text)) {
            System.out.println("Skriv en mening eller skriv 'stop' för att avsluta: ");
            text = scan.nextLine();


            //Bearbeta linjen
            //Nome do objeto. metodo - escreve e enter
            analyser.countLine(text);
            analyser.countCharacters(text);
            analyser.countWord(text);
            analyser.checkLongestWord(text);

        }

        //Skriver ut hur många rader - Imprimir quantas linhas
        System.out.println("Antalet rader: " + analyser.getLines());

        //Skriver ut antal tecken - Imprimir numero de caracteres
        System.out.println("Antalet tecken: " + analyser.getCharacters());


        //Skriver ut antalet ord - Imprimir numero de palavras
        System.out.println("Antalet ord: " + analyser.getWord());

        //Skriver ut länsta ordet - Imprimir palavra mais longa
        System.out.println("Antalet länsta ord: " + analyser.getLongestWord());
    }


}
