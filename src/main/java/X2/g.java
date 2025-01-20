package x2;

import android.database.sqlite.SQLiteStatement;
import q2.B;
import w2.d;

public final class g extends B implements d {
    public final SQLiteStatement Z;

    public g(SQLiteStatement sQLiteStatement0) {
        super(sQLiteStatement0);
        this.Z = sQLiteStatement0;
    }

    public final long a() {
        return this.Z.executeInsert();
    }

    public final int b() {
        return this.Z.executeUpdateDelete();
    }
}

