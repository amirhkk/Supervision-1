package uk.ac.cam.ahk44.oop.supo1;

import java.util.Scanner;
import java.util.*;

public class Ex5{
  static float[][] matrix(int n){
    Scanner input = new Scanner (System.in);
    float ans[][] = new float[n][n];
    for(int row = 0; row < n; row++){
      for(int col = 0; col < n; col++){
        ans[row][col] = input.nextFloat();
      }
    }
    return ans;
  }

  public static void main(String args[]){
    // ... //
  }
}
