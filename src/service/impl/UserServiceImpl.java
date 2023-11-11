package service.impl;

import model.entitiy.Post;
import model.entitiy.User;
import model.enums.Status;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import repository.UserRepository;

public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepository();


    @Override
    public List<Post> PostsForMainPage(int id) {
        User user = userRepository.getById(id);
        List<User> followings = user.getFollowing();
        List<Post> sorted1 = new ArrayList<>();
        for(User u: followings) {
            sorted1.addAll(u.getPosts());
        }
        List<Post> sorted = new ArrayList<>();
        for(Post post: sorted1) {
            Post firstPost = post;
            if(post.getCreatedDate().isBefore(firstPost.getCreatedDate())) {
                if(post.getStatus() == Status.ACTIVE) {
                    sorted.add(post);
                }
            }
        }
        return sorted;

    }
}
