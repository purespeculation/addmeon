package com.comp350.william.addmeon;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

/**
 * Created by william on 4/4/18.
 */
@Database(entities = {Account.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
abstract class AccountDatabase extends RoomDatabase {
    public abstract AccountDao accountDao();

    private static AccountDatabase INSTANCE;

    public static AccountDatabase getDatabase(final Context context) {


        if (INSTANCE == null) {
            synchronized (AccountDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AccountDatabase.class, "account_database").allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
