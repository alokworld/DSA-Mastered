public class ReducedString
{
    public static String check(String a)
    {
        int i=0;
        char ch;
        while(i<(a.length()-1))
        {
            ch=a.charAt(i);
            if(ch==a.charAt(i+1))
            {
                if((i+2)<a.length())
                {
                    a=a.substring(0, i)+a.substring(i+2);
                    i=-1;
                }
                else
                {
                    a=a.substring(0,i);
                    i=-1;
                }
            }
            i++;
        }
        if(a=="")
        return "Empty String";
        else
        return a;
    }
    public static void main(String[] args) 
    {
        System.out.println(check("babba"));
        
        
    }
}