package N5;

import a6.d;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class s extends d {
    public final e a;

    public s(e e0, Looper looper0) {
        this.a = e0;
        super(looper0, 2);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        e e1;
        if(this.a.u0.get() != message0.arg1) {
            if(message0.what != 1 && message0.what != 2 && message0.what != 7) {
                return;
            }
            l l0 = (l)message0.obj;
            l0.getClass();
            l0.d();
            return;
        }
        switch(message0.what) {
            case 4: {
                this.a.getClass();
                break;
            }
            case 1: 
            case 5: 
            case 7: {
                break;
            }
            default: {
                goto label_11;
            }
        }
        if(this.a.g()) {
        label_11:
            PendingIntent pendingIntent0 = null;
            switch(message0.what) {
                case 2: {
                    if(!this.a.a()) {
                        l l1 = (l)message0.obj;
                        l1.getClass();
                        l1.d();
                        return;
                    }
                    break;
                }
                case 3: {
                    Object object0 = message0.obj;
                    if(object0 instanceof PendingIntent) {
                        pendingIntent0 = (PendingIntent)object0;
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(message0.arg2, pendingIntent0);
                    this.a.h0.b(connectionResult2);
                    this.a.getClass();
                    return;
                }
                case 4: {
                    this.a.r0 = new ConnectionResult(message0.arg2);
                    e e0 = this.a;
                    if(!e0.s0 && !TextUtils.isEmpty(e0.u()) && !TextUtils.isEmpty(null)) {
                        try {
                            Class.forName(e0.u());
                            e1 = this.a;
                            if(!e1.s0) {
                                goto label_20;
                            }
                        }
                        catch(ClassNotFoundException unused_ex) {
                        }
                        goto label_22;
                    label_20:
                        e1.B(3, null);
                        return;
                    }
                label_22:
                    ConnectionResult connectionResult0 = this.a.r0 == null ? new ConnectionResult(8) : this.a.r0;
                    this.a.h0.b(connectionResult0);
                    this.a.getClass();
                    return;
                }
                case 5: {
                    ConnectionResult connectionResult1 = this.a.r0 == null ? new ConnectionResult(8) : this.a.r0;
                    this.a.h0.b(connectionResult1);
                    this.a.getClass();
                    return;
                }
                case 6: {
                    this.a.B(5, null);
                    b b0 = this.a.m0;
                    if(b0 != null) {
                        b0.b(message0.arg2);
                    }
                    this.a.x();
                    e.A(this.a, 5, 1, null);
                    return;
                }
            }
            int v = message0.what;
            if(v != 1 && v != 2 && v != 7) {
                Log.wtf("GmsClient", "Don\'t know how to handle message: " + v, new Exception());
                return;
            }
            l l2 = (l)message0.obj;
            synchronized(l2) {
                Boolean boolean0 = l2.a;
                if(l2.b) {
                    Log.w("GmsClient", "Callback proxy " + l2.toString() + " being reused. This is not safe.");
                }
            }
            if(boolean0 != null) {
                e e2 = l2.f;
                int v1 = l2.d;
                if(v1 != 0) {
                    e2.B(1, null);
                    Bundle bundle0 = l2.e;
                    if(bundle0 != null) {
                        pendingIntent0 = (PendingIntent)bundle0.getParcelable("pendingIntent");
                    }
                    l2.a(new ConnectionResult(v1, pendingIntent0));
                }
                else if(!l2.b()) {
                    e2.B(1, null);
                    l2.a(new ConnectionResult(8, null));
                }
            }
            synchronized(l2) {
                l2.b = true;
            }
            l2.d();
            return;
        }
        l l3 = (l)message0.obj;
        l3.getClass();
        l3.d();
    }
}

