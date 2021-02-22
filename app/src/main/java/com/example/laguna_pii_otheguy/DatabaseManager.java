package com.example.laguna_pii_otheguy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.laguna_pii_otheguy.model.Appointment;
import com.example.laguna_pii_otheguy.model.Attachement;
import com.example.laguna_pii_otheguy.model.Conversation;
import com.example.laguna_pii_otheguy.model.Message;
import com.example.laguna_pii_otheguy.model.PatientRecord;
import com.example.laguna_pii_otheguy.model.User;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.List;

public class DatabaseManager extends OrmLiteSqliteOpenHelper {
    private static final String sDATABASE_NAME="Laguna.db";
    private static final int sDATBASE_VERSION=1;


    public DatabaseManager(Context context) {
        super(context, sDATABASE_NAME, null, sDATBASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try{
            TableUtils.createTable(connectionSource,User.class);
            TableUtils.createTable(connectionSource,PatientRecord.class);
            TableUtils.createTable(connectionSource,Message.class);
            TableUtils.createTable(connectionSource,Conversation.class);
            TableUtils.createTable(connectionSource,Attachement.class);
            TableUtils.createTable(connectionSource,Appointment.class);
            Log.i("DATABASE","onCreate exécuté");
        }catch(Exception exception){
            Log.e("DATABASE","Echec de création de la base de donnée",exception);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try{
            //algorithme de migration des données.
            TableUtils.dropTable(connectionSource, User.class, true);
            TableUtils.dropTable(connectionSource, PatientRecord.class, true);
            TableUtils.dropTable(connectionSource, Message.class, true);
            TableUtils.dropTable(connectionSource, Conversation.class, true);
            TableUtils.dropTable(connectionSource, Attachement.class, true);
            TableUtils.dropTable(connectionSource, Appointment.class, true);
            onCreate(database);
            Log.i("DATABASE","onUpgrade exécuté");
        }catch(Exception exception){
            Log.e("DATABASE","Echec de la mise à jour de la base de donnée",exception);
        }
    }

    public void signUpUser(User user){
        try{
            Dao<User, Integer> dao = getDao(User.class);
            dao.create(user);//insert dans la base
            Log.i("DATABASE","Insertion du nouvel utilisateur dans la DB");
        }
        catch (Exception exception){
            Log.e("DATABASE","Echec de l'insertion du nouvel utilisateur dans la DB",exception);
        }
    }


    public List<User> returnUsers(){
        try{
            Dao<User, Integer> dao = getDao(User.class);
            List<User> users =dao.queryForAll();
            Log.i("DATABASE","returnUsers employé");
            return users;
        }
        catch (Exception exception){
            Log.e("DATABASE","returnUsers failure",exception);
            return null;
        }
    }
}
