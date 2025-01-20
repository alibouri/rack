package I5;

import H5.b;
import M5.r;
import N5.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import b4.A0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class d extends f {
    public final GoogleSignInOptions x0;

    public d(Context context0, Looper looper0, A0 a00, GoogleSignInOptions googleSignInOptions0, r r0, r r1) {
        super(context0, looper0, 91, a00, r0, r1);
        b b0;
        if(googleSignInOptions0 == null) {
            b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
            b0.a = new HashSet();
            b0.h = new HashMap();
        }
        else {
            b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
            b0.a = new HashSet();
            b0.h = new HashMap();
            b0.a = new HashSet(googleSignInOptions0.Y);
            b0.b = googleSignInOptions0.c0;
            b0.c = googleSignInOptions0.d0;
            b0.d = googleSignInOptions0.b0;
            b0.e = googleSignInOptions0.e0;
            b0.f = googleSignInOptions0.Z;
            b0.g = googleSignInOptions0.f0;
            b0.h = GoogleSignInOptions.l(googleSignInOptions0.g0);
            b0.i = googleSignInOptions0.h0;
        }
        byte[] arr_b = new byte[16];
        Y5.b.a.nextBytes(arr_b);
        b0.i = Base64.encodeToString(arr_b, 11);
        Set set0 = (Set)a00.c;
        if(!set0.isEmpty()) {
            for(Object object0: set0) {
                HashSet hashSet0 = b0.a;
                hashSet0.add(((Scope)object0));
                hashSet0.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet1 = b0.a;
        if(hashSet1.contains(GoogleSignInOptions.l0)) {
            Scope scope0 = GoogleSignInOptions.k0;
            if(hashSet1.contains(scope0)) {
                hashSet1.remove(scope0);
            }
        }
        if(b0.d && (b0.f == null || !hashSet1.isEmpty())) {
            b0.a.add(GoogleSignInOptions.j0);
        }
        this.x0 = new GoogleSignInOptions(3, new ArrayList(hashSet1), b0.f, b0.d, b0.b, b0.c, b0.e, b0.g, b0.h, b0.i);
    }

    @Override  // N5.e, L5.c
    public final int f() {
        return 12451000;
    }

    @Override  // N5.e
    public final IInterface o(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterface0 instanceof j ? ((j)iInterface0) : new j(iBinder0, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    }

    @Override  // N5.e
    public final String u() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override  // N5.e
    public final String v() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}

