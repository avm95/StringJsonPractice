public class Numeric {


    public static void main(String[] args)
    {
        System.out.println("Numeric");
        String num="123456.34";
        try {
            Double value = Double.parseDouble(num);
            System.out.println(value);
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }

    }
}
