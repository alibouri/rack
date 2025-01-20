package y5;

import A5.a;
import E7.s;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import r5.i;
import z5.b;

public final class h implements c, d, z5.c {
    public final j X;
    public final a Y;
    public final a Z;
    public final y5.a b0;
    public final zb.a c0;
    public static final o5.c d0;

    static {
        h.d0 = new o5.c("proto");
    }

    public h(a a0, a a1, y5.a a2, j j0, zb.a a3) {
        this.X = j0;
        this.Y = a0;
        this.Z = a1;
        this.b0 = a2;
        this.c0 = a3;
    }

    public final SQLiteDatabase a() {
        j j0 = this.X;
        Objects.requireNonNull(j0);
        a a0 = this.Z;
        long v = a0.j();
        while(true) {
            try {
                return j0.getWritableDatabase();
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            }
            if(a0.j() >= ((long)this.b0.c) + v) {
                break;
            }
            SystemClock.sleep(50L);
        }
        throw new z5.a("Timed out while trying to open db.", sQLiteDatabaseLockedException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public static Long b(SQLiteDatabase sQLiteDatabase0, i i0) {
        StringBuilder stringBuilder0 = new StringBuilder("backend_name = ? and priority = ?");
        String s = String.valueOf(B5.a.a(i0.c));
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{i0.a, s}));
        byte[] arr_b = i0.b;
        if(arr_b == null) {
            stringBuilder0.append(" and extras is null");
        }
        else {
            stringBuilder0.append(" and extras = ?");
            arrayList0.add(Base64.encodeToString(arr_b, 0));
        }
        Object[] arr_object = arrayList0.toArray(new String[0]);
        try(Cursor cursor0 = sQLiteDatabase0.query("transport_contexts", new String[]{"_id"}, stringBuilder0.toString(), ((String[])arr_object), null, null, null)) {
            return !cursor0.moveToNext() ? null : cursor0.getLong(0);
        }
    }

    @Override
    public final void close() {
        this.X.close();
    }

    public final Object f(f f0) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            Object object0 = f0.apply(sQLiteDatabase0);
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase0, i i0, int v) {
        ArrayList arrayList0 = new ArrayList();
        Long long0 = h.b(sQLiteDatabase0, i0);
        if(long0 == null) {
            return arrayList0;
        }
        s s0 = new s(this, arrayList0, i0, 10);
        h.v(sQLiteDatabase0.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{long0.toString()}, null, null, null, String.valueOf(v)), s0);
        return arrayList0;
    }

    public final void l(long v, u5.c c0, String s) {
        this.f(new W7.f(v, s, c0));
    }

    public final Object q(b b0) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        a a0 = this.Z;
        long v = a0.j();
        while(true) {
            try {
                sQLiteDatabase0.beginTransaction();
                break;
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
                if(a0.j() >= ((long)this.b0.c) + v) {
                    throw new z5.a("Timed out while trying to acquire the lock.", sQLiteDatabaseLockedException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object object0 = b0.a();
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public static String r(Iterable iterable0) {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((y5.b)object0).a);
            if(iterator0.hasNext()) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    public static Object v(Cursor cursor0, f f0) {
        try(cursor0) {
            return f0.apply(cursor0);
        }
    }
}

