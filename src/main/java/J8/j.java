package J8;

import A3.e;
import N5.A;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
import x2.b;

public abstract class j {
    public final int a;

    public j(int v) {
        this.a = v;
        super();
    }

    public abstract void a(b arg1);

    public static void b(String s) {
        if(!s.equalsIgnoreCase(":memory:")) {
            int v = s.length() - 1;
            int v1 = 0;
            boolean z = false;
            while(v1 <= v) {
                boolean z1 = Nb.j.h(s.charAt((z ? v : v1)), 0x20) <= 0;
                if(z) {
                    if(!z1) {
                        break;
                    }
                    --v;
                }
                else if(z1) {
                    ++v1;
                }
                else {
                    z = true;
                }
            }
            if(s.subSequence(v1, v + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + s);
                try {
                    SQLiteDatabase.deleteDatabase(new File(s));
                }
                catch(Exception exception0) {
                    Log.w("SupportSQLite", "delete failed: ", exception0);
                }
            }
        }
    }

    public abstract void c(b arg1);

    public abstract void d(b arg1);

    public abstract void e(b arg1);

    public void f(b b0, int v, int v1) {
        throw new SQLiteException(e.t(v, v1, "Can\'t downgrade database from version ", " to "));
    }

    public void g(b b0) {
    }

    public abstract void h(b arg1);

    public abstract void i(b arg1);

    public abstract void j(b arg1, int arg2, int arg3);

    public abstract A k(b arg1);
}

