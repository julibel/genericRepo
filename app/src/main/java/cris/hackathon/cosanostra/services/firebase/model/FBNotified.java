package cris.hackathon.cosanostra.services.firebase.model;

/**
 * Created by CristianErik on 18/09/2016.
 */
public interface FBNotified {

    void sendNext(FirebaseNotif notification);

    void sendTerminated();

}
