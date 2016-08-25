/**
 * 
 */
package com.atr.annotations.runners;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.atr.annotations.beans.Department;
import com.atr.annotations.beans.Employee;
import com.atr.annotations.beans.EmployeeDetail;
import com.atr.annotations.beans.Meeting;
import com.atr.hibtasks.utils.HibernateUtil;

/**
 * @author Ivan Atroshonok
 *
 */
public class Runner {
    private static Logger log = Logger.getLogger(Runner.class);
    private static HibernateUtil util = HibernateUtil.getInstance();

    public static void main(String[] args) {
	Department depart1 = new Department("Dark Angels");
	
	Employee empl1 = createEmployee1(depart1);
	Employee empl2 = createEmployee2(depart1);
	Employee empl3 = createEmployee3(depart1);
	
	setEmployeeToDepartment(depart1, empl1, empl2, empl3);
	
	Meeting meet1 = new Meeting("SPRING HERE");
	Meeting meet2 = new Meeting("HIBERNATE");
	
	meet1.getEmployees().add(empl1);
	empl1.getMeetings().add(meet1);
	meet1.getEmployees().add(empl2);
	empl2.getMeetings().add(meet1);
	
	meet2.getEmployees().add(empl3);
	empl3.getMeetings().add(meet2);

	
	
	Session session = util.getSession();
	Transaction transact = session.beginTransaction();
	
	session.saveOrUpdate(depart1);
	
	session.saveOrUpdate(empl1);
	session.saveOrUpdate(empl2);
	session.saveOrUpdate(empl3);
//	session.flush();
	transact.commit();
	session.clear();
	
	
	empl3 = (Employee) session.get(Employee.class, 3l);
	System.out.println(empl3);
	

    }

    private static void setEmployeeToDepartment(Department depart1, Employee empl1, Employee empl2, Employee empl3) {
	depart1.getEmployees().add(empl1);
	depart1.getEmployees().add(empl2);
	depart1.getEmployees().add(empl3);
    }

    private static Employee createEmployee3(Department depart1) {
	Employee empl3 = new Employee("Alias", "White", "563-58-89");
	EmployeeDetail empDetail3 = new EmployeeDetail("Belarus", "Minsk", "Surganova");
	empl3.setEmployeeDetail(empDetail3);
	empl3.setDepartment(depart1);
	return empl3;
    }

    private static Employee createEmployee2(Department depart1) {
	Employee empl2 = new Employee("Smith", "John", "563-58-89");
	EmployeeDetail empDetail2 = new EmployeeDetail("Belarus", "Minsk", "Zkhukova");
	empl2.setEmployeeDetail(empDetail2);
	empl2.setDepartment(depart1);
	return empl2;
    }

    private static Employee createEmployee1(Department depart1) {
	Employee empl1 = new Employee("Atr", "Ivan", "561-58-89");
	EmployeeDetail empDetail1 = new EmployeeDetail("Belarus", "Minsk", "Gaya");
	empl1.setEmployeeDetail(empDetail1);
	empl1.setDepartment(depart1);
	return empl1;
    }

}
