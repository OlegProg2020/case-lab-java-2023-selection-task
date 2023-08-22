package task3_1;

/***
 * Узел односвязного списка, содержащий данные и ссылку на следующий элемент.
 * @param <T> тип данных для хранения.
 */
public class Node<T> {

    /***
     * Хранимые данные.
     */
    private T data;
    /***
     * Ссылка на следующий узел в списке.
     */
    private Node<T> next;

    /***
     * Создает новый узел, у которого указатель на следующий элемент равен null.
     * @param data данные, которые будут храниться в элементе списка (узле).
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
