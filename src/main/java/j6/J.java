package j6;

import S5.b;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

public final class j extends SQLiteOpenHelper {
    public final int X;
    public final O3.j Y;

    public j(Context context0, String s) {
        if(s.equals("")) {
            s = null;
        }
        super(context0, s, null, 1);
    }

    public j(E e0, Context context0) {
        this.X = 1;
        this.Y = e0;
        this(context0, "google_app_measurement_local.db");
    }

    public j(g g0, Context context0) {
        this.X = 0;
        this.Y = g0;
        this(context0, "google_app_measurement.db");
    }

    private final void a(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if(this.X != 0) {
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
                throw sQLiteDatabaseLockedException0;
            }
            catch(SQLiteException unused_ex) {
                E e0 = (E)this.Y;
                e0.b().e0.d("Opening the local database failed, dropping and recreating it");
                if(!((d0)e0.Y).X.getDatabasePath("google_app_measurement_local.db").delete()) {
                    e0.b().e0.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                }
                try {
                    return super.getWritableDatabase();
                }
                catch(SQLiteException sQLiteException0) {
                    e0.b().e0.b(sQLiteException0, "Failed to open local database. Events will bypass local storage");
                    return null;
                }
            }
        }
        g g0 = (g)this.Y;
        I i0 = g0.d0;
        if(i0.Y != 0L) {
            ((b)i0.Z).getClass();
            if(SystemClock.elapsedRealtime() - i0.Y < 3600000L) {
                throw new SQLiteException("Database open failed");
            }
        }
        try {
            return super.getWritableDatabase();
        }
        catch(SQLiteException unused_ex) {
            I i1 = g0.d0;
            ((b)i1.Z).getClass();
            i1.Y = SystemClock.elapsedRealtime();
            g0.b().e0.d("Opening the database failed, dropping and recreating it");
            if(!((d0)g0.Y).X.getDatabasePath("google_app_measurement.db").delete()) {
                g0.b().e0.b("google_app_measurement.db", "Failed to delete corrupted db file");
            }
            try {
                SQLiteDatabase sQLiteDatabase0 = super.getWritableDatabase();
                i1.Y = 0L;
                return sQLiteDatabase0;
            }
            catch(SQLiteException sQLiteException1) {
                g0.b().e0.b(sQLiteException1, "Failed to open freshly created database");
                throw sQLiteException1;
            }
        }
    }

    private final void h(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        if(this.X != 0) {
            t0.f(((E)this.Y).b(), sQLiteDatabase0);
            return;
        }
        t0.f(((g)this.Y).b(), sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(this.X != 0) {
            t0.g(((E)this.Y).b(), sQLiteDatabase0, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
            return;
        }
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", g.e0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", g.f0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", g.g0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", g.i0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", g.h0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", g.j0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", g.k0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", g.l0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", g.m0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", g.n0);
        t0.g(((g)this.Y).b(), sQLiteDatabase0, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

