import java.util.*;

class roughwork {
static int c=0;
public static void main(String args[])
{
 roughwork a1 = c();
 roughwork a2 = c(a1);
 roughwork a3 = c(a2);
 roughwork a4 = c(a3);
}
private roughwork()
{
    System.out.println("c"+c);
}
static roughwork c()
{
    return c++>=0?new roughwork():null;
}
static  roughwork c(roughwork a)
{
    return c++>=1?new roughwork():null;
}
}



