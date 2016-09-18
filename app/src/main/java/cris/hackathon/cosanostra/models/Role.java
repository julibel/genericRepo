package cris.hackathon.cosanostra.models;

import java.io.Serializable;

/**
* Created by Julieta on 18/09/16.
        */
public enum Role implements Serializable {
    Police("Police"),
    Thieve("Thieve"),
    Medic("Medic"),
    Regular("Regular"),
    God("God");

    String roleName;

    Role(String name) {
        roleName = name;
    }
}
