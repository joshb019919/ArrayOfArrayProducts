import java.io.*;
import java.util.*;

class Solution {
  
  static int[] arrayOfArrayProducts(int[] arr) {
    if (arr.length == 1 || arr.length == 0) {
      return new int[0];
    }
    
    int[] out = new int[arr.length];
    int product = 1;
    
    for (int j = 0; j < arr.length; ++j) {
      product = 1;
      
      for (int i = 0; i < arr.length; ++i){
        if (i == j) continue;
        product *= arr[i];
      }

      out[j] = product;
    }

    return out;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int[] output = arrayOfArrayProducts(arr);
    
    for (int i = 0; i < output.length; ++i) {
      System.out.println(output[i]);
    }
  }
}
