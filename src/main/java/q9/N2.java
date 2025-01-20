package q9;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.util.ParcelableSingleton;

public final class n2 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        String s = parcel0.readString();
        ClassLoader classLoader0 = ParcelableSingleton.class.getClassLoader();
        j.c(classLoader0);
        Object object0 = classLoader0.loadClass(s).getConstructor(null).newInstance(null);
        j.d(object0, "null cannot be cast to non-null type com.sendwave.util.ParcelableSingleton<*>");
        return (ParcelableSingleton)object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelableSingleton[v];
    }
}

