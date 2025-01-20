package S2;

import C3.i;
import E7.B;
import V7.j;
import W7.e;
import W7.n;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import io.sentry.metrics.a;
import io.sentry.z;
import j6.w;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.URL;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Callable;
import l7.c;
import org.json.JSONException;
import org.json.JSONObject;
import v1.r;

public final class d implements Callable {
    public final int a;
    public final Object b;

    public d(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    public d(c c0, w w0) {
        this.a = 5;
        super();
        this.b = c0;
    }

    @Override
    public final Object call() {
        FileInputStream fileInputStream0;
        Object object0 = null;
        int v = 0;
        switch(this.a) {
            case 0: {
                WorkDatabase workDatabase0 = (WorkDatabase)((B3.c)this.b).Y;
                Long long0 = workDatabase0.t().g("next_alarm_manager_id");
                int v1 = long0 == null ? 0 : ((int)(((long)long0)));
                if(v1 != 0x7FFFFFFF) {
                    v = v1 + 1;
                }
                workDatabase0.t().h(new R2.d("next_alarm_manager_id", ((long)v)));
                return v1;
            }
            case 1: {
                return ((j)this.b).b("firebase");
            }
            case 2: {
                n n0 = (n)this.b;
                __monitor_enter(n0);
                try {
                    fileInputStream0 = null;
                    fileInputStream0 = n0.a.openFileInput(n0.b);
                    goto label_38;
                }
                catch(JSONException | FileNotFoundException unused_ex) {
                    goto label_43;
                }
                catch(Throwable throwable0) {
                }
                Throwable throwable1 = throwable0;
                goto label_48;
                try {
                label_38:
                    int v2 = fileInputStream0.available();
                    byte[] arr_b1 = new byte[v2];
                    fileInputStream0.read(arr_b1, 0, v2);
                    object0 = e.a(new JSONObject(new String(arr_b1, "UTF-8")));
                    goto label_51;
                }
                catch(JSONException | FileNotFoundException unused_ex) {
                label_43:
                    if(fileInputStream0 != null) {
                        try {
                            fileInputStream0.close();
                        }
                        catch(Throwable throwable2) {
                            __monitor_exit(n0);
                            throw throwable2;
                        }
                    }
                    __monitor_exit(n0);
                    return null;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_48:
                    if(fileInputStream0 != null) {
                        fileInputStream0.close();
                    }
                    throw throwable1;
                label_51:
                    fileInputStream0.close();
                }
                catch(Throwable throwable2) {
                    __monitor_exit(n0);
                    throw throwable2;
                }
                __monitor_exit(n0);
                return object0;
            }
            case 3: {
                z z0 = (z)this.b;
                z0.getClass();
                try {
                    z0.e.getClass();
                    z0.b = InetAddress.getLocalHost().getCanonicalHostName();
                    z0.c = System.currentTimeMillis() + z0.a;
                    return null;
                }
                finally {
                    z0.d.set(false);
                }
            }
            case 4: {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object2: ((a)this.b).a.entrySet()) {
                    ((Long)((Map.Entry)object2).getKey()).getClass();
                    Iterator iterator1 = ((Map)((Map.Entry)object2).getValue()).values().iterator();
                    if(iterator1.hasNext()) {
                        throw r.e(iterator1);
                    }
                    if(false) {
                        break;
                    }
                }
                return stringBuilder0.toString().getBytes(a.b);
            }
            default: {
                ((c)this.b).getClass();
                byte[] arr_b = new JSONObject().toString().getBytes("UTF-8");
                i i0 = ((c)this.b).c;
                i0.getClass();
                Fc.d d0 = ((c)this.b).f;
                if(d0.b > System.currentTimeMillis()) {
                    throw new B("Too many attempts.");
                }
                JSONObject jSONObject0 = new JSONObject(i0.y(new URL("https://firebaseappcheck.googleapis.com/v1/projects/" + ((String)i0.b0) + "/apps/" + ((String)i0.Z) + ":generatePlayIntegrityChallenge?key=" + ((String)i0.Y)), arr_b, d0, false));
                String s = jSONObject0.optString("challenge");
                if(TextUtils.isEmpty(s)) {
                    s = null;
                }
                String s1 = jSONObject0.optString("ttl");
                if(!TextUtils.isEmpty(s1)) {
                    object0 = s1;
                }
                if(s == null || object0 == null) {
                    throw new B("Unexpected server response.");
                }
                Object object1 = new l7.a();  // initializer: Ljava/lang/Object;-><init>()V
                object1.a = s;
                return object1;
            }
        }
    }
}

