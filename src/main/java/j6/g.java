package j6;

import M.J;
import N5.r;
import Y8.o;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.p1;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzon;
import io.sentry.android.core.internal.util.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import jeb.synthetic.TWR;
import m5.b;

public final class g extends g1 {
    public final j c0;
    public final I d0;
    public static final String[] e0;
    public static final String[] f0;
    public static final String[] g0;
    public static final String[] h0;
    public static final String[] i0;
    public static final String[] j0;
    public static final String[] k0;
    public static final String[] l0;
    public static final String[] m0;
    public static final String[] n0;

    static {
        g.e0 = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        g.f0 = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        g.g0 = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};
        g.h0 = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        g.i0 = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        g.j0 = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        g.k0 = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        g.l0 = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
        g.m0 = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
        g.n0 = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    }

    public g(k1 k10) {
        super(k10);
        this.d0 = new I(((d0)this.Y).l0);
        this.c0 = new j(this, ((d0)this.Y).X);
    }

    public final long A(i1 i10) {
        this.q();
        this.u();
        r.f(i10.d2());
        byte[] arr_b = i10.c();
        long v = this.r().y(arr_b);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", i10.d2());
        contentValues0.put("metadata_fingerprint", v);
        contentValues0.put("metadata", arr_b);
        try {
            this.y().insertWithOnConflict("raw_events_metadata", null, contentValues0, 4);
            return v;
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.c(L.u(i10.d2()), "Error storing raw event metadata. appId", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final void A0(String s) {
        boolean z;
        Cursor cursor1;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"name", "lifetime_count"}));
        p p0 = this.o0("events", s, "_f");
        p p1 = this.o0("events", s, "_v");
        this.u0("events", s);
        Cursor cursor0 = null;
        int v = 0;
        try {
            cursor1 = this.y().query("events_snapshot", ((String[])arrayList0.toArray(new String[0])), "app_id=?", new String[]{s}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            z = false;
            goto label_61;
        }
        catch(Throwable throwable0) {
            z = false;
            goto label_76;
        }
        try {
            if(!cursor1.moveToFirst()) {
                goto label_24;
            }
            goto label_32;
        }
        catch(SQLiteException sQLiteException0) {
            z = false;
            cursor0 = cursor1;
            goto label_61;
        }
        catch(Throwable throwable0) {
            z = false;
            cursor0 = cursor1;
            goto label_76;
        }
    label_24:
        cursor1.close();
        if(p0 != null) {
            this.T("events", p0);
        }
        else if(p1 != null) {
            this.T("events", p1);
        }
        this.u0("events_snapshot", s);
        return;
    label_32:
        int v1 = 0;
        z = false;
        try {
            do {
                String s1 = cursor1.getString(0);
                if(((d0)this.Y).e0.B(null, s.a1)) {
                    if(cursor1.getLong(1) >= 1L) {
                        if("_f".equals(s1)) {
                            v1 = 1;
                        }
                        else if("_v".equals(s1)) {
                            z = true;
                        }
                    }
                }
                else if("_f".equals(s1)) {
                    v1 = 1;
                }
                else if("_v".equals(s1)) {
                    z = true;
                }
                if(s1 != null) {
                    p p2 = this.o0("events_snapshot", s, s1);
                    if(p2 != null) {
                        this.T("events", p2);
                    }
                }
            }
            while(cursor1.moveToNext());
            goto label_85;
        }
        catch(SQLiteException sQLiteException0) {
            cursor0 = cursor1;
            v = v1;
        }
        catch(Throwable throwable0) {
            cursor0 = cursor1;
            v = v1;
            goto label_76;
        }
        try {
        label_61:
            L l0 = this.b();
            M m0 = L.u(s);
            l0.e0.c(m0, "Error querying snapshot. appId", sQLiteException0);
        }
        catch(Throwable throwable0) {
            goto label_76;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        if(v == 0 && p0 != null) {
            this.T("events", p0);
        }
        else if(!z && p1 != null) {
            this.T("events", p1);
        }
        this.u0("events_snapshot", s);
        return;
    label_76:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(v == 0 && p0 != null) {
            this.T("events", p0);
        }
        else if(!z && p1 != null) {
            this.T("events", p1);
        }
        this.u0("events_snapshot", s);
        throw throwable0;
    label_85:
        cursor1.close();
        if(v1 == 0 && p0 != null) {
            this.T("events", p0);
        }
        else if(!z && p1 != null) {
            this.T("events", p1);
        }
        this.u0("events_snapshot", s);
    }

    public final long B(String s) {
        r.f(s);
        this.q();
        this.u();
        try {
            return (long)this.y().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{s, String.valueOf(Math.max(0, Math.min(1000000, ((d0)this.Y).e0.v(s, s.q))))});
        }
        catch(SQLiteException sQLiteException0) {
            L l0 = this.b();
            M m0 = L.u(s);
            l0.e0.c(m0, "Error deleting over the limit events. appId", sQLiteException0);
            return 0L;
        }
    }

    public final boolean B0(String s) {
        return ((d0)this.Y).e0.B(null, s.B0) ? this.g0(b.w("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", this.e0()), new String[]{s}) != 0L : false;
    }

    public final long C(String s, String[] arr_s, long v) {
        long v1;
        SQLiteDatabase sQLiteDatabase0 = this.y();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v1 = cursor0.getLong(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.b().e0.c(s, "Database error", sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return v1;
    label_14:
        cursor0.close();
        return v;
    }

    public final void C0() {
        this.u();
        this.y().endTransaction();
    }

    public final i D(long v, String s, long v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        r.f(s);
        this.q();
        this.u();
        String[] arr_s = {s};
        i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        Cursor cursor0 = null;
        try {
            SQLiteDatabase sQLiteDatabase0 = this.y();
            cursor0 = sQLiteDatabase0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                if(cursor0.getLong(0) == v) {
                    i0.b = cursor0.getLong(1);
                    i0.a = cursor0.getLong(2);
                    i0.c = cursor0.getLong(3);
                    i0.d = cursor0.getLong(4);
                    i0.e = cursor0.getLong(5);
                    i0.f = cursor0.getLong(6);
                    i0.g = cursor0.getLong(7);
                }
                if(z) {
                    i0.b += v1;
                }
                if(z1) {
                    i0.a += v1;
                }
                if(z2) {
                    i0.c += v1;
                }
                if(z3) {
                    i0.d += v1;
                }
                if(z4) {
                    i0.e += v1;
                }
                if(z5) {
                    i0.f += v1;
                }
                if(z6) {
                    i0.g += v1;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("day", v);
                contentValues0.put("daily_public_events_count", ((long)i0.a));
                contentValues0.put("daily_events_count", ((long)i0.b));
                contentValues0.put("daily_conversions_count", ((long)i0.c));
                contentValues0.put("daily_error_events_count", ((long)i0.d));
                contentValues0.put("daily_realtime_events_count", ((long)i0.e));
                contentValues0.put("daily_realtime_dcu_count", ((long)i0.f));
                contentValues0.put("daily_registered_triggers_count", ((long)i0.g));
                sQLiteDatabase0.update("apps", contentValues0, "app_id=?", arr_s);
                goto label_41;
            }
            goto label_43;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_48;
        }
        catch(Throwable throwable0) {
            goto label_55;
        }
    label_41:
        cursor0.close();
        return i0;
        try {
            try {
            label_43:
                L l0 = this.b();
                M m0 = L.u(s);
                l0.h0.b(m0, "Not updating daily counts, app is not known. appId");
                goto label_57;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_48:
            L l1 = this.b();
            M m1 = L.u(s);
            l1.e0.c(m1, "Error updating daily counts. appId", sQLiteException0);
            if(cursor0 != null) {
                goto label_52;
            }
            return i0;
        }
        catch(Throwable throwable0) {
            goto label_55;
        }
    label_52:
        cursor0.close();
        return i0;
    label_55:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_57:
        cursor0.close();
        return i0;
    }

    public final void D0() {
        this.q();
        this.u();
        if(!this.d0()) {
            return;
        }
        k1 k10 = this.Z;
        long v = k10.g0.d0.a();
        d0 d00 = (d0)this.Y;
        d00.l0.getClass();
        long v1 = SystemClock.elapsedRealtime();
        if(Math.abs(v1 - v) > ((long)(((Long)s.A.a(null))))) {
            k10.g0.d0.b(v1);
            this.q();
            this.u();
            if(this.d0()) {
                SQLiteDatabase sQLiteDatabase0 = this.y();
                d00.l0.getClass();
                int v2 = sQLiteDatabase0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((long)(((Long)s.F.a(null)))))});
                if(v2 > 0) {
                    this.b().m0.b(v2, "Deleted stale rows. rowsDeleted");
                }
            }
        }
    }

    public final i E(long v, String s, boolean z, boolean z1, boolean z2, boolean z3) {
        return this.D(v, s, 1L, false, false, z, false, z1, z2, z3);
    }

    public final void E0() {
        this.u();
        this.y().setTransactionSuccessful();
    }

    public final Object F(Cursor cursor0, int v) {
        int v1 = cursor0.getType(v);
        switch(v1) {
            case 0: {
                this.b().e0.d("Loaded invalid null value from database");
                return null;
            }
            case 1: {
                return cursor0.getLong(v);
            }
            case 2: {
                return cursor0.getDouble(v);
            }
            case 3: {
                return cursor0.getString(v);
            }
            case 4: {
                this.b().e0.d("Loaded invalid blob type value, ignoring it");
                return null;
            }
            default: {
                this.b().e0.b(v1, "Loaded invalid unknown value type, ignoring it");
                return null;
            }
        }
    }

    public final String G(long v) {
        String s;
        Cursor cursor0;
        this.q();
        this.u();
        try {
            cursor0 = null;
            cursor0 = this.y().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v)});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.b().m0.d("No expired configs for apps with pending events");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_10:
        cursor0.close();
        return null;
        try {
            try {
            label_12:
                s = cursor0.getString(0);
                goto label_22;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_15:
            this.b().e0.b(sQLiteException0, "Error selecting expired configs");
            if(cursor0 != null) {
                goto label_17;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_17:
        cursor0.close();
        return null;
    label_20:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_22:
        cursor0.close();
        return s;
    }

    public final String H(String s, String[] arr_s) {
        String s1;
        SQLiteDatabase sQLiteDatabase0 = this.y();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    s1 = cursor0.getString(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.b().e0.c(s, "Database error", sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return s1;
    label_14:
        cursor0.close();
        return "";
    }

    public final List I(int v, int v1, String s) {
        List list2;
        List list1;
        long v5;
        h1 h10;
        byte[] arr_b1;
        List list0;
        this.q();
        this.u();
        r.b(v > 0);
        r.b(v1 > 0);
        r.f(s);
        Cursor cursor0 = null;
        try {
            cursor0 = this.y().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{s}, null, null, "rowid", String.valueOf(v));
            if(cursor0.moveToFirst()) {
                list0 = new ArrayList();
                int v2 = 0;
                while(true) {
                    long v3 = cursor0.getLong(0);
                    try {
                        byte[] arr_b = cursor0.getBlob(1);
                        arr_b1 = this.r().f0(arr_b);
                    }
                    catch(IOException iOException0) {
                        L l0 = this.b();
                        M m0 = L.u(s);
                        l0.e0.c(m0, "Failed to unzip queued bundle. appId", iOException0);
                        goto label_55;
                    }
                    if(!((ArrayList)list0).isEmpty()) {
                        if(arr_b1.length + v2 <= v1) {
                            goto label_21;
                        }
                        goto label_56;
                    }
                    try {
                    label_21:
                        h10 = (h1)O.E(i1.b2(), arr_b1);
                    }
                    catch(IOException iOException1) {
                        L l1 = this.b();
                        M m1 = L.u(s);
                        l1.e0.c(m1, "Failed to merge queued bundle. appId", iOException1);
                        goto label_55;
                    }
                    if(!((ArrayList)list0).isEmpty()) {
                        i1 i10 = (i1)((Pair)((ArrayList)list0).get(0)).first;
                        i1 i11 = (i1)h10.d();
                        if(!i10.G().equals(i11.G()) || !i10.F().equals(i11.F()) || i10.W() != i11.W() || !i10.H().equals(i11.H())) {
                            goto label_56;
                        }
                        long v4 = -1L;
                        Iterator iterator0 = i10.U().iterator();
                        while(true) {
                            v5 = -1L;
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            Object object0 = iterator0.next();
                            p1 p10 = (p1)object0;
                            if("_npa".equals(p10.B())) {
                                v4 = p10.x();
                                break;
                            }
                        }
                        for(Object object1: i11.U()) {
                            p1 p11 = (p1)object1;
                            if("_npa".equals(p11.B())) {
                                v5 = p11.x();
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        if(v4 == v5) {
                            goto label_49;
                        }
                        goto label_56;
                    }
                label_49:
                    if(!cursor0.isNull(2)) {
                        int v6 = cursor0.getInt(2);
                        h10.f();
                        i1.p1(((i1)h10.Y), v6);
                    }
                    v2 += arr_b1.length;
                    ((ArrayList)list0).add(Pair.create(((i1)h10.d()), v3));
                label_55:
                    if(cursor0.moveToNext() && v2 <= v1) {
                        continue;
                    }
                    goto label_56;
                }
            }
            goto label_58;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_61;
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
    label_56:
        cursor0.close();
        return list0;
        try {
            try {
            label_58:
                list1 = Collections.emptyList();
                goto label_71;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_61:
            L l2 = this.b();
            M m2 = L.u(s);
            l2.e0.c(m2, "Error querying bundles. appId", sQLiteException0);
            list2 = Collections.emptyList();
            if(cursor0 != null) {
                goto label_66;
            }
            return list2;
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
    label_66:
        cursor0.close();
        return list2;
    label_69:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_71:
        cursor0.close();
        return list1;
    }

    public final List J(String s, String s1, String s2) {
        r.f(s);
        this.q();
        this.u();
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(s);
        StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(s1)) {
            arrayList0.add(s1);
            stringBuilder0.append(" and origin=?");
        }
        if(!TextUtils.isEmpty(s2)) {
            arrayList0.add(s2 + "*");
            stringBuilder0.append(" and name glob ?");
        }
        return this.K(stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    public final List K(String s, String[] arr_s) {
        List list1;
        this.q();
        this.u();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.y().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, s, arr_s, null, null, "rowid", "1001");
            if(cursor0.moveToFirst()) {
                while(true) {
                    if(((ArrayList)list0).size() >= 1000) {
                        goto label_25;
                    }
                    boolean z = false;
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    String s3 = cursor0.getString(2);
                    Object object0 = this.F(cursor0, 3);
                    if(cursor0.getInt(4) != 0) {
                        z = true;
                    }
                    String s4 = cursor0.getString(5);
                    long v = cursor0.getLong(6);
                    Parcelable parcelable0 = this.r().B(cursor0.getBlob(7), zzbf.CREATOR);
                    long v1 = cursor0.getLong(8);
                    Parcelable parcelable1 = this.r().B(cursor0.getBlob(9), zzbf.CREATOR);
                    long v2 = cursor0.getLong(10);
                    long v3 = cursor0.getLong(11);
                    Parcelable parcelable2 = this.r().B(cursor0.getBlob(12), zzbf.CREATOR);
                    ((ArrayList)list0).add(new zzae(s1, s2, new zzon(v2, object0, s3, s2), v1, z, s4, ((zzbf)parcelable0), v, ((zzbf)parcelable1), v3, ((zzbf)parcelable2)));
                    if(!cursor0.moveToNext()) {
                        goto label_24;
                    }
                }
            }
            goto label_38;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_28;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_24:
        goto label_36;
        try {
            try {
            label_25:
                this.b().e0.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                goto label_36;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_28:
            this.b().e0.b(sQLiteException0, "Error querying conditional user property value");
            list1 = Collections.emptyList();
            if(cursor0 != null) {
                goto label_31;
            }
            return list1;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_31:
        cursor0.close();
        return list1;
    label_34:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_36:
        cursor0.close();
        return list0;
    label_38:
        cursor0.close();
        return list0;
    }

    public final void L(ContentValues contentValues0) {
        try {
            SQLiteDatabase sQLiteDatabase0 = this.y();
            String s = contentValues0.getAsString("app_id");
            if(s == null) {
                L l0 = this.b();
                M m0 = L.u("app_id");
                l0.g0.b(m0, "Value of the primary key is not set.");
                return;
            }
            if(((long)sQLiteDatabase0.update("consent_settings", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("consent_settings", null, contentValues0, 5) == -1L) {
                L l1 = this.b();
                M m1 = L.u("consent_settings");
                M m2 = L.u("app_id");
                l1.e0.c(m1, "Failed to insert/update table (got -1). key", m2);
            }
            return;
        }
        catch(SQLiteException sQLiteException0) {
        }
        L l2 = this.b();
        M m3 = L.u("consent_settings");
        M m4 = L.u("app_id");
        l2.e0.e("Error storing into table. key", m3, m4, sQLiteException0);
    }

    public static void M(ContentValues contentValues0, Object object0) {
        r.f("value");
        r.j(object0);
        if(object0 instanceof String) {
            contentValues0.put("value", ((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            contentValues0.put("value", ((Long)object0));
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues0.put("value", ((Double)object0));
    }

    public final void N(i1 i10, boolean z) {
        byte[] arr_b1;
        this.q();
        this.u();
        r.f(i10.d2());
        if(!i10.t0()) {
            throw new IllegalStateException();
        }
        this.D0();
        ((d0)this.Y).l0.getClass();
        long v = System.currentTimeMillis();
        if(i10.J1() < v - ((long)(((Long)s.F.a(null)))) || i10.J1() > ((long)(((Long)s.F.a(null)))) + v) {
            this.b().h0.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", L.u(i10.d2()), v, i10.J1());
        }
        byte[] arr_b = i10.c();
        try {
            arr_b1 = this.r().d0(arr_b);
        }
        catch(IOException iOException0) {
            this.b().e0.c(L.u(i10.d2()), "Data loss. Failed to serialize bundle. appId", iOException0);
            return;
        }
        this.b().m0.b(((int)arr_b1.length), "Saving bundle, size");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", i10.d2());
        contentValues0.put("bundle_end_timestamp", i10.J1());
        contentValues0.put("data", arr_b1);
        contentValues0.put("has_realtime", ((int)z));
        if(i10.A0()) {
            contentValues0.put("retry_count", i10.i1());
        }
        try {
            if(this.y().insert("queue", null, contentValues0) == -1L) {
                this.b().e0.b(L.u(i10.d2()), "Failed to insert bundle (got -1). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.c(L.u(i10.d2()), "Error storing bundle. appId", sQLiteException0);
        }
    }

    public final void O(B b0, boolean z) {
        this.q();
        this.u();
        String s = b0.f();
        r.j(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        d0 d00 = (d0)this.Y;
        A a0 = s.Y0;
        boolean z1 = d00.e0.B(null, a0);
        p0 p00 = p0.Z;
        k1 k10 = this.Z;
        if(!z1) {
            contentValues0.put("app_instance_id", b0.g());
        }
        else if(z) {
            contentValues0.put("app_instance_id", null);
        }
        else if(k10.I(s).i(p00)) {
            contentValues0.put("app_instance_id", b0.g());
        }
        contentValues0.put("gmp_app_id", b0.j());
        d d0 = d00.e0;
        boolean z2 = d0.B(null, a0);
        d0 d01 = b0.a;
        if(!z2 || k10.I(s).i(p0.Y)) {
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("resettable_device_id_hash", b0.e);
        }
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("last_bundle_index", ((long)b0.g));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("last_bundle_start_timestamp", ((long)b0.h));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("last_bundle_end_timestamp", ((long)b0.i));
        contentValues0.put("app_version", b0.h());
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("app_store", b0.l);
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("gmp_version", ((long)b0.m));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("dev_cert_hash", ((long)b0.n));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("measurement_enabled", Boolean.valueOf(b0.o));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("day", ((long)b0.J));
        a0 a00 = d01.h0;
        d0.h(a00);
        a00.q();
        contentValues0.put("daily_public_events_count", ((long)b0.K));
        d0.h(a00);
        a00.q();
        contentValues0.put("daily_events_count", ((long)b0.L));
        d0.h(a00);
        a00.q();
        contentValues0.put("daily_conversions_count", ((long)b0.M));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("config_fetched_time", ((long)b0.R));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("failed_config_fetch_time", ((long)b0.S));
        contentValues0.put("app_version_int", b0.y());
        contentValues0.put("firebase_instance_id", b0.i());
        d0.h(a00);
        a00.q();
        contentValues0.put("daily_error_events_count", ((long)b0.N));
        d0.h(a00);
        a00.q();
        contentValues0.put("daily_realtime_events_count", ((long)b0.O));
        d0.h(a00);
        a00.q();
        contentValues0.put("health_monitor_sample", b0.P);
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("android_id", 0L);
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("adid_reporting_enabled", Boolean.valueOf(b0.p));
        contentValues0.put("admob_app_id", b0.d());
        contentValues0.put("dynamite_version", b0.N());
        if(!d0.B(null, a0) || k10.I(s).i(p00)) {
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("session_stitching_token", b0.u);
        }
        contentValues0.put("sgtm_upload_enabled", Boolean.valueOf(b0.o()));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("target_os_version", ((long)b0.w));
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("session_stitching_token_hash", ((long)b0.x));
        if(d0.B(s, s.H0)) {
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("ad_services_version", ((int)b0.y));
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("attribution_eligibility_status", ((long)b0.C));
        }
        d0.h(d01.h0);
        d01.h0.q();
        contentValues0.put("unmatched_first_open_without_ad_id", Boolean.valueOf(b0.z));
        contentValues0.put("npa_metadata_value", b0.U());
        if(d0.B(s, s.x0)) {
            this.p();
            if(r1.u0(s)) {
                d0.h(d01.h0);
                d01.h0.q();
                contentValues0.put("bundle_delivery_index", ((long)b0.G));
            }
        }
        if(d0.B(s, s.y0)) {
            contentValues0.put("sgtm_preview_key", b0.l());
        }
        d0.h(a00);
        a00.q();
        contentValues0.put("dma_consent_state", ((int)b0.E));
        d0.h(a00);
        a00.q();
        contentValues0.put("daily_realtime_dcu_count", ((int)b0.F));
        contentValues0.put("serialized_npa_metadata", b0.k());
        d0.h(d01.h0);
        d01.h0.q();
        ArrayList arrayList0 = b0.t;
        if(arrayList0 != null) {
            if(arrayList0.isEmpty()) {
                this.b().h0.b(s, "Safelisted events should not be an empty list. appId");
            }
            else {
                contentValues0.put("safelisted_events", TextUtils.join(",", arrayList0));
            }
        }
        if(d0.B(null, s.u0) && !contentValues0.containsKey("safelisted_events")) {
            contentValues0.put("safelisted_events", null);
        }
        if(d0.B(null, s.W0)) {
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("unmatched_pfo", b0.A);
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("unmatched_uwa", b0.B);
        }
        if(d0.B(s, s.U0)) {
            d0.h(d01.h0);
            d01.h0.q();
            contentValues0.put("ad_campaign_info", b0.I);
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.y();
            if(((long)sQLiteDatabase0.update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("apps", null, contentValues0, 5) == -1L) {
                L l0 = this.b();
                M m0 = L.u(s);
                l0.e0.b(m0, "Failed to insert/update app (got -1). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l1 = this.b();
            M m1 = L.u(s);
            l1.e0.c(m1, "Error storing app. appId", sQLiteException0);
        }
    }

    public final void P(Long long0) {
        this.q();
        this.u();
        if(!((d0)this.Y).e0.B(null, s.B0)) {
            return;
        }
        if(!this.d0()) {
            return;
        }
        if(this.g0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + long0 + " AND retry_count =  2147483647 LIMIT 1", null) > 0L) {
            this.b().h0.d("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.y().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + long0 + " AND retry_count < 2147483647");
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.b(sQLiteException0, "Error incrementing retry count. error");
        }
    }

    public final void Q(String s, Bundle bundle0) {
        g g0 = this;
        r.j(bundle0);
        this.q();
        this.u();
        A0.d d0 = new A0.d(g0, s);
        List list0 = d0.a();
        while(!list0.isEmpty()) {
            for(Object object0: list0) {
                O o0 = this.r();
                Bundle bundle1 = new Bundle();
                for(Object object1: ((h)object0).d.D()) {
                    d1 d10 = (d1)object1;
                    if(d10.G()) {
                        bundle1.putDouble(d10.D(), d10.o());
                    }
                    else if(d10.H()) {
                        bundle1.putFloat(d10.D(), d10.v());
                    }
                    else if(d10.I()) {
                        bundle1.putLong(d10.D(), d10.A());
                    }
                    else if(d10.K()) {
                        bundle1.putString(d10.D(), d10.E());
                    }
                    else if(d10.F().isEmpty()) {
                        o0.b().e0.b(d10, "Unexpected parameter type for parameter");
                    }
                    else {
                        bundle1.putParcelableArray(d10.D(), O.e0(((l2)d10.F())));
                    }
                }
                String s1 = bundle1.getString("_o");
                bundle1.remove("_o");
                this.p().J(bundle1, bundle0);
                q q0 = new q(((d0)g0.Y), (s1 == null ? "" : s1), s, ((h)object0).d.C(), ((h)object0).d.A(), ((h)object0).d.z(), bundle1);
                long v = ((h)object0).a;
                this.q();
                this.u();
                String s2 = q0.a;
                r.f(s2);
                byte[] arr_b = this.r().C(q0).c();
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s2);
                contentValues0.put("name", q0.b);
                contentValues0.put("timestamp", ((long)q0.d));
                contentValues0.put("metadata_fingerprint", ((long)((h)object0).b));
                contentValues0.put("data", arr_b);
                contentValues0.put("realtime", ((int)((h)object0).c));
                try {
                    long v1 = (long)this.y().update("raw_events", contentValues0, "rowid = ?", new String[]{String.valueOf(v)});
                    if(v1 != 1L) {
                        L l0 = this.b();
                        M m0 = L.u(s2);
                        l0.e0.c(m0, "Failed to update raw event. appId, updatedRows", v1);
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    L l1 = this.b();
                    M m1 = L.u(s2);
                    l1.e0.c(m1, "Error updating raw event. appId", sQLiteException0);
                }
                g0 = this;
            }
            list0 = d0.a();
            g0 = this;
        }
    }

    public final void R(String s, com.google.android.gms.internal.measurement.g1 g10, String s1, Map map0, int v) {
        this.q();
        this.u();
        r.j(g10);
        r.f(s);
        d0 d00 = (d0)this.Y;
        if(!d00.e0.B(null, s.B0)) {
            return;
        }
        this.q();
        this.u();
        boolean z = this.d0();
        S5.b b0 = d00.l0;
        if(z) {
            k1 k10 = this.Z;
            long v1 = k10.g0.e0.a();
            b0.getClass();
            long v2 = SystemClock.elapsedRealtime();
            if(Math.abs(v2 - v1) > ((long)(((Long)s.A.a(null))))) {
                k10.g0.e0.b(v2);
                this.q();
                this.u();
                if(this.d0()) {
                    int v3 = this.y().delete("upload_queue", this.e0(), new String[0]);
                    if(v3 > 0) {
                        this.b().m0.b(v3, "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                    }
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            arrayList0.add(((String)((Map.Entry)object0).getKey()) + "=" + ((String)((Map.Entry)object0).getValue()));
        }
        byte[] arr_b = g10.c();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("measurement_batch", arr_b);
        contentValues0.put("upload_uri", s1);
        StringBuilder stringBuilder0 = new StringBuilder();
        int v4 = arrayList0.size();
        if(v4 > 0) {
            stringBuilder0.append(((CharSequence)arrayList0.get(0)));
            int v5 = 1;
            while(v5 < v4) {
                stringBuilder0.append("\r\n");
                Object object1 = arrayList0.get(v5);
                ++v5;
                stringBuilder0.append(((CharSequence)object1));
            }
        }
        contentValues0.put("upload_headers", stringBuilder0.toString());
        contentValues0.put("upload_type", v.h.d(v));
        b0.getClass();
        contentValues0.put("creation_timestamp", System.currentTimeMillis());
        contentValues0.put("retry_count", 0);
        try {
            if(this.y().insert("upload_queue", null, contentValues0) == -1L) {
                this.b().e0.b(s, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.c(s, "Error storing MeasurementBatch to upload_queue. appId", sQLiteException0);
        }
    }

    public final void S(String s, zzno zzno0) {
        this.q();
        this.u();
        r.f(s);
        ((d0)this.Y).l0.getClass();
        long v = System.currentTimeMillis();
        long v1 = (long)(((Long)s.i0.a(null)));
        long v2 = zzno0.Y;
        if(v2 < v - v1 || v2 > ((long)(((Long)s.i0.a(null)))) + v) {
            L l0 = this.b();
            M m0 = L.u(s);
            l0.h0.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", m0, v, v2);
        }
        this.b().m0.d("Saving trigger URI");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("trigger_uri", zzno0.X);
        contentValues0.put("source", ((int)zzno0.Z));
        contentValues0.put("timestamp_millis", v2);
        try {
            if(this.y().insert("trigger_uris", null, contentValues0) == -1L) {
                L l1 = this.b();
                M m1 = L.u(s);
                l1.e0.b(m1, "Failed to insert trigger URI (got -1). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l2 = this.b();
            M m2 = L.u(s);
            l2.e0.c(m2, "Error storing trigger URI. appId", sQLiteException0);
        }
    }

    public final void T(String s, p p0) {
        r.j(p0);
        this.q();
        this.u();
        ContentValues contentValues0 = new ContentValues();
        String s1 = p0.a;
        contentValues0.put("app_id", s1);
        contentValues0.put("name", p0.b);
        contentValues0.put("lifetime_count", ((long)p0.c));
        contentValues0.put("current_bundle_count", ((long)p0.d));
        contentValues0.put("last_fire_timestamp", ((long)p0.f));
        contentValues0.put("last_bundled_timestamp", ((long)p0.g));
        contentValues0.put("last_bundled_day", p0.h);
        contentValues0.put("last_sampled_complex_event_id", p0.i);
        contentValues0.put("last_sampling_rate", p0.j);
        contentValues0.put("current_session_count", ((long)p0.e));
        contentValues0.put("last_exempt_from_sampling", (p0.k == null || !p0.k.booleanValue() ? null : 1L));
        try {
            if(this.y().insertWithOnConflict(s, null, contentValues0, 5) == -1L) {
                L l0 = this.b();
                M m0 = L.u(s1);
                l0.e0.b(m0, "Failed to insert/update event aggregates (got -1). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l1 = this.b();
            M m1 = L.u(s1);
            l1.e0.c(m1, "Error storing event aggregates. appId", sQLiteException0);
        }
    }

    public final void U(String s, q0 q00) {
        r.j(s);
        this.q();
        this.u();
        this.j0(s, this.t0(s));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("storage_consent_at_bundling", q00.m());
        this.L(contentValues0);
    }

    public final void V(String s, Long long0, long v, a1 a10) {
        this.q();
        this.u();
        r.j(a10);
        r.f(s);
        byte[] arr_b = a10.c();
        L l0 = this.b();
        String s1 = ((d0)this.Y).k0.c(s);
        l0.m0.c(s1, "Saving complex main event, appId, data size", ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("event_id", long0);
        contentValues0.put("children_to_process", v);
        contentValues0.put("main_event", arr_b);
        try {
            if(this.y().insertWithOnConflict("main_event_params", null, contentValues0, 5) == -1L) {
                L l1 = this.b();
                M m0 = L.u(s);
                l1.e0.b(m0, "Failed to insert complex main event (got -1). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l2 = this.b();
            M m1 = L.u(s);
            l2.e0.c(m1, "Error storing complex main event. appId", sQLiteException0);
        }
    }

    public final void W(String s, String s1) {
        r.f(s);
        r.f(s1);
        this.q();
        this.u();
        try {
            this.y().delete("conditional_properties", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            L l0 = this.b();
            M m0 = L.u(s);
            String s2 = ((d0)this.Y).k0.g(s1);
            l0.e0.e("Error deleting conditional property", m0, s2, sQLiteException0);
        }
    }

    public final void X(List list0) {
        this.q();
        this.u();
        r.j(list0);
        if(((ArrayList)list0).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if(!this.d0()) {
            return;
        }
        String s = J.e("(", TextUtils.join(",", list0), ")");
        if(this.g0("SELECT COUNT(1) FROM queue WHERE rowid IN " + s + " AND retry_count =  2147483647 LIMIT 1", null) > 0L) {
            this.b().h0.d("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.y().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + s + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.b(sQLiteException0, "Error incrementing retry count. error");
        }
    }

    public final boolean Y(zzae zzae0) {
        this.q();
        this.u();
        String s = zzae0.X;
        r.j(s);
        if(this.q0(s, zzae0.Z.Y) == null && this.g0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{s}) >= 1000L) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", zzae0.Y);
        contentValues0.put("name", zzae0.Z.Y);
        Object object0 = zzae0.Z.zza();
        r.j(object0);
        g.M(contentValues0, object0);
        contentValues0.put("active", Boolean.valueOf(zzae0.c0));
        contentValues0.put("trigger_event_name", zzae0.d0);
        contentValues0.put("trigger_timeout", ((long)zzae0.f0));
        this.p();
        contentValues0.put("timed_out_event", r1.g0(zzae0.e0));
        contentValues0.put("creation_timestamp", ((long)zzae0.b0));
        this.p();
        contentValues0.put("triggered_event", r1.g0(zzae0.g0));
        contentValues0.put("triggered_timestamp", ((long)zzae0.Z.Z));
        contentValues0.put("time_to_live", ((long)zzae0.h0));
        this.p();
        contentValues0.put("expired_event", r1.g0(zzae0.i0));
        try {
            if(this.y().insertWithOnConflict("conditional_properties", null, contentValues0, 5) == -1L) {
                L l0 = this.b();
                M m0 = L.u(s);
                l0.e0.b(m0, "Failed to insert/update conditional user property (got -1)");
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l1 = this.b();
            M m1 = L.u(s);
            l1.e0.c(m1, "Error storing conditional user property", sQLiteException0);
        }
        return true;
    }

    public final boolean Z(q q0, long v, boolean z) {
        this.q();
        this.u();
        String s = q0.a;
        r.f(s);
        byte[] arr_b = this.r().C(q0).c();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("name", q0.b);
        contentValues0.put("timestamp", ((long)q0.d));
        contentValues0.put("metadata_fingerprint", v);
        contentValues0.put("data", arr_b);
        contentValues0.put("realtime", ((int)z));
        try {
            if(this.y().insert("raw_events", null, contentValues0) == -1L) {
                L l0 = this.b();
                M m0 = L.u(s);
                l0.e0.b(m0, "Failed to insert raw event (got -1). appId");
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            L l1 = this.b();
            M m1 = L.u(s);
            l1.e0.c(m1, "Error storing raw event. appId", sQLiteException0);
            return false;
        }
    }

    public final boolean a0(j6.p1 p10) {
        this.q();
        this.u();
        String s = p10.a;
        String s1 = p10.c;
        j6.p1 p11 = this.q0(s, s1);
        String s2 = p10.b;
        if(p11 == null) {
            if(r1.x0(s1)) {
                if(this.g0("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}) >= ((long)Math.max(Math.min(((d0)this.Y).e0.v(s, s.J), 100), 25))) {
                    return false;
                }
            }
            else if(!"_npa".equals(s1) && this.g0("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{s, s2}) >= 25L) {
                return false;
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", s2);
        contentValues0.put("name", s1);
        contentValues0.put("set_timestamp", ((long)p10.d));
        g.M(contentValues0, p10.e);
        try {
            if(this.y().insertWithOnConflict("user_attributes", null, contentValues0, 5) == -1L) {
                L l0 = this.b();
                M m0 = L.u(s);
                l0.e0.b(m0, "Failed to insert/update user property (got -1). appId");
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l1 = this.b();
            M m1 = L.u(s);
            l1.e0.c(m1, "Error storing user property. appId", sQLiteException0);
        }
        return true;
    }

    public final boolean b0(String s, int v, r0 r00) {
        this.u();
        this.q();
        r.f(s);
        r.j(r00);
        Integer integer0 = null;
        if(r00.v().isEmpty()) {
            L l0 = this.b();
            M m0 = L.u(s);
            Integer integer1 = v;
            if(r00.B()) {
                integer0 = r00.s();
            }
            l0.h0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", m0, integer1, String.valueOf(integer0));
            return false;
        }
        byte[] arr_b = r00.c();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("audience_id", v);
        contentValues0.put("filter_id", (r00.B() ? r00.s() : null));
        contentValues0.put("event_name", r00.v());
        contentValues0.put("session_scoped", (r00.C() ? Boolean.valueOf(r00.z()) : null));
        contentValues0.put("data", arr_b);
        try {
            if(this.y().insertWithOnConflict("event_filters", null, contentValues0, 5) == -1L) {
                L l1 = this.b();
                M m1 = L.u(s);
                l1.e0.b(m1, "Failed to insert event filter (got -1). appId");
                return true;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            L l2 = this.b();
            M m2 = L.u(s);
            l2.e0.c(m2, "Error storing event filter. appId", sQLiteException0);
            return false;
        }
    }

    public final boolean c0(String s, int v, x0 x00) {
        this.u();
        this.q();
        r.f(s);
        r.j(x00);
        Integer integer0 = null;
        if(x00.s().isEmpty()) {
            L l0 = this.b();
            M m0 = L.u(s);
            Integer integer1 = v;
            if(x00.w()) {
                integer0 = x00.o();
            }
            l0.h0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", m0, integer1, String.valueOf(integer0));
            return false;
        }
        byte[] arr_b = x00.c();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("audience_id", v);
        contentValues0.put("filter_id", (x00.w() ? x00.o() : null));
        contentValues0.put("property_name", x00.s());
        contentValues0.put("session_scoped", (x00.x() ? Boolean.valueOf(x00.v()) : null));
        contentValues0.put("data", arr_b);
        try {
            if(this.y().insertWithOnConflict("property_filters", null, contentValues0, 5) == -1L) {
                L l1 = this.b();
                M m1 = L.u(s);
                l1.e0.b(m1, "Failed to insert property filter (got -1). appId");
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            L l2 = this.b();
            M m2 = L.u(s);
            l2.e0.c(m2, "Error storing property filter. appId", sQLiteException0);
            return false;
        }
    }

    public final boolean d0() {
        return ((d0)this.Y).X.getDatabasePath("google_app_measurement.db").exists();
    }

    public final String e0() {
        ((d0)this.Y).l0.getClass();
        long v = System.currentTimeMillis();
        long v1 = (long)(((Long)s.G.a(null)));
        StringBuilder stringBuilder0 = new StringBuilder("(upload_type = 1 AND (ABS(creation_timestamp - ");
        stringBuilder0.append(v);
        stringBuilder0.append(") > CAST(");
        String s = o.w(v1, " AS INTEGER)))", stringBuilder0);
        long v2 = (long)(((Long)s.F.a(null)));
        StringBuilder stringBuilder1 = new StringBuilder("(upload_type != 1 AND (ABS(creation_timestamp - ");
        stringBuilder1.append(v);
        stringBuilder1.append(") > CAST(");
        String s1 = o.w(v2, " AS INTEGER)))", stringBuilder1);
        return "(" + s + " OR " + s1 + ")";
    }

    public final long f0(String s) {
        long v2;
        r.f(s);
        r.f("first_open_count");
        this.q();
        this.u();
        SQLiteDatabase sQLiteDatabase0 = this.y();
        sQLiteDatabase0.beginTransaction();
        long v = 0L;
        try {
            v2 = this.C("select first_open_count from app2 where app_id=?", new String[]{s}, -1L);
            if(Long.compare(v2, -1L) == 0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s);
                contentValues0.put("first_open_count", 0);
                contentValues0.put("previous_install_count", 0);
                if(sQLiteDatabase0.insertWithOnConflict("app2", null, contentValues0, 5) == -1L) {
                    L l0 = this.b();
                    M m0 = L.u(s);
                    l0.e0.c(m0, "Failed to insert column (got -1). appId", "first_open_count");
                    return -1L;
                }
                goto label_22;
            }
            goto label_26;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_41;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return -1L;
        try {
        label_22:
            v2 = 0L;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_41;
        }
        try {
        label_26:
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("app_id", s);
            contentValues1.put("first_open_count", ((long)(1L + v2)));
            if(((long)sQLiteDatabase0.update("app2", contentValues1, "app_id = ?", new String[]{s})) == 0L) {
                L l1 = this.b();
                M m1 = L.u(s);
                l1.e0.c(m1, "Failed to update column (got 0). appId", "first_open_count");
                return -1L;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return v2;
        }
        catch(SQLiteException sQLiteException1) {
            sQLiteException0 = sQLiteException1;
            v = v2;
        }
    label_41:
        L l2 = this.b();
        M m2 = L.u(s);
        l2.e0.e("Error inserting column. appId", m2, "first_open_count", sQLiteException0);
        return v;
    }

    public final long g0(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.y();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.b().e0.c(s, "Database error", sQLiteException0);
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

    public final List h0(String s, String s1, String s2) {
        List list1;
        String s5;
        Object object0;
        long v;
        String s4;
        StringBuilder stringBuilder0;
        ArrayList arrayList0;
        r.f(s);
        this.q();
        this.u();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            arrayList0 = new ArrayList(3);
            arrayList0.add(s);
            stringBuilder0 = new StringBuilder("app_id=?");
            if(TextUtils.isEmpty(s1)) {
                goto label_17;
            }
            else {
                goto label_13;
            }
            goto label_18;
        }
        catch(SQLiteException sQLiteException0) {
            String s3 = s1;
            goto label_47;
            try {
                try {
                label_13:
                    s3 = s1;
                    arrayList0.add(s3);
                    stringBuilder0.append(" and origin=?");
                    goto label_18;
                label_17:
                    s3 = s1;
                label_18:
                    if(!TextUtils.isEmpty(s2)) {
                        arrayList0.add(s2 + "*");
                        stringBuilder0.append(" and name glob ?");
                    }
                    cursor0 = this.y().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])), null, null, "rowid", "1001");
                    if(cursor0.moveToFirst()) {
                        while(true) {
                        label_23:
                            if(((ArrayList)list0).size() >= 1000) {
                                this.b().e0.b(1000, "Read more than the max allowed user properties, ignoring excess");
                            }
                            else {
                                s4 = cursor0.getString(0);
                                v = cursor0.getLong(1);
                                object0 = this.F(cursor0, 2);
                                s5 = cursor0.getString(3);
                                if(object0 == null) {
                                    goto label_31;
                                }
                                else {
                                    goto label_35;
                                }
                                goto label_36;
                            }
                            goto label_41;
                        }
                    }
                    goto label_57;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_47;
                }
                try {
                label_31:
                    L l0 = this.b();
                    M m0 = L.u(s);
                    l0.e0.e("(2)Read invalid user property value, ignoring it", m0, s5, s2);
                    goto label_36;
                label_35:
                    ((ArrayList)list0).add(new j6.p1(s, s5, s4, v, object0));
                label_36:
                    if(cursor0.moveToNext()) {
                        goto label_43;
                    }
                    goto label_41;
                }
                catch(SQLiteException sQLiteException0) {
                }
            }
            catch(Throwable throwable0) {
                goto label_55;
            }
            try {
            label_39:
                s3 = s5;
                goto label_47;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_39;
            }
            catch(Throwable throwable0) {
                goto label_55;
            }
        label_41:
            cursor0.close();
            return list0;
            try {
                try {
                label_43:
                    s3 = s5;
                    goto label_23;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_47:
                L l1 = this.b();
                M m1 = L.u(s);
                l1.e0.e("(2)Error querying user properties", m1, s3, sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_52;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_55;
            }
        label_52:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_55:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_57:
        cursor0.close();
        return list0;
    }

    public final void i0(String s, Bundle bundle0) {
        this.q();
        this.u();
        q q0 = new q(((d0)this.Y), "", s, "dep", 0L, 0L, bundle0);
        byte[] arr_b = this.r().C(q0).c();
        L l0 = this.b();
        String s1 = ((d0)this.Y).k0.c(s);
        l0.m0.c(s1, "Saving default event parameters, appId, data size", ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("parameters", arr_b);
        try {
            if(this.y().insertWithOnConflict("default_event_params", null, contentValues0, 5) == -1L) {
                L l1 = this.b();
                M m0 = L.u(s);
                l1.e0.b(m0, "Failed to insert default event parameters (got -1). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l2 = this.b();
            M m1 = L.u(s);
            l2.e0.c(m1, "Error storing default event parameters. appId", sQLiteException0);
        }
    }

    public final void j0(String s, q0 q00) {
        r.j(s);
        r.j(q00);
        this.q();
        this.u();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("consent_state", q00.m());
        contentValues0.put("consent_source", ((int)q00.b));
        this.L(contentValues0);
    }

    public final void k0(String s, ArrayList arrayList0) {
        r.f(s);
        this.u();
        this.q();
        SQLiteDatabase sQLiteDatabase0 = this.y();
        try {
            long v = this.g0("select count(1) from audience_filter_values where app_id=?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            L l0 = this.b();
            M m0 = L.u(s);
            l0.e0.c(m0, "Database error querying filters. appId", sQLiteException0);
            return;
        }
        int v2 = Math.max(0, Math.min(2000, ((d0)this.Y).e0.v(s, s.I)));
        if(v <= ((long)v2)) {
            return;
        }
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            Integer integer0 = (Integer)arrayList0.get(v1);
            if(integer0 == null) {
                return;
            }
            arrayList1.add(Integer.toString(((int)integer0)));
        }
        sQLiteDatabase0.delete("audience_filter_values", J.e("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", J.e("(", TextUtils.join(",", arrayList1), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{s, Integer.toString(v2)});
    }

    public final long l0(String s) {
        r.f(s);
        this.q();
        this.u();
        return this.C("select first_open_count from app2 where app_id=?", new String[]{s}, -1L);
    }

    public final long m0(String s) {
        r.f(s);
        return this.C("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}, 0L);
    }

    public final zzae n0(String s, String s1) {
        zzae zzae0;
        Cursor cursor0;
        d0 d00 = (d0)this.Y;
        r.f(s);
        r.f(s1);
        this.q();
        this.u();
        try {
            cursor0 = null;
            cursor0 = this.y().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_11;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_33;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_11:
                if(cursor0.moveToFirst()) {
                    String s2 = cursor0.getString(0);
                    if(s2 == null) {
                        s2 = "";
                    }
                    Object object0 = this.F(cursor0, 1);
                    boolean z = cursor0.getInt(2) != 0;
                    String s3 = cursor0.getString(3);
                    long v = cursor0.getLong(4);
                    Parcelable parcelable0 = this.r().B(cursor0.getBlob(5), zzbf.CREATOR);
                    long v1 = cursor0.getLong(6);
                    Parcelable parcelable1 = this.r().B(cursor0.getBlob(7), zzbf.CREATOR);
                    long v2 = cursor0.getLong(8);
                    long v3 = cursor0.getLong(9);
                    Parcelable parcelable2 = this.r().B(cursor0.getBlob(10), zzbf.CREATOR);
                    zzae0 = new zzae(s, s2, new zzon(v2, object0, s1, s2), v1, z, s3, ((zzbf)parcelable0), v, ((zzbf)parcelable1), v3, ((zzbf)parcelable2));
                    if(cursor0.moveToNext()) {
                        L l0 = this.b();
                        M m0 = L.u(s);
                        String s4 = d00.k0.g(s1);
                        l0.e0.c(m0, "Got multiple records for conditional property, expected one", s4);
                    }
                    goto label_43;
                }
                goto label_45;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_33:
            L l1 = this.b();
            M m1 = L.u(s);
            String s5 = d00.k0.g(s1);
            l1.e0.e("Error querying conditional property", m1, s5, sQLiteException0);
            if(cursor0 != null) {
                goto label_38;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_41;
        }
    label_38:
        cursor0.close();
        return null;
    label_41:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_43:
        cursor0.close();
        return zzae0;
    label_45:
        cursor0.close();
        return null;
    }

    public final p o0(String s, String s1, String s2) {
        p p0;
        Boolean boolean0;
        Cursor cursor0;
        boolean z;
        r.f(s1);
        r.f(s2);
        this.q();
        this.u();
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        try {
            z = false;
            cursor0 = null;
            cursor0 = this.y().query(s, ((String[])arrayList0.toArray(new String[0])), "app_id=? and name=?", new String[]{s1, s2}, null, null, null);
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_33;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_12:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(1);
                    long v2 = cursor0.getLong(2);
                    long v3 = cursor0.isNull(3) ? 0L : cursor0.getLong(3);
                    Long long0 = cursor0.isNull(4) ? null : cursor0.getLong(4);
                    Long long1 = cursor0.isNull(5) ? null : cursor0.getLong(5);
                    Long long2 = cursor0.isNull(6) ? null : cursor0.getLong(6);
                    if(cursor0.isNull(7)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getLong(7) == 1L) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    p0 = new p(s1, s2, v, v1, (cursor0.isNull(8) ? 0L : cursor0.getLong(8)), v2, v3, long0, long1, long2, boolean0);
                    if(cursor0.moveToNext()) {
                        L l0 = this.b();
                        M m0 = L.u(s1);
                        l0.e0.b(m0, "Got multiple records for event aggregates, expected one. appId");
                    }
                    goto label_40;
                }
                goto label_42;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_33:
            this.b().e0.e("Error querying events. appId", L.u(s1), ((d0)this.Y).k0.c(s2), sQLiteException0);
            if(cursor0 != null) {
                goto label_35;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_38;
        }
    label_35:
        cursor0.close();
        return null;
    label_38:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_40:
        cursor0.close();
        return p0;
    label_42:
        cursor0.close();
        return null;
    }

    public final B p0(String s) {
        String s3;
        boolean z1;
        d0 d01;
        B b0;
        Throwable throwable1;
        SQLiteException sQLiteException1;
        Cursor cursor1;
        d0 d00 = (d0)this.Y;
        k1 k10 = this.Z;
        r.f(s);
        this.q();
        this.u();
        Cursor cursor0 = null;
        try {
            cursor1 = this.y().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{s}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor1 = null;
            goto label_151;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_157;
        }
        try {
            if(cursor1.moveToFirst()) {
                b0 = new B(k10.j0, s);
                d01 = b0.a;
                A a0 = s.Y0;
                boolean z = d00.e0.B(null, a0);
                p0 p00 = p0.Z;
                if(!z || k10.I(s).i(p00)) {
                    b0.r(cursor1.getString(0));
                }
                z1 = true;
                b0.C(cursor1.getString(1));
                if(!d00.e0.B(null, a0) || k10.I(s).i(p0.Y)) {
                    b0.G(cursor1.getString(2));
                }
                b0.Q(cursor1.getLong(3));
                b0.R(cursor1.getLong(4));
                b0.P(cursor1.getLong(5));
                b0.x(cursor1.getString(6));
                b0.v(cursor1.getString(7));
                b0.M(cursor1.getLong(8));
                b0.J(cursor1.getLong(9));
                b0.s(cursor1.isNull(10) || cursor1.getInt(10) != 0);
                b0.I(cursor1.getLong(11));
                b0.F(cursor1.getLong(12));
                b0.D(cursor1.getLong(13));
                b0.z(cursor1.getLong(14));
                b0.w(cursor1.getLong(15));
                b0.L(cursor1.getLong(16));
                b0.q((cursor1.isNull(17) ? 0xFFFFFFFF80000000L : ((long)cursor1.getInt(17))));
                b0.A(cursor1.getString(18));
                b0.B(cursor1.getLong(19));
                b0.H(cursor1.getLong(20));
                b0.E(cursor1.getString(21));
                boolean z2 = cursor1.isNull(23) || cursor1.getInt(23) != 0;
                d0.h(d01.h0);
                d01.h0.q();
                b0.Q |= b0.p != z2;
                b0.p = z2;
                b0.b(cursor1.getString(24));
                b0.K((cursor1.isNull(25) ? 0L : cursor1.getLong(25)));
                if(!cursor1.isNull(26)) {
                    b0.c(Arrays.asList(cursor1.getString(26).split(",", -1)));
                }
                if(!d00.e0.B(null, a0) || k10.I(s).i(p00)) {
                    String s1 = cursor1.getString(28);
                    d0.h(d01.h0);
                    d01.h0.q();
                    b0.Q |= !Objects.equals(b0.u, s1);
                    b0.u = s1;
                }
                if(d00.e0.B(null, s.x0)) {
                    this.p();
                    if(r1.u0(s)) {
                        boolean z3 = cursor1.isNull(29) || cursor1.getInt(29) == 0 ? false : true;
                        d0.h(d01.h0);
                        d01.h0.q();
                        b0.Q |= b0.v != z3;
                        b0.v = z3;
                        b0.O(cursor1.getLong(39));
                        if(d00.e0.B(null, s.y0)) {
                            String s2 = cursor1.getString(36);
                            d0.h(d01.h0);
                            d01.h0.q();
                            b0.Q |= b0.D != s2;
                            b0.D = s2;
                        }
                    }
                }
                b0.T(cursor1.getLong(30));
                b0.S(cursor1.getLong(0x1F));
                if(d00.e0.B(s, s.H0)) {
                    int v = cursor1.getInt(0x20);
                    d0.h(d01.h0);
                    d01.h0.q();
                    b0.Q |= b0.y != v;
                    b0.y = v;
                    b0.u(cursor1.getLong(35));
                }
                if(cursor1.isNull(33) || cursor1.getInt(33) == 0) {
                    goto label_94;
                }
                else {
                    goto label_92;
                }
                goto label_95;
            }
            goto label_162;
        }
        catch(SQLiteException sQLiteException2) {
            sQLiteException1 = sQLiteException2;
            goto label_151;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            cursor0 = cursor1;
            goto label_157;
        }
    label_92:
        boolean z4 = true;
        goto label_95;
    label_94:
        z4 = false;
        try {
            try {
            label_95:
                d0.h(d01.h0);
                d01.h0.q();
                b0.Q |= b0.z != z4;
                b0.z = z4;
                Boolean boolean0 = cursor1.isNull(34) ? null : Boolean.valueOf(cursor1.getInt(34) != 0);
                d0.h(d01.h0);
                d01.h0.q();
                b0.Q |= !Objects.equals(b0.r, boolean0);
                b0.r = boolean0;
                b0.t(cursor1.getInt(37));
                b0.p(cursor1.getInt(38));
                if(cursor1.isNull(40)) {
                    s3 = "";
                }
                else {
                    s3 = cursor1.getString(40);
                    r.j(s3);
                }
                d0.h(d01.h0);
                d01.h0.q();
                b0.Q |= b0.H != s3;
                b0.H = s3;
                if(d00.e0.B(null, s.W0)) {
                    if(!cursor1.isNull(41)) {
                        Long long0 = cursor1.getLong(41);
                        d0.h(d01.h0);
                        d01.h0.q();
                        b0.Q |= !Objects.equals(b0.A, long0);
                        b0.A = long0;
                    }
                    if(!cursor1.isNull(42)) {
                        Long long1 = cursor1.getLong(42);
                        d0.h(d01.h0);
                        d01.h0.q();
                        b0.Q |= !Objects.equals(b0.B, long1);
                        b0.B = long1;
                    }
                }
                if(d00.e0.B(s, s.U0)) {
                    byte[] arr_b = cursor1.getBlob(43);
                    d0.h(d01.h0);
                    d01.h0.q();
                    boolean z5 = b0.Q;
                    if(b0.I == arr_b) {
                        z1 = false;
                    }
                    b0.Q = z5 | z1;
                    b0.I = arr_b;
                }
                d0.h(d01.h0);
                d01.h0.q();
                b0.Q = false;
                if(cursor1.moveToNext()) {
                    L l0 = this.b();
                    M m0 = L.u(s);
                    l0.e0.b(m0, "Got multiple records for app, expected one. appId");
                }
                goto label_160;
            }
            catch(SQLiteException sQLiteException2) {
                sQLiteException1 = sQLiteException2;
            }
        label_151:
            L l1 = this.b();
            M m1 = L.u(s);
            l1.e0.c(m1, "Error querying app. appId", sQLiteException1);
            if(cursor1 != null) {
                goto label_155;
            }
            return null;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            cursor0 = cursor1;
            goto label_157;
        }
    label_155:
        cursor1.close();
        return null;
    label_157:
        if(cursor0 != null) {
            cursor0.close();
        }
        throw throwable1;
    label_160:
        cursor1.close();
        return b0;
    label_162:
        cursor1.close();
        return null;
    }

    public final j6.p1 q0(String s, String s1) {
        j6.p1 p10;
        Cursor cursor0;
        r.f(s);
        r.f(s1);
        this.q();
        this.u();
        try {
            cursor0 = null;
            cursor0 = this.y().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    Object object0 = this.F(cursor0, 1);
                    if(object0 != null) {
                        p10 = new j6.p1(s, cursor0.getString(2), s1, v, object0);
                        if(cursor0.moveToNext()) {
                            L l0 = this.b();
                            M m0 = L.u(s);
                            l0.e0.b(m0, "Got multiple records for user property, expected one. appId");
                        }
                        goto label_31;
                    }
                    goto label_33;
                }
                goto label_35;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_21:
            L l1 = this.b();
            M m1 = L.u(s);
            String s2 = ((d0)this.Y).k0.g(s1);
            l1.e0.e("Error querying user property. appId", m1, s2, sQLiteException0);
            if(cursor0 != null) {
                goto label_26;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
    label_26:
        cursor0.close();
        return null;
    label_29:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_31:
        cursor0.close();
        return p10;
    label_33:
        cursor0.close();
        return null;
    label_35:
        cursor0.close();
        return null;
    }

    public final q0 r0(String s) {
        r.j(s);
        this.q();
        this.u();
        return q0.c(100, this.H("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{s}));
    }

    public final void s0(String s, String s1) {
        r.f(s);
        r.f(s1);
        this.q();
        this.u();
        try {
            this.y().delete("user_attributes", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            L l0 = this.b();
            M m0 = L.u(s);
            String s2 = ((d0)this.Y).k0.g(s1);
            l0.e0.e("Error deleting user property. appId", m0, s2, sQLiteException0);
        }
    }

    public final q0 t0(String s) {
        Cursor cursor0;
        r.j(s);
        this.q();
        this.u();
        q0 q00 = null;
        try {
            cursor0 = null;
            cursor0 = this.y().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{s});
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        goto label_23;
        try {
        label_9:
            if(!cursor0.moveToFirst()) {
                this.b().m0.d("No data found");
                goto label_11;
            }
            goto label_13;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_17;
        }
        catch(Throwable throwable0) {
            goto label_22;
        }
    label_11:
        cursor0.close();
        return q0.c;
        try {
            try {
            label_13:
                String s1 = cursor0.getString(0);
                q00 = q0.c(cursor0.getInt(1), s1);
                goto label_26;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_17:
            this.b().e0.b(sQLiteException0, "Error querying database.");
            if(cursor0 != null) {
                goto label_19;
            }
            return q00 == null ? q0.c : q00;
        }
        catch(Throwable throwable0) {
            goto label_22;
        }
    label_19:
        cursor0.close();
        return q0.c;
    label_22:
        q00 = cursor0;
    label_23:
        if(q00 != null) {
            ((Cursor)q00).close();
        }
        throw throwable0;
    label_26:
        cursor0.close();
        return q00 == null ? q0.c : q00;
    }

    public final void u0(String s, String s1) {
        r.f(s1);
        this.q();
        this.u();
        try {
            this.y().delete(s, "app_id=?", new String[]{s1});
        }
        catch(SQLiteException sQLiteException0) {
            L l0 = this.b();
            M m0 = L.u(s1);
            l0.e0.c(m0, "Error deleting snapshot. appId", sQLiteException0);
        }
    }

    public final c v0(String s) {
        c c0;
        String s2;
        Cursor cursor0;
        r.f(s);
        this.q();
        this.u();
        if(!((d0)this.Y).e0.B(null, s.B0)) {
            return null;
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.y();
            String s1 = this.e0();
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + s1, new String[]{s}, null, null, "creation_timestamp ASC", "1");
            goto label_13;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_66;
        }
        catch(Throwable throwable0) {
        }
        Cursor cursor1 = null;
        goto label_72;
        try {
        label_13:
            if(cursor0.moveToFirst()) {
                s2 = cursor0.getString(3);
                if(TextUtils.isEmpty(s2)) {
                    this.b().l0.d("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    goto label_17;
                }
                goto label_19;
            }
            goto label_77;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_66;
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
    label_17:
        cursor0.close();
        return null;
        try {
            try {
            label_19:
                f1 f10 = (f1)O.E(com.google.android.gms.internal.measurement.g1.w(), cursor0.getBlob(2));
                int[] arr_v = v.h.e(3);
                int v = arr_v[cursor0.getInt(5)];
                if((v == 1 || v == 3) && cursor0.getInt(6) > 0) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: Collections.unmodifiableList(((com.google.android.gms.internal.measurement.g1)f10.Y).z())) {
                        h1 h10 = (h1)((i1)object0).l();
                        int v1 = cursor0.getInt(6);
                        h10.f();
                        i1.p1(((i1)h10.Y), v1);
                        arrayList0.add(((i1)h10.d()));
                    }
                    f10.f();
                    com.google.android.gms.internal.measurement.g1.u(((com.google.android.gms.internal.measurement.g1)f10.Y));
                    f10.f();
                    com.google.android.gms.internal.measurement.g1.t(((com.google.android.gms.internal.measurement.g1)f10.Y), arrayList0);
                }
                HashMap hashMap0 = new HashMap();
                String s3 = cursor0.getString(4);
                if(s3 != null) {
                    String[] arr_s = s3.split("\r\n");
                    int v2 = 0;
                    while(v2 < arr_s.length) {
                        String s4 = arr_s[v2];
                        if(s4.isEmpty()) {
                            break;
                        }
                        String[] arr_s1 = s4.split("=", 2);
                        if(arr_s1.length == 2) {
                            hashMap0.put(arr_s1[0], arr_s1[1]);
                            ++v2;
                        }
                        else {
                            this.b().e0.b(s4, "Invalid upload header: ");
                            if(true) {
                                break;
                            }
                        }
                    }
                }
                long v3 = cursor0.getLong(0);
                com.google.android.gms.internal.measurement.g1 g10 = (com.google.android.gms.internal.measurement.g1)f10.d();
                c0 = new c();  // initializer: Ljava/lang/Object;-><init>()V
                c0.a = v3;
                c0.c = g10;
                c0.d = s2;
                c0.e = hashMap0;
                c0.b = v;
                goto label_75;
            }
            catch(IOException iOException0) {
            }
            this.b().e0.c(s, "Failed to queued MeasurementBatch from upload_queue. appId", iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_66;
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
        cursor0.close();
        return null;
        try {
        label_66:
            this.b().e0.c(s, "Error to querying MeasurementBatch from upload_queue. appId", sQLiteException0);
            if(cursor0 != null) {
                goto label_68;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
    label_68:
        cursor0.close();
        return null;
    label_71:
        cursor1 = cursor0;
    label_72:
        if(cursor1 != null) {
            cursor1.close();
        }
        throw throwable0;
    label_75:
        cursor0.close();
        return c0;
    label_77:
        cursor0.close();
        return null;
    }

    @Override  // j6.g1
    public final boolean w() {
        return false;
    }

    public final List w0(String s) {
        List list1;
        r.f(s);
        this.q();
        this.u();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.y().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{s}, null, null, "rowid", "1000");
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    if(s2 == null) {
                        s2 = "";
                    }
                    long v = cursor0.getLong(2);
                    Object object0 = this.F(cursor0, 3);
                    if(object0 == null) {
                        L l0 = this.b();
                        M m0 = L.u(s);
                        l0.e0.b(m0, "Read invalid user property value, ignoring it. appId");
                    }
                    else {
                        ((ArrayList)list0).add(new j6.p1(s, s2, s1, v, object0));
                    }
                }
                while(cursor0.moveToNext());
                goto label_32;
            }
            goto label_34;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                L l1 = this.b();
                M m1 = L.u(s);
                l1.e0.c(m1, "Error querying user properties. appId", sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_27;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_30;
            }
        label_27:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_30:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_32:
        cursor0.close();
        return list0;
    label_34:
        cursor0.close();
        return list0;
    }

    public final long x() {
        long v;
        Cursor cursor0;
        try {
            try {
                cursor0 = null;
                cursor0 = this.y().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if(cursor0.moveToFirst()) {
                    v = cursor0.getLong(0);
                    goto label_13;
                }
                goto label_15;
            }
            catch(SQLiteException sQLiteException0) {
            }
            this.b().e0.b(sQLiteException0, "Error querying raw events");
            if(cursor0 != null) {
                goto label_8;
            }
            return -1L;
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
    label_8:
        cursor0.close();
        return -1L;
    label_11:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_13:
        cursor0.close();
        return v;
    label_15:
        cursor0.close();
        return -1L;
    }

    public final void x0() {
        this.u();
        this.y().beginTransaction();
    }

    public final SQLiteDatabase y() {
        this.q();
        try {
            return this.c0.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.b().h0.b(sQLiteException0, "Error opening database");
            throw sQLiteException0;
        }
    }

    public final void y0(String s) {
        this.q();
        this.u();
        try {
            this.y().execSQL("delete from default_event_params where app_id=?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            this.b().e0.b(sQLiteException0, "Error clearing default event params");
        }
    }

    public final String z() {
        String s;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.y();
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_7;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    s = cursor0.getString(0);
                    goto label_14;
                }
                goto label_16;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_7:
            this.b().e0.b(sQLiteException0, "Database error getting next bundle app id");
            if(cursor0 != null) {
                goto label_9;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
    label_9:
        cursor0.close();
        return null;
    label_12:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_14:
        cursor0.close();
        return s;
    label_16:
        cursor0.close();
        return null;
    }

    public final void z0(String s) {
        this.u0("events_snapshot", s);
        List list0 = Collections.singletonList("name");
        Cursor cursor0 = null;
        try {
            cursor0 = this.y().query("events", ((String[])list0.toArray(new String[0])), "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    if(s1 != null) {
                        p p0 = this.o0("events", s, s1);
                        if(p0 != null) {
                            this.T("events_snapshot", p0);
                        }
                    }
                }
                while(cursor0.moveToNext());
                goto label_22;
            }
            goto label_24;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                L l0 = this.b();
                M m0 = L.u(s);
                l0.e0.c(m0, "Error creating snapshot. appId", sQLiteException0);
                if(cursor0 != null) {
                    goto label_17;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
        label_17:
            cursor0.close();
            return;
        }
        catch(Throwable throwable0) {
        label_20:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_22:
        cursor0.close();
        return;
    label_24:
        cursor0.close();
    }
}

