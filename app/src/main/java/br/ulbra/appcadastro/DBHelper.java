package br.ulbra.appcadastro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static String nome = "BancoDados.db";
    private static int versao=1;

    public DBHelper(Context context) {
        super(context, nome, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String str = "CREATE TABLE utilizador(NomeUsuario TEXT PRIMARY KEY, S1 TEXT);"; // Renomeei S1 para senha
        db.execSQL(str);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS utilizador;");
        onCreate(db);
    }

    public long criarUtilizador(String NomeUsuario, String S1) { // Renomeei S1 para senha
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NomeUsuario", NomeUsuario);
        cv.put("S1", S1);
        long result = db.insert("utilizador", null, cv);
        return result;
    }

    public String validarLogin(String NomeUsuario, String S1) { // Renomeei S1 para senha
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM utilizador WHERE NomeUsuario=? AND S1=?", new String[]{NomeUsuario, S1});

        String result;
        if (c.getCount() > 0) {
            result = "OK";
        } else {
            result = "ERRO";
        }
        c.close();
        return result;
    }
}
