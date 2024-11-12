package Inlamningsuppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Testklass {

    //Teste para testar o metodo nas suas duas possibilidades
    @Test
    public void firstTestCase(){

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
    public void secondTestCase(){

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

}
