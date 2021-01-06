public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    start = null;
    end = null;
    size = 0;
  }

  public int size(){
      return size;
  }

  public boolean add(String value){
    size++;
    if(start == null) {
      start = new Node(value);
    }
    else if(end == null) {
      end = new Node(value);
      start.setNext(end);
      end.setPrev(start);
    }
    else
    {
      Node temp = end;
      end.getPrev().setNext(temp);
      temp.setNext(new Node(value));
      end = temp.getNext();
    }
    return true;
  }

  public boolean add(int index, String value){
    Node temp = start;
    Node temp2;
    if(index > size){
      return false;
    }
    else{
      for(int i = 0; i < index; i++){
        temp = temp.getNext();
      }
      temp2 = temp.getNext();
      temp.setNext(new Node(value));
      temp.getNext().setNext(temp2);
      temp.getNext().setPrev(temp);
      temp2.setPrev(temp.getNext());
    }
  }

  public String get(int index){
    Node temp = start;
    for(int i = 0; i < index; i++){
      temp = temp.getNext();
    }
    return temp.getData();
  }
  public String set(int index, String value){
    Node temp = new Node (get(index));
    String x = temp.getdata();
    temp.setData(value);
    return x;
  }
  public String toString();
  //Any helper method that returns a Node object MUST BE PRIVATE!
}
