public class FightPhase {
    public static void main(String[] args) {
        int hits = 0;
        int wounds = 0;
        System.out.println("Please select the attacking unit ");
        System.out.println("Press 1 to attack with ork boyz");
        System.out.println("Press 2 to attack with ork nobz");
        System.out.println("Press 3 to attack with a Warboss in mega armour");
        int u = Input.inputint();
        if (u == 1) {
            System.out.println("How many models those the unit have?");
            int nr = Input.inputint();
            int a = Orkz.boyzatk();
            int ws = Orkz.boyzws();
            int A = a * nr;
            for (int i = 0; i < A; i++) {
                int hitroll = D6.die();
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

            int T = Input.inputint();
            int S = Orkz.boyzstr();

            for (int i = 0; i < hits; i++) {
                int woundroll = D6.die();
                if(T==S)
                {
                    if(woundroll >= 4){
                        wounds++;
                    }
                }else if(T>S){
                    if (woundroll >=5 ) {
                        wounds++;
                    } }else if (T/2 >=S ){
                        if (woundroll >= 6) {
                            wounds++;
                        }  }else if (T<S){
                            if(woundroll>=3){
                                wounds++;
                            }
                        }else if (S/2>=T){
                            if (woundroll>=2){
                                wounds++;
                            }
                        }


                }
            System.out.println("You wound a total of "+wounds +" times" );
            }


        }
    }

