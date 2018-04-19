package akragl.mds;

import akragl.mds.MySLinkedList;

public class Tester {

  public static void main(String[] args) {
    
    // LINKED LIST
    System.out.println("LINKED LIST:");
    MySLinkedList<Integer> testLinkedList = new MySLinkedList<Integer>();
    
    testLinkedList.add(1);
    System.out.println(testLinkedList.getSize());
    testLinkedList.removeFirst();
    System.out.println(testLinkedList.getSize());
    
    // STACK
    System.out.println("\nSTACK:");
    
    MyStack<String> testStack = new MyStack<String>();
    testStack.push("ECSE 210");
    testStack.push("ECSE 205");
    testStack.push("ECSE 206");

    System.out.println(testStack.getSize());
    System.out.println(testStack.pop().getValue());
    System.out.println(testStack.getSize());
    System.out.println(testStack.peek().getValue());
  }
}
