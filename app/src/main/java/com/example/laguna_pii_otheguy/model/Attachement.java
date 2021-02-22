package com.example.laguna_pii_otheguy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.time.LocalDateTime;
import java.util.Date;

@DatabaseTable(tableName = "attachments")
public class Attachement {
    @DatabaseField(columnName = "attachments_id", generatedId = true) //cle primaire
    private int mId;
    @DatabaseField(columnName = "attachments_user_id",foreign = true) //Clé externe
    private User mSender;
    @DatabaseField(columnName = "attachments_date")
    private Date mDateTime;
    @DatabaseField(columnName = "attachments_location")
    private String mWhereIsIt;

    public Attachement() {
        //ORMLite needs a constructor without arguments
    }
}
