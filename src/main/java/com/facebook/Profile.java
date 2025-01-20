package com.facebook;

import C2.a;
import N4.j;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final String c0;
    public final Uri d0;
    public final Uri e0;

    static {
        Profile.CREATOR = new a(15);
    }

    public Profile(Parcel parcel0) {
        this.X = parcel0.readString();
        this.Y = parcel0.readString();
        this.Z = parcel0.readString();
        this.b0 = parcel0.readString();
        this.c0 = parcel0.readString();
        String s = parcel0.readString();
        Uri uri0 = null;
        this.d0 = s == null ? null : Uri.parse(s);
        String s1 = parcel0.readString();
        if(s1 != null) {
            uri0 = Uri.parse(s1);
        }
        this.e0 = uri0;
    }

    public Profile(String s, String s1, String s2, String s3, String s4, Uri uri0, Uri uri1) {
        j.D(s, "id");
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.b0 = s3;
        this.c0 = s4;
        this.d0 = uri0;
        this.e0 = uri1;
    }

    public Profile(JSONObject jSONObject0) {
        Uri uri0 = null;
        this.X = jSONObject0.optString("id", null);
        this.Y = jSONObject0.optString("first_name", null);
        this.Z = jSONObject0.optString("middle_name", null);
        this.b0 = jSONObject0.optString("last_name", null);
        this.c0 = jSONObject0.optString("name", null);
        String s = jSONObject0.optString("link_uri", null);
        this.d0 = s == null ? null : Uri.parse(s);
        String s1 = jSONObject0.optString("picture_uri", null);
        if(s1 != null) {
            uri0 = Uri.parse(s1);
        }
        this.e0 = uri0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // Deobfuscation rating: MEDIUM(70)
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Profile ? (this.X == null && ((Profile)object0).X == null || Nb.j.a(this.X, ((Profile)object0).X)) && (this.Y == null && ((Profile)object0).Y == null || Nb.j.a(this.Y, ((Profile)object0).Y)) && (this.Z == null && ((Profile)object0).Z == null || Nb.j.a(this.Z, ((Profile)object0).Z)) && (this.b0 == null && ((Profile)object0).b0 == null || Nb.j.a(this.b0, ((Profile)object0).b0)) && (this.c0 == null && ((Profile)object0).c0 == null || Nb.j.a(this.c0, ((Profile)object0).c0)) && (this.d0 == null && ((Profile)object0).d0 == null || Nb.j.a(this.d0, ((Profile)object0).d0)) && (this.e0 == null && ((Profile)object0).e0 == null || Nb.j.a(this.e0, ((Profile)object0).e0)) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x20F + (this.X == null ? 0 : this.X.hashCode());
        String s = this.Y;
        if(s != null) {
            v = v * 0x1F + s.hashCode();
        }
        String s1 = this.Z;
        if(s1 != null) {
            v = v * 0x1F + s1.hashCode();
        }
        String s2 = this.b0;
        if(s2 != null) {
            v = v * 0x1F + s2.hashCode();
        }
        String s3 = this.c0;
        if(s3 != null) {
            v = v * 0x1F + s3.hashCode();
        }
        Uri uri0 = this.d0;
        if(uri0 != null) {
            v = v * 0x1F + uri0.hashCode();
        }
        return this.e0 == null ? v : v * 0x1F + this.e0.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Nb.j.f(parcel0, "dest");
        parcel0.writeString(this.X);
        parcel0.writeString(this.Y);
        parcel0.writeString(this.Z);
        parcel0.writeString(this.b0);
        parcel0.writeString(this.c0);
        String s = null;
        parcel0.writeString((this.d0 == null ? null : this.d0.toString()));
        Uri uri0 = this.e0;
        if(uri0 != null) {
            s = uri0.toString();
        }
        parcel0.writeString(s);
    }
}

