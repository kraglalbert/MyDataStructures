package akragl.mds;

/**
 * Stack implemented using a Singly-Linked List
 */
public class MyStack<E> {
  private MyStackNode<E> head;
  private Integer size;
  
  // CONSTRUCTOR
  MyStack() {
    this.head = null;
    this.size = 0;
  }
  
  /**
   * Push an element into the stack
   * @param newNode
   * @return the new head of the stack
   */
  public MyStackNode<E> push(E newValue) {
    MyStackNode<E> newNode = new MyStackNode<E>(newValue);
    if (this.isEmpty()) {
      head = newNode;
      this.size++;
      
      return head;
    } else {
      MyStackNode<E> tempNode = head;
      head = newNode;
      head.next = tempNode;
      this.size++;
      
      return head;
    }
  }
  
  /**
   * Pop the head from the stack
   * @return the removed node
   */
  public MyStackNode<E> pop() {
    if (this.isEmpty()) {
      return null;
    }
    MyStackNode<E> removedNode = this.head;
    this.head = head.next;
    removedNode.next = null;
    this.size--;

    return removedNode;
  }
  
  public MyStackNode<E> peek() {
    return this.head;
  }
  
  public Integer getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return (this.size == 0);
  }
}

/**
 * Inner node class
 */
class MyStackNode<E> {
  E value;
  MyStackNode<E> next;
  
  // CONTRUCTORS
  MyStackNode() {
    this.value = null;
    this.next = null;
  }

  MyStackNode(E value) {
    this.value = value;
    this.next = null;
  }
  
  public E getValue() {
    return this.value;
  }
  
  private MyStackNode<E> getNext() {
    return this.next;
  } 
}