package com.twilio.voice;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class CancelledCallInvite implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String callSid;
    final Map cancelledCallInviteMessage;
    final Map customParameters;
    private final String from;
    private final String to;

    static {
        CancelledCallInvite.CREATOR = new Parcelable.Creator() {
            public CancelledCallInvite createFromParcel(Parcel parcel0) {
                return new CancelledCallInvite(0, parcel0);
            }

            public CancelledCallInvite[] newArray(int v) {
                return new CancelledCallInvite[v];
            }
        };
    }

    public CancelledCallInvite(int v, Parcel parcel0) {
        this(parcel0);
    }

    private CancelledCallInvite(Parcel parcel0) {
        String[] arr_s = new String[3];
        parcel0.readStringArray(arr_s);
        this.from = arr_s[0];
        this.to = arr_s[1];
        this.callSid = arr_s[2];
        int v1 = parcel0.readInt();
        this.cancelledCallInviteMessage = new HashMap(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            this.cancelledCallInviteMessage.put(s, s1);
        }
        int v3 = parcel0.readInt();
        this.customParameters = new HashMap(v3);
        for(int v = 0; v < v3; ++v) {
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            this.customParameters.put(s2, s3);
        }
    }

    private CancelledCallInvite(Map map0) {
        this.from = (String)map0.get("twi_from");
        this.to = (String)map0.get("twi_to");
        this.callSid = (String)map0.get("twi_call_sid");
        HashMap hashMap0 = new HashMap();
        this.customParameters = hashMap0;
        String s = (String)map0.get("twi_params");
        if(s != null) {
            Utils.parseCustomParams(s, hashMap0);
        }
        this.cancelledCallInviteMessage = map0;
    }

    public static CancelledCallInvite create(Map map0) {
        return new CancelledCallInvite(map0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CancelledCallInvite && this.getFrom().equals(((CancelledCallInvite)object0).getFrom()) && this.getTo().equals(((CancelledCallInvite)object0).getTo()) && this.getCallSid().equals(((CancelledCallInvite)object0).getCallSid());
    }

    public String getCallSid() {
        return this.callSid;
    }

    public Map getCustomParameters() {
        return this.customParameters;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public static boolean isValid(Map map0) {
        String s = (String)map0.get("twi_message_type");
        return s != null && s.equals("twilio.voice.cancel") && ((String)map0.get("twi_call_sid")) != null && ((String)map0.get("twi_to")) != null;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringArray(new String[]{this.from, this.to, this.callSid});
        parcel0.writeInt(this.cancelledCallInviteMessage.size());
        for(Object object0: this.cancelledCallInviteMessage.entrySet()) {
            parcel0.writeString(((String)((Map.Entry)object0).getKey()));
            parcel0.writeString(((String)((Map.Entry)object0).getValue()));
        }
        Map map0 = this.customParameters;
        if(map0 != null) {
            parcel0.writeInt(map0.size());
            for(Object object1: this.customParameters.entrySet()) {
                parcel0.writeString(((String)((Map.Entry)object1).getKey()));
                parcel0.writeString(((String)((Map.Entry)object1).getValue()));
            }
        }
    }
}

