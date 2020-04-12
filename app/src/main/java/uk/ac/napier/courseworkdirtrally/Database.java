package uk.ac.napier.courseworkdirtrally;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by abdek on 10/02/2017.
 */

public class Database extends SQLiteOpenHelper {
    //set static final variables for the database.
    //this is not a class that has database, it is only a gate that allowes
    //comunication with DATABASE_NAME that is why it is a final static.
    //everytime a copy of this class is made, it only creates a connection
    //wioth the .db file , shieeet
    public static final String DATABASE_NAME = "session_records.db";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedReaderContract.FeedSession.TABLE_NAME + " (" +
                    FeedReaderContract.FeedSession._ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContract.FeedSession.COLUMN_PLAYER + " TEXT," +
                    FeedReaderContract.FeedSession.COLUMN_TRACK + " TEXT," +
                    FeedReaderContract.FeedSession.COLUMN_CARMODEL + " TEXT," +
                    FeedReaderContract.FeedSession.COLUMN_DATE + " TEXT," +
                    FeedReaderContract.FeedSession.COLUMN_TIME + " TEXT);" +
                    "CREATE TABLE " + FeedReaderContract.FeedPlayer.TABLE_NAME + " (" +
                    FeedReaderContract.FeedPlayer._ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContract.FeedPlayer.COLUMN_NAME + " TEXT," +
                    FeedReaderContract.FeedPlayer.COLUMN_COLOUR + " TEXT);";

}
