public class SecondLargest {
    public static void main(String args[])
    {
        int arr[]={2,16,13,4,17,25};
        int largest=arr[1];
        int second=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }else if(arr[i]<second && arr[i]!=largest)
            {
                second=arr[i];
            }
        }
        System.out.println("Second Largest Number is " +second);
    }
}
