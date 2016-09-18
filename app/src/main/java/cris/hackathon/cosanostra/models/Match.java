package cris.hackathon.cosanostra.models;

import java.util.ArrayList;
import java.util.List;

import cris.hackathon.cosanostra.services.firebase.FirebaseRepository;

/**
 * Created by Julieta on 18/09/16.
 */
public class Match {
    private String _id;
    private String _name;

    public List<User> users = new ArrayList<>();

    public Match(String id, String name) {
        _id = id;
        _name = name;
    }

    public String getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public void add(User user) {
        users.add(user);
    }

}
