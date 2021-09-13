import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args)
    {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter first element: ");
        String first=input.nextLine();
        System.out.println("Enter Second Element: ");
        String second=input.nextLine();
        //String first="RACE";
        //String  second="CaRE";
        if(first.length()==second.length())
        {
            first=first.toLowerCase(Locale.ROOT);
            second=second.toLowerCase(Locale.ROOT);
            char[] firstArray=first.toCharArray();
            char[] secondArray=second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            for (int i=0;i<firstArray.length;i++)
            {
                System.out.println(firstArray[i]);
            }
            boolean result= Arrays.equals(firstArray,secondArray);
            if(result)
                System.out.println("Both String are Anagram");
            else
                System.out.println("Both String are not Anagram");
        }
    }


}
