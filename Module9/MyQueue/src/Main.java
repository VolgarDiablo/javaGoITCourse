public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> list = new MyQueue<>();

        list.add(3);
        list.add(4);
        System.out.println("MyList: " + list);
        System.out.println("Size: " + list.size());
        list.clear();
        System.out.println("MyList cleared: " + list);
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
        System.out.println(list.peek());
        System.out.println("MyList: " + list);
        list.poll();
        System.out.println(list);
        list.clear();
        System.out.println(list.peek());
    }
}