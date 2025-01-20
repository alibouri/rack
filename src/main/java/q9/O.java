package q9;

import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.sendwave.backend.type.AnnouncementEventType;
import com.sendwave.util.AnnouncementAction;
import com.sendwave.util.AnnouncementDetailsParams;
import com.sendwave.util.AnnouncementEventData;
import com.sendwave.util.Country;
import com.sendwave.util.UNIT;
import java.util.ArrayList;

public final class o implements Parcelable.Creator {
    public final int a;

    public o(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                j.f(parcel0, "parcel");
                return new AnnouncementAction(parcel0.readString(), parcel0.readString());
            }
            case 1: {
                j.f(parcel0, "parcel");
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                int v = parcel0.readInt();
                ArrayList arrayList0 = new ArrayList(v);
                for(int v1 = 0; v1 != v; ++v1) {
                    arrayList0.add(AnnouncementAction.CREATOR.createFromParcel(parcel0));
                }
                return new AnnouncementDetailsParams(s, s1, s2, s3, s4, arrayList0);
            }
            case 2: {
                j.f(parcel0, "parcel");
                String s5 = parcel0.readString();
                return new AnnouncementEventData(((AnnouncementEventType)parcel0.readParcelable(AnnouncementEventData.class.getClassLoader())), s5);
            }
            case 3: {
                j.f(parcel0, "parcel");
                Object object0 = M0.b(parcel0.readString());
                j.c(object0);
                return object0;
            }
            default: {
                j.f(parcel0, "parcel");
                parcel0.readInt();
                return new UNIT();
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new AnnouncementAction[v];
            }
            case 1: {
                return new AnnouncementDetailsParams[v];
            }
            case 2: {
                return new AnnouncementEventData[v];
            }
            case 3: {
                return new Country[v];
            }
            default: {
                return new UNIT[v];
            }
        }
    }
}

