package com.facebook;

import A3.e;
import C2.a;
import M4.f;
import M4.l;
import Nb.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Date X;
    public final Set Y;
    public final Set Z;
    public final Set b0;
    public final String c0;
    public final f d0;
    public final Date e0;
    public final String f0;
    public final String g0;
    public final Date h0;
    public final String i0;
    public static final Date j0;
    public static final Date k0;
    public static final f l0;

    static {
        AccessToken.j0 = new Date(0x7FFFFFFFFFFFFFFFL);
        AccessToken.k0 = new Date();
        AccessToken.l0 = f.Y;
        AccessToken.CREATOR = new a(12);
    }

    public AccessToken(Parcel parcel0) {
        j.f(parcel0, "parcel");
        super();
        this.X = new Date(parcel0.readLong());
        ArrayList arrayList0 = new ArrayList();
        parcel0.readStringList(arrayList0);
        Set set0 = Collections.unmodifiableSet(new HashSet(arrayList0));
        j.e(set0, "unmodifiableSet(HashSet(permissionsList))");
        this.Y = set0;
        arrayList0.clear();
        parcel0.readStringList(arrayList0);
        Set set1 = Collections.unmodifiableSet(new HashSet(arrayList0));
        j.e(set1, "unmodifiableSet(HashSet(permissionsList))");
        this.Z = set1;
        arrayList0.clear();
        parcel0.readStringList(arrayList0);
        Set set2 = Collections.unmodifiableSet(new HashSet(arrayList0));
        j.e(set2, "unmodifiableSet(HashSet(permissionsList))");
        this.b0 = set2;
        String s = parcel0.readString();
        N4.j.D(s, "token");
        this.c0 = s;
        String s1 = parcel0.readString();
        this.d0 = s1 == null ? AccessToken.l0 : f.valueOf(s1);
        this.e0 = new Date(parcel0.readLong());
        String s2 = parcel0.readString();
        N4.j.D(s2, "applicationId");
        this.f0 = s2;
        String s3 = parcel0.readString();
        N4.j.D(s3, "userId");
        this.g0 = s3;
        this.h0 = new Date(parcel0.readLong());
        this.i0 = parcel0.readString();
    }

    public AccessToken(String s, String s1, String s2, Collection collection0, Collection collection1, Collection collection2, f f0, Date date0, Date date1, Date date2, String s3) {
        j.f(s, "accessToken");
        j.f(s1, "applicationId");
        j.f(s2, "userId");
        super();
        N4.j.B(s, "accessToken");
        N4.j.B(s1, "applicationId");
        N4.j.B(s2, "userId");
        Date date3 = AccessToken.j0;
        if(date0 == null) {
            date0 = date3;
        }
        this.X = date0;
        Set set0 = Collections.unmodifiableSet((collection0 == null ? new HashSet() : new HashSet(collection0)));
        j.e(set0, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.Y = set0;
        Set set1 = Collections.unmodifiableSet((collection1 == null ? new HashSet() : new HashSet(collection1)));
        j.e(set1, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.Z = set1;
        Set set2 = Collections.unmodifiableSet((collection2 == null ? new HashSet() : new HashSet(collection2)));
        j.e(set2, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.b0 = set2;
        this.c0 = s;
        if(f0 == null) {
            f0 = AccessToken.l0;
        }
        if(s3 != null && s3.equals("instagram")) {
            switch(f0.ordinal()) {
                case 1: {
                    f0 = f.Z;
                    break;
                }
                case 4: {
                    f0 = f.c0;
                    break;
                }
                case 5: {
                    f0 = f.b0;
                }
            }
        }
        this.d0 = f0;
        if(date1 == null) {
            date1 = AccessToken.k0;
        }
        this.e0 = date1;
        this.f0 = s1;
        this.g0 = s2;
        if(date2 == null || date2.getTime() == 0L) {
            date2 = date3;
        }
        this.h0 = date2;
        if(s3 == null) {
            s3 = "facebook";
        }
        this.i0 = s3;
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("version", 1);
        jSONObject0.put("token", this.c0);
        jSONObject0.put("expires_at", this.X.getTime());
        jSONObject0.put("permissions", new JSONArray(this.Y));
        jSONObject0.put("declined_permissions", new JSONArray(this.Z));
        jSONObject0.put("expired_permissions", new JSONArray(this.b0));
        jSONObject0.put("last_refresh", this.e0.getTime());
        jSONObject0.put("source", this.d0.name());
        jSONObject0.put("application_id", this.f0);
        jSONObject0.put("user_id", this.g0);
        jSONObject0.put("data_access_expiration_time", this.h0.getTime());
        String s = this.i0;
        if(s != null) {
            jSONObject0.put("graph_domain", s);
        }
        return jSONObject0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessToken)) {
            return false;
        }
        if(j.a(this.X, ((AccessToken)object0).X) && j.a(this.Y, ((AccessToken)object0).Y) && j.a(this.Z, ((AccessToken)object0).Z) && j.a(this.b0, ((AccessToken)object0).b0) && j.a(this.c0, ((AccessToken)object0).c0) && this.d0 == ((AccessToken)object0).d0 && j.a(this.e0, ((AccessToken)object0).e0) && j.a(this.f0, ((AccessToken)object0).f0) && j.a(this.g0, ((AccessToken)object0).g0) && j.a(this.h0, ((AccessToken)object0).h0)) {
            String s = ((AccessToken)object0).i0;
            return this.i0 == null ? s == null : j.a(this.i0, s);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s((this.e0.hashCode() + (this.d0.hashCode() + e.s((this.b0.hashCode() + (this.Z.hashCode() + (this.Y.hashCode() + (this.X.hashCode() + 0x20F) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.c0)) * 0x1F) * 0x1F, 0x1F, this.f0), 0x1F, this.g0);
        int v1 = this.h0.hashCode();
        return this.i0 == null ? (v1 + v) * 0x1F : (v1 + v) * 0x1F + this.i0.hashCode();
    }

    @Override
    public final String toString() {
        synchronized(l.b) {
        }
        String s = "{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[" + TextUtils.join(", ", this.Y) + "]}";
        j.e(s, "builder.toString()");
        return s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeLong(this.X.getTime());
        parcel0.writeStringList(new ArrayList(this.Y));
        parcel0.writeStringList(new ArrayList(this.Z));
        parcel0.writeStringList(new ArrayList(this.b0));
        parcel0.writeString(this.c0);
        parcel0.writeString(this.d0.name());
        parcel0.writeLong(this.e0.getTime());
        parcel0.writeString(this.f0);
        parcel0.writeString(this.g0);
        parcel0.writeLong(this.h0.getTime());
        parcel0.writeString(this.i0);
    }
}

