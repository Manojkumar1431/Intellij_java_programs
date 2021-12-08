public class String_buffer {
    public static void main(String[] args)
    {
            StringBuffer bdr=new StringBuffer("hello");

            //append("text") //
            bdr.append("Manoj");
            System.out.println(bdr);

            //insert(start indexno,"text")
            bdr.insert(5,",welcome");
            System.out.println(bdr);

            //reverse()
            bdr.reverse();
            System.out.println(bdr);

        bdr.reverse();

            //delete(start indexno,end indexno) and deleteCharAt(indexno)
         bdr.delete(5,7);
         System.out.println(bdr);
         bdr.deleteCharAt(9);
         System.out.println(bdr);


         //replace(start indexno,end indexno,"text")
        bdr.replace(9,10,"end");
        System.out.println(bdr);


        //conversion of stringBuffer to StringBuilder by using toString()

        String str=bdr.toString();   //converting bdr to str
        StringBuilder bldr=new StringBuilder("StringBuilder : "+str);
        System.out.println(bldr);


        }
    }



// StringBuilder is similar but more efficient than StringBuffer