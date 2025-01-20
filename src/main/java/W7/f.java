package W7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import o6.a;
import r5.i;
import u5.c;
import y5.e;
import z5.b;

public final class f implements a, y5.f, b {
    public final long X;
    public final Object Y;
    public final Object Z;

    public f(long v, Object object0, Object object1) {
        this.Y = object0;
        this.Z = object1;
        this.X = v;
        super();
    }

    public f(h h0, long v, HashMap hashMap0) {
        this.Y = h0;
        this.X = v;
        this.Z = hashMap0;
    }

    @Override  // z5.b
    public Object a() {
        long v = ((x5.h)this.Y).g.j();
        y5.h h0 = (y5.h)((x5.h)this.Y).c;
        h0.getClass();
        h0.f(new e(v + this.X, ((i)this.Z)));
        return null;
    }

    @Override  // y5.f
    public Object apply(Object object0) {
        String s;
        int v;
        v = ((c)this.Z).X;
        s = (String)this.Y;
        try(Cursor cursor0 = ((SQLiteDatabase)object0).rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{s, Integer.toString(v)})) {
            if(cursor0.getCount() > 0) {
                goto label_10;
            }
            else {
                goto label_12;
            }
        }
        goto label_13;
    label_10:
        boolean z = true;
        goto label_13;
    label_12:
        z = false;
    label_13:
        long v1 = this.X;
        if(!z) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("log_source", s);
            contentValues0.put("reason", v);
            contentValues0.put("events_dropped_count", v1);
            ((SQLiteDatabase)object0).insert("log_event_dropped", null, contentValues0);
            return null;
        }
        ((SQLiteDatabase)object0).execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + v1 + " WHERE log_source = ? AND reason = ?", new String[]{s, Integer.toString(v)});
        return null;
    }

    @Override  // o6.a
    public Object j(o6.h h0) {
        return ((h)this.Y).b(h0, this.X, ((HashMap)this.Z));
    }
}

