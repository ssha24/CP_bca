public class bubblesort {
  public static void main(String[] args) {
    int[] a={4,3,1,2,0,5};
    int p_val=0;
    for (int i=0;i<a.length-1;i++){
      for(int j=0;j<a.length-1-i;j++){
        if(a[j]>a[j+1]){
          p_val=a[j];
          a[j]=a[j+1];
          a[j+1]=p_val;    
      }
    }
    for(int k=0;k<a.length-1;k++){
      System.out.print(a[k]+", ");
    }
  }
}}


