package Y8;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.ParcelableVariables;
import java.util.LinkedHashMap;

public final class n2 implements Parcelable.Creator {
    public final int a;

    public n2(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        if(this.a != 0) {
            j.f(parcel0, "parcel");
            int v = parcel0.readInt();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
            for(int v1 = 0; v1 != v; ++v1) {
                linkedHashMap0.put(parcel0.readString(), parcel0.readValue(ParcelableVariables.class.getClassLoader()));
            }
            return new ParcelableVariables(linkedHashMap0);
        }
        j.f(parcel0, "parcel");
        return new FragmentHandle(parcel0.readString(), ((ParcelableVariables)ParcelableVariables.CREATOR.createFromParcel(parcel0)));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return this.a != 0 ? new ParcelableVariables[v] : new FragmentHandle[v];
    }
}

