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
      start.setNext(end);
    }
    else if(end == null) {
      end = new Node(value);
      start.setNext(end);
      end.setPrev(start);
    }
    else
    {
      Node temp = new Node(value);
      temp.setPrev(end);
      end.setNext(temp);
      end = temp;
    }
    return true;
  }
  public void add(int index, String value){
    Node temp = start;
    Node temp2;
    if(index > size){
      return;
    }else if (index == size){
      add(value);
    }else{
      size++;
      for(int i = 0; i < index - 1; i++){
        temp = temp.getNext();
      }
      // Might run into IndexOutOfBounds below
      // consider using end
      temp2 = temp.getNext();
      temp.setNext(new Node(value));
      temp.getNext().setNext(temp2);
      temp.getNext().setPrev(temp);
      temp2.setPrev(temp.getNext());
      return;
    }
  }
  public String get(int index){
    try{
      if(index >= size){
        throw new Exception("IndexOutOfBounds");
      }
      Node temp = start;
      for(int i = 0; i < index; i++){
        temp = temp.getNext();
      }
      return temp.getData();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  private Node getNode(int index){
    try{
      if(index >= size){
        throw new Exception("IndexOutOfBounds");
      }
      Node temp = start;
      for(int i = 0; i < index; i++){
        temp = temp.getNext();
      }
      return temp;
    }
    catch(Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  public String set(int index, String value){
    try{
      if(index >= size) {
        throw new Exception("IndexOutOfBounds");
      }
      this.getNode(index).setData(value);
      return value;
    }
    catch(Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  public String toString(){
    if(start == null) {
      return "";
    }
    String x = start.getData();
    Node temp = start;
    for(int i = 0; i < size - 1; i++){
      x += ", ";
      temp = temp.getNext();
      x += temp.getData();
    }
    return x;
  }
  //Any helper method that returns a Node object MUST BE PRIVATE!
}
