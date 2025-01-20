package V4;

import Ab.o;
import Nb.j;
import W4.f;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import f5.a;
import org.json.JSONObject;

public final class i {
    public final o a;
    public static final p b;
    public static volatile i c;

    static {
        i.b = new p();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public i() {
        this.a = f.A(h.X);
    }

    public final SharedPreferences a() {
        if(a.b(this)) {
            return null;
        }
        try {
            Object object0 = this.a.getValue();
            j.e(object0, "<get-preferences>(...)");
            return (SharedPreferences)object0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final void b(Activity activity0) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(activity0, "activity");
            Uri uri0 = activity0.getIntent().getData();
            if(uri0 == null) {
                return;
            }
            Intent intent0 = activity0.getIntent();
            j.e(intent0, "activity.intent");
            this.c(uri0, intent0);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void c(Uri uri0, Intent intent0) {
        String s2;
        String s = null;
        if(a.b(this)) {
            return;
        }
        try {
            if(!a.b(this)) {
                try {
                    String s1 = uri0.getQueryParameter("al_applink_data");
                    if(s1 == null) {
                        goto label_12;
                    }
                    else {
                        try {
                            s2 = new JSONObject(s1).getString("campaign_ids");
                        }
                        catch(Exception unused_ex) {
                            Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                            goto label_12;
                        }
                    }
                    goto label_15;
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, this);
                }
            }
        label_12:
            s2 = null;
        label_15:
            if(s2 == null) {
                if(!a.b(this)) {
                    try {
                        Bundle bundle0 = intent0.getBundleExtra("al_applink_data");
                        if(bundle0 != null) {
                            s = bundle0.getString("campaign_ids");
                        }
                    }
                    catch(Throwable throwable2) {
                        a.a(throwable2, this);
                    }
                }
                s2 = s;
            }
            if(s2 != null) {
                this.a().edit().putString("campaign_ids", s2).apply();
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

