package entity;

import java.util.List;

/**
 * Created by dakshay on 29/10/2021.
 */
public class Waitlist {
    private final Long id;
    private List<Group> groupList;

    public Waitlist(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
