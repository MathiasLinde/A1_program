public class Test
{
    public static void main(String[] args)
    {
    int A = 0;


        for (int i=0; i<10;i++)
        {
        int roll = D6.die();

        if (roll>= 3 )
        {
            A++;

        }

        }
        System.out.println(A);
    }

}
