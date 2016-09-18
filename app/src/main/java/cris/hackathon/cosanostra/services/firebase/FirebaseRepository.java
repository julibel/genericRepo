package cris.hackathon.cosanostra.services.firebase;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import cris.hackathon.cosanostra.services.firebase.model.FBNotified;
import cris.hackathon.cosanostra.services.firebase.model.FBObject;
import cris.hackathon.cosanostra.services.firebase.model.FirebaseNotif;
import cris.hackathon.cosanostra.services.firebase.model.FirebaseRef;

/**
 * Created by CristianErik on 18/09/2016.
 */
public class FirebaseRepository {

    private DatabaseReference _ref;

    public static void SubscribeEvent(final FBNotified subscriber) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("subscriptions");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                FirebaseNotif notification = FirebaseNotif.From(value);
                subscriber.sendNext(notification);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                //TODO: Log error
                subscriber.sendTerminated();
            }
        });
    }

    public FirebaseRepository(FirebaseRef ref) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        _ref = database.getReference(ref.getValue());
    }

    //TODO: Va a modificarse.
    public <T extends FBObject> void save(T something) {
        _ref.setValue(something.toFBObject());
    }

    public void read(final FBNotified subscriber) {
        _ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                FirebaseNotif notification = FirebaseNotif.From(value);
                subscriber.sendNext(notification);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                //TODO: Log error
                subscriber.sendTerminated();
            }
        });
    }

}

