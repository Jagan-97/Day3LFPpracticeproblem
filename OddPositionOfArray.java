public class OddPositionOfArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        for (int i=0;i<arr.length;i=i+2){
            System.out.println("Element of given array on odd position:"+ arr[i]);
        }
    }
}

