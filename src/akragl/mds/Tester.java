package akragl.mds;

import akragl.mds.MySLinkedList;

public class Tester {

  public static void main(String[] args) {
    
    // LINKED LIST
    MySLinkedList<Integer> testLinkedList = new MySLinkedList<Integer>();
    
    testLinkedList.add(1);
    System.out.println(testLinkedList.getSize());

  }

}
