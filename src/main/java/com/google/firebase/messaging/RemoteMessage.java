package com.google.firebase.messaging;

import C2.a;
import R2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import s.e;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle X;
    public e Y;

    static {
        RemoteMessage.CREATOR = new a(1);
    }

    public RemoteMessage(Bundle bundle0) {
        this.X = bundle0;
    }

    public final Map g() {
        if(this.Y == null) {
            e e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
            Bundle bundle0 = this.X;
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = bundle0.get(s);
                if(object1 instanceof String && !s.startsWith("google.") && !s.startsWith("gcm.") && !s.equals("from") && !s.equals("message_type") && !s.equals("collapse_key")) {
                    e0.put(s, ((String)object1));
                }
            }
            this.Y = e0;
        }
        return this.Y;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.C(parcel0, 2, this.X);
        f.J(v1, parcel0);
    }
}

