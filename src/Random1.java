import java.util.Locale;
import java.util.Random;

public class Random1 {


    public static void main(String[] args)
    {
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stb=new StringBuilder();

        //Create an Object of Random Class
         Random random=new Random();
         //Length of random string
        int len=7;
        for(int i=1;i<=len;i++)
        {
            int index= random.nextInt(alphabet.length());
            System.out.println(index);
            Character xy=alphabet.charAt(index);
            System.out.println(xy.charValue());
            stb.append(xy);
        }
        String randomString=stb.toString();
    System.out.println(randomString.toLowerCase(Locale.ROOT));
    }
}
