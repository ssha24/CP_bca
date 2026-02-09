import java.util.Scanner;
public class userDefinematrix {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter x");
  int x=sc.nextInt();
System.out.println("enter y");
  int y=sc.nextInt();
  int [][]arr=new int[x][y];
  for (int  i=0;i<x ; i++) {
    for(int j=0;j<y;j++){

      arr[i][j]=sc.nextInt();
    }  
  }

  for (int  i=0;i<x ; i++) {
    System.out.print("[");
    for(int j=0;j<y;j++){
      System.out.print(arr[i][j]);
    }  
  System.out.println("]");
  } 
  }

}
