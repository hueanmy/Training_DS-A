public class Main {
    public static void main(String[] args) {
/*        Recursion s = new Recursion();
        System.out.println(s.f(5));
        s.init();
        System.out.println(s.C(16,32));

        LietKeNhiPhan l = new LietKeNhiPhan();
        l.solve(10);*/

//        NghiemNguyenDuong nghiem = new NghiemNguyenDuong();
//        nghiem.solve(3,5);
//
//        Hoanvi hv = new Hoanvi();
//        hv.solve(3);

//        LinkList linkList = new LinkList();
//        for(int i =1; i<=10;i++){
//            linkList.addLast(i,10*i);
//        }
//        linkList.printList();
//        linkList.addFirst(0,5);
//        linkList.printList();

        BTree btree = new BTree(3);
        btree.addLeft(1,3);
        btree.addRight(2,3);
        btree.addLeft(5,1);
        btree.addRight(4,1);
        btree.addLeft(7,2);
        btree.addLeft(9,7);
        btree.addRight(10,7);
        btree.addLeft(8,10);
        btree.printTree();
        System.out.println("Height of node 2:" + btree.height(2));
    }
}
