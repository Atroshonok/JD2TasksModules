package com.atr.hibtasks.db;

import org.apache.log4j.Logger;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.atr.hibtasks.beans.User;
import com.atr.hibtasks.db.exceptions.DaoException;
import com.atr.hibtasks.utils.HibernateUtil;

//import static com.atr.hibtasks.loaders.UserLoader.util;


/**
 * @author Atroshonok Ivan
 */
public class UserDao extends BaseDao<User> {

    private static Logger log = Logger.getLogger(UserDao.class);

    public void flush(Integer id, String newName) throws DaoException {
        try {
            Session session = HibernateUtil.getInstance().getSession();
//            Transaction transaction = session.beginTransaction();
//            session.setFlushMode(FlushMode.MANUAL);
            User user = (User) session.get(User.class, id);
            System.out.println("User after get(): " + user);
            user.setFirstname(newName);
            System.out.println("User after changing firstName: " + user);
            session.flush();
            user = null;
            System.out.println("User after flush(): " + user);
            user = (User) session.get(User.class, id);
            System.out.println("User after flush() and get(): " + user);
            session.refresh(user);
            System.out.println("User after refresh(): " + user);
            
        } catch (HibernateException e) {
            log.error("Error Flush user" + e);
            throw new DaoException(e);
        }

    }

}
