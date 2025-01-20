package x2;

import J8.j;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import i.s;
import java.io.IOException;
import java.util.List;

public final class c implements DatabaseErrorHandler {
    public final j a;
    public final s b;

    public c(j j0, s s0) {
        this.a = j0;
        this.b = s0;
    }

    @Override  // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase0) {
        Nb.j.f(this.a, "$callback");
        Nb.j.e(sQLiteDatabase0, "dbObj");
        b b0 = Z6.b.p(this.b, sQLiteDatabase0);
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + b0 + ".path");
        SQLiteDatabase sQLiteDatabase1 = b0.X;
        if(sQLiteDatabase1.isOpen()) {
            try {
                try {
                    List list0 = null;
                    list0 = sQLiteDatabase1.getAttachedDbs();
                }
                catch(SQLiteException unused_ex) {
                }
                try {
                    b0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            catch(Throwable throwable0) {
                if(list0 == null) {
                    String s1 = sQLiteDatabase1.getPath();
                    if(s1 != null) {
                        j.b(s1);
                    }
                }
                else {
                    for(Object object0: list0) {
                        Object object1 = ((Pair)object0).second;
                        Nb.j.e(object1, "p.second");
                        j.b(((String)object1));
                    }
                }
                throw throwable0;
            }
            if(list0 != null) {
                for(Object object2: list0) {
                    Object object3 = ((Pair)object2).second;
                    Nb.j.e(object3, "p.second");
                    j.b(((String)object3));
                }
                return;
            }
            String s2 = sQLiteDatabase1.getPath();
            if(s2 != null) {
                j.b(s2);
            }
        }
        else {
            String s = sQLiteDatabase1.getPath();
            if(s != null) {
                j.b(s);
            }
        }
    }
}

