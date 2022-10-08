class TrappingRainwater
{
    public static void main(String[] args) {
        int a[]={4,1,0,3,6,5,3,1,4,1,2};
        //left highest element
        int left[]=new int[a.length];
        left[0]=4;
        for(int i=1;i<a.length;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
            System.out.print(left[i]+" ");
        }
        int right[]=new int[a.length];
        right[a.length-1]=2;
        System.out.println();
        for(int i=a.length-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(right[i]+" ");
        }
        int sum=0;
        System.out.println();
        for(int i=1;i<a.length-1;i++)
        {
            sum+=Math.min(left[i],right[i])-a[i];
        }
        System.out.println("Maximum capacity = "+sum);
    }
}