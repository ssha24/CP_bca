//given an array element check if there exist a pair  i,j such that arr[i]+arr[j]==k and i !=j  note: i and j are index value  and k is the given sum:
public class pairSumpointer {
  public static void main(String[] args) {
  int sum=10 ;
  int pre_val;
  int [] arr={3,-2,1,4,3,6,8};
  for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
      pre_val=arr[i];
      if(pre_val+arr[j]==sum){
        System.out.println("yes  indexes are:"+i+","+j);
      }
    }
  }
  }

}
//given an integer array a you have to find this largest second element in the array or report that no such element is exist .