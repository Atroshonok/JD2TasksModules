/**
 * 
 */
package com.atr.hibtasks.loaders;

import org.apache.log4j.Logger;

import com.atr.hibtasks.beans.Client;
import com.atr.hibtasks.beans.ClientDetail;
import com.atr.hibtasks.db.ClientDao;
import com.atr.hibtasks.db.ClientDetailDao;
import com.atr.hibtasks.db.exceptions.DaoException;

/**
 * @author Atroshonok Ivan
 *
 */
public class OneToOneRunner {
    
    private static Logger log = Logger.getLogger(SavingHierarchyRunner.class);
    
    public static void main(String[] args) {
	Client client = createClient();
	ClientDetail clientDetail = createClientDetail();
	clientDetail.setClient(client);
	client.setClientDetail(clientDetail);
	
	saveClient(client);
	
	clientDetail = findClientDetail(1l);
	System.out.println(clientDetail);
	
	deleteClient(client);
	
	client = findClient(1l);
	System.out.println(client);
    }

    private static void deleteClient(Client client) {
	try {
	    new ClientDao().delete(client);
	} catch (DaoException e) {
	    log.error("Error deleting client in " + OneToOneRunner.class, e);
	}
    }

    private static ClientDetail findClientDetail(long id) {
	ClientDetail clientDetail = null;
	try {
	    clientDetail = new ClientDetailDao().get(id);
	} catch (DaoException e) {
	    log.error("Can't get clientDetail in " + OneToOneRunner.class, e);
	}
	return clientDetail;
    }

    private static Client findClient(long id) {
	Client client = null;
	try {
	    client = new ClientDao().get(id);
	} catch (DaoException e) {
	    log.error("Can't get client in " + OneToOneRunner.class, e);
	}
	return client;
    }

    private static void saveClient(Client client) {
	try {
	    new ClientDao().saveOrUpdate(client);
	} catch (DaoException e) {
	    log.error("Can't save client in " + OneToOneRunner.class, e);
	}
    }

    private static ClientDetail createClientDetail() {
	ClientDetail clientDetail = new ClientDetail();
	clientDetail.setAge(18);
	clientDetail.setFirstname("John");
	clientDetail.setLastname("Atr");
	return clientDetail;
    }

    private static Client createClient() {
	Client client = new Client();
	client.setLogin("Clienttt");
	client.setPassword("ClientPass");
	return client;
    }

}
