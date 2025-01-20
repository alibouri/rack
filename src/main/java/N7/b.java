package n7;

import J2.d;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import i.J;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r5.i;
import u5.c;
import x5.h;
import y5.e;

public final class b implements g, z5.b {
    public final int X;
    public final Object Y;
    public final long Z;
    public final Object b0;
    public final Object c0;

    public b(f f0, Object object0, long v, TimeUnit timeUnit0, int v1) {
        this.X = v1;
        this.Y = f0;
        this.c0 = object0;
        this.Z = v;
        this.b0 = timeUnit0;
        super();
    }

    public b(h h0, Iterable iterable0, i i0, long v) {
        this.X = 2;
        super();
        this.Y = h0;
        this.c0 = iterable0;
        this.b0 = i0;
        this.Z = v;
    }

    @Override  // z5.b
    public Object a() {
        h h0 = (h)this.Y;
        y5.h h1 = (y5.h)h0.c;
        h1.getClass();
        Iterable iterable0 = (Iterable)this.c0;
        if(iterable0.iterator().hasNext()) {
            SQLiteDatabase sQLiteDatabase0 = h1.a();
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.compileStatement("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y5.h.r(iterable0)).execute();
                Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while(true) {
                    try {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        int v1 = cursor0.getInt(0);
                        String s = cursor0.getString(1);
                        h1.l(((long)v1), c.d0, s);
                    }
                    catch(Throwable throwable0) {
                        cursor0.close();
                        throw throwable0;
                    }
                }
                cursor0.close();
                sQLiteDatabase0.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
        }
        h1.f(new e(h0.g.j() + this.Z, ((i)this.b0)));
        return null;
    }

    @Override  // n7.g
    public ScheduledFuture b(J j0) {
        if(this.X != 0) {
            ((f)this.Y).getClass();
            d d0 = new d(((f)this.Y), ((Callable)this.c0), j0, 1);
            return ((f)this.Y).Y.schedule(d0, this.Z, ((TimeUnit)this.b0));
        }
        ((f)this.Y).getClass();
        n7.e e0 = new n7.e(((f)this.Y), ((Runnable)this.c0), j0, 1);
        return ((f)this.Y).Y.schedule(e0, this.Z, ((TimeUnit)this.b0));
    }
}

