/**
 * 
 */
package com.atr.annotations.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;

/**
 * @author Atroshonok Ivan
 *
 */
@Entity
@Proxy(lazy = false)
@Table(name = "T_EMPLOYEE", catalog = "task3_db")
public class Employee implements Serializable {

    private static final long serialVersionUID = 3422119895124671359L;

    @Id
    @Column(name = "F_EMPL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "F_FIRSTNAME")
    private String firstname;

    @Column(name = "F_LASTNAME")
    private String lastname;

    @Column(name = "F_CELLPHONE")
    private String cellphone;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "F_EMPL_ID", referencedColumnName = "F_EMPL_DETAIL_ID")
    // @JoinColumn(name = "F_EMPL_ID", referencedColumnName = "F_EMPL_DETAIL_ID")
    private EmployeeDetail employeeDetail;

    @ManyToOne
    @JoinColumn(name = "F_DEPARTMENT_ID")
    private Department department;

     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(catalog = "task3_db", name = "T_MEETING_EMPLOYEE", joinColumns = {@JoinColumn(name = "F_EMPL_ID")},
     inverseJoinColumns = {@JoinColumn(name = "F_MEETING_ID")})
     private Set<Meeting> meetings = new HashSet<>();

    public Employee() {
	super();
    }

    public Employee(String firstname, String lastname, String cellphone) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.cellphone = cellphone;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", cellphone=" + cellphone
		+ ", employeeDetail=" + employeeDetail + "]";
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cellphone == null) ? 0 : cellphone.hashCode());
	result = prime * result + ((employeeDetail == null) ? 0 : employeeDetail.hashCode());
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
	if (employeeDetail == null) {
	    if (other.employeeDetail != null)
		return false;
	} else if (!employeeDetail.equals(other.employeeDetail))
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
     * @param id
     *            the id to set
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
     * @param firstname
     *            the firstname to set
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
     * @param lastname
     *            the lastname to set
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
     * @param cellphone
     *            the cellphone to set
     */
    public void setCellphone(String cellphone) {
	this.cellphone = cellphone;
    }

    /**
     * @return the employeeDetail
     */
    public EmployeeDetail getEmployeeDetail() {
	return employeeDetail;
    }

    /**
     * @param employeeDetail
     *            the employeeDetail to set
     */
    public void setEmployeeDetail(EmployeeDetail employeeDetail) {
	this.employeeDetail = employeeDetail;
    }

    /**
     * @return the department
     */
    public Department getDepartment() {
	return department;
    }

    /**
     * @param department
     *            the department to set
     */
    public void setDepartment(Department department) {
	this.department = department;
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