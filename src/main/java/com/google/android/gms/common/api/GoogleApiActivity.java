package com.google.android.gms.common.api;

import K5.b;
import M.J;
import M5.f;
import N5.r;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int X;
    public static final int Y;

    public GoogleApiActivity() {
        this.X = 0;
    }

    @Override  // android.app.Activity
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            boolean z = this.getIntent().getBooleanExtra("notify_manager", true);
            this.X = 0;
            this.setResult(v1, intent0);
            if(z) {
                f f0 = f.g(this);
                switch(v1) {
                    case -1: {
                        Message message0 = f0.n.obtainMessage(3);
                        f0.n.sendMessage(message0);
                        break;
                    }
                    case 0: {
                        f0.h(new ConnectionResult(13, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                }
            }
        }
        else if(v == 2) {
            this.X = 0;
            this.setResult(v1, intent0);
        }
        this.finish();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.X = 0;
        this.setResult(0);
        this.finish();
    }

    @Override  // android.app.Activity
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.X = bundle0.getInt("resolution");
        }
        if(this.X != 1) {
            Bundle bundle1 = this.getIntent().getExtras();
            if(bundle1 == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                this.finish();
                return;
            }
            PendingIntent pendingIntent0 = (PendingIntent)bundle1.get("pending_intent");
            Integer integer0 = (Integer)bundle1.get("error_code");
            if(pendingIntent0 == null && integer0 == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                this.finish();
                return;
            }
            if(pendingIntent0 != null) {
                try {
                    this.startIntentSenderForResult(pendingIntent0.getIntentSender(), 1, null, 0, 0, 0);
                    this.X = 1;
                }
                catch(ActivityNotFoundException activityNotFoundException0) {
                    if(bundle1.getBoolean("notify_manager", true)) {
                        f.g(this).h(new ConnectionResult(22, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                    else {
                        Log.e("GoogleApiActivity", (Build.FINGERPRINT.contains("generic") ? J.e("Activity not found while launching ", pendingIntent0.toString(), ".") + " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : J.e("Activity not found while launching ", pendingIntent0.toString(), ".")), activityNotFoundException0);
                    }
                    this.X = 1;
                    this.finish();
                }
                catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", intentSender$SendIntentException0);
                    this.finish();
                }
                return;
            }
            r.j(integer0);
            b.d.d(this, ((int)integer0), this);
            this.X = 1;
        }
    }

    @Override  // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putInt("resolution", this.X);
        super.onSaveInstanceState(bundle0);
    }
}

