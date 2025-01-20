package j6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import jeb.synthetic.TWR;

public final class E extends U {
    public final j b0;
    public boolean c0;

    public E(d0 d00) {
        super(d00);
        this.b0 = new j(this, ((d0)this.Y).X);
    }

    public final boolean A() {
        SQLiteDatabase sQLiteDatabase0;
        this.q();
        if(this.c0) {
            return false;
        }
        if(!((d0)this.Y).X.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int v = 5;
        int v1 = 0;
        while(true) {
            try {
                try {
                label_7:
                    sQLiteDatabase0 = null;
                    sQLiteDatabase0 = this.B();
                    if(sQLiteDatabase0 == null) {
                        this.c0 = true;
                        return false;
                    }
                    sQLiteDatabase0.beginTransaction();
                    sQLiteDatabase0.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabase0.setTransactionSuccessful();
                    sQLiteDatabase0.endTransaction();
                    break;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_23;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_29;
                }
                this.b().e0.b(sQLiteFullException0, "Error deleting app launch break from local database");
                this.c0 = true;
                if(sQLiteDatabase0 != null) {
                    goto label_21;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_38;
            }
        label_21:
            sQLiteDatabase0.close();
            goto label_35;
            try {
            label_23:
                SystemClock.sleep(v);
                v += 20;
                if(sQLiteDatabase0 != null) {
                    goto label_26;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_38;
            }
        label_26:
            sQLiteDatabase0.close();
            goto label_35;
            try {
            label_29:
                if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                    sQLiteDatabase0.endTransaction();
                }
                this.b().e0.b(sQLiteException0, "Error deleting app launch break from local database");
                this.c0 = true;
                if(sQLiteDatabase0 != null) {
                    goto label_34;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_38;
            }
        label_34:
            sQLiteDatabase0.close();
        label_35:
            ++v1;
            goto label_7;
        label_38:
            TWR.safeClose$NT(sQLiteDatabase0, throwable0);
            throw throwable0;
        }
        sQLiteDatabase0.close();
        return true;
    }

    public final SQLiteDatabase B() {
        if(this.c0) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase0 = this.b0.getWritableDatabase();
        if(sQLiteDatabase0 == null) {
            this.c0 = true;
            return null;
        }
        return sQLiteDatabase0;
    }

    @Override  // j6.U
    public final boolean w() {
        return false;
    }

    public static long x(SQLiteDatabase sQLiteDatabase0) {
        try(Cursor cursor0 = sQLiteDatabase0.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1")) {
            return cursor0.moveToFirst() ? cursor0.getLong(0) : -1L;
        }
    }

    public final boolean y(int v, byte[] arr_b) {
        long v3;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase1;
        SQLiteDatabase sQLiteDatabase0;
        this.q();
        if(this.c0) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("type", v);
        contentValues0.put("entry", arr_b);
        int v1 = 5;
        int v2 = 0;
        while(true) {
            try {
                sQLiteDatabase0 = null;
                sQLiteDatabase1 = null;
                sQLiteDatabase1 = this.B();
                goto label_15;
            }
            catch(SQLiteFullException sQLiteFullException0) {
                goto label_44;
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_52;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_80;
            }
            cursor0 = null;
            goto label_64;
        label_15:
            if(sQLiteDatabase1 == null) {
                try {
                    this.c0 = true;
                    return false;
                label_18:
                    sQLiteDatabase1.beginTransaction();
                    cursor0 = sQLiteDatabase1.rawQuery("select count(1) from messages", null);
                    goto label_26;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_44;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_52;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor0 = null;
                    goto label_63;
                }
                catch(Throwable throwable0) {
                    goto label_80;
                }
            }
            goto label_18;
        label_26:
            if(cursor0 == null) {
                goto label_32;
            }
            else {
                try {
                    if(cursor0.moveToFirst()) {
                        v3 = cursor0.getLong(0);
                    }
                    else {
                        v3 = 0L;
                        goto label_33;
                    label_32:
                        v3 = 0L;
                    }
                label_33:
                    if(Long.compare(v3, 100000L) >= 0) {
                        this.b().e0.d("Data loss, local db full");
                        long v4 = (long)sQLiteDatabase1.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(100001L - v3)});
                        if(v4 != 100001L - v3) {
                            this.b().e0.e("Different delete count than expected in local db. expected, received, difference", ((long)(100001L - v3)), v4, ((long)(100001L - v3 - v4)));
                        }
                    }
                    sQLiteDatabase1.insertOrThrow("messages", null, contentValues0);
                    sQLiteDatabase1.setTransactionSuccessful();
                    sQLiteDatabase1.endTransaction();
                    goto label_85;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_43;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_51;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_63;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            goto label_33;
        label_43:
            sQLiteDatabase0 = cursor0;
            try {
            label_44:
                this.b().e0.b(sQLiteFullException0, "Error writing entry; local database full");
                this.c0 = true;
                if(sQLiteDatabase0 != null) {
                    goto label_47;
                }
                goto label_48;
            }
            catch(Throwable throwable0) {
                goto label_80;
            }
        label_47:
            ((Cursor)sQLiteDatabase0).close();
        label_48:
            if(sQLiteDatabase1 != null) {
                sQLiteDatabase1.close();
                goto label_76;
            label_51:
                sQLiteDatabase0 = cursor0;
                try {
                label_52:
                    SystemClock.sleep(v1);
                    v1 += 20;
                }
                catch(Throwable throwable0) {
                    goto label_80;
                }
                if(sQLiteDatabase0 != null) {
                    ((Cursor)sQLiteDatabase0).close();
                }
                if(sQLiteDatabase1 != null) {
                    sQLiteDatabase1.close();
                    goto label_76;
                label_63:
                    sQLiteDatabase0 = sQLiteDatabase1;
                    try {
                    label_64:
                        if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                            sQLiteDatabase0.endTransaction();
                        }
                        this.b().e0.b(sQLiteException0, "Error writing entry to local database");
                        this.c0 = true;
                    }
                    catch(Throwable throwable0) {
                        sQLiteDatabase1 = sQLiteDatabase0;
                        break;
                    }
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                }
            }
        label_76:
            ++v2;
        }
        sQLiteDatabase0 = cursor0;
    label_80:
        if(sQLiteDatabase0 != null) {
            ((Cursor)sQLiteDatabase0).close();
        }
        if(sQLiteDatabase1 != null) {
            sQLiteDatabase1.close();
        }
        throw throwable0;
    label_85:
        if(cursor0 != null) {
            cursor0.close();
        }
        sQLiteDatabase1.close();
        return true;
    }

    public final void z() {
        this.q();
        try {
            SQLiteDatabase sQLiteDatabase0 = this.B();
            if(sQLiteDatabase0 != null) {
                int v = sQLiteDatabase0.delete("messages", null, null);
                if(v > 0) {
                    this.b().m0.b(v, "Reset local analytics data. records");
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.b(sQLiteException0, "Error resetting local analytics data. error");
        }
    }
}

