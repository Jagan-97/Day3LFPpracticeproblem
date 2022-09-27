public class SmallestElement {
    public static void main(String args[]){
        int arr[]=new int []{10,24,56,47,98,78};
        int min=arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Largest element of an array is "+min);
    }
}
