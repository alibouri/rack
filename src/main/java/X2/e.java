package x2;

import J8.j;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import i.s;
import java.io.File;
import java.util.UUID;
import v.h;
import y2.a;

public final class e extends SQLiteOpenHelper {
    public final Context X;
    public final s Y;
    public final j Z;
    public final boolean b0;
    public boolean c0;
    public final a d0;
    public boolean e0;
    public static final int f0;

    public e(Context context0, String s, s s1, j j0, boolean z) {
        Nb.j.f(context0, "context");
        Nb.j.f(j0, "callback");
        c c0 = new c(j0, s1);
        super(context0, s, null, j0.a, c0);
        this.X = context0;
        this.Y = s1;
        this.Z = j0;
        this.b0 = z;
        if(s == null) {
            s = UUID.randomUUID().toString();
            Nb.j.e(s, "randomUUID().toString()");
        }
        this.d0 = new a(s, context0.getCacheDir(), false);
    }

    public final b a(boolean z) {
        b b1;
        b b0;
        SQLiteDatabase sQLiteDatabase0;
        a a0;
        try {
            a0 = this.d0;
            a0.a(!this.e0 && this.getDatabaseName() != null);
            this.c0 = false;
            sQLiteDatabase0 = this.h(z);
            if(this.c0) {
                this.close();
                b0 = this.a(z);
                goto label_7;
            }
            b1 = this.b(sQLiteDatabase0);
            goto label_14;
        }
        catch(Throwable throwable0) {
            a0.b();
            throw throwable0;
        }
    label_7:
        a0.b();
        return b0;
        try {
            b1 = this.b(sQLiteDatabase0);
        }
        catch(Throwable throwable0) {
            a0.b();
            throw throwable0;
        }
    label_14:
        a0.b();
        return b1;
    }

    public final b b(SQLiteDatabase sQLiteDatabase0) {
        Nb.j.f(sQLiteDatabase0, "sqLiteDatabase");
        return Z6.b.p(this.Y, sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void close() {
        try {
            this.d0.a(this.d0.a);
            super.close();
            this.Y.X = null;
            this.e0 = false;
        }
        finally {
            this.d0.b();
        }
    }

    public final SQLiteDatabase f(boolean z) {
        SQLiteDatabase sQLiteDatabase0;
        if(z) {
            sQLiteDatabase0 = this.getWritableDatabase();
            Nb.j.e(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
            return sQLiteDatabase0;
        }
        sQLiteDatabase0 = this.getReadableDatabase();
        Nb.j.e(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
        return sQLiteDatabase0;
    }

    public final SQLiteDatabase h(boolean z) {
        String s = this.getDatabaseName();
        Context context0 = this.X;
        if(s != null && !this.e0) {
            File file0 = context0.getDatabasePath(s).getParentFile();
            if(file0 != null) {
                file0.mkdirs();
                if(!file0.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + file0);
                }
            }
        }
        try {
            return this.f(z);
        }
        catch(Throwable unused_ex) {
            super.close();
            try {
                Thread.sleep(500L);
            }
            catch(InterruptedException unused_ex) {
            }
            try {
                return this.f(z);
            }
            catch(Throwable throwable0) {
            }
        }
        super.close();
        if(throwable0 instanceof d) {
            int v = h.d(((d)throwable0).X);
            Throwable throwable1 = ((d)throwable0).Y;
            if(v == 0 || v == 1 || v == 2 || v == 3 || !(throwable1 instanceof SQLiteException)) {
                throw throwable1;
            }
        }
        else if(throwable0 instanceof SQLiteException && s != null && this.b0) {
        }
        else {
            throw throwable0;
        }
        context0.deleteDatabase(s);
        try {
            return this.f(z);
        }
        catch(d d0) {
            throw d0.Y;
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        Nb.j.f(sQLiteDatabase0, "db");
        j j0 = this.Z;
        if(!this.c0) {
            int v = sQLiteDatabase0.getVersion();
            if(j0.a != v) {
                sQLiteDatabase0.setMaxSqlCacheSize(1);
            }
        }
        try {
            j0.d(this.b(sQLiteDatabase0));
        }
        catch(Throwable throwable0) {
            throw new d(1, throwable0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        Nb.j.f(sQLiteDatabase0, "sqLiteDatabase");
        try {
            b b0 = this.b(sQLiteDatabase0);
            this.Z.e(b0);
        }
        catch(Throwable throwable0) {
            throw new d(2, throwable0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Nb.j.f(sQLiteDatabase0, "db");
        this.c0 = true;
        try {
            b b0 = this.b(sQLiteDatabase0);
            this.Z.f(b0, v, v1);
        }
        catch(Throwable throwable0) {
            throw new d(4, throwable0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        Nb.j.f(sQLiteDatabase0, "db");
        if(!this.c0) {
            try {
                b b0 = this.b(sQLiteDatabase0);
                this.Z.g(b0);
            }
            catch(Throwable throwable0) {
                throw new d(5, throwable0);
            }
        }
        this.e0 = true;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Nb.j.f(sQLiteDatabase0, "sqLiteDatabase");
        this.c0 = true;
        try {
            b b0 = this.b(sQLiteDatabase0);
            this.Z.j(b0, v, v1);
        }
        catch(Throwable throwable0) {
            throw new d(3, throwable0);
        }
    }
}

