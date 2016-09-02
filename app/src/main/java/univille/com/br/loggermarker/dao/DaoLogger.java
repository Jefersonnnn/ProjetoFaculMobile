package univille.com.br.loggermarker.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import univille.com.br.loggermarker.util.MySQLiteHelper;

/**
 * Created by CASA on 12/08/2016.
 */
public class DaoLogger {

    private static final String DATABASE_LOGGERS = "CREATE TABLE \"loggers\" (\"cdlogger\"     INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \"flstatus\" VARCHAR NOT NULL);";

    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allColumns = {"cdlogger", "flstatus"};

}
