package ra;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.wave.customer.paymentcards.PaymentCardsParams;
import com.wave.customer.transactions.ui.TransactionsParams;

public final class h0 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        j.f(parcel0, "parcel");
        return new PaymentCardsParams(parcel0.readString(), ((FragmentHandle)parcel0.readParcelable(PaymentCardsParams.class.getClassLoader())), ((FragmentHandle)parcel0.readParcelable(PaymentCardsParams.class.getClassLoader())), ((TransactionsParams)TransactionsParams.CREATOR.createFromParcel(parcel0)));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaymentCardsParams[v];
    }
}

