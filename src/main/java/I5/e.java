package I5;

import N6.d;
import Y5.c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public final class e extends d implements i {
    public final int e;
    public final f f;

    public e(f f0, int v) {
        this.e = v;
        this.f = f0;
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 3);
    }

    @Override  // I5.i
    public void G(Status status0) {
        if(this.e != 1) {
            throw new UnsupportedOperationException();
        }
        this.f.setResult(status0);
    }

    @Override  // N6.d
    public final boolean K(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 101: {
                GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)c.a(parcel0, GoogleSignInAccount.CREATOR);
                Status status0 = (Status)c.a(parcel0, Status.CREATOR);
                c.b(parcel0);
                throw new UnsupportedOperationException();
            }
            case 102: {
                Status status1 = (Status)c.a(parcel0, Status.CREATOR);
                c.b(parcel0);
                this.k(status1);
                break;
            }
            case 103: {
                Status status2 = (Status)c.a(parcel0, Status.CREATOR);
                c.b(parcel0);
                this.G(status2);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // I5.i
    public void k(Status status0) {
        if(this.e != 0) {
            throw new UnsupportedOperationException();
        }
        this.f.setResult(status0);
    }
}

