package ADF2.Assignment6;

import java.util.ArrayList;

public interface DAOInterface<E> {
    void save(E e);
    ArrayList<E> list();
    void update(E e);
    void delete(E e);
}
