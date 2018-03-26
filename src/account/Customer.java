/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 5:31:02 PM
 */
public class Customer {
    private int id;
    private String email;
    private CustomerType type;
    private Account account;
    
    public boolean changeProfile(Account account) {
        return true;
    }
    
    public boolean deleteAccount(Account account) {
         return true;
    }
    
    public Customer search(String customerName) {
        return new Customer();
    }
}
