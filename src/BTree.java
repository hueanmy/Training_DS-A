class TNode {
    int id;
    TNode left;
    TNode right;

    public TNode(int id){
        this.id = id;
        this.left=null;
        this.right=null;
    }

    public String toString(){
        return this.id + "";
    }
}
public class BTree {

    private TNode root;
    public BTree() {
        root = null;
    }

    public BTree(int id){
        root = new TNode(id);
    }
    private TNode find(int id, TNode r){
        //tim va tra ve con tro tro den mot nut co dinh danh id
        if(r==null) return null;
        if(r.id == id) return r;
        TNode p = find(id, r.left);
        if(p!=null) return p;
        return find(id, r.right);
    }

    public TNode find(int id){
        return find(id, root);
    }
    public void addLeft(int id, int v){
        //them 1 nut co dinh danh id vao con trai cua nut co dinh danh v
        TNode leftNode = new TNode(id);
        TNode q = find(v);
        if(q.left!=null) return;
        q.left=leftNode;
    }
    public void addRight(int id, int v){
        //them mot nut co dinh danh id vao con phai cua nut co dinh danh v
        TNode rightNode = new TNode(id);
        TNode q = find(v);
        if(q.right!=null) return;
        q.right=rightNode;
    }

    private int count(TNode r){
        if(r==null) return 0;
        return 1 + count(r.left) + count(r.right);
    }
    public int count(){
        return count(root);
    }

    private int height(TNode r){
        if(r==null) return 0;
        int hLeft = height(r.left);
        int hRight = height(r.right);
        return hLeft > hRight ? hLeft +1 : hRight +1;
    }


    public int height(int id){
        TNode p = find(id);
        return height(p);
    }

    private void printTree(TNode r){
        if(r==null) return;
        System.out.println(r.toString() + ":");
        if(r.left!=null){
            System.out.println("left:" + r.left.toString());
        }else System.out.println("left = N");
        if(r.right!=null){
            System.out.println("right:" + r.right.toString());
        }else System.out.println("right=N");

        printTree(r.left);
        printTree(r.right);
    }

    public void printTree(){
        printTree(root);
        System.out.println("Count:" + count());
    }
}
