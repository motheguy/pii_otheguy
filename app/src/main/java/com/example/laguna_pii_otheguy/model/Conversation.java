package com.example.laguna_pii_otheguy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

@DatabaseTable(tableName = "conversations")
public class Conversation {
    @DatabaseField(columnName = "conversations_id", generatedId = true) //cle primaire
    private int mId;
    @DatabaseField(columnName = "conversations_title")
    private String mName;
    //private List<User> mTextingUsers;
    //private List<Message> mMessages; //a supprimer ?

    public Conversation() {
        //ORMLite needs a constructor without arguments
    }
}
