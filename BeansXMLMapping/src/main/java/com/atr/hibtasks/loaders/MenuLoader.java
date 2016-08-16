/**
 * 
 */
package com.atr.hibtasks.loaders;

import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.atr.hibtasks.beans.User;
import com.atr.hibtasks.beans.UserType;
import com.atr.hibtasks.db.UserDao;
import com.atr.hibtasks.db.exceptions.DaoException;
import com.atr.hibtasks.utils.HibernateUtil;
import com.atr.hibtasks.utils.UserPropertyManager;

/**
 * @author Atroshonok Ivan
 *
 */
public class MenuLoader {
    private static Logger log = Logger.getLogger(MenuLoader.class);
    public static Boolean needMenu = true;
    private static UserDao userDao = null;

    public static void menu() throws DaoException {
	while (needMenu) {
	    User user = null;
	    printMenu();
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    switch (choice) {
	    case 0:
		HibernateUtil.getInstance().getSession().close();
		scanner.close();
		System.exit(0);
		break;
	    case 1:
		deleteUser();
		break;
	    case 2:
		user = findUser();
		break;
	    case 3:
		user = createUser(user);
		getUserDao().saveOrUpdate(user);
		break;
	    case 4:
		user = createUserWithId(user);
		getUserDao().save(user);
		break;
	    case 5:
		user = loadUserById();
		break;
	    case 6:
		performFlush();
		break;
	    default:
		needMenu = true;
		break;
	    }
	    needMenu = true;
	}

    }

    private static void performFlush() {
	int id = 13;
	String newName = "Alla";
	try {
	    getUserDao().flush(id, newName);
	} catch (DaoException e) {
	    log.error("Error durring execution performFlush(): " + e);
	}

    }

    private static User loadUserById() {
	System.out.println("Load by Id. Please enter user id:");
	System.out.print("Id - ");

	Scanner scanner = new Scanner(System.in);
	User user = null;
	Integer id = scanner.nextInt();
	try {
	    user = getUserDao().load(id);
	} catch (DaoException e) {
	    log.error("Can,t load user with id = " + id, e);
	} catch (NullPointerException e) {
	    log.error("Unable load user:", e);
	    System.out.println(user);
	}
	return user;
    }

    private static User createUserWithId(User user) {
	System.out.println("Please enter user description:");
	System.out.print("Login - ");

	if (user == null) {
	    user = new User();
	}

	initialUserFields(user);
	Scanner scanner = new Scanner(System.in);
	String parameter = scanner.nextLine();
	user.setLogin(parameter);
	System.out.print("Id - ");
	parameter = scanner.nextLine();
	user.setId(Integer.parseInt(parameter));

	return user;
    }

    private static void deleteUser() {
	System.out.print("Id - ");
	Scanner scanner = new Scanner(System.in);
	int id = Integer.parseInt(scanner.nextLine());
	try {
	    User user = getUserDao().get(id);
	    if (user != null) {
		getUserDao().delete(user);
	    }
	} catch (DaoException e) {
	    log.error("Can't delete user with id = " + id);
	}
    }

    private static User createUser(User user) {
	System.out.println("Please enter user description:");
	System.out.print("Login - ");

	if (user == null) {
	    user = new User();
	}

	initialUserFields(user);
	Scanner scanner = new Scanner(System.in);
	String parameter = scanner.nextLine();
	user.setLogin(parameter);
	return user;
    }

    private static void initialUserFields(User user) {
	user.setPassword(UserPropertyManager.getProperty("password"));
	user.setEmail(UserPropertyManager.getProperty("email"));
	user.setFirstname(UserPropertyManager.getProperty("firstname"));
	user.setLastname(UserPropertyManager.getProperty("lastname"));
	user.setUserType(UserType.valueOf(UserPropertyManager.getProperty("userType")));
	user.setRegistrDate(new Date());
    }

    private static User findUser() {
	System.out.println("Get by Id. Please enter user id:");
	System.out.print("Id - ");

	Scanner scanner = new Scanner(System.in);
	User user = null;
	Integer id = scanner.nextInt();
	try {
	    user = getUserDao().get(id);
	} catch (DaoException e) {
	    log.error("Can,t find user with id = " + id, e);
	} catch (NullPointerException e) {
	    log.error("Unable find user:", e);
	}
	System.out.println(user);
	return user;
    }

    private static UserDao getUserDao() {
	if (userDao == null) {
	    userDao = new UserDao();
	}
	return userDao;
    }

    private static void printMenu() {
	System.out.println(" Options:");
	System.out.println("        0. Exit");
	System.out.println("        1. Delete User");
	System.out.println("        2. Get User");
	System.out.println("        3. Save or Update User");
	System.out.println("        4. Save User");
	System.out.println("        5. Load User");
	System.out.println("        6. Flush User");

    }
}
