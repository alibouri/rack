package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import S5.b;
import S5.d;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

final class zzcd extends zzbr implements Closeable {
    private static final String zza = "CREATE TABLE IF NOT EXISTS hits2 ( \'hit_id\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'hit_time\' INTEGER NOT NULL, \'hit_url\' TEXT NOT NULL, \'hit_string\' TEXT NOT NULL, \'hit_app_id\' INTEGER);";
    private static final String zzb = "SELECT MAX(hit_time) FROM hits2 WHERE 1;";
    private final zzcc zzc;
    private final zzfb zzd;
    private final zzfb zze;

    public zzcd(zzbu zzbu0) {
        super(zzbu0);
        this.zzd = new zzfb(this.zzC());
        this.zze = new zzfb(this.zzC());
        this.zzc = new zzcc(this, zzbu0.zza(), "google_analytics_v4.db");
    }

    @Override
    public final void close() {
        try {
            this.zzc.close();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzJ("Sql error closing database", sQLiteException0);
        }
        catch(IllegalStateException illegalStateException0) {
            this.zzJ("Error closing database", illegalStateException0);
        }
    }

    public final void zzY(List list0) {
        r.j(list0);
        k.a();
        this.zzV();
        if(list0.isEmpty()) {
            return;
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder("hit_id in (");
            for(int v = 0; v < list0.size(); ++v) {
                Long long0 = (Long)list0.get(v);
                if(long0 == null || ((long)long0) == 0L) {
                    throw new SQLiteException("Invalid hit id");
                }
                if(v > 0) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(long0);
            }
            stringBuilder0.append(")");
            String s = stringBuilder0.toString();
            try {
                SQLiteDatabase sQLiteDatabase0 = this.zzf();
                this.zzO("Deleting dispatched hits. count", list0.size());
                int v1 = sQLiteDatabase0.delete("hits2", s, null);
                if(v1 != list0.size()) {
                    this.zzT("Deleted fewer hits then expected", list0.size(), v1, s);
                    return;
                }
                return;
            }
            catch(SQLiteException sQLiteException0) {
            }
        }
        this.zzJ("Error deleting hits", sQLiteException0);
        throw sQLiteException0;
    }

    public final void zzZ() {
        this.zzV();
        this.zzf().endTransaction();
    }

    public final int zza() {
        k.a();
        this.zzV();
        if(!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        this.zzN("Deleting stale hits (if any)");
        SQLiteDatabase sQLiteDatabase0 = this.zzf();
        ((b)this.zzC()).getClass();
        int v = sQLiteDatabase0.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)});
        this.zzO("Deleted stale hits, count", v);
        return v;
    }

    public final void zzaa() {
        this.zzV();
        this.zzf().setTransactionSuccessful();
    }

    public final boolean zzab() {
        return this.zzb() == 0L;
    }

    private final long zzac(String s, String[] arr_s, long v) {
        long v1;
        SQLiteDatabase sQLiteDatabase0 = this.zzf();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                v1 = cursor0.moveToFirst() ? cursor0.getLong(0) : 0L;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzK("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v1;
    }

    private final String zzad() [...] // Inlined contents

    public final long zzb() {
        long v;
        k.a();
        this.zzV();
        SQLiteDatabase sQLiteDatabase0 = this.zzf();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery("SELECT COUNT(*) FROM hits2", null);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.zzK("Database error", "SELECT COUNT(*) FROM hits2", sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    public final long zzc() {
        k.a();
        this.zzV();
        return this.zzac(zzcd.zzb, null, 0L);
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }

    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzR("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public static zzfb zzg(zzcd zzcd0) {
        return zzcd0.zze;
    }

    public static String zzh(zzcd zzcd0) {
        return "google_analytics_v4.db";
    }

    public static String zzi() {
        return zzcd.zza;
    }

    public final List zzj(long v) {
        List list0;
        r.b(Long.compare(v, 0L) >= 0);
        k.a();
        this.zzV();
        SQLiteDatabase sQLiteDatabase0 = this.zzf();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, "hit_id ASC", Long.toString(v));
                list0 = new ArrayList();
                if(cursor0.moveToFirst()) {
                    do {
                        long v1 = cursor0.getLong(0);
                        long v2 = cursor0.getLong(1);
                        String s = cursor0.getString(2);
                        String s1 = cursor0.getString(3);
                        int v3 = cursor0.getInt(4);
                        ((ArrayList)list0).add(new zzek(this, this.zzk(s), v2, TextUtils.isEmpty(s1) || !s1.startsWith("http:"), v1, v3, null));
                    }
                    while(cursor0.moveToNext());
                }
            }
            catch(SQLiteException sQLiteException0) {
                this.zzJ("Error loading hits from the database", sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return list0;
    }

    public final Map zzk(String s) {
        if(TextUtils.isEmpty(s)) {
            return new HashMap(0);
        }
        try {
            if(!s.startsWith("?")) {
                s = "?" + s;
            }
            return d.a(new URI(s));
        }
        catch(URISyntaxException uRISyntaxException0) {
        }
        this.zzJ("Error parsing hit parameters", uRISyntaxException0);
        return new HashMap(0);
    }

    public final Map zzl(String s) {
        if(TextUtils.isEmpty(s)) {
            return new HashMap(0);
        }
        try {
            return d.a(new URI("?" + s));
        }
        catch(URISyntaxException uRISyntaxException0) {
            this.zzJ("Error parsing property parameters", uRISyntaxException0);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        this.zzV();
        this.zzf().beginTransaction();
    }

    public final void zzn(long v) {
        k.a();
        this.zzV();
        ArrayList arrayList0 = new ArrayList(1);
        Long long0 = v;
        arrayList0.add(long0);
        this.zzO("Deleting hit, id", long0);
        this.zzY(arrayList0);
    }
}

