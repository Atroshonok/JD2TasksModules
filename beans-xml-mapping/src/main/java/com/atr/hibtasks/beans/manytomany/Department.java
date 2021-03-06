/**
 * 
 */
package com.atr.hibtasks.beans.manytomany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Atroshonok Ivan
 *
 */
public class Department implements Serializable {

    private static final long serialVersionUID = -7674661916613937472L;
    
    private Long id;
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();
   
    public Department() {
	super();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Department [id=" + id + ", dapartmentName=" + departmentName + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	Department other = (Department) obj;
	if (departmentName == null) {
	    if (other.departmentName != null)
		return false;
	} else if (!departmentName.equals(other.departmentName))
	    return false;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	return true;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the dapartmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param dapartmentName the dapartmentName to set
     */
    public void setDepartmentName(String dapartmentName) {
        this.departmentName = dapartmentName;
    }

    /**
     * @return the employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    
    
    
    

}
