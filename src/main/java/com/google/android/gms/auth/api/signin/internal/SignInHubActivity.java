package com.google.android.gms.auth.api.signin.internal;

import I5.a;
import I5.h;
import L5.i;
import U7.c;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.LifecycleOwner;
import c2.x;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.E1;
import g2.b;
import g2.d;
import java.lang.reflect.Modifier;
import s.K;

@KeepName
public class SignInHubActivity extends x {
    public boolean A0;
    public int B0;
    public Intent C0;
    public static boolean D0 = false;
    public boolean y0;
    public SignInConfiguration z0;

    public SignInHubActivity() {
        this.y0 = false;
    }

    @Override  // android.app.Activity
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return true;
    }

    @Override  // c2.x
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(!this.y0) {
            this.setResult(0);
            if(v == 0xA002) {
                if(intent0 != null) {
                    SignInAccount signInAccount0 = (SignInAccount)intent0.getParcelableExtra("signInAccount");
                    if(signInAccount0 != null) {
                        GoogleSignInAccount googleSignInAccount0 = signInAccount0.Y;
                        if(googleSignInAccount0 != null) {
                            h h0 = h.x(this);
                            synchronized(h0) {
                                ((a)h0.Y).d(googleSignInAccount0, this.z0.Y);
                            }
                            intent0.removeExtra("signInAccount");
                            intent0.putExtra("googleSignInAccount", googleSignInAccount0);
                            this.A0 = true;
                            this.B0 = v1;
                            this.C0 = intent0;
                            this.y();
                            return;
                        }
                    }
                    if(intent0.hasExtra("errorCode")) {
                        int v3 = intent0.getIntExtra("errorCode", 8);
                        if(v3 == 13) {
                            v3 = 0x30D5;
                        }
                        this.z(v3);
                        return;
                    }
                }
                this.z(8);
            }
        }
    }

    @Override  // c2.x
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        String s = intent0.getAction();
        if(s == null) {
            Log.e("AuthSignInClient", "Null action");
            this.z(12500);
            return;
        }
        if(s.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            this.z(12500);
            return;
        }
        if(!s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !s.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: " + intent0.getAction());
            this.finish();
            return;
        }
        Bundle bundle1 = intent0.getBundleExtra("config");
        if(bundle1 == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            this.setResult(0);
            this.finish();
            return;
        }
        SignInConfiguration signInConfiguration0 = (SignInConfiguration)bundle1.getParcelable("config");
        if(signInConfiguration0 == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            this.setResult(0);
            this.finish();
            return;
        }
        this.z0 = signInConfiguration0;
        if(bundle0 == null) {
            if(SignInHubActivity.D0) {
                this.setResult(0);
                this.z(0x30D6);
                return;
            }
            SignInHubActivity.D0 = true;
            Intent intent1 = new Intent(s);
            if(s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent1.setPackage("com.google.android.gms");
            }
            else {
                intent1.setPackage("com.wave.personal");
            }
            intent1.putExtra("config", this.z0);
            try {
                this.startActivityForResult(intent1, 0xA002);
            }
            catch(ActivityNotFoundException unused_ex) {
                this.y0 = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                this.z(17);
            }
            return;
        }
        boolean z = bundle0.getBoolean("signingInGoogleApiClients");
        this.A0 = z;
        if(z) {
            this.B0 = bundle0.getInt("signInResultCode");
            Intent intent2 = (Intent)bundle0.getParcelable("signInResultData");
            if(intent2 == null) {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                this.setResult(0);
                this.finish();
                return;
            }
            this.C0 = intent2;
            this.y();
        }
    }

    @Override  // c2.x
    public final void onDestroy() {
        super.onDestroy();
        SignInHubActivity.D0 = false;
    }

    @Override  // c.o
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("signingInGoogleApiClients", this.A0);
        if(this.A0) {
            bundle0.putInt("signInResultCode", this.B0);
            bundle0.putParcelable("signInResultData", this.C0);
        }
    }

    public final void y() {
        g2.a a1;
        E1 e10 = E1.q(this);
        c c0 = new c(6, this);
        d d0 = (d)e10.Z;
        if(d0.Z) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        K k0 = d0.Y;
        g2.a a0 = (g2.a)k0.d(0);
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)e10.Y;
        if(a0 == null) {
            try {
                d0.Z = true;
                I5.c c1 = new I5.c(this, i.a());
                if(I5.c.class.isMemberClass() && !Modifier.isStatic(I5.c.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c1);
                }
                a1 = new g2.a(c1);
                k0.e(0, a1);
            }
            finally {
                d0.Z = false;
            }
            b b0 = new b(a1.l, c0);
            a1.d(lifecycleOwner0, b0);
            b b1 = a1.n;
            if(b1 != null) {
                a1.i(b1);
            }
            a1.m = lifecycleOwner0;
            a1.n = b0;
        }
        else {
            b b2 = new b(a0.l, c0);
            a0.d(lifecycleOwner0, b2);
            b b3 = a0.n;
            if(b3 != null) {
                a0.i(b3);
            }
            a0.m = lifecycleOwner0;
            a0.n = b2;
        }
        SignInHubActivity.D0 = false;
    }

    public final void z(int v) {
        Status status0 = new Status(v, null, null, null);
        Intent intent0 = new Intent();
        intent0.putExtra("googleSignInStatus", status0);
        this.setResult(0, intent0);
        this.finish();
        SignInHubActivity.D0 = false;
    }
}

