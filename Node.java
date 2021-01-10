public class Node{
  // stored variables for Node
  private String data;
  private Node next,prev;

  // basic constructor
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }

  // accessor (getter) functions
  public String getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }

  // mutator (setter) functions
  public void setData(String value){
    data = value;
  }
  public void setNext(Node n){
    next = n;
  }
  public void setPrev(Node n){
    prev = n;
  }




}
