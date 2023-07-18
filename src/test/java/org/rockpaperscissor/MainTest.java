package org.rockpaperscissor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

class MainTest {

    private boolean rockPaperScissor(String weapon1, String weapon2){
        if (weapon1.contains("rock") && weapon2.contains("scissors")){
            return true;
        }
        else{
            return false;
        }
        

       //return Objects.equals(weapon1, weapon2);        
    }


   @Test
   void testrock_rock(){
        rockPaperScissor("rock","rock");
        assertTrue(true);    
   }
   
   @Test
   void testRockSmashScissors(){
    boolean result = rockPaperScissor("rock", "scissors");
    assertTrue(result);
   }

   @Test
   void testScissorsLosesToRock(){
    boolean result = rockPaperScissor("scissors", "rock");
    assertFalse(result);
   }
}