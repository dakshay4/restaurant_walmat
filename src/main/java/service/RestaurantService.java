package service;

import entity.Group;
import entity.Waitlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dakshay on 29/10/2021.
 */
public class RestaurantService {
    private final Waitlist waitlist;
    private Map<Integer,List<Group>> map = new HashMap<>();

    public RestaurantService(Waitlist waitlist) {
        this.waitlist = waitlist;
    }

    public void addGroupInWaitlist(Group group) {
        List<Group> groups = waitlist.getGroupList();
        groups.add(group);

    }



    public boolean removeGroupfromWaitlist(Group group) {
        Long id = null;
        if(group!=null)
           id = group.getId();
        List<Group> groups = waitlist.getGroupList();
        return groups.remove(group);
    }


    public Group findFirstGroupWithSizeEqualTo(int n) {
        List<Group> groups =  waitlist.getGroupList();
        return groups.stream().filter(g-> g.getSize()==n).findFirst().orElse(null);
    }
}
