package com.interfaceDao;

import java.util.List;

public interface InterfaceDao<T> {

    T save(T t);
    void remove(T t);
    T update (T t);
    T findeById(int id);
    List<T> all();
}
