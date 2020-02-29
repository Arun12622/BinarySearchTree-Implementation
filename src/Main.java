public class Main {
    public static void main(String[] args)
    {
        MyBinarySearchTree bs=new MyBinarySearchTree();
        bs.insert(100);
        bs.insert(75);
        bs.insert(150);
        bs.insert(200);
        System.out.println(bs.search(100));
    }
}
