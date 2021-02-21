package com.example.laguna_pii_otheguy.model;

import java.time.LocalDateTime;
import java.util.List;

public class Message {
    private Conversation mConversation;
    private User mSender;
    private List<User> mReceivers;
    private LocalDateTime mDateTime;
    private String mText;
    private List<Attachement> mAttachements;

}
