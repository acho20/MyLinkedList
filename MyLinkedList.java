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
      start.setNext(end.getData());
      end.setPrev(start.getData());
    }
    else
    {
      Node temp = end;
      end.getPrev().setNext(temp.getData());
      temp.setNext(value);
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
      temp.setNext(value);
      temp.getNext().setNext(temp2.getData());
      temp.getNext().setPrev(temp.getData());
      temp2.setPrev(temp.getNext().getData());
      return true;
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
    String x = temp.getData();
    temp.setData(value);
    return x;
  }
  public String toString(){
    String x = "";
    Node temp = start;
    for(int i = 0; i < size - 1; i++){
      x += temp.getData();
      x += ", ";
    }
    x += end.getData();
    return x;
  }
}
