package uk.ac.cam.ahk44.oop.supo1;

public class Ex7{

  public class Linkedlist{
    public int head, size;
    public Linkedlist tail;

    public Linkedlist(int head, int size, Linkedlist tail){
      this.head = head;
      this.size = size;
      this.tail = tail;
    }

    public int head(){return head;}

    public int size(){return size;}

    public Linkedlist tail(){return tail;}

    public Linkedlist add(int x){
      if(size == 0) return new Linkedlist(x, 1, tail);
      return new Linkedlist(head, size + 1, tail.add(x));
    }

    public Linkedlist remove(int x){
      if(head == x) return tail;
      return new Linkedlist(head, size - 1, tail.remove(x));
    }

    public int nthElement(int n){
      return (n == 1 ? head : tail.nthElement(n - 1));
    }
  }

  public boolean detectCycles(LinkedList[] soFar) {
    //If this is the last element then it cannot be part of a loop so exit
    if (soFar.head == null) {
      return false;
    }
    // Check if this is part of a loop
    LinkedList[] updatedSoFar = new LinkedList[soFar.length];
    int counter = 0;
    for (LinkedList currentNode : soFar) {
      if (currentNode == this) { //there is a cycle
        return true;
      } else {
        //Not part of a cycle so far
        updatedSoFar[counter] = currentNode;
        counter++;
      }
    }
    //No cycle so far - add to the array
    updatedSoFar[counter] = this;
    //Check the next element
    return head.detectCycles(updatedSoFar);
  }

  public static void main(String[] args){

  }
}
