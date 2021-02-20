package com.example.laguna_pii_otheguy.model;

import java.util.List;

public class User {
    private String mLastName;
    private String mFirstName;
    private String mEmail;
    private String mPassword;
    private String mProfilPicture;
    private Enum mJob;
    private String mContact;
    private String mDescription;
    private List<Patient> Patients;

    public String getLastName() {
        return mLastName;
    }
    public void setLastName(String lastName) {
        mLastName = lastName;
    }
}
