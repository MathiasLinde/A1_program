import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FightPhaseTest {


    @Test
    void onesautofailing2wound() {
        /*
        Following variables are used as input in the Test method
         */
        int hits = 10;
        int wounds = 0;
        int s = 10;
        int t = 10;
        int fails = 0;


        /*
        This for loop runs the program for the amount of times specified in
        the hits intenger
         */
        for (int i = 0; i < hits; i++) {
            boolean modiferwoundroll = true;
            int modifier = 0;

            if (modiferwoundroll == true) {
                modifier = 1;
            }


            int unmodifiedrollwound = D6.die();
            int rollwound = unmodifiedrollwound + modifier;
            if (t == s) {
                if (rollwound >= 4 && rollwound != 1 && unmodifiedrollwound != 1) {
                    wounds++;

                    System.out.println("You roll a " + rollwound);
                    System.out.println("The unmodified dice roll was  " + unmodifiedrollwound);
                    if (unmodifiedrollwound == 0) {
                        fails++;
                    }
                }


            }
        }
        assertEquals(0, fails);
        System.out.println("You scored a total of " + wounds + " wounds");

    }


    @Test
    void minus2wound() {
        boolean minustowound = true;
        boolean plustowound = false;
        int modifier = 0;
        int hits = 10;
        int t = 0;
        int s = 0;
        int wounds = 0;
        int success = 0;
        for (int i = 0; i < hits; i++) {


            if (plustowound == true) {
                modifier = 1;
            }
            if (minustowound == true) {
                modifier = -1;
            }



            int unmodifiedrollwound = D6.die();

            if (unmodifiedrollwound==1||unmodifiedrollwound==6){
                modifier = 0;
            }

            int rollwound = unmodifiedrollwound + modifier;
            if (t == s) {
                if (rollwound >= 4 && rollwound != 1 && unmodifiedrollwound != 1) {
                    wounds++;

                }
            }
            if (rollwound ==unmodifiedrollwound -1  ){
                success++;
            }
            System.out.println(unmodifiedrollwound);
            System.out.println(rollwound);
            System.out.println("");
        }

        assertEquals(hits,success);

    }


    @Test
    void sixsautowounding() {
        boolean minustowound = true;
        boolean plustowound = false;
        int modifier = 0;
        int hits = 10;
        int t = 0;
        int s = 0;
        int wounds = 0;
        int success = 0;
        for (int i = 0; i < hits; i++) {


            if (plustowound == true) {
                modifier = 1;
            }
            if (minustowound == true) {
                modifier = -1;
            }



            int unmodifiedrollwound = D6.die();


            int rollwound = unmodifiedrollwound + modifier;
            if (t == s) {
                if (rollwound >= 4 && rollwound != 1 && unmodifiedrollwound != 1||unmodifiedrollwound==6) {
                    wounds++;

                }

            }

            System.out.println(unmodifiedrollwound);
            System.out.println(rollwound);
            System.out.println("");
        }

       // assertEquals(10,wounds);
        System.out.println(wounds);

    }
}