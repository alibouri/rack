package x2;

import M.V;
import Nb.j;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.internal.measurement.E1;
import java.io.Closeable;
import w2.e;

public final class b implements Closeable {
    public final SQLiteDatabase X;
    public static final String[] Y;
    public static final String[] Z;

    static {
        b.Y = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        b.Z = new String[0];
    }

    public b(SQLiteDatabase sQLiteDatabase0) {
        j.f(sQLiteDatabase0, "delegate");
        super();
        this.X = sQLiteDatabase0;
    }

    public final Cursor F(e e0) {
        j.f(e0, "query");
        a a0 = new a(1, new V(2, e0));
        String s = e0.b();
        Cursor cursor0 = this.X.rawQueryWithFactory(a0, s, b.Z, null);
        j.e(cursor0, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursor0;
    }

    public final void G() {
        this.X.setTransactionSuccessful();
    }

    public final void a() {
        this.X.beginTransaction();
    }

    public final void b() {
        this.X.beginTransactionNonExclusive();
    }

    @Override
    public final void close() {
        this.X.close();
    }

    public final g f(String s) {
        j.f(s, "sql");
        SQLiteStatement sQLiteStatement0 = this.X.compileStatement(s);
        j.e(sQLiteStatement0, "delegate.compileStatement(sql)");
        return new g(sQLiteStatement0);
    }

    public final void h() {
        this.X.endTransaction();
    }

    public final void l(String s) {
        j.f(s, "sql");
        this.X.execSQL(s);
    }

    public final void q(Object[] arr_object) {
        j.f(arr_object, "bindArgs");
        this.X.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", arr_object);
    }

    public final boolean r() {
        return this.X.inTransaction();
    }

    public final boolean v() {
        j.f(this.X, "sQLiteDatabase");
        return this.X.isWriteAheadLoggingEnabled();
    }

    public final Cursor z(String s) {
        j.f(s, "query");
        return this.F(new E1(s));
    }
}

