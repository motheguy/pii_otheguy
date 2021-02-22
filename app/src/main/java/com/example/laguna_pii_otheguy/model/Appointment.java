package com.example.laguna_pii_otheguy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.time.LocalDateTime;
import java.util.Date;

@DatabaseTable(tableName = "appointments")
public class Appointment {
    @DatabaseField(columnName = "appointements_id", generatedId = true) //cle primaire
    private int mId;
    @DatabaseField(columnName = "appointements_users_id",foreign = true) //cle externe
    private User mProvider;
    @DatabaseField(columnName = "appointements_patientrecords_id",foreign = true) //cle externe
    private PatientRecord mPatientRecord;
    @DatabaseField(columnName = "appointements_title")
    private String mTitle;
    @DatabaseField(columnName = "appointements_description")
    private String mDescription;
    @DatabaseField(columnName = "appointements_date")
    private Date mDateTime;

    public Appointment() {
        //No arg constructor for ORMLite
    }
}
