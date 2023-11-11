package model.entitiy;

import model.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public class Post extends BaseEntitiy {

    private User user;
    private String location;
    private List<User> likes;
    private List<Comment> comments;
    private String description;

    public Post(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String post1, User user, String location, List<User> likes, List<Comment> comments, String description) {
        super(id, createdDate, updatedDate, status);
        this.user = user;
        this.location = location;
        this.likes = likes;
        this.comments = comments;
        this.description = description;
    }

    public Post() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "user=" + user +
                ", location='" + location + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                ", description='" + description + '\'' +
                '}';
    }
}
