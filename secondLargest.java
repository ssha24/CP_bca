public class secondLargest {
  public static void main(String[] args) {
    int[] a ={1,2,3,4,5};
    int pval=0;
    int cval=0;
    for(int i=0;i<=a.length-1;i++){
      if(a[i]>pval){
        pval=a[i];
        for(int j=0;j<=a.length-1;j++){
          if(a[j]!=pval && a[j]>pval){
            cval=a[j];
          }
        }
      }
    }
  System.out.println("second largest element is:"+cval); 
  }

}
