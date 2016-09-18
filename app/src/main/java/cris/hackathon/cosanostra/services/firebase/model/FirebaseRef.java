package cris.hackathon.cosanostra.services.firebase.model;

/**
 * Created by CristianErik on 18/09/2016.
 */
public enum FirebaseRef {
    Users,
    Characters,
    Matches;

    private String _value;

    public static FirebaseRef Users() {
        FirebaseRef ref = FirebaseRef.Users;
                ref._value = "users";
        return ref;
    }

    public static FirebaseRef Characters() {
        FirebaseRef ref = FirebaseRef.Characters;
        ref._value = "characters";
        return ref;
    }

    public static FirebaseRef Matches() {
        FirebaseRef ref = FirebaseRef.Matches;
        ref._value = "message";
        return ref;
    }

    public String getValue() {
        return _value;
    }
}
