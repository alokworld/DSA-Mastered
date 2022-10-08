//Rotate an array by one place
public class CyclicArray 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int l=a[0];
        int r=0;
        for(int i=0;i<a.length-1;i++)
        {
            r=a[i+1];
            a[i+1]=l;
            l=r;
        }
        a[0]=r;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
