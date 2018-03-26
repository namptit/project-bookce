/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warehouse;

import java.util.ArrayList;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 9:47:22 PM
 */
public class Warehouse {
    private int id;
    private String name;
    private String code;
    private String location;
    private String phone;
    private String email;
    
    public ArrayList<Warehouse> getAll() {
        return new ArrayList<Warehouse>();
    }
    
    public Warehouse getOneById(int id) {
        return new Warehouse();
    }
    
    public boolean insert(Warehouse employee) {
        return true;
    }
    
    public boolean update(Warehouse employee) {
        return true;
    }
    
    public boolean delete(Warehouse employee) {
        return true;
    }
    
    public ArrayList<Warehouse> doSearch(Warehouse employee) {
        return new ArrayList<Warehouse>();
    } 
}
