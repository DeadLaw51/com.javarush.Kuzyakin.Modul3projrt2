import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.management.ConstructorParameters;

import static org.junit.jupiter.api.Assertions.*;
class HorseTest {


    @Test
    void nullException(){
        assertThrows(IllegalArgumentException.class, () -> new Horse(null,2,2));

    }

    @Test
    void nullMessg(){
        try{
            new Horse(null,1,1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null.",e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"","   ","\t\t","\n\n"}
    )
    void spaceException(String name){
        assertThrows(IllegalArgumentException.class, () -> new Horse(name,1,1));

    }

    @ParameterizedTest
    @ValueSource(strings = {"","   ","\t\t","\n\n"}
    )
    void spaceMessg(String name){
        try{
            new Horse(name,1,1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be blank.",e.getMessage());
        }
    }

    @Test
    void speedMinus(){
        assertThrows(IllegalArgumentException.class, () -> new Horse("bddd",-1,2));
    }

    @Test
    void speedMinusMess(){
        try{
            new Horse("bddd",-1,1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Speed cannot be negative.",e.getMessage());
        }
    }

    @Test
    void distanceMinus(){
        assertThrows(IllegalArgumentException.class, () -> new Horse("bddd",1,-2));
    }

    @Test
    void distanceMinusMess(){
        try{
            new Horse("bddd",1,-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distance cannot be negative.",e.getMessage());
        }
    }

    @Test
    void getName(){
        Horse horse = new Horse("asd",1,1);
        String name = horse.getName();
        assertEquals("asd",name);

    }

    @Test
    void getSpeed(){
        Horse horse = new Horse("aaa",28.56,40);
        double speed = horse.getSpeed();
        assertEquals(28.56,speed);
    }

    @Test
    void getDistanceDouble(){
        Horse horse = new Horse("aaa",28.56,40.9999);
        double distance = horse.getDistance();
        assertEquals(40.9999,distance);
    }

    @Test
    void getDistanseError(){
        Horse horse = new Horse("asdf",12);
        double distance = horse.getDistance();
        assertEquals(0.0,distance);
    }

    // ПОВТОРИТЬ ПРО MOCK


}