package Inlamningsuppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Testklass {

    //Teste para testar o metodo nas suas duas possibilidades
    @Test
    public void del2firstTestCase(){

        //Arrange
        Logikklass wordProcessor = new Logikklass();
        boolean expectedStop = false; //Falso significa que o texto eh stop
        boolean expectedNoStop = true;
        //Act
        boolean actualStop = wordProcessor.isNotStop("stop");
        boolean actualNoStop = wordProcessor.isNotStop("Hej");
        //Assert
        assertEquals(expectedStop, actualStop);
        assertEquals(expectedNoStop, actualNoStop);

    }
//Teste para contar o numero de linhas
    @Test
    public void del2secondTestCase(){

        //Arrange
        Logikklass wordProcessor = new Logikklass();
        int expected = 3;

        //Act
        wordProcessor.countLine("Hej");
        wordProcessor.countLine("Godmorgon");
        wordProcessor.countLine("Hejdå");
        wordProcessor.countLine("stop");
        int actual = wordProcessor.getLines();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void del2thirdTestCase(){

        //Arrange
        Logikklass wordProcessor = new Logikklass();
        int expected = 8;

        //Act
        wordProcessor.countCharacters("Hej");
        wordProcessor.countCharacters("Hejdå");
        wordProcessor.countCharacters("stop");
        int actual = wordProcessor.getCharacters();

        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void del3firstTestCase(){
        //Arrange
        Logikklass wordProcessor = new Logikklass();
        int expected = 2;

        //Act
        wordProcessor.countWord("Hej");
        wordProcessor.countWord("Hejdå");
        wordProcessor.countWord("stop");
        int actual = wordProcessor.getWord();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void del3secondTestCase(){

        //Arrange
        Logikklass wordProcessor = new Logikklass();
        String expected = "Godmorgon";

        //Act
        wordProcessor.checkLongestWord("Hej");
        wordProcessor.checkLongestWord("Godmorgon");
        wordProcessor.checkLongestWord("Hejdå");
        wordProcessor.checkLongestWord("stop");

        String actual = wordProcessor.getLongestWord();

        //Assert
        assertEquals(expected, actual);

}

}