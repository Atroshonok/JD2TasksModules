/**
 * 
 */
package com.atr.hibtasks.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Atroshonok Ivan
 *
 */
public class Cart implements Serializable {

    private static final long serialVersionUID = 250327260720940058L;

    private long id;
    private int allProductsCount;
    private List<Order> orders = new ArrayList<>();
    
    public Cart() {
	super();
    }
    

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Cart [id=" + id + ", allProductsCount=" + allProductsCount + ", orders=" + orders + "]";
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + allProductsCount;
	result = prime * result + ((orders == null) ? 0 : orders.hashCode());
	return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Cart other = (Cart) obj;
	if (allProductsCount != other.allProductsCount)
	    return false;
	if (orders == null) {
	    if (other.orders != null)
		return false;
	} else if (!orders.equals(other.orders))
	    return false;
	return true;
    }

    /**
     * @return the allProductsCount
     */
    public int getAllProductsCount() {
        return allProductsCount;
    }

    /**
     * @param allProductsCount the allProductsCount to set
     */
    public void setAllProductsCount(int allProductsCount) {
        this.allProductsCount = allProductsCount;
    }

    /**
     * @return the orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }
    
    
    
    

}
