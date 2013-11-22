using System;
using System.Collections.Generic;
using System.IO;
class Solution {
/* Head ends here */
static void insertionSort(int[] ar) {
    if (!ar.Equals(null)){
        for (int j = 1; j<ar.Length; j++){
            int valueSave = ar[j];
            for (int i = j-1; i>=0; i--){
                if (valueSave<ar[i]){
                    ar[i+1] = ar[i];
                    ar[i] = valueSave;
                }
            }
            foreach(var item in ar){
                Console.Write(item.ToString() + " ");
            }
            Console.WriteLine();
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