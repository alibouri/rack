package K9;

import Nb.j;
import X8.h;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.ActionSource;
import com.wave.components.sendmoney.SendMoneyDialogParams;
import com.wave.components.sendmoney.SendMoneyEnterContactParams;
import com.wave.components.sendmoney.SendMoneySelectParams;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class z implements Parcelable.Creator {
    public final int a;

    public z(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                j.f(parcel0, "parcel");
                String s = parcel0.readString();
                h h0 = h.valueOf(parcel0.readString());
                return new SendMoneyDialogParams(((FragmentHandle)parcel0.readParcelable(SendMoneyDialogParams.class.getClassLoader())), ((Contact)parcel0.readParcelable(SendMoneyDialogParams.class.getClassLoader())), ((ActionSource)parcel0.readParcelable(SendMoneyDialogParams.class.getClassLoader())), s, h0);
            }
            case 1: {
                j.f(parcel0, "parcel");
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Class class1 = SendMoneyEnterContactParams.class;
                FragmentHandle fragmentHandle1 = (FragmentHandle)parcel0.readParcelable(class1.getClassLoader());
                int v2 = parcel0.readInt();
                ArrayList arrayList0 = new ArrayList(v2);
                for(int v3 = 0; v3 != v2; ++v3) {
                    arrayList0.add(parcel0.readParcelable(class1.getClassLoader()));
                }
                return new SendMoneyEnterContactParams(s1, s2, fragmentHandle1, arrayList0);
            }
            default: {
                j.f(parcel0, "parcel");
                Class class0 = SendMoneySelectParams.class;
                FragmentHandle fragmentHandle0 = (FragmentHandle)parcel0.readParcelable(class0.getClassLoader());
                int v = parcel0.readInt();
                LinkedHashSet linkedHashSet0 = new LinkedHashSet(v);
                boolean z = false;
                for(int v1 = 0; v1 != v; ++v1) {
                    linkedHashSet0.add(parcel0.readParcelable(class0.getClassLoader()));
                }
                if(parcel0.readInt() != 0) {
                    z = true;
                }
                return new SendMoneySelectParams(fragmentHandle0, linkedHashSet0, z, ((FragmentHandle)parcel0.readParcelable(class0.getClassLoader())));
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new SendMoneyDialogParams[v];
            }
            case 1: {
                return new SendMoneyEnterContactParams[v];
            }
            default: {
                return new SendMoneySelectParams[v];
            }
        }
    }
}

