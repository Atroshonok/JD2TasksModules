package com.atr.annotations.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


/**
 * @author Atroshonok Ivan
 *
 */

@Entity
@Table(name = "T_MEETING", catalog = "task3_db")
public class Meeting implements Serializable {

    private static final long serialVersionUID = 4935147814195686002L;

    @Id
    @Column(name = "F_MEETING_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "F_SUBJECT")
    private String subject;

    @ManyToMany(mappedBy = "meetings")
    private Set<Employee> employees = new HashSet<>();

    public Meeting() {
	super();
    }

    public Meeting(String subject) {
	super();
	this.subject = subject;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Meeting [id=" + id + ", subject=" + subject + ", employees=" + employees + "]";
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
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
	Meeting other = (Meeting) obj;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	if (subject == null) {
	    if (other.subject != null)
		return false;
	} else if (!subject.equals(other.subject))
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
     * @return the subject
     */
    public String getSubject() {
	return subject;
    }

    /**
     * @param subject
     *            the subject to set
     */
    public void setSubject(String subject) {
	this.subject = subject;
    }

    /**
     * @return the employees
     */
    public Set<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

   

}
