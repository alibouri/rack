package K5;

import N5.m;
import N5.r;
import N6.d;
import V5.a;
import V5.b;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class k extends d implements m {
    public final int e;
    public static final int f;

    public k(byte[] arr_b) {
        super("com.google.android.gms.common.internal.ICertData", 5);
        r.b(arr_b.length == 25);
        this.e = Arrays.hashCode(arr_b);
    }

    @Override  // N6.d
    public final boolean M(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                a a0 = this.a();
                parcel1.writeNoException();
                c6.a.c(parcel1, a0);
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                parcel1.writeInt(this.e);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static byte[] N(String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new AssertionError(unsupportedEncodingException0);
        }
    }

    public abstract byte[] O();

    @Override  // N5.m
    public final a a() {
        return new b(this.O());
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != null && object0 instanceof m) {
            try {
                if(((m)object0).l() != this.e) {
                    return false;
                }
                a a0 = ((m)object0).a();
                if(a0 == null) {
                    return false;
                }
                byte[] arr_b = (byte[])b.O(a0);
                return Arrays.equals(this.O(), arr_b);
            }
            catch(RemoteException remoteException0) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.e;
    }

    @Override  // N5.m
    public final int l() {
        return this.e;
    }
}

