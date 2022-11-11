public class FightPhase {
    public static void main(String[] args) {
        int hits = 0;
        int wounds = 0;
/*
        int addtohit = +1;
        int addtowound = +1;
        int subracttohit = -1;
        int subracttowound = -1;

 */
        boolean plustohit = false;
        boolean minustohit = false;
        boolean plustowound = false;
        boolean minustowound = false;

        DataSheetFactory kage = new  DataSheetFactory();
        int s = kage.getStrength();





/*
        System.out.println("Please select the attacking unit ");
        System.out.println("Press 1 to attack with ork boyz");
        System.out.println("Press 2 to attack with ork nobz");
        System.out.println("Press 3 to attack with a Warboss in mega armour");
        int u = Input.inputint();
        */
        int modifier = 0;

        if(plustohit == true) modifier = 1;
        if (minustohit == true ) modifier = -1;
        if (plustowound == true) modifier = 1;
        if (minustowound==true) modifier = -1;

            System.out.println("How many models those the unit have?");
            int nr = Input.inputint();
            int a = Orkz.boyzatk();
            int ws = Orkz.boyzws();
            int A = a * nr;


            for (int i = 0; i < A; i++) {
                int hitroll = D6.die() + modifier;
                if (hitroll >= ws) {
                    hits++;
                }

            }
            System.out.println("You score a total of " + hits + " hits!");
            System.out.println("");
            System.out.println("");
            System.out.println("What is the toughness of the enemy?");
           /*
            System.out.println("1. for T3 target");
            System.out.println("2. for T4 target");
            System.out.println("3. for T5 target");
            System.out.println("4. for T6 target");
            System.out.println("5. for T7 target");
            System.out.println("6. for T8 target");
            System.out.println("7. for T9 target");
            */


            int t = Input.inputint();
            modifier = 0;

            for (int i = 0; i < hits; i++) {




                int unmodifiedrollwound = D6.die();
                int rollwound = unmodifiedrollwound + modifier;
                if(t==s)
                {
                    if(rollwound >= 4 && rollwound!=1&& unmodifiedrollwound != 1){
                        wounds++;
                    }
                }else if(t>s){
                    if (rollwound >=5 && unmodifiedrollwound != 1 ) {
                        wounds++;
                    } }else if (t/2 >=s && unmodifiedrollwound != 1 ){
                        if (rollwound >= 6) {
                            wounds++;
                        }  }else if (t<s && rollwound != 1){
                            if(rollwound>=3){
                                wounds++;
                            }
                        }else if (s/2 >= t ){
                            if (rollwound>=2){
                                wounds++;
                            }
                        }


                }
            System.out.println("You wound a total of " + wounds + " times" );
            }


        }


