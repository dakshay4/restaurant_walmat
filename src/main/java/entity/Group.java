package entity;

/**
 * Created by dakshay on 29/10/2021.
 */
public class Group {
    private final Long id;
    private final int size;
    private final Long createdAt;

    public Group(Long id, int size, Long createdAt) {
        this.id = id;
        this.size = size;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
}
