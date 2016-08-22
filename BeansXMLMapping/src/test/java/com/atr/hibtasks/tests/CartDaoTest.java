/**
 * 
 */
package com.atr.hibtasks.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.atr.hibtasks.beans.Cart;
import com.atr.hibtasks.beans.Order;
import com.atr.hibtasks.db.CartDao;
import com.atr.hibtasks.db.OrderDao;
import com.atr.hibtasks.db.exceptions.DaoException;
import com.atr.hibtasks.utils.HibernateUtil;

/**
 * @author Atroshonok Ivan
 *
 */
/**
 * @author Atroshonok Ivan
 *
 */
public class CartDaoTest {
    private static final long CART_ID = 1l;
    private static final int ORDERS_COUNT = 3;
    private static Logger log = Logger.getLogger(CartDaoTest.class);
    private static HibernateUtil util = HibernateUtil.getInstance();
    private Cart cart = null;
    private static CartDao cartDao = new CartDao();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
	
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
	util.getSession().close();
    }

    @Before
    public void setUp() throws Exception {
	cart = createCart();
	List<Order> orders = createOrders();
	cart.setOrders(orders);
	System.out.println("Created Cart object before test: " + cart);
	saveOrUpdateCart(cart);
    }

    private void saveOrUpdateCart(Cart cart) {
	try {
	    cartDao.saveOrUpdate(cart);
	} catch (DaoException e) {
	    log.error("Error saving or updating cart in " + CartDaoTest.class, e);
	}
    }

    @After
    public void tearDown() throws Exception {
	util.getSession().clear();
    }

    public void testSaveOrUpdate() throws DaoException {
	    cartDao.saveOrUpdate(cart);
    }

    @Test
    public void testGet() {
	Cart actualCart = null;
	try {
	    actualCart = cartDao.get(cart.getId());
	} catch (DaoException e) {
	    log.error("Error getting cart with id = " + CART_ID + "from DB in class: " + CartDaoTest.class, e);
	}
	if (actualCart != null && cart != null) {
	    assertEquals(cart, actualCart);
	}

    }

    @Test
    public void testDelete() {
	try {
	    cartDao.delete(cart);
	} catch (DaoException e) {
	    log.error("Error deleting cart in class: " + CartDaoTest.class, e);
	}
	assertTrue(!util.getSession().contains(cart));
	
    }

    private static List<Order> createOrders() {
	List<Order> tempOrders = new ArrayList<>();
	for (int i = 0; i < ORDERS_COUNT; i++) {
	    Order tempOrder = createOrder();
	    tempOrders.add(tempOrder);
	}
	return tempOrders;
    }

    private static Order createOrder() {
	Order tempOrder = new Order();
	tempOrder.setState("New");
	return tempOrder;
    }

    private Cart createCart() {
	Cart tempCart = new Cart();
	tempCart.setAllProductsCount(ORDERS_COUNT);
	return tempCart;
    }
}
