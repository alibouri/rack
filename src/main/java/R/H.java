package r;

import G1.m;
import P4.c;
import U0.F;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

public final class h implements Observer {
    public final int X;
    public final BiometricFragment Y;

    public h(BiometricFragment biometricFragment0, int v) {
        this.X = v;
        this.Y = biometricFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void b(Object object0) {
        switch(this.X) {
            case 0: {
                if(((p)object0) != null) {
                    this.Y.c0(((p)object0));
                    s s1 = this.Y.Y0;
                    if(s1.n0 == null) {
                        s1.n0 = new MutableLiveData();
                    }
                    s.u(s1.n0, null);
                }
                return;
            }
            case 1: {
                if(((e)object0) != null) {
                    BiometricFragment biometricFragment0 = this.Y;
                    biometricFragment0.getClass();
                    int v = ((e)object0).a;
                    switch(v) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: 
                        case 14: 
                        case 15: {
                            break;
                        }
                        default: {
                            v = 8;
                        }
                    }
                    Context context0 = biometricFragment0.n();
                    int v1 = Build.VERSION.SDK_INT;
                    int v2 = 0;
                    if(v1 >= 29 || v != 7 && v != 9 || context0 == null) {
                    label_30:
                        boolean z = biometricFragment0.Y();
                        CharSequence charSequence0 = ((e)object0).b;
                        if(z) {
                            if(charSequence0 == null) {
                                charSequence0 = c.C(biometricFragment0.n(), v);
                            }
                            if(v == 5) {
                                if(biometricFragment0.Y0.h0 == 0 || biometricFragment0.Y0.h0 == 3) {
                                    biometricFragment0.b0(5, charSequence0);
                                }
                                biometricFragment0.V();
                            }
                            else {
                                if(biometricFragment0.Y0.s0) {
                                    biometricFragment0.a0(v, charSequence0);
                                }
                                else {
                                    biometricFragment0.d0(charSequence0);
                                    f f0 = new f(biometricFragment0, v, charSequence0, 1);
                                    Context context1 = biometricFragment0.n();
                                    if(context1 == null) {
                                        v2 = 2000;
                                    }
                                    else {
                                        boolean z1 = false;
                                        String s2 = Build.MODEL;
                                        if(v1 == 28 && s2 != null) {
                                            String[] arr_s = context1.getResources().getStringArray(0x7F030004);  // array:hide_fingerprint_instantly_prefixes
                                            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                                                if(s2.startsWith(arr_s[v3])) {
                                                    z1 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        if(!z1) {
                                            v2 = 2000;
                                        }
                                    }
                                    biometricFragment0.X0.postDelayed(f0, ((long)v2));
                                }
                                biometricFragment0.Y0.s0 = true;
                            }
                        }
                        else {
                            if(charSequence0 == null) {
                                charSequence0 = biometricFragment0.r(0x7F12010E) + " " + v;  // string:default_error_msg "Unknown error"
                            }
                            biometricFragment0.a0(v, charSequence0);
                        }
                    }
                    else {
                        KeyguardManager keyguardManager0 = B.a(context0);
                        if((keyguardManager0 == null ? false : B.b(keyguardManager0)) && N4.h.u(biometricFragment0.Y0.o())) {
                            biometricFragment0.Z();
                            biometricFragment0.Y0.q(null);
                            return;
                        }
                        goto label_30;
                    }
                    biometricFragment0.Y0.q(null);
                }
                return;
            }
            case 2: {
                if(((CharSequence)object0) != null) {
                    BiometricFragment biometricFragment1 = this.Y;
                    if(biometricFragment1.Y()) {
                        biometricFragment1.d0(((CharSequence)object0));
                    }
                    biometricFragment1.Y0.q(null);
                }
                return;
            }
            case 3: {
                if(((Boolean)object0).booleanValue()) {
                    BiometricFragment biometricFragment2 = this.Y;
                    if(biometricFragment2.Y()) {
                        biometricFragment2.d0(biometricFragment2.r(0x7F12019D));  // string:fingerprint_not_recognized "Not recognized"
                    }
                    s s3 = biometricFragment2.Y0;
                    if(s3.j0) {
                        F f1 = s3.Y;
                        if(f1 == null) {
                            f1 = new m(3);
                        }
                        f1.execute(new g(biometricFragment2, 0));
                    }
                    else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    s s4 = biometricFragment2.Y0;
                    if(s4.q0 == null) {
                        s4.q0 = new MutableLiveData();
                    }
                    s.u(s4.q0, Boolean.FALSE);
                }
                return;
            }
            case 4: {
                if(((Boolean)object0).booleanValue()) {
                    BiometricFragment biometricFragment3 = this.Y;
                    if(biometricFragment3.X()) {
                        biometricFragment3.Z();
                    }
                    else {
                        CharSequence charSequence1 = biometricFragment3.Y0.p();
                        if(charSequence1 == null) {
                            charSequence1 = biometricFragment3.r(0x7F12010E);  // string:default_error_msg "Unknown error"
                        }
                        biometricFragment3.a0(13, charSequence1);
                        biometricFragment3.U(2);
                    }
                    biometricFragment3.Y0.t(false);
                }
                return;
            }
            default: {
                if(((Boolean)object0).booleanValue()) {
                    this.Y.U(1);
                    this.Y.V();
                    s s0 = this.Y.Y0;
                    if(s0.t0 == null) {
                        s0.t0 = new MutableLiveData();
                    }
                    s.u(s0.t0, Boolean.FALSE);
                }
            }
        }
    }
}

