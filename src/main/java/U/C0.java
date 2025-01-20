package U;

import M.J;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class c0 implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState a(Parcel parcel0, ClassLoader classLoader0) {
        if(classLoader0 == null) {
            classLoader0 = c0.class.getClassLoader();
        }
        Object object0 = parcel0.readValue(classLoader0);
        int v = parcel0.readInt();
        switch(v) {
            case 0: {
                return new ParcelableSnapshotMutableState(object0, Z.b);
            }
            case 1: {
                return new ParcelableSnapshotMutableState(object0, Z.e);
            }
            case 2: {
                return new ParcelableSnapshotMutableState(object0, Z.c);
            }
            default: {
                throw new IllegalStateException(J.d(v, "Unsupported MutableState policy ", " was restored"));
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return c0.a(parcel0, null);
    }

    @Override  // android.os.Parcelable$ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
        return c0.a(parcel0, classLoader0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelableSnapshotMutableState[v];
    }
}

