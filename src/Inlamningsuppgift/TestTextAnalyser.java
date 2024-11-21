package Inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestTextAnalyser {

    // Test av båda möjligheterna i Stop-metoden
    @Test
    public void testStop() {

        // Arrange
        TextAnalyser analyser = new TextAnalyser();
        boolean expectedStop = false; // False betyder att texten är "Stop"
        boolean expectedNoStop = true;
        // Act
        boolean actualStop = analyser.isNotStop("Stop");
        boolean actualNoStop = analyser.isNotStop("Hej");
        // Assert
        assertEquals(expectedStop, actualStop);
        assertEquals(expectedNoStop, actualNoStop);
    }

    // Test för att räkna antalet rader
    @Test
    public void testCountRows() {

        // Arrange
        TextAnalyser analyser = new TextAnalyser();
        int expected = 3;

        // Act
        analyser.countRows("Hej");
        analyser.countRows("Godmorgon");
        analyser.countRows("Hejdå");
        analyser.countRows("stop");
        int actual = analyser.getRows();

        // Assert
        assertEquals(expected, actual);
    }

    // Test för att räkna antalet tecken
    @Test
    public void testCountCharacters() {

        // Arrange
        TextAnalyser analyser = new TextAnalyser();
        int expected = 8;

        // Act
        analyser.countCharacters("Hej");
        analyser.countCharacters("Hejdå");
        analyser.countCharacters("stop");
        int actual = analyser.getCharacters();

        // Assert
        assertEquals(expected, actual);
    }

    // Test för att kolla mellanslag i början, mitten och slutet av orden
    @Test
    public void testSpaceBetweenWords() {

        // Arrange
        TextAnalyser analyser = new TextAnalyser();

        int expected = 3;

        // Act
        analyser.countWords("  Hej hej        ");
        analyser.countWords(" Hejdå       ");
        analyser.countWords("stop");
        int actual = analyser.getWords();

        // Assert
        assertEquals(expected, actual);
    }

    // Test för att räkna antalet ord
    @Test
    public void testCountWords() {
        // Arrange
        TextAnalyser analyser = new TextAnalyser();
        int expected = 2;

        // Act
        analyser.countWords("Hej");
        analyser.countWords("Hejdå");
        analyser.countWords("stop");
        int actual = analyser.getWords();

        // Assert
        assertEquals(expected, actual);
    }

    // Test för att kolla längsta ord
    @Test
    public void testCheckLongestWord() {

        // Arrange
        TextAnalyser analyser = new TextAnalyser();
        String expected = "Godmorgon";

        // Act
        analyser.checkLongestWord("Hej");
        analyser.checkLongestWord("Godmorgon");
        analyser.checkLongestWord("Hejdå");
        analyser.checkLongestWord("stop");

        String actual = analyser.getLongestWord();

        // Assert
        assertEquals(expected, actual);
    }
}