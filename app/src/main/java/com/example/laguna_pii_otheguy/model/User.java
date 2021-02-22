package com.example.laguna_pii_otheguy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

@DatabaseTable (tableName = "users")
public class User {
    @DatabaseField(columnName = "users_id", generatedId = true) //cle primaire
    private int mId;
    @DatabaseField(columnName = "users_last_name")
    private String mLastName;
    @DatabaseField(columnName = "users_first_name")
    private String mFirstName;
    @DatabaseField(columnName = "users_email")
    private String mEmail;
    @DatabaseField(columnName = "users_password")
    private String mPassword;
    @DatabaseField(columnName = "users_profil_picture")
    private String mProfilPicture;
    @DatabaseField(columnName = "users_job")
    private String mJob;
    @DatabaseField(columnName = "users_contact")
    private String mContact;
    @DatabaseField(columnName = "users_description")
    private String mDescription;
    //private List<PatientRecord> mPatientRecords;
    //private List<Conversation> mConversations;

    public String getLastName() {
        return mLastName;
    }
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public User() {
        //ORMLite needs a constructor without arguments
    }

    public User(String email, String password) {
        mEmail = email;
        mPassword = password;
    }

    public User(String lastName, String firstName, String email, String password, String job) {
        mLastName = lastName;
        mFirstName = firstName;
        mEmail = email;
        mPassword = password;
        mJob = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "mLastName='" + mLastName + '\'' +
                ", mFirstName='" + mFirstName + '\'' +
                ", mJob=" + mJob +
                '}';
    }
}
