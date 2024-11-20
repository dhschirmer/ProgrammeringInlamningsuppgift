package Inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    //Teste para testar o metodo nas suas duas possibilidades
    @Test
    public void testStop() {

        //Arrange
        TextAnalyser analyser = new TextAnalyser();
        boolean expectedStop = false; //Falso significa que o texto eh stop
        boolean expectedNoStop = true;
        //Act
        boolean actualStop = analyser.isNotStop("stop");
        boolean actualNoStop = analyser.isNotStop("Hej");
        //Assert
        assertEquals(expectedStop, actualStop);
        assertEquals(expectedNoStop, actualNoStop);

    }

    //Teste para contar o numero de linhas
    @Test
    public void testCountLines() {

        //Arrange
        TextAnalyser analyser = new TextAnalyser();
        int expected = 3;

        //Act
        analyser.countLine("Hej");
        analyser.countLine("Godmorgon");
        analyser.countLine("Hejdå");
        analyser.countLine("stop");
        int actual = analyser.getLines();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testCountCharacters() {

        //Arrange
        TextAnalyser analyser = new TextAnalyser();
        int expected = 8;

        //Act
        analyser.countCharacters("Hej");
        analyser.countCharacters("Hejdå");
        analyser.countCharacters("stop");
        int actual = analyser.getCharacters();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testCountWord() {
        //Arrange
        TextAnalyser analyser = new TextAnalyser();
        int expected = 2;

        //Act
        analyser.countWord("Hej");
        analyser.countWord("Hejdå");
        analyser.countWord("stop");
        int actual = analyser.getWord();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testCheckLongestWord() {

        //Arrange
        TextAnalyser analyser = new TextAnalyser();
        String expected = "Godmorgon";

        //Act
        analyser.checkLongestWord("Hej");
        analyser.checkLongestWord("Godmorgon");
        analyser.checkLongestWord("Hejdå");
        analyser.checkLongestWord("stop");

        String actual = analyser.getLongestWord();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testSpaceBetweenWords() {

        //Arrange
        TextAnalyser analyser = new TextAnalyser();

        int expected = 3;

        //Act
        analyser.countWord("  Hej hej        ");
        analyser.countWord(" Hejdå       ");
        analyser.countWord("stop");
        int actual = analyser.getWord();

        //Assert
        assertEquals(expected, actual);

    }


}