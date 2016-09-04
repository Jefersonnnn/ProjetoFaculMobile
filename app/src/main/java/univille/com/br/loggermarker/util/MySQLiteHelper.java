package univille.com.br.loggermarker.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Jeferson Machado on 11/08/2016.
 */
public class MySQLiteHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME  = "dblogger.db";
    private static final int DATABASE_VERSION = 1;

    //Database creation sql statement
    private static final String DATABASE_INSTALACOES  = "CREATE TABLE \"instalacoes\"  (\"cdInstal\"     INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \"dtIni\" DATETIME NOT NULL , \"dtFim\" DATETIME NOT NULL , \"vlLat\" DOUBLE NOT NULL , \"vtLong\" DOUBLE NOT NULL , \"numCasa\" INTEGER NOT NULL , \"dsRua\" VARCHAR NOT NULL , \"dsSituacao\" INTEGER NOT NULL , \"flVazamento\" INTEGER NOT NULL , \"cdLogger\" INTEGER NOT NULL );";
    private static final String DATABASE_PROJETOS     = "CREATE TABLE \"projetos\"     (\"cdProjeto\"    INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \"dsNome\" VARCHAR NOT NULL , \"dtIni\" DATETIME NOT NULL , \"dtFim\" DATETIME NOT NULL , \"dsSituacao\" INTEGER NOT NULL , \"cdSubProjeto\" INTEGER NOT NULL );";
    private static final String DATABASE_SUBPROJETOS  = "CREATE TABLE \"SubProjeto\"   (\"cdSubProjeto\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \"dsNome\" INT NOT NULL, \"dtIni\" DATETIME NOT NULL, \"dtFinal\" DATETIME NOT NULL, \"dsSituacao\" INT NOT NULL, \"cdInstal\" INT NOT NULL);";
    private static final String DATABASE_INSTALACOESSITUACOES = "CREATE TABLE \"instalacoesSituacoes\" (\"cdInstalSit\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"dsNome\" VARCHAR NOT NULL , \"cdInstal\" INTEGER NOT NULL);";
    private static final String DATABASE_USUARIOS             = "CREATE TABLE \"usuarios\" (\"cdUsuario\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \"usuarioMatricula\" VARCHAR NOT NULL, \"usuarioUser\" VARCHAR NOT NULL, \"usuarioPass\" VARCHAR NOT NULL);";

    public MySQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       // db.execSQL(DATABASE_LOGGERS);
        db.execSQL(DATABASE_INSTALACOES);
        db.execSQL(DATABASE_PROJETOS);
        db.execSQL(DATABASE_SUBPROJETOS);
        db.execSQL(DATABASE_INSTALACOESSITUACOES);
        db.execSQL(DATABASE_USUARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Atualizando BANCO DE DADOS DA VERSÃO [" + oldVersion + "] para ["
                        + newVersion + "], which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " /*+ TABLE_COMMENTS*/);
        onCreate(db);

    }
}

