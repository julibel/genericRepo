package cris.hackathon.cosanostra.services.firebase.models;

/**
 * Created by CristianErik on 18/09/2016.
 */
public enum FirebaseRef {
    Users("users"),
    Matches("matches");

    private String _refName;

    FirebaseRef(String name) {
        _refName = name;
    }

    public String getRefName() {
        return _refName;
    }
}
