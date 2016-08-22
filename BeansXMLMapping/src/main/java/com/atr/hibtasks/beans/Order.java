/**
 * 
 */
package com.atr.hibtasks.beans;

import java.io.Serializable;

/**
 * @author Atroshonok Ivan
 *
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 8873811593106529052L;

    private long id;
    private double sumPrice;
    private String state;

    public Order() {
	super();
    }
    
    

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Order [id=" + id + ", sumPrice=" + sumPrice + ", state=" + state + "]";
    }



    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	long temp;
	temp = Double.doubleToLongBits(sumPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
    }

    /*
     * (non-Javadoc)
     * 
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
	Order other = (Order) obj;
	if (id != other.id)
	    return false;
	if (state == null) {
	    if (other.state != null)
		return false;
	} else if (!state.equals(other.state))
	    return false;
	if (Double.doubleToLongBits(sumPrice) != Double.doubleToLongBits(other.sumPrice))
	    return false;
	return true;
    }

    /**
     * @return the id
     */
    public long getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(long id) {
	this.id = id;
    }

    /**
     * @return the sumPrice
     */
    public double getSumPrice() {
	return sumPrice;
    }

    /**
     * @param sumPrice
     *            the sumPrice to set
     */
    public void setSumPrice(double sumPrice) {
	this.sumPrice = sumPrice;
    }

    /**
     * @return the state
     */
    public String getState() {
	return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {
	this.state = state;
    }


}
