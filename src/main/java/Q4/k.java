package Q4;

import E7.n;
import Nb.j;
import R4.g;
import V4.e;
import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import f5.a;
import io.sentry.B;
import io.sentry.android.core.L;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v1.r;

public final class k extends TimerTask {
    public final int X;
    public final Object Y;

    public k(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override
    public final void run() {
        String s2;
        FutureTask futureTask0;
        String s1;
        Class class1;
        String s;
        boolean z1;
        View view0;
        boolean z;
        Class class0;
        Object object0 = this.Y;
        switch(this.X) {
            case 0: {
                try {
                    class0 = l.class;
                    z = a.b(class0);
                }
                catch(Exception exception0) {
                    Log.e(l.a(), "UI Component tree indexing failure!", exception0);
                    return;
                }
                Handler handler0 = null;
                l l0 = (l)object0;
                try {
                    Activity activity0 = (Activity)(z ? null : l0.b).get();
                    view0 = e.b(activity0);
                    if(activity0 != null && view0 != null) {
                        z1 = false;
                        s = activity0.getClass().getSimpleName();
                        class1 = d.class;
                        if(!a.b(class1)) {
                            z1 = d.g.get();
                        }
                        goto label_21;
                    }
                }
                catch(Exception exception0) {
                    Log.e(l.a(), "UI Component tree indexing failure!", exception0);
                }
                return;
                try {
                    z1 = d.g.get();
                    goto label_21;
                }
                catch(Throwable throwable0) {
                    try {
                        a.a(throwable0, class1);
                    label_21:
                        s1 = "";
                        if(z1) {
                            if(j.a(null, Boolean.TRUE)) {
                                N4.j.K("CaptureViewHierarchy", "");
                                return;
                            }
                            futureTask0 = new FutureTask(new Q4.j(view0));
                            if(!a.b(class0)) {
                                handler0 = l0.a;
                            }
                            handler0.post(futureTask0);
                            s1 = (String)futureTask0.get(1L, TimeUnit.SECONDS);
                            goto label_34;
                        }
                    }
                    catch(Exception exception0) {
                        Log.e(l.a(), "UI Component tree indexing failure!", exception0);
                    }
                    return;
                }
                try {
                    s1 = (String)futureTask0.get(1L, TimeUnit.SECONDS);
                    goto label_34;
                }
                catch(Exception exception1) {
                    try {
                        Log.e(l.a(), "Failed to take screenshot.", exception1);
                    label_34:
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.put("screenname", s);
                            jSONObject0.put("screenshot", s1);
                            JSONArray jSONArray0 = new JSONArray();
                            jSONArray0.put(g.c(view0));
                            jSONObject0.put("view", jSONArray0);
                        }
                        catch(JSONException unused_ex) {
                            Log.e(l.a(), "Failed to create JSONObject");
                        }
                        s2 = jSONObject0.toString();
                        j.e(s2, "viewTree.toString()");
                        if(!a.b(class0)) {
                            goto label_45;
                        }
                    }
                    catch(Exception exception0) {
                        Log.e(l.a(), "UI Component tree indexing failure!", exception0);
                    }
                    return;
                }
                try {
                label_45:
                    l0.getClass();
                    if(!a.b(l0)) {
                        goto label_47;
                    }
                    return;
                }
                catch(Throwable throwable1) {
                    goto label_53;
                }
                try {
                label_47:
                    M4.l.c().execute(new n(s2, 16, l0));
                    return;
                }
                catch(Throwable throwable2) {
                    try {
                        a.a(throwable2, l0);
                        return;
                    }
                    catch(Throwable throwable1) {
                    }
                }
                try {
                label_53:
                    a.a(throwable1, class0);
                    return;
                }
                catch(Exception exception0) {
                    Log.e(l.a(), "UI Component tree indexing failure!", exception0);
                }
                return;
            }
            case 1: {
                B b0 = ((L)object0).e0;
                if(((L)object0).f0) {
                    b0.h();
                }
                b0.u().getReplayController().getClass();
                return;
            }
            default: {
                Iterator iterator0 = ((CopyOnWriteArrayList)((X2.g)object0).c0).iterator();
                if(iterator0.hasNext()) {
                    throw r.e(iterator0);
                }
            }
        }
    }
}

