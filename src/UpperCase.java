import java.util.Locale;

public class UpperCase {

    public static void main(String[] args)
    {
        String str="santosh Maurya";
        String first=str.substring(0,1);
        first=first.toUpperCase(Locale.ROOT);
        String second=str.substring(1);
        str=first+second;
        System.out.println(str);
    }
}
