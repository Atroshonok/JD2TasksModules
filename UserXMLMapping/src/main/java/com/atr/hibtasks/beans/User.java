/**
 * 
 */
package com.atr.hibtasks.beans;

import java.io.Serializable;
//import java.sql.Date;

/**
 * @author Atroshonok Ivan
 *
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8706338095586255829L;

    private int id;
    private String login;
    private String password;
    private String email;
    private String firstname;
    private String lastname;

    public User() {
	super();
    }
    
    

    @Override
    public String toString() {
	return "User [id=" + id + ", login=" + login + ", email=" + email + ", firstname=" + firstname + ", lastname="
		+ lastname + "]";
    }



    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	result = prime * result + ((login == null) ? 0 : login.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
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
	User other = (User) obj;
	if (email == null) {
	    if (other.email != null)
		return false;
	} else if (!email.equals(other.email))
	    return false;
	if (firstname == null) {
	    if (other.firstname != null)
		return false;
	} else if (!firstname.equals(other.firstname))
	    return false;
	if (id != other.id)
	    return false;
	if (lastname == null) {
	    if (other.lastname != null)
		return false;
	} else if (!lastname.equals(other.lastname))
	    return false;
	if (login == null) {
	    if (other.login != null)
		return false;
	} else if (!login.equals(other.login))
	    return false;
	if (password == null) {
	    if (other.password != null)
		return false;
	} else if (!password.equals(other.password))
	    return false;
	return true;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

}
