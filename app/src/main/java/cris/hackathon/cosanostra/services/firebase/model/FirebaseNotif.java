package cris.hackathon.cosanostra.services.firebase.model;

/**
 * Created by CristianErik on 18/09/2016.
 */
public enum FirebaseNotif {
    WakeUpThieves,
    WakeUpMedic,
    WakeUpAll,
    ThievesChoise,
    MedicChoise,
    AllChoise,
    Killed,
    //TODO: Eliminar case default
    NotHandled;

    public static FirebaseNotif From(String value) {
        switch (value) {
            case "WakeUpThieves": return FirebaseNotif.WakeUpThieves;
            case "WakeUpMedic": return FirebaseNotif.WakeUpMedic;
            case "WakeUpAll": return FirebaseNotif.WakeUpAll;
            case "ThievesChoise": return FirebaseNotif.ThievesChoise;
            case "MedicChoise": return FirebaseNotif.MedicChoise;
            case "AllChoise": return FirebaseNotif.AllChoise;
            case "Killed": return FirebaseNotif.Killed;
            default:  return FirebaseNotif.NotHandled;
        }
    }
}
