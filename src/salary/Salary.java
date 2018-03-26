/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salary;

import java.util.ArrayList;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 5:42:47 PM
 */
public class Salary {
    private int salaryLevel;
    private Salary basicSalary;
    private float salaryRate;
    private float allowanceRate;
    
    public ArrayList<Salary> getAll() {
        return new ArrayList<Salary>();
    }
    
    public Salary getOneById(int id){
        return new Salary();
    }
    
    public boolean insert(Salary salary) {
        return true;
    }
    
    public boolean update(Salary salry) {
        return true;
    }
    
    public boolean delete(Salary salary) {
        return true;
    }
    
    public ArrayList<Salary> doSearch(Salary salary) {
        return new ArrayList<Salary>();
    }
}
