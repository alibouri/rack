package ha;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.wave.accounts.AccountEvent;
import com.wave.customer.home.PersonalHomeParams;

public final class c0 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new PersonalHomeParams(((FragmentHandle)parcel0.readParcelable(PersonalHomeParams.class.getClassLoader())), ((AccountEvent)parcel0.readParcelable(PersonalHomeParams.class.getClassLoader())));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PersonalHomeParams[v];
    }
}

