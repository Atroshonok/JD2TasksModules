package com.atr.hibtasks.db;

import java.io.Serializable;

import com.atr.hibtasks.db.exceptions.DaoException;

public interface Dao<T> {
    
    void saveOrUpdate(T t) throws DaoException;

    T get(Serializable id) throws DaoException;

    T load(Serializable id) throws DaoException;

    void delete(T t) throws DaoException;
}




