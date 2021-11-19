package uk.ac.cam.ahk44.oop.supo1;

public class Ex4{

  static int sum(int[] a){
      int ans = 0;
      for(int i = 0; i < a.length; i++) ans += a[i];
      return ans;
  }

  static int[] cumsum(int[] a){
    int b[] = new int[a.length];
    b[0] = a[0];
    for(int i = 1; i < a.length; i++) b[i] += b[i - 1] + a[i];
    return b;
  }

  static int[] positives(int[] a){
    int b[] = new int[1000]; // 1000 or a large number
    int j = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] > 0) b[j++] = a[i];
    }
    int ans[] = new int[j];
    for(int i = 0; i < j; i++) ans[i] = b[i];
    return ans;
  }

  public static void main(String args[]){
    int[] amir = {1, 2, 3};
    System.out.println(sum(amir));
    int[] ans2 = cumsum(amir);
    for(int i = 0; i < ans2.length; i++) System.out.println(ans2[i]);
    int[] ans3 = positives(amir);
    for(int i = 0; i < ans3.length; i++) System.out.println(ans3[i]);
  }
}
