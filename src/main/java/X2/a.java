package x2;

import M.V;
import Nb.j;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import q2.B;
import w2.e;

public final class a implements SQLiteDatabase.CursorFactory {
    public final int a;
    public final Object b;

    public a(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.database.sqlite.SQLiteDatabase$CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        if(this.a != 0) {
            return (Cursor)((V)this.b).r(sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
        }
        j.f(((e)this.b), "$query");
        j.c(sQLiteQuery0);
        B b0 = new B(sQLiteQuery0);
        ((e)this.b).h(b0);
        return new SQLiteCursor(sQLiteCursorDriver0, s, sQLiteQuery0);
    }
}

