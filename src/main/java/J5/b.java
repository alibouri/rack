package J5;

import Q4.i;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;

public final class b implements Parcelable.Creator {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        if(this.a != 0) {
            return new zzd(parcel0.readStrongBinder());
        }
        int v = i.R(parcel0);
        Intent intent0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                intent0 = (Intent)i.u(parcel0, v1, Intent.CREATOR);
            }
            else {
                i.P(v1, parcel0);
            }
        }
        i.z(v, parcel0);
        return new CloudMessage(intent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return this.a != 0 ? new zzd[v] : new CloudMessage[v];
    }
}

