package uk.ac.cam.ahk44.oop.supo1;

public class Ex6{
  public static int[] vectorAdd(int x, int y, int dx, int dy){
    x = x + dx;
    y = y + dy;
    int[] ans = {x, y};
    return ans;
  }
  public static void main(String[] args){
    int a = 0;
    int b = 2;
    int[] arr = vectorAdd(a, b, 1, 1);
    a = arr[0]; b = arr[1];
    System.out.println(a + " " + b);
  }
}
