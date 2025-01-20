package p9;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.shared.paybill.AddFavoriteResult;
import com.sendwave.shared.paybill.AddOnsFieldSelectResult;
import com.sendwave.shared.paybill.AddOnsFieldSelectWithToggleParams;
import com.sendwave.shared.paybill.SelectFavoriteParams;
import com.sendwave.shared.paybill.SelectFavoriteResult;
import com.sendwave.shared.paybill.conflictingIndices;
import com.wave.voip.VoipCallParams;
import com.wave.voip.call.VoipCaller.CallParams;
import pb.n;

public final class i implements Parcelable.Creator {
    public final int a;

    public i(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                j.f(parcel0, "parcel");
                return new AddFavoriteResult(parcel0.readString());
            }
            case 1: {
                j.f(parcel0, "parcel");
                return new AddOnsFieldSelectResult(parcel0.createBooleanArray());
            }
            case 2: {
                j.f(parcel0, "parcel");
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                String[] arr_s = parcel0.createStringArray();
                boolean[] arr_z = parcel0.createBooleanArray();
                int v = parcel0.readInt();
                conflictingIndices[] arr_conflictingIndices = new conflictingIndices[v];
                for(int v1 = 0; v1 != v; ++v1) {
                    arr_conflictingIndices[v1] = conflictingIndices.CREATOR.createFromParcel(parcel0);
                }
                return new AddOnsFieldSelectWithToggleParams(s3, s4, s5, s6, arr_s, arr_z, arr_conflictingIndices);
            }
            case 3: {
                j.f(parcel0, "parcel");
                return new SelectFavoriteParams(((FragmentHandle)FragmentHandle.CREATOR.createFromParcel(parcel0)), parcel0.readString());
            }
            case 4: {
                j.f(parcel0, "parcel");
                return new SelectFavoriteResult(parcel0.readString());
            }
            case 5: {
                j.f(parcel0, "parcel");
                return new conflictingIndices(parcel0.readInt(), parcel0.readInt());
            }
            case 6: {
                j.f(parcel0, "parcel");
                n n0 = null;
                Object object0 = parcel0.readInt() == 0 ? null : VoipCaller.CallParams.CREATOR.createFromParcel(parcel0);
                boolean z2 = parcel0.readInt() != 0;
                if(parcel0.readInt() != 0) {
                    n0 = n.valueOf(parcel0.readString());
                }
                return new VoipCallParams(((VoipCaller.CallParams)object0), z2, n0);
            }
            default: {
                j.f(parcel0, "parcel");
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                boolean z = true;
                boolean z1 = parcel0.readInt() != 0;
                if(parcel0.readInt() == 0) {
                    z = false;
                }
                return new VoipCaller.CallParams(s, s1, s2, z1, z);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new AddFavoriteResult[v];
            }
            case 1: {
                return new AddOnsFieldSelectResult[v];
            }
            case 2: {
                return new AddOnsFieldSelectWithToggleParams[v];
            }
            case 3: {
                return new SelectFavoriteParams[v];
            }
            case 4: {
                return new SelectFavoriteResult[v];
            }
            case 5: {
                return new conflictingIndices[v];
            }
            case 6: {
                return new VoipCallParams[v];
            }
            default: {
                return new VoipCaller.CallParams[v];
            }
        }
    }
}

