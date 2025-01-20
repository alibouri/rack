package I5;

import F5.a;
import L5.c;
import L5.l;
import M5.u;
import N5.r;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class f extends BasePendingResult {
    public final int a;

    public f(u u0, int v) {
        this.a = v;
        r.k(u0, "GoogleApiClient must not be null");
        super(u0);
        r.k(a.a, "Api must not be null");
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final l m0(Status status0) {
        return status0;
    }

    public final void n0(c c0) {
        if(this.a != 0) {
            j j0 = (j)((d)c0).t();
            e e0 = new e(this, 1);
            Parcel parcel0 = Parcel.obtain();
            parcel0.writeInterfaceToken(j0.f);
            parcel0.writeStrongBinder(e0);
            GoogleSignInOptions googleSignInOptions0 = ((d)c0).x0;
            if(googleSignInOptions0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                googleSignInOptions0.writeToParcel(parcel0, 0);
            }
            j0.c(103, parcel0);
            return;
        }
        j j1 = (j)((d)c0).t();
        e e1 = new e(this, 0);
        Parcel parcel1 = Parcel.obtain();
        parcel1.writeInterfaceToken(j1.f);
        parcel1.writeStrongBinder(e1);
        GoogleSignInOptions googleSignInOptions1 = ((d)c0).x0;
        if(googleSignInOptions1 == null) {
            parcel1.writeInt(0);
        }
        else {
            parcel1.writeInt(1);
            googleSignInOptions1.writeToParcel(parcel1, 0);
        }
        j1.c(102, parcel1);
    }

    public final void o0(Status status0) {
        r.a("Failed result must not be success", ((boolean)((status0.X > 0 ? 0 : 1) ^ 1)));
        this.setResult(this.m0(status0));
    }
}

