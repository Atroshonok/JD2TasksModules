/**
 * 
 */
package com.atr.hibtasks.beans;

import java.io.Serializable;

/**
 * @author Atroshonok Ivan
 *
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 2061883038888083548L;

    private int id;
    private String name;
    private double price;
    private ProductCategory category;
    private int count;
    private String description;

    public Product() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", count="
		+ count + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + count;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Product other = (Product) obj;
	if (category == null) {
	    if (other.category != null)
		return false;
	} else if (!category.equals(other.category))
	    return false;
	if (count != other.count)
	    return false;
	if (description == null) {
	    if (other.description != null)
		return false;
	} else if (!description.equals(other.description))
	    return false;
	if (id != other.id)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
	    return false;
	return true;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public ProductCategory getCategory() {
	return category;
    }

    public void setCategory(ProductCategory category) {
	this.category = category;
    }

    public int getCount() {
	return count;
    }

    public void setCount(int count) {
	this.count = count;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}
