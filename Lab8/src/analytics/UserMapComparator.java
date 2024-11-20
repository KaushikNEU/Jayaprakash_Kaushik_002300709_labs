/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

/**
 *
 * @author kaushikj
 */
public class UserMapComparator implements Comparator<User> { // We use this comparator to find store the values in a HashMap and compare them according to the number of users

    HashMap<Integer, Integer> userPostMap;

    public UserMapComparator(HashMap<Integer, Integer> userPostMap) {
        this.userPostMap = userPostMap;
    }

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(
                ((userPostMap.get(o1.getId()) == null) ? 0 : userPostMap.get(o1.getId())),
                ((userPostMap.get(o2.getId()) == null) ? 0 : userPostMap.get(o2.getId()))
        );

    }

}
