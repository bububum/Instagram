package service;

import model.entitiy.Post;
import model.entitiy.User;

import java.util.List;

public interface UserService {

    List<Post> PostsForMainPage(int id);

}
