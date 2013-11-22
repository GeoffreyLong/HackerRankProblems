/* Head ends here */
import java.util.*;
public class Solution {
       
       static void partition(int[] ar) {
           List lList = new LinkedList<Integer>();
           List uList = new LinkedList<Integer>();
           int firstVal = ar[0];
           for (int i : ar){
               if(i<firstVal){
                   lList.add(i);
               }
               else{
                   uList.add(i);
               }
           }
           lList.addAll(uList);
           System.out.println(lList.toString().replace(",", "")
                .replace("[", "")
                .replace("]", ""));
       }   

/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }