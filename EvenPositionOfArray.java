public class EvenPositionOfArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        for (int i=1;i<arr.length;i=i+2){
            System.out.println("Element of given array on even position:"+ arr[i]);
        }
    }
}
