public class Node{
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }

  public String getData(){
    return data;
  }
  public void setData(String value){
    data = value;
  }

  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }

  public void setNext(String value){
    next = new Node(value);
  }

  public void setPrev(String value){
    prev = new Node(value);
  }
  private String data;
  private Node next,prev;
}
