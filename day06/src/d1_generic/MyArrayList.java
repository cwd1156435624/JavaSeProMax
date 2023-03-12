package d1_generic;

public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int index;
    public void add(E e){
        arr[index] = e;
        index++;
    }

    public E get(int index){
        return (E)arr[index];
    }


}
