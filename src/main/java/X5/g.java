package x5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import r5.i;
import z5.b;

public final class g implements b {
    public final int X;
    public final h Y;
    public final i Z;

    public g(h h0, i i0, int v) {
        this.X = v;
        this.Y = h0;
        this.Z = i0;
        super();
    }

    @Override  // z5.b
    public final Object a() {
        Boolean boolean0;
        Object object0;
        if(this.X != 0) {
            ((y5.h)this.Y.c).getClass();
            E7.g g0 = new E7.g(((y5.h)this.Y.c), 23, this.Z);
            return (Iterable)((y5.h)this.Y.c).f(g0);
        }
        y5.h h0 = (y5.h)this.Y.c;
        SQLiteDatabase sQLiteDatabase0 = h0.a();
        sQLiteDatabase0.beginTransaction();
        try {
            Long long0 = y5.h.b(sQLiteDatabase0, this.Z);
            if(long0 == null) {
                object0 = Boolean.FALSE;
            }
            else {
                Cursor cursor0 = h0.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{long0.toString()});
                try {
                    boolean0 = Boolean.valueOf(cursor0.moveToNext());
                }
                catch(Throwable throwable0) {
                    cursor0.close();
                    throw throwable0;
                }
                cursor0.close();
                object0 = boolean0;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }
}

