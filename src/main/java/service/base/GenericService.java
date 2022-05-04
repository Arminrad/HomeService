package service.base;

import java.util.List;

public interface GenericService<T, ID> {
    T save(T t);
    T update(T t);
    void delete(T t);
    T findById(Class<T> clazz, ID id);
    List<T> findAll(Class<T> Clazz);
}
