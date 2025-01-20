package Ba;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.wave.customer.savings.deposit.DepositSavingsParams;

public final class h implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new DepositSavingsParams(((FragmentHandle)parcel0.readParcelable(DepositSavingsParams.class.getClassLoader())));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DepositSavingsParams[v];
    }
}

