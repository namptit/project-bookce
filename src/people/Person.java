/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package people;

import java.sql.Date;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 5:26:06 PM
 */
public abstract class Person {
    private FullName fullName;
    private Address address;
    private Gender gender;
    private Date birthday;
    private String phone;
}
