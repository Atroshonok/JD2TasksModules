package com.atr.hibtasks.db;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.atr.hibtasks.db.exceptions.DaoException;
import com.atr.hibtasks.utils.HibernateUtil;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * @author Atroshonok Ivan
 */
public class BaseDao<T> implements Dao<T> {
    private static Logger log = Logger.getLogger(BaseDao.class);
    private Transaction transaction = null;

    public BaseDao() {

    }

    public void saveOrUpdate(T t) throws DaoException {
	try {
	    Session session = HibernateUtil.getInstance().getSession();
	    transaction = session.beginTransaction();
	    session.saveOrUpdate(t);
	    log.info("saveOrUpdate(t):" + t);
	    transaction.commit();
	    log.info("Save or update (commit):" + t);
	} catch (HibernateException e) {
	    log.error("Error save or update object of " + t.getClass() + "class in Dao: " + e);
	    transaction.rollback();
	    throw new DaoException(e);
	}
    }

    public Serializable save(T t) throws DaoException {
	Serializable id = null;
	try {
	    Session session = HibernateUtil.getInstance().getSession();
	    transaction = session.beginTransaction();
	    id = session.save(t);
	    log.info("save(t):" + t);
	    transaction.commit();
	    log.info("Save (commit):" + t);
	} catch (HibernateException e) {
	    log.error("Error save object of " + t.getClass() + " class in Dao: " + e);
	    transaction.rollback();
	    throw new DaoException(e);
	}
	return id;
    }

    public T get(Serializable id) throws DaoException {
	log.info("Get Clazz by id:" + id);
	T t = null;
	try {
	    Session session = HibernateUtil.getInstance().getSession();
	    transaction = session.beginTransaction();
	    t = (T) session.get(getPersistentClass(), id);
	    transaction.commit();
	    log.info("get clazz:" + t);
	} catch (HibernateException e) {
	    transaction.rollback();
	    log.error("Error get " + getPersistentClass() + " in Dao: " + e);
	    throw new DaoException(e);
	}
	return t;
    }

    public T load(Serializable id) throws DaoException {
	log.info("Load class by id:" + id);
	T t = null;
	try {
	    Session session = HibernateUtil.getInstance().getSession();
	    transaction = session.beginTransaction();
	    t = (T) session.load(getPersistentClass(), id);
	    log.info("load() clazz:" + t);
	    transaction.commit();
	} catch (HibernateException e) {
	    log.error("Error load() " + getPersistentClass() + " in Dao: " + e);
	    transaction.rollback();
	    throw new DaoException(e);
	}
	return t;
    }

    public void delete(T t) throws DaoException {
	try {
	    Session session = HibernateUtil.getInstance().getSession();
	    transaction = session.beginTransaction();
	    session.delete(t);
	    transaction.commit();
	    log.info("Delete:" + t);
	} catch (HibernateException e) {
	    log.error("Error delete object of " + t.getClass() + " class in Dao: " + e);
	    transaction.rollback();
	    throw new DaoException(e);
	}
    }

    private Class<T> getPersistentClass() {
	return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Transaction getTransaction() {
	return transaction;
    }

    public void setTransaction(Transaction transaction) {
	this.transaction = transaction;
    }
}
