package service.base;

import java.io.Serializable;
import java.util.List;

public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {





    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T findById(Class<T> clazz, ID id) {
        return null;
    }

    @Override
    public List<T> findAll(Class<T> Clazz) {
        return null;
    }
}
