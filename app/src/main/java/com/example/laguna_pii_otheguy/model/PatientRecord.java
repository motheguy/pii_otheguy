package com.example.laguna_pii_otheguy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

@DatabaseTable(tableName = "patientrecords")
public class PatientRecord {
    @DatabaseField(columnName = "patientrecords_id", generatedId = true) //cle primaire
    private int mId;
    @DatabaseField(columnName = "patientrecords_last_name")
    private String mLastName;
    @DatabaseField(columnName = "patientrecords_first_name")
    private String mFirstName;
    @DatabaseField(columnName = "patientrecords_profil_picture")
    private String mProfilPicture;
    @DatabaseField(columnName = "patientrecords_contact")
    private String mContact;
    @DatabaseField(columnName = "patientrecords_description")
    private String mDescription;
    private List<String> mMainFeatures;
    private List<Appointment> mAppointments;

    public PatientRecord() {
        //ORMLite needs a constructor without arguments
    }
}
