package Dao;

import java.util.List;

public interface Dao<T> {
    void create(T t);
    void update(T t);
    void delete(int id);
    List<T> readAll();
    T readById(int id);
}