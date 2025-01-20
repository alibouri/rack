package y5;

import A3.e;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class j extends SQLiteOpenHelper {
    public final int X;
    public boolean Y;
    public static final String Z;
    public static final int b0;
    public static final List c0;

    static {
        j.Z = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
        j.b0 = 5;
        j.c0 = Arrays.asList(new i[]{new i(0), new i(1), new i(2), new i(3), new i(4)});
    }

    public j(int v, Context context0, String s) {
        super(context0, s, null, v);
        this.Y = false;
        this.X = v;
    }

    public static void a(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        List list0 = j.c0;
        if(v1 <= list0.size()) {
            while(v < v1) {
                switch(((i)list0.get(v)).a) {
                    case 0: {
                        sQLiteDatabase0.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase0.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase0.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase0.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        break;
                    }
                    case 1: {
                        sQLiteDatabase0.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                        sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                        sQLiteDatabase0.execSQL("DROP INDEX contexts_backend_priority");
                        break;
                    }
                    case 2: {
                        sQLiteDatabase0.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    }
                    case 3: {
                        sQLiteDatabase0.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS event_payloads");
                        sQLiteDatabase0.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                        break;
                    }
                    default: {
                        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase0.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase0.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase0.execSQL(j.Z);
                    }
                }
                ++v;
            }
            return;
        }
        StringBuilder stringBuilder0 = e.v(v, v1, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
        stringBuilder0.append(list0.size());
        stringBuilder0.append(" migrations are provided");
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        this.Y = true;
        sQLiteDatabase0.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        if(!this.Y) {
            this.onConfigure(sQLiteDatabase0);
        }
        j.a(sQLiteDatabase0, 0, this.X);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE events");
        sQLiteDatabase0.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase0.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if(!this.Y) {
            this.onConfigure(sQLiteDatabase0);
        }
        j.a(sQLiteDatabase0, 0, v1);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(!this.Y) {
            this.onConfigure(sQLiteDatabase0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        if(!this.Y) {
            this.onConfigure(sQLiteDatabase0);
        }
        j.a(sQLiteDatabase0, v, v1);
    }
}

