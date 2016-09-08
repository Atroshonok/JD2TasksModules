/**
 * 
 */
package com.atr.hibtasks.beans;

import java.io.Serializable;

/**
 * @author Atroshonok Ivan
 *
 */
public class Client implements Serializable {

    private static final long serialVersionUID = 251462757953185306L;

    private long id;
    private String login;
    private String password;
    private ClientDetail clientDetail;

    public Client() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Client [id=" + id + ", login=" + login + ", password=" + password + ", clientDetail=" + clientDetail
		+ "]";
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
	result = prime * result + ((clientDetail == null) ? 0 : clientDetail.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((login == null) ? 0 : login.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
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
	Client other = (Client) obj;
	if (clientDetail == null) {
	    if (other.clientDetail != null)
		return false;
	} else if (!clientDetail.equals(other.clientDetail))
	    return false;
	if (id != other.id)
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
     * @return the login
     */
    public String getLogin() {
	return login;
    }

    /**
     * @param login
     *            the login to set
     */
    public void setLogin(String login) {
	this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @return the clientDetail
     */
    public ClientDetail getClientDetail() {
	return clientDetail;
    }

    /**
     * @param clientDetail
     *            the clientDetail to set
     */
    public void setClientDetail(ClientDetail clientDetail) {
	this.clientDetail = clientDetail;
    }

}
