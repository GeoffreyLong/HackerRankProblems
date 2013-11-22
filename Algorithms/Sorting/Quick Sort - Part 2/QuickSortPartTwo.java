/* Head ends here */
import java.util.*;
public class Solution {
       
          static void quickSort(int[] ar) {
                    LinkedList<Integer> list = new LinkedList<Integer>();
              for (int a : ar){
              list.add(a);
              }
              list.addAll(sort(list));
       }   
    static LinkedList<Integer> sort(LinkedList<Integer> list){
       LinkedList<Integer> lList = new LinkedList<Integer>();
       LinkedList<Integer> uList = new LinkedList<Integer>();
       int firstVal = list.get(0);
       for (int i=1;i<list.size();i++){
          if(list.get(i)<firstVal){
                   lList.add(list.get(i));
               }
               else{
                   uList.add(list.get(i));
               }
          }
        list.clear();
        if (lList.size()<=1 && uList.size()<=1){
            lList.add(firstVal);
            lList.addAll(uList);
            System.out.println(lList.toString().replace(",", "")
                .replace("[", "")
                .replace("]", ""));
            return (lList);
        }
        else if (uList.size()<=1){
            list.addAll(sort(lList));
            list.add(firstVal);
            list.addAll(uList);
            System.out.println(list.toString().replace(",", "")
                .replace("[", "")
                .replace("]", ""));
            return (list);
        }
        else if (lList.size()<=1){
            lList.add(firstVal);
            lList.addAll(sort(uList));
            System.out.println(lList.toString().replace(",", "")
                .replace("[", "")
                .replace("]", ""));
            return (lList);
        }
        list.addAll(sort(lList));
        list.add(firstVal);
        list.addAll(sort(uList));
        System.out.println(list.toString().replace(",", "")
                .replace("[", "")
                .replace("]", ""));
        return(list);
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
           quickSort(ar);
       }    
   }