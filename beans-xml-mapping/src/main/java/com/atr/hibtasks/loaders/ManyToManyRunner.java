/**
 * 
 */
package com.atr.hibtasks.loaders;

import java.util.Collection;
import java.util.Set;

import org.apache.log4j.Logger;

import com.atr.hibtasks.beans.manytomany.Department;
import com.atr.hibtasks.beans.manytomany.Employee;
import com.atr.hibtasks.beans.manytomany.EmployeeDetail;
import com.atr.hibtasks.beans.manytomany.Meeting;
import com.atr.hibtasks.db.EmployeeDao;
import com.atr.hibtasks.db.exceptions.DaoException;
import com.atr.hibtasks.db.manytomany.DepartmentDao;
import com.atr.hibtasks.db.manytomany.EmployeeDetailDao;
import com.atr.hibtasks.db.manytomany.MeetingDao;
import com.atr.hibtasks.utils.HibernateUtil;

/**
 * @author Atroshonok Ivan
 *
 */
public class ManyToManyRunner {
    private static Logger log = Logger.getLogger(ManyToManyRunner.class);
    private static HibernateUtil util = HibernateUtil.getInstance();
    private static MeetingDao meetingDao = new MeetingDao();
    private static EmployeeDao employeeDao = new EmployeeDao();
    private static DepartmentDao departmentDao = new DepartmentDao();
    private static EmployeeDetailDao employeeDetailDao = new EmployeeDetailDao();

    public static void main(String[] args) {
	Department department1 = new Department();
	department1.setDepartmentName("MI-6");

	Employee employee1 = createEmployee("Ivan", department1);
	Employee employee2 = createEmployee("Kate", department1);

	Meeting meeting1 = createNewMeeting("Hibernate MAPPING!");
	Meeting meeting2 = createNewMeeting("USING SPRING FRAMEWORK!");

	meeting1.getEmployees().add(employee1);
	meeting1.getEmployees().add(employee2);
	employee1.getMeetings().add(meeting1);
	employee2.getMeetings().add(meeting1);

	saveEmployee(employee1);
	saveEmployee(employee2);
	saveMitting(meeting1);
	saveMitting(meeting2);
	
	



//	Employee emp3 = null;
//	try {
//	    emp3 = employeeDao.get(1l);
//	} catch (DaoException e) {
//	    log.error("Error getting employee in class: " + ManyToManyRunner.class, e);
//	}
//	System.out.print("Employee 3 meetings: ");
//	print(emp3.getMeetings());
//	emp3.getMeetings().remove(meeting1);
//	meeting1.getEmployees().remove(emp3);
//	util.getSession().flush();


    }

    private static <T> void print(Collection<T> collection) {
	System.out.print("[");
	for (T item : collection) {
	    System.out.print(item + " ");
	}
	System.out.println("]");
    }

    private static void saveEmployee(Employee employee) {
	try {
	    employeeDao.saveOrUpdate(employee);
	} catch (DaoException e) {
	    log.error("Error saving or updating employee in class: " + ManyToManyRunner.class, e);
	}

    }

    private static void deleteEmployee(Employee employee1) {
	try {
	    employeeDao.delete(employee1);
	} catch (DaoException e) {
	    log.error("Error deleting employee in class: " + ManyToManyRunner.class, e);
	}
    }

    private static void deleteMeeting(Meeting meeting) {
	try {
	    meetingDao.delete(meeting);
	} catch (DaoException e) {
	    log.error("Error deleting meetings in class: " + ManyToManyRunner.class, e);
	}
    }

    private static void saveMitting(Meeting meeting) {
	try {
	    meetingDao.save(meeting);
	} catch (DaoException e) {
	    log.error("Error saving meetings in class: " + ManyToManyRunner.class, e);
	}
	System.out.println("Meeting saved: " + meeting);
    }

    private static Employee createEmployee(String lastname, Department department) {
	Employee employee = new Employee();

	department.getEmployees().add(employee);

	employee.setLastname(lastname);
	// employee.setDepartment(department);
	employee.setCellphone("8029-561-58-89");
	employee.setFirstname("Smith");
	// employee.setEmployeeDetail(createEmployeeDetail("Belarus", "Minsk",
	// "Gaya"));
	return employee;
    }

    private static EmployeeDetail createEmployeeDetail(String country, String city, String street) {
	EmployeeDetail employeeDetail = new EmployeeDetail();
	employeeDetail.setCountry(country);
	employeeDetail.setCity(city);
	employeeDetail.setStreet(street);
	return employeeDetail;
    }

    private static Meeting createNewMeeting(String subject) {
	Meeting meeting = new Meeting();
	meeting.setSubject(subject);
	return meeting;
    }

}
