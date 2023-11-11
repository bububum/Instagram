package model.entitiy;


import model.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public class Comment extends BaseEntitiy {

    private Post post;
    private User user;
    private String description;
    private List<User> likes;

    public Comment(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, Post post, User user, String description, List<User> likes) {
        super(id, createdDate, updatedDate, status);
        this.post = post;
        this.user = user;
        this.description = description;
        this.likes = likes;
    }

    public Comment() {

    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "post=" + post +
                ", user=" + user +
                ", description='" + description + '\'' +
                ", likes=" + likes +
                '}';
    }
}
