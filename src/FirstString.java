
public class FirstString {
     public static void main(String args[])
     {
         System.out.println("Hello World");
         String s1="Bold";
         String s2="Bold";
         if(s1==s2)
         System.out.println("Equal");
         else
             System.out.println("Not Equal");
         String x1=new String("Bold");
         String x2=new String("Bold");
         if(x1==x2)
             System.out.println("Equal");
         else
             System.out.println("Not Equal");
         s1="ksforgeeks";
         s2="or";
         int res=s1.compareTo(s2);
         System.out.println("Res : "+res);

     }
}
