package transporthub.repositiries;

import java.util.List;

public interface RepoCrudOperations <T>{
    T add(T t);
    T getById(int id);
    List<T> getAll();
    Boolean delete(T t);
}
