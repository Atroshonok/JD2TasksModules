/**
 * 
 */
package com.atr.hibtasks.db;

import com.atr.hibtasks.beans.Order;
import com.atr.hibtasks.db.exceptions.DaoException;

/**
 * @author Atroshonok Ivan
 *
 */
public class OrderDao extends BaseDao<Order> {

    /* (non-Javadoc)
     * @see com.atr.hibtasks.db.BaseDao#saveOrUpdate(java.lang.Object)
     */
    @Override
    public void saveOrUpdate(Order t) throws DaoException {
	// TODO Auto-generated method stub
	super.saveOrUpdate(t);
	t.setState("Processing");
    }
    

}
