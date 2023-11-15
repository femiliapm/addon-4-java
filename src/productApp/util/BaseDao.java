package productApp.util;

import java.util.List;

public interface BaseDao<T, ID> {
  // add data
  void save(T data);

  // get all data
  List<T> findAll();

  // get data by id
  T findById(ID id);

  // update
  void update(ID id, T data);

  // delete
  void delete(ID id);

  // size
  Integer size();
}
