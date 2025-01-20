package e9;

import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon.APPROVED;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon.CLIPBOARD;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon.PENDING;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon.REJECTED;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon.UNKNOWN__;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon;

public abstract class i implements Adapter {
    public static UserKycIdPhotoStatusIcon a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        UserKycIdPhotoStatusIcon.R.getClass();
        switch(s.hashCode()) {
            case 0x21C1577: {
                if(s.equals("PENDING")) {
                    return PENDING.X;
                }
                break;
            }
            case 174130302: {
                if(s.equals("REJECTED")) {
                    return REJECTED.X;
                }
                break;
            }
            case 0x46B3ED76: {
                if(s.equals("CLIPBOARD")) {
                    return CLIPBOARD.X;
                }
                break;
            }
            case 0x754B56B7: {
                if(s.equals("APPROVED")) {
                    return APPROVED.X;
                }
                break;
            }
            default: {
                return new UNKNOWN__(s);
            }
        }
        return new UNKNOWN__(s);
    }
}

