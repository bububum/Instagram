package model.entitiy;

import model.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public class User extends BaseEntitiy{

    private String username;
    private List<User> followers;
    private List<User> following;
    private List<Post> posts;

    public User(int id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String username, List<User> followers, List<User> following, List<Post> posts) {
        super(id, createdDate, updatedDate, status);
        this.username = username;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                ", posts=" + posts +
                '}';
    }
}
