package uk.ac.napier.courseworkdirtrally;

import android.provider.BaseColumns;

/**
 * Created by abdek on 13/02/2017.
 */

public class FeedReaderContract {

    //private FeedReaderContract() {}

    //inner classes that define tables
    //by implementing basecolumns the inner class can inherit
    //primary keys that some Andorid classes will expect to have it.

    //this class is used along with the main database to keep all the hard coded names, and tables
    //together in one place.

    public static class FeedSession implements BaseColumns{
        public static final String TABLE_NAME = "sessions";
        public static final String COLUMN_PLAYER = "player";
        public static final String COLUMN_TRACK = "track";
        public static final String COLUMN_CARMODEL = "carmodel";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_TIME = "time";
    }

    public static class FeedPlayer implements BaseColumns{
        public static final String TABLE_NAME = "players";
        public static final String COLUMN_NAME = "player";
        public static final String COLUMN_COLOUR = "colour";
    }

    public static class FeedTrack implements BaseColumns{
        public static final String TABLE_NAME = "tracks";
        public static final String COLUMN_COUNTRY = "country";
        public static final String COLUMN_NAME= "name";
        public static final String COLUMN_LENGTH= "length";
    }

}
