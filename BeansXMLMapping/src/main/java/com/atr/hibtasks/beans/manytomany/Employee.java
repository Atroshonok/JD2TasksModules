/**
 * 
 */
package com.atr.hibtasks.beans.manytomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Atroshonok Ivan
 *
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 3422119895124671359L;
    
    private Long id;
    private String firstname;
    private String lastname;
    private String cellphone;
//    private EmployeeDetail employeeDetail;
//    private Department department;
    private Set<Meeting> meetings = new HashSet<>();
   
    public Employee() {
	super();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cellphone == null) ? 0 : cellphone.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
	Employee other = (Employee) obj;
	if (cellphone == null) {
	    if (other.cellphone != null)
		return false;
	} else if (!cellphone.equals(other.cellphone))
	    return false;
	if (firstname == null) {
	    if (other.firstname != null)
		return false;
	} else if (!firstname.equals(other.firstname))
	    return false;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	if (lastname == null) {
	    if (other.lastname != null)
		return false;
	} else if (!lastname.equals(other.lastname))
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
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the meetings
     */
    public Set<Meeting> getMeetings() {
        return meetings;
    }

    /**
     * @param meetings the meetings to set
     */
    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = meetings;
    }

  

    
}