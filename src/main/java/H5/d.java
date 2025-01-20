package H5;

import Q4.i;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

public final class d implements Parcelable.Creator {
    public final int a;

    public d(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                int v2 = i.R(parcel0);
                String s2 = null;
                String s3 = null;
                String s4 = null;
                String s5 = null;
                Uri uri0 = null;
                String s6 = null;
                String s7 = null;
                ArrayList arrayList0 = null;
                String s8 = null;
                String s9 = null;
                long v3 = 0L;
                int v4 = 0;
                while(parcel0.dataPosition() < v2) {
                    int v5 = parcel0.readInt();
                    switch(((char)v5)) {
                        case 1: {
                            v4 = i.M(v5, parcel0);
                            break;
                        }
                        case 2: {
                            s2 = i.v(v5, parcel0);
                            break;
                        }
                        case 3: {
                            s3 = i.v(v5, parcel0);
                            break;
                        }
                        case 4: {
                            s4 = i.v(v5, parcel0);
                            break;
                        }
                        case 5: {
                            s5 = i.v(v5, parcel0);
                            break;
                        }
                        case 6: {
                            uri0 = (Uri)i.u(parcel0, v5, Uri.CREATOR);
                            break;
                        }
                        case 7: {
                            s6 = i.v(v5, parcel0);
                            break;
                        }
                        case 8: {
                            v3 = i.N(v5, parcel0);
                            break;
                        }
                        case 9: {
                            s7 = i.v(v5, parcel0);
                            break;
                        }
                        case 10: {
                            arrayList0 = i.x(parcel0, v5, Scope.CREATOR);
                            break;
                        }
                        case 11: {
                            s8 = i.v(v5, parcel0);
                            break;
                        }
                        case 12: {
                            s9 = i.v(v5, parcel0);
                            break;
                        }
                        default: {
                            i.P(v5, parcel0);
                        }
                    }
                }
                i.z(v2, parcel0);
                return new GoogleSignInAccount(v4, s2, s3, s4, s5, uri0, s6, v3, s7, arrayList0, s8, s9);
            }
            case 1: {
                int v6 = i.R(parcel0);
                ArrayList arrayList1 = null;
                ArrayList arrayList2 = null;
                Account account0 = null;
                String s10 = null;
                String s11 = null;
                String s12 = null;
                int v7 = 0;
                boolean z = false;
                boolean z1 = false;
                boolean z2 = false;
                while(parcel0.dataPosition() < v6) {
                    int v8 = parcel0.readInt();
                    switch(((char)v8)) {
                        case 1: {
                            v7 = i.M(v8, parcel0);
                            break;
                        }
                        case 2: {
                            arrayList2 = i.x(parcel0, v8, Scope.CREATOR);
                            break;
                        }
                        case 3: {
                            account0 = (Account)i.u(parcel0, v8, Account.CREATOR);
                            break;
                        }
                        case 4: {
                            z = i.K(v8, parcel0);
                            break;
                        }
                        case 5: {
                            z1 = i.K(v8, parcel0);
                            break;
                        }
                        case 6: {
                            z2 = i.K(v8, parcel0);
                            break;
                        }
                        case 7: {
                            s10 = i.v(v8, parcel0);
                            break;
                        }
                        case 8: {
                            s11 = i.v(v8, parcel0);
                            break;
                        }
                        case 9: {
                            arrayList1 = i.x(parcel0, v8, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        }
                        case 10: {
                            s12 = i.v(v8, parcel0);
                            break;
                        }
                        default: {
                            i.P(v8, parcel0);
                        }
                    }
                }
                i.z(v6, parcel0);
                return new GoogleSignInOptions(v7, arrayList2, account0, z, z1, z2, s10, s11, GoogleSignInOptions.l(arrayList1), s12);
            }
            default: {
                int v = i.R(parcel0);
                String s = "";
                GoogleSignInAccount googleSignInAccount0 = null;
                String s1 = "";
                while(parcel0.dataPosition() < v) {
                    int v1 = parcel0.readInt();
                    switch(((char)v1)) {
                        case 4: {
                            s = i.v(v1, parcel0);
                            break;
                        }
                        case 7: {
                            googleSignInAccount0 = (GoogleSignInAccount)i.u(parcel0, v1, GoogleSignInAccount.CREATOR);
                            break;
                        }
                        case 8: {
                            s1 = i.v(v1, parcel0);
                            break;
                        }
                        default: {
                            i.P(v1, parcel0);
                        }
                    }
                }
                i.z(v, parcel0);
                return new SignInAccount(s, googleSignInAccount0, s1);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new GoogleSignInAccount[v];
            }
            case 1: {
                return new GoogleSignInOptions[v];
            }
            default: {
                return new SignInAccount[v];
            }
        }
    }
}

