package com.example.laguna_pii_otheguy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@DatabaseTable(tableName = "messages")
public class Message {
    @DatabaseField(columnName = "messages_id", generatedId = true) //cle primaire
    private int mId;
    @DatabaseField(columnName = "messages_conversations_id",foreign = true)//cle externe
    private Conversation mConversation;
    @DatabaseField(columnName = "messages_users_id",foreign = true)//cle externe
    private User mSender;
    @DatabaseField(columnName = "messages_date")
    private Date mDateTime;
    @DatabaseField(columnName = "messages_text")
    private String mText;
    //private List<Attachement> mAttachements;

    public Message() {
        //ORMLite needs a constructor without arguments
    }

    public Message(Conversation conversation, User sender, Date dateTime, String text) {
        mConversation = conversation;
        mSender = sender;
        mDateTime = dateTime;
        mText = text;
    }
}
