package akragl.mds;

public class MySLinkedList<E> {
  private MySLinkedListNode<E> head;
  private Integer size;
  
  // CONSTRUCTOR
  MySLinkedList() {
    head = null;
    size = 0;
  }
  
  /**
   * Add a node to the front of the list
   * @param newNode
   * @return new head
   */
  public MySLinkedListNode<E> add(MySLinkedListNode<E> newNode) {
    if (this.isEmpty()) {
      head = newNode;
      
      size++;
      return head;
    } else {
      MySLinkedListNode<E> tempNode = head;
      head = newNode;
      head.next = tempNode;
      
      size++;
      return head;  
    }
  }
  
  /**
   * Add a node to the front of the list given a value
   * @param newValue
   * @return new head
   */
  public MySLinkedListNode<E> add(E newValue) {
    MySLinkedListNode<E> newNode = new MySLinkedListNode<E>(newValue);
    if (this.isEmpty()) {
      head = newNode;
      
      size++;
      return head;
    } else {
      MySLinkedListNode<E> tempNode = head;
      head = newNode;
      head.next = tempNode;
      
      size++;
      return head;  
    }  
  }
  
  /**
   * Remove the node at the front of the list
   * @return removed node
   */
  public MySLinkedListNode<E> removeFirst() {
    if (this.isEmpty()) {
      return null;
    } else {
      MySLinkedListNode<E> tempNode = head;
      head = head.next;
      tempNode.next = null;
      
      this.size--;
      return tempNode;
    }
  }
  
  /**
   * Remove the node with specified value from the list
   * @param value
   * @return removed node
   */
  public MySLinkedListNode<E> remove(E value) {
    MySLinkedListNode<E> prevNode = this.head;
    MySLinkedListNode<E> tempNode = this.head.next;
    
    // edge case checks
    if (this.head.value == value || this.head.value.equals(value)) {
      this.removeFirst();
    }
    if (this.isEmpty()) {
      return null;
    }
    
    for (int i = 0; i < this.getSize()-1; i++) {
      if (tempNode.getValue() == value || tempNode.getValue().equals(value)) {
        prevNode.next = tempNode.next;
        tempNode.next = null;
        
        this.size--;
        return tempNode;
      }
      prevNode = prevNode.next;
      tempNode = tempNode.next;
    }
    
    return null;
  }
  
  public MySLinkedListNode<E> getFirst() {
    return head;
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
class MySLinkedListNode<E> {
  E value;
  MySLinkedListNode<E> next;
  
  // CONSTRUCTORS
  MySLinkedListNode() {
    value = null;
    next = null;
  }
  
  MySLinkedListNode(E value) {
    this.value = value;
    next = null;
  }
  
  public E getValue() {
    return value;
  } 
}
