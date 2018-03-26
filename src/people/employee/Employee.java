/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package people.employee;

import people.employee.information.Department;
import people.employee.information.Ethnic;
import people.employee.information.Position;
import people.employee.information.Literacy;
import account.Account;
import java.sql.Date;
import java.util.ArrayList;
import people.Person;
import salary.Penalty;
import salary.Reward;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 5:55:47 PM
 */
public class Employee extends Person {
    private int id;
    private Ethnic ethnic;
    private Date startWorkingDate;
    private Literacy literacy;
    private Position position;
    private Department department;
    private Account account;
    private ArrayList<Penalty> listPenalty;
    private ArrayList<Reward> listReward;
    
    public ArrayList<Employee> getAll() {
        return new ArrayList<Employee>();
    }
    
    public Employee getOneById(int id) {
        return new Employee();
    }
    
    public boolean insert(Employee employee) {
        return true;
    }
    
    public boolean update(Employee employee) {
        return true;
    }
    
    public boolean delete(Employee employee) {
        return true;
    }
    
    public ArrayList<Employee> doSearch(Employee employee) {
        return new ArrayList<Employee>();
    }
}
