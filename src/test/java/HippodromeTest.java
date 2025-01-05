import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HippodromeTest {

    @Test
    void nullExcept(){
        assertThrows(IllegalArgumentException.class,() -> new Hippodrome(null));
    }
    @Test
    void nullMessag(){
        try{
            new Hippodrome(null);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Horses cannot be null.",e.getMessage());
        }
    }

    @Test
    void spaceExcept(){
        assertThrows(IllegalArgumentException.class,() -> new Hippodrome(Collections.<Horse>emptyList()));
    }
    @Test
    void spaceMessag(){
        try{
            new Hippodrome(Collections.<Horse>emptyList());
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Horses cannot be empty.",e.getMessage());
        }
    }

    List<String> horses = Arrays.asList("Chief","Chopin","Churchill","Clyde","Cookie","DaVinc","Dallas", "Debutante","Dickinson","Dolly",
            "Flicka","Flopsy","Genie","Goliath","Henrietta","Honey","Isabella", "Jackson","Jasper","Jet",
            "Juliet","Lacey","LittleJoe","London","Lucky","Major","Mario", "Marquis","Max","Misty");
    List<String> hors = Arrays.asList("Chief","Chopin","Churchill","Clyde","Cookie","DaVinc","Dallas", "Debutante","Dickinson","Dolly",
            "Flicka","Flopsy","Genie","Goliath","Henrietta","Honey","Isabella", "Jackson","Jasper","Jet",
            "Juliet","Lacey","LittleJoe","London","Lucky","Major","Mario", "Marquis","Max","Misty");
    @Test
    void getHorses(){
        Assert.assertEquals(horses,hors);
    }

}