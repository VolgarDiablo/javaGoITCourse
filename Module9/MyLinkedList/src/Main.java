public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(3);
        list.add(4);
        System.out.println("MyList: " + list);
        System.out.println("Size: " + list.size());
        list.clear();
        System.out.println("MyList after cleaning: " + list);
        list.add(3);
        list.add(4);
        list.add(874);
        list.add(465);
        list.add(123454);
        list.add(4342);
        list.add(0);
        list.add(4234);
        list.add(5874);
        System.out.println("MyList: " + list);
        list.remove(4);
        System.out.println("MyList: " + list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.get(15));
    }
}