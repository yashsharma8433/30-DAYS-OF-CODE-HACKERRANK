import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
      int test = sc.nextInt();
      sc.nextLine(); 
      
      for(int i=0 ; i<test ; i++){
          String a = sc.nextLine();
          String even ="";
          String odd ="";
          char ch[]=a.toCharArray();
          for(int j=0 ;j<ch.length;j++){
              if(j%2==0){
                  even =even+ch[j];
                  
              }
              else {
                  odd =odd+ch[j];
              }
          }
          System.out.print(even + " " + odd );
          System.out.println();
      }
        
    }
}
