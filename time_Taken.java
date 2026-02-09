public class time_Taken {
  public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int Time = 0;
        for (int i = 0; i < arr.length; i++) {
            Time += (max - arr[i]);
        }
        System.out.println("Minimum time to make all elements equal: " + Time);
    }
}
//find and return the product array of the same size where the ith element of the product array will be equals to the product of all the elements divided by the ith element of the  array .
