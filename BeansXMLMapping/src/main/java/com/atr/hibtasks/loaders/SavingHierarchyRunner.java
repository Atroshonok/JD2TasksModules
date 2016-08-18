/**
 * 
 */
package com.atr.hibtasks.loaders;

import org.apache.log4j.Logger;

import com.atr.hibtasks.beans.Address;
import com.atr.hibtasks.beans.Admin;
import com.atr.hibtasks.beans.Entity;
import com.atr.hibtasks.db.AddressDao;
import com.atr.hibtasks.db.AdminDao;
import com.atr.hibtasks.db.EntityDao;
import com.atr.hibtasks.db.exceptions.DaoException;

/**
 * @author Atroshonok Ivan
 *
 */
public class SavingHierarchyRunner {

    private static Logger log = Logger.getLogger(SavingHierarchyRunner.class);
    private static AddressDao addressDao = null;
    private static AdminDao adminDao = null;
    private static EntityDao entityDao = null;

    public static void main(String[] args) {
	
	System.out.println("======= SavingHierarchyRunner =======");
	Address address = createAddressObject();
	Admin admin = createAdminObject();
	Entity entity = createEntity();

	saveEntity(entity);
	saveAdmin(admin);
	saveAddress(address);
	Admin admin1 = findAdmin();
	System.out.println("Admin - " + admin1);
	Entity entity1 = findEntity();
	System.out.println("Entity - " + entity1);

    }

    private static Entity findEntity() {
	long id = 1;
	Entity entity = null;
	try {
	    entity = getEntityDao().get(id);
	} catch (DaoException e) {
	    log.error("Can't get entity with id = " + id + " in class " + SavingHierarchyRunner.class, e);
	}
	return entity;
    }

    private static Admin findAdmin() {
	long id = 2;
	Admin admin = null;
	try {
	    admin = getAdminDao().get(id);
	} catch (DaoException e) {
	    log.error("Can't get admin with id = " + id + " in " + SavingHierarchyRunner.class, e);

	}
	return admin;
    }

    private static void saveAddress(Address address) {
	try {
	    getAddressDao().saveOrUpdate(address);
	} catch (DaoException e) {
	    log.error("Can't save Or update address in " + SavingHierarchyRunner.class, e);
	}
    }

    private static void saveAdmin(Admin admin) {
	try {
	    getAdminDao().saveOrUpdate(admin);
	} catch (DaoException e) {
	    log.error("Can't save Or update admin in " + SavingHierarchyRunner.class, e);
	}
    }

    private static void saveEntity(Entity entity) {
	try {
	    getEntityDao().saveOrUpdate(entity);
	} catch (DaoException e) {
	    log.error("Can't save Or update entity in " + SavingHierarchyRunner.class, e);

	}
    }

    private static Address createAddressObject() {
	Address address = new Address();
	address.setName("Home Address");
	address.setCity("Минск");
	address.setCountry("Belarus");
	address.setHouseNumber(12);
	return address;
    }

    private static Admin createAdminObject() {
	Admin admin = new Admin();
	admin.setName("Main Admin");
	admin.setLogin("Ivan");
	admin.setPassword("password");
	return admin;
    }

    private static Entity createEntity() {
	Entity entity = new Entity();
	entity.setName("Entity1");
	return entity;
    }

    public static EntityDao getEntityDao() {
	if (entityDao == null) {
	    entityDao = new EntityDao();
	}
	return entityDao;
    }

    private static AddressDao getAddressDao() {
	if (addressDao == null) {
	    addressDao = new AddressDao();
	}
	return addressDao;
    }

    private static AdminDao getAdminDao() {
	if (adminDao == null) {
	    adminDao = new AdminDao();
	}
	return adminDao;
    }
}
