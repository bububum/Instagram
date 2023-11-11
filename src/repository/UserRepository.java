package repository;

import model.entitiy.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> db = new ArrayList<>();

    public List<User> findAll() {
        return db;
    }

    public User getById(int id) {
        return db.get(id);
    }

    public void save(User user) {
        db.add(user);
    }
}
