package task3_1;

/*
 * Написать Java-программу, которая инвертирует односвязный список
 */

public class Task3_1 {

    /*
     * Пример работы метода reverse(), инвертирующего односвязный список.
     * */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Исходный список: " + list);

        list.reverse();
        System.out.println("Инвертированный список: " + list);
    }

}
