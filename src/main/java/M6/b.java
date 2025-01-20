package m6;

import M5.B;
import N6.d;
import a6.a;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;

public abstract class b extends d {
    @Override  // N6.d
    public final boolean J(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 3: {
                ConnectionResult connectionResult0 = (ConnectionResult)a.a(parcel0, ConnectionResult.CREATOR);
                zaa zaa0 = (zaa)a.a(parcel0, zaa.CREATOR);
                a.b(parcel0);
                break;
            }
            case 4: {
                Status status0 = (Status)a.a(parcel0, Status.CREATOR);
                a.b(parcel0);
                break;
            }
            case 6: {
                Status status1 = (Status)a.a(parcel0, Status.CREATOR);
                a.b(parcel0);
                break;
            }
            case 7: {
                Status status2 = (Status)a.a(parcel0, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)a.a(parcel0, GoogleSignInAccount.CREATOR);
                a.b(parcel0);
                break;
            }
            case 8: {
                zak zak0 = (zak)a.a(parcel0, zak.CREATOR);
                a.b(parcel0);
                Y6.b b0 = new Y6.b(13, ((B)this), zak0, false);
                ((B)this).f.post(b0);
                break;
            }
            case 9: {
                zag zag0 = (zag)a.a(parcel0, zag.CREATOR);
                a.b(parcel0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

