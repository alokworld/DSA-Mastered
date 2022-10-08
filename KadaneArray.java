//Kadane Algorithm
public class KadaneArray {
    public static void main(String[] args) 
    {
        int a[]={-9,3,-7,6,8,-2,2,5,4};
        int m=Integer.MIN_VALUE;
        int sum=0;
        int i=0;
        while(i<a.length)
        {
            sum+=a[i];
            if(m<sum)
            {
                m=sum;
            }
            if(sum<0)
            sum=0;
            i++;
        }
        System.out.println("Maximum Sum="+m);
    }
    
}
