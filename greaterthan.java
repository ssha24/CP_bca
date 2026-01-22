import java.util.Scanner;
class greaterthan {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int[]arr={1,2,3,4,5,6,7};
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count+=1;
            }
        }
        System.out.println("no. of elements are:"+count);  
    }
}