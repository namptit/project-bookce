/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salary;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author TrongPhung trongpq@magenest.com
 * Mar 26, 2018 5:49:58 PM
 */
public class Reward {
    private int id;
    private String name;
    private RewardType type;
    private Date timeReward;
    
    public ArrayList<Reward> getAll() {
        return new ArrayList<Reward>();
    }
    
    public Reward getOneById(int id) {
        return new Reward();
    }
    
    public boolean insert(Reward reward) {
        return true;
    }
    
    public boolean update(Reward reward) {
        return true;
    }
    
    public boolean delete(Reward reward) {
        return true;
    }
    
    public ArrayList<Reward> doSearch(Reward reward) {
        return new ArrayList<Reward>();
    }
}
