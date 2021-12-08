
import java.util.Scanner;
public class SubEX_exam_question
{
    static int fun(int input1,int input2[],int input3,int input4[])
    {
        int count=0;
        for(int i=0;i<input1;i++)
            for(int j=0;j<input3;j++)
            {
                if(input2[i]<=input4[j])
                    count++;
            }
        System.out.println(count);
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int input1=s.nextInt();
        int input2[]=new int[input1];
        for(int i=0;i<input1;i++)
            input2[i]=s.nextInt();
        int input3=s.nextInt();
        int input4[]=new int[input3];
        for(int j=0;j<input3;j++)
            input4[j]=s.nextInt();
        fun(input1,input2,input3,input4);
    }
}
