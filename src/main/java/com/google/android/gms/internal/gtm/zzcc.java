package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import jeb.synthetic.TWR;

final class zzcc extends zzfp {
    final zzcd zza;

    public zzcc(zzcd zzcd0, Context context0, String s) {
        this.zza = zzcd0;
        super(context0, "google_analytics_v4.db", null, 1);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if(zzcd.zzg(this.zza).zzc(3600000L)) {
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteException unused_ex) {
                zzcd.zzg(this.zza).zzb();
                this.zza.zzI("Opening the database failed, dropping the table and recreating it");
                this.zza.zzo().getDatabasePath(zzcd.zzh(this.zza)).delete();
                try {
                    SQLiteDatabase sQLiteDatabase0 = super.getWritableDatabase();
                    zzcd.zzg(this.zza).zza();
                    return sQLiteDatabase0;
                }
                catch(SQLiteException sQLiteException0) {
                    this.zza.zzJ("Failed to open freshly created database", sQLiteException0);
                    throw sQLiteException0;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        String s = sQLiteDatabase0.getPath();
        try {
            if(Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
        }
        catch(NumberFormatException unused_ex) {
            zzen.zzb("Invalid version number", Build.VERSION.SDK);
            return;
        }
        File file0 = new File(s);
        file0.setReadable(false, false);
        file0.setWritable(false, false);
        file0.setReadable(true, true);
        file0.setWritable(true, true);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(this.zza(sQLiteDatabase0, "hits2")) {
            Set set0 = zzcc.zzb(sQLiteDatabase0, "hits2");
            for(int v1 = 0; v1 < 4; ++v1) {
                String s = new String[]{"hit_id", "hit_string", "hit_time", "hit_url"}[v1];
                if(!set0.remove(s)) {
                    throw new SQLiteException("Database hits2 is missing required column: " + s);
                }
            }
            boolean z = set0.remove("hit_app_id");
            if(!set0.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if(!z) {
                sQLiteDatabase0.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        else {
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS hits2 ( \'hit_id\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'hit_time\' INTEGER NOT NULL, \'hit_url\' TEXT NOT NULL, \'hit_string\' TEXT NOT NULL, \'hit_app_id\' INTEGER);");
        }
        if(this.zza(sQLiteDatabase0, "properties")) {
            Set set1 = zzcc.zzb(sQLiteDatabase0, "properties");
            for(int v = 0; v < 6; ++v) {
                String s1 = new String[]{"app_uid", "cid", "tid", "params", "adid", "hits_count"}[v];
                if(!set1.remove(s1)) {
                    throw new SQLiteException("Database properties is missing required column: " + s1);
                }
            }
            if(!set1.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase0, String s) {
        boolean z;
        Cursor cursor0;
        try {
            try {
                cursor0 = null;
                cursor0 = sQLiteDatabase0.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{s}, null, null, null);
                z = cursor0.moveToFirst();
            }
            catch(SQLiteException sQLiteException0) {
                this.zza.zzS("Error querying for table", s, sQLiteException0);
                z = false;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return z;
    }

    private static final Set zzb(SQLiteDatabase sQLiteDatabase0, String s) {
        try {
            Set set0 = new HashSet();
            try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM " + s + " LIMIT 0", null)) {
                String[] arr_s = cursor0.getColumnNames();
                for(int v = 0; true; ++v) {
                    if(v >= arr_s.length) {
                        break;
                    }
                    ((HashSet)set0).add(arr_s[v]);
                }
                return set0;
            }
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }
}

