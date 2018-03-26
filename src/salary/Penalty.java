/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salary;

import java.sql.Date;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 5:49:06 PM
 */
public class Penalty {
    private float value;
    private Date timePenalty;
    
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDate() {
        return timePenalty;
    }

    public void setDate(Date date) {
        this.timePenalty = date;
    }
    
}
