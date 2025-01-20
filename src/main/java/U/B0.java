package U;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;

public final class b0 implements Parcelable.Creator {
    public final int a;

    public b0(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                return new ParcelableSnapshotMutableFloatState(parcel0.readFloat());
            }
            case 1: {
                return new ParcelableSnapshotMutableIntState(parcel0.readInt());
            }
            default: {
                return new ParcelableSnapshotMutableLongState(parcel0.readLong());
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new ParcelableSnapshotMutableFloatState[v];
            }
            case 1: {
                return new ParcelableSnapshotMutableIntState[v];
            }
            default: {
                return new ParcelableSnapshotMutableLongState[v];
            }
        }
    }
}

