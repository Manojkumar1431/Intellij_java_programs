public class ASCI_Example {
    public static void main(String args[])
    {
        int sum =0;
        String test = "hello i love java";
        String str = test.indexOf("e")+""+test.indexOf("a")+""+test.lastIndexOf("l")+""+test.lastIndexOf("a");

        System.out.println("size "+str.length());
        System.out.println(str);
        for(int i=0;i<str.length();i++)//1 14 8 16
        {
            if(str.charAt(i)!=' ')
            {
                sum = sum+str.charAt(i);//ASCI 1 1 4 8 1 6 = 49+49+52+56+49+54

            }
        }
        System.out.println(sum);
    }
}
