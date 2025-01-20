package com.google.android.gms.auth.api.signin;

import H5.d;
import N5.r;
import R2.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final String c0;
    public final Uri d0;
    public String e0;
    public final long f0;
    public final String g0;
    public final ArrayList h0;
    public final String i0;
    public final String j0;
    public final HashSet k0;

    static {
        GoogleSignInAccount.CREATOR = new d(0);
    }

    public GoogleSignInAccount(int v, String s, String s1, String s2, String s3, Uri uri0, String s4, long v1, String s5, ArrayList arrayList0, String s6, String s7) {
        this.k0 = new HashSet();
        this.X = v;
        this.Y = s;
        this.Z = s1;
        this.b0 = s2;
        this.c0 = s3;
        this.d0 = uri0;
        this.e0 = s4;
        this.f0 = v1;
        this.g0 = s5;
        this.h0 = arrayList0;
        this.i0 = s6;
        this.j0 = s7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof GoogleSignInAccount)) {
            return false;
        }
        if(((GoogleSignInAccount)object0).g0.equals(this.g0)) {
            HashSet hashSet0 = new HashSet(((GoogleSignInAccount)object0).h0);
            hashSet0.addAll(((GoogleSignInAccount)object0).k0);
            HashSet hashSet1 = new HashSet(this.h0);
            hashSet1.addAll(this.k0);
            return hashSet0.equals(hashSet1);
        }
        return false;
    }

    public static GoogleSignInAccount g(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(s);
        String s2 = jSONObject0.optString("photoUrl");
        Uri uri0 = TextUtils.isEmpty(s2) ? null : Uri.parse(s2);
        long v = Long.parseLong(jSONObject0.getString("expirationTime"));
        HashSet hashSet0 = new HashSet();
        JSONArray jSONArray0 = jSONObject0.getJSONArray("grantedScopes");
        int v1 = jSONArray0.length();
        for(int v2 = 0; v2 < v1; ++v2) {
            hashSet0.add(new Scope(1, jSONArray0.getString(v2)));
        }
        String s3 = jSONObject0.optString("id");
        String s4 = jSONObject0.has("tokenId") ? jSONObject0.optString("tokenId") : null;
        String s5 = jSONObject0.has("email") ? jSONObject0.optString("email") : null;
        String s6 = jSONObject0.has("displayName") ? jSONObject0.optString("displayName") : null;
        String s7 = jSONObject0.has("givenName") ? jSONObject0.optString("givenName") : null;
        String s8 = jSONObject0.has("familyName") ? jSONObject0.optString("familyName") : null;
        String s9 = jSONObject0.getString("obfuscatedIdentifier");
        r.f(s9);
        GoogleSignInAccount googleSignInAccount0 = new GoogleSignInAccount(3, s3, s4, s5, s6, uri0, null, v, s9, new ArrayList(hashSet0), s7, s8);
        if(jSONObject0.has("serverAuthCode")) {
            s1 = jSONObject0.optString("serverAuthCode");
        }
        googleSignInAccount0.e0 = s1;
        return googleSignInAccount0;
    }

    @Override
    public final int hashCode() {
        HashSet hashSet0 = new HashSet(this.h0);
        hashSet0.addAll(this.k0);
        return (this.g0.hashCode() + 0x20F) * 0x1F + hashSet0.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.F(parcel0, 2, this.Y);
        f.F(parcel0, 3, this.Z);
        f.F(parcel0, 4, this.b0);
        f.F(parcel0, 5, this.c0);
        f.E(parcel0, 6, this.d0, v);
        f.F(parcel0, 7, this.e0);
        f.K(parcel0, 8, 8);
        parcel0.writeLong(this.f0);
        f.F(parcel0, 9, this.g0);
        f.H(parcel0, 10, this.h0);
        f.F(parcel0, 11, this.i0);
        f.F(parcel0, 12, this.j0);
        f.J(v1, parcel0);
    }
}

