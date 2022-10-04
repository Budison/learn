package com.github.budison.learn.dao.baeldung;

import java.util.List;
import java.util.Optional;

/**
 * @author Kevin Nowak
 */
interface DAO<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}
