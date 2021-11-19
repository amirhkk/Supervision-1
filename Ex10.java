package uk.ac.cam.ahk44.oop.supo1;

public class Ex10{

  public class Stack{
    public int top, size;
    public Stack tail;

    public Stack(int top, int size, Stack tail){
      this.top = top;
      this.size = size;
      this.tail = tail;
    }

    public int top(){return top;}

    public int size(){return size;}

    public Stack tail(){return tail;}

    public Stack push(int x){
      if(size == 0) return new Stack(x, 1, tail);
      return new Stack(x, size + 1, tail.push(top));
    }

    public Stack pop(){
      return tail;
    }
  }

  public static void main(String[] args){

  }
}
