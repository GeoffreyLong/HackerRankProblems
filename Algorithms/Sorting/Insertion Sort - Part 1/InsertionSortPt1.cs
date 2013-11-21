using System;
using System.Collections.Generic;
using System.IO;
class Solution {
/* Head ends here */
static void insertionSort(int[] ar) {
    int valueSave = ar[ar.Length-1];
    if (!ar.Equals(null)){
        for (int i = ar.Length-2; i>=0; i--){
            if (valueSave<ar[i]){
                ar[i+1] = ar[i];    
            }
            else{
                ar[i+1] = valueSave;
            }
            foreach(var item in ar){
                Console.Write(item.ToString() + " ");
            }
            if (ar[i+1] == valueSave){break;}
            Console.WriteLine();
        }
        if (valueSave <= ar[0]){
            ar[0] = valueSave;
            foreach(var item in ar){
                Console.Write(item.ToString() + " ");
            }
        }
    }
}
/* Tail starts here */
/* Tail starts here */
    static void Main(String[] args) {
           
           int _ar_size;
           _ar_size = Convert.ToInt32(Console.ReadLine());
           int [] _ar =new int [_ar_size];
           String elements = Console.ReadLine();
           String[] split_elements = elements.Split(' ');
           for(int _ar_i=0; _ar_i < _ar_size; _ar_i++) {
                  _ar[_ar_i] = Convert.ToInt32(split_elements[_ar_i]); 
           }

           insertionSort(_ar);
    }
}
    