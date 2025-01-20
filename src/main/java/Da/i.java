package da;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.wave.customer.deviceapproval.DeviceApprovalRequiredResultSuccess;

public final class i implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return parcel0.readInt() == 0 ? new DeviceApprovalRequiredResultSuccess(false) : new DeviceApprovalRequiredResultSuccess(true);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceApprovalRequiredResultSuccess[v];
    }
}

