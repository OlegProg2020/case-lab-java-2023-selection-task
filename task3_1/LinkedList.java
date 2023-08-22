package task3_1;

/***
 * Односвязный список.
 * @param <T> тип элементов, содержащихся в этом списке.
 */
public class LinkedList<T> {

    /***
     * Указатель на "голову" (первый элемент) списка.
     */
    private Node<T> head;

    /***
     * Создает пустой список.
     */
    public LinkedList() {
        this.head = null;
    }

    /***
     * Добавляет элемент в конец списка.
     * @param data элемент для добавления.
     */
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    /***
     * Инвертирует порядок элементов текущего списка.
     */
    public void reverse() {
        Node<T> previous = null;
        Node<T> current = this.head;

        while (current != null) {
            Node<T> next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    /***
     * Возвращает строковое представление этого списка.
     * Строковое представление состоит из данных каждого узла списка (поле Node.data).
     * Данные упорядочены от головы списка.
     * Соседние элементы разделяются символом " " (пробела).
     * @return строковое представление этого списка.
     */
    @Override
    public String toString() {
        Node<T> current = this.head;
        StringBuilder builder = new StringBuilder();

        while (current != null) {
            builder.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return builder.toString();
    }

}
