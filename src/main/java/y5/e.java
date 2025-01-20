package y5;

import B5.a;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import o5.d;
import r5.i;

public final class e implements f {
    public final long X;
    public final i Y;

    public e(long v, i i0) {
        this.X = v;
        this.Y = i0;
    }

    @Override  // y5.f
    public final Object apply(Object object0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("next_request_ms", ((long)this.X));
        i i0 = this.Y;
        d d0 = i0.c;
        String s = String.valueOf(a.a(d0));
        if(((SQLiteDatabase)object0).update("transport_contexts", contentValues0, "backend_name = ? and priority = ?", new String[]{i0.a, s}) < 1) {
            contentValues0.put("backend_name", i0.a);
            contentValues0.put("priority", a.a(d0));
            ((SQLiteDatabase)object0).insert("transport_contexts", null, contentValues0);
        }
        return null;
    }
}

