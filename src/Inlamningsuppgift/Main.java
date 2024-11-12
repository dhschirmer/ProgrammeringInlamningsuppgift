package Inlamningsuppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Objeto - Instanciando a classe logica
        Logikklass wordProcessor = new Logikklass();

        String text = "";

        while (wordProcessor.isNotStop(text)) {
            System.out.println("Skriv en mening eller skriv 'stop' för att avsluta: ");
            text = scan.nextLine();


            //Bearbeta linjen
            //Nome do objeto. metodo - escreve e enter
            wordProcessor.countLine(text);
            wordProcessor.countCharacters(text);
            wordProcessor.countWord(text);
            wordProcessor.checkLongestWord(text);

        }

        //Skriver ut hur många rader - Imprimir quantas linhas
        System.out.println("Antalet rader: " + wordProcessor.getLines());

        //Skriver ut antal tecken - Imprimir numero de caracteres
        System.out.println("Antalet tecken: " + wordProcessor.getCharacters());


        //Skriver ut antalet ord - Imprimir numero de palavras
        System.out.println("Antalet ord: " + wordProcessor.getWord());

        //Skriver ut länsta ordet - Imprimir palavra mais longa
        System.out.println("Antalet ord: " + wordProcessor.getLongestWord());
    }


}
