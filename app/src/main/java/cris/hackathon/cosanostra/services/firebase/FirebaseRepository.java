package cris.hackathon.cosanostra.services.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import cris.hackathon.cosanostra.services.firebase.model.FBObject;
import cris.hackathon.cosanostra.services.firebase.model.FirebaseRef;

/**
 * Created by CristianErik on 18/09/2016.
 */
public class FirebaseRepository {

    private DatabaseReference _ref;

    public FirebaseRepository(FirebaseRef ref) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        _ref = database.getReference(ref.getValue());
    }

    //TODO: Va a modificarse.
    public <T extends FBObject> void save(T something) {
        _ref.setValue(something.toFBObject());
    }

    //TODO: Implementacion del fetch en progreso.

}

