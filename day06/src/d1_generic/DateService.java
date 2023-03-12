package d1_generic;

public interface DateService<E> {
    //添加
    public void add(E e);
    //删除
    public void remove(E e);
    //修改
    public void update(E e);
    //查询
    public E get(int id);
}
