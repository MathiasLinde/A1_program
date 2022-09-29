import java.util.Random;

public class D6 {
    public static int die(){
        Random r = new Random();
        int result = r.nextInt(6);
        result++;
        return result;


    }


}
