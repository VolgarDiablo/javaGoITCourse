public class Main {
    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();
        list.push(8);
        list.push(190);
        list.push(7);
        list.push(8);
        list.push(5);
        list.push(123412);
        list.push(203);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.peek());
        list.pop();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(12);
    }
}