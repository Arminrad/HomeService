package repository.base;

import java.util.List;

public interface GenericRepository<T, ID> {
    T add(T t);
    T update(T t);
    void delete(T t);
    T findById(Class<T> genericClass, ID id);
    List<T> findAll(Class<T> genericClass);
}
