class Node{
    int id;
    int value;
    Node next; //tham chieu den phan tu tiep theo trong danh sach

    public Node(int id, int value){
        this.id=id;
        this.value=value;
        this.next = null;
    }
    public String toString(){
        return this.id + "->";
    }
}
public class LinkList {
   private Node first; //tham chieu den phan tu dau tien
   private Node last; //tham chieu den phant tu cuoi cung

   public LinkList(){
       first = null;
       last = null;
   }
   public void addBefore(int id, int value, int inp_id){
       //chen 1 phan tu vao truoc phan tu co id la inp_id
   }

   public boolean isNull(){
       return first ==null && last == null;
   }
   public void addLast(int id, int value){
       Node p = new Node(id,value);
       if(isNull()){
           first = p;
           last = p;
       }else {
           last.next = p;
           last = p;
       }
       //them 1 phan tu vao cuoi danh sach
   }

   public void addFirst(int id, int value){
       Node p = new Node(id,value);
       if(isNull()){
           first=p;
           last=p;
       }else {
           p.next = first;
           first=p;
       }
   }

   public int count(){
       int count = 0;
       Node p =first;
       while (p!=null){
           count = count + 1;
           p = p.next;
       }
       return count;
   }

   public void remove(int id){
       //loai bo phan tu co dinh danh la id khoi ds
       Node p = first;
       if(p==null) return;

       if(first.id == id){
           first = first.next; return;
       }

       while (p!=null){
           if(p.next == null) return;
           if(p.next.id!=id) break;
           p = p.next;
       }

       if(p==null) return;
       if(p.next ==last){
           last = p;
       }

       p.next = p.next.next;
   }
   public void printList(){
       Node p = first;
       while (p!=null){
           System.out.println(p.toString());
           p = p.next;
       }
       System.out.println("\n");
       System.out.printf("Size =" + count());
       System.out.println("\n");
   }
}
