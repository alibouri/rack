package com.google.android.gms.auth.api.signin;

import H5.c;
import H5.d;
import L5.b;
import R2.f;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements b, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final ArrayList Y;
    public final Account Z;
    public final boolean b0;
    public final boolean c0;
    public final boolean d0;
    public final String e0;
    public final String f0;
    public final ArrayList g0;
    public final String h0;
    public static final GoogleSignInOptions i0;
    public static final Scope j0;
    public static final Scope k0;
    public static final Scope l0;
    public static final c m0;

    static {
        Scope scope0 = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope1 = new Scope(1, "openid");
        GoogleSignInOptions.j0 = scope1;
        Scope scope2 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        GoogleSignInOptions.k0 = scope2;
        GoogleSignInOptions.l0 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet0 = new HashSet();
        HashMap hashMap0 = new HashMap();
        hashSet0.add(scope1);
        hashSet0.add(scope0);
        if(hashSet0.contains(GoogleSignInOptions.l0)) {
            Scope scope3 = GoogleSignInOptions.k0;
            if(hashSet0.contains(scope3)) {
                hashSet0.remove(scope3);
            }
        }
        GoogleSignInOptions.i0 = new GoogleSignInOptions(3, new ArrayList(hashSet0), null, false, false, false, null, null, hashMap0, null);
        HashSet hashSet1 = new HashSet();
        HashMap hashMap1 = new HashMap();
        hashSet1.add(scope2);
        hashSet1.addAll(Arrays.asList(new Scope[0]));
        if(hashSet1.contains(GoogleSignInOptions.l0)) {
            Scope scope4 = GoogleSignInOptions.k0;
            if(hashSet1.contains(scope4)) {
                hashSet1.remove(scope4);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet1), null, false, false, false, null, null, hashMap1, null);
        GoogleSignInOptions.CREATOR = new d(1);
        GoogleSignInOptions.m0 = new c(1);
    }

    public GoogleSignInOptions(int v, ArrayList arrayList0, Account account0, boolean z, boolean z1, boolean z2, String s, String s1, HashMap hashMap0, String s2) {
        this.X = v;
        this.Y = arrayList0;
        this.Z = account0;
        this.b0 = z;
        this.c0 = z1;
        this.d0 = z2;
        this.e0 = s;
        this.f0 = s1;
        this.g0 = new ArrayList(hashMap0.values());
        this.h0 = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        String s = this.e0;
        ArrayList arrayList0 = this.Y;
        if(object0 == null) {
            return false;
        }
        try {
            ArrayList arrayList1 = ((GoogleSignInOptions)object0).Y;
            String s1 = ((GoogleSignInOptions)object0).e0;
            Account account0 = ((GoogleSignInOptions)object0).Z;
            if(this.g0.isEmpty() && ((GoogleSignInOptions)object0).g0.isEmpty() && arrayList0.size() == new ArrayList(arrayList1).size() && arrayList0.containsAll(new ArrayList(arrayList1))) {
                Account account1 = this.Z;
                if(account1 != null) {
                    if(account1.equals(account0)) {
                    label_13:
                        if(TextUtils.isEmpty(s)) {
                            return TextUtils.isEmpty(s1) ? this.d0 == ((GoogleSignInOptions)object0).d0 && this.b0 == ((GoogleSignInOptions)object0).b0 && this.c0 == ((GoogleSignInOptions)object0).c0 && TextUtils.equals(this.h0, ((GoogleSignInOptions)object0).h0) : false;
                        }
                        return s.equals(s1) ? this.d0 == ((GoogleSignInOptions)object0).d0 && this.b0 == ((GoogleSignInOptions)object0).b0 && this.c0 == ((GoogleSignInOptions)object0).c0 && TextUtils.equals(this.h0, ((GoogleSignInOptions)object0).h0) : false;
                    }
                }
                else if(account0 == null) {
                    goto label_13;
                }
            }
        }
        catch(ClassCastException unused_ex) {
        }
        return false;
    }

    public static GoogleSignInOptions g(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(s);
        HashSet hashSet0 = new HashSet();
        JSONArray jSONArray0 = jSONObject0.getJSONArray("scopes");
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            hashSet0.add(new Scope(1, jSONArray0.getString(v1)));
        }
        String s2 = jSONObject0.has("accountName") ? jSONObject0.optString("accountName") : null;
        Account account0 = TextUtils.isEmpty(s2) ? null : new Account(s2, "com.google");
        ArrayList arrayList0 = new ArrayList(hashSet0);
        boolean z = jSONObject0.getBoolean("idTokenRequested");
        boolean z1 = jSONObject0.getBoolean("serverAuthRequested");
        boolean z2 = jSONObject0.getBoolean("forceCodeForRefreshToken");
        String s3 = jSONObject0.has("serverClientId") ? jSONObject0.optString("serverClientId") : null;
        if(jSONObject0.has("hostedDomain")) {
            s1 = jSONObject0.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList0, account0, z, z1, z2, s3, s1, new HashMap(), null);
    }

    @Override
    public final int hashCode() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.Y;
        int v = arrayList1.size();
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            arrayList0.add(((Scope)arrayList1.get(v2)).Y);
        }
        Collections.sort(arrayList0);
        String s = this.h0;
        int v3 = ((((((arrayList0.hashCode() + 0x1F) * 0x1F + (this.Z == null ? 0 : this.Z.hashCode())) * 0x1F + (this.e0 == null ? 0 : this.e0.hashCode())) * 0x1F + this.d0) * 0x1F + this.b0) * 0x1F + this.c0) * 0x1F;
        if(s != null) {
            v1 = s.hashCode();
        }
        return v3 + v1;
    }

    public static HashMap l(ArrayList arrayList0) {
        HashMap hashMap0 = new HashMap();
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                hashMap0.put(((int)((GoogleSignInOptionsExtensionParcelable)object0).Y), ((GoogleSignInOptionsExtensionParcelable)object0));
            }
        }
        return hashMap0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.H(parcel0, 2, new ArrayList(this.Y));
        f.E(parcel0, 3, this.Z, v);
        f.K(parcel0, 4, 4);
        parcel0.writeInt(((int)this.b0));
        f.K(parcel0, 5, 4);
        parcel0.writeInt(((int)this.c0));
        f.K(parcel0, 6, 4);
        parcel0.writeInt(((int)this.d0));
        f.F(parcel0, 7, this.e0);
        f.F(parcel0, 8, this.f0);
        f.H(parcel0, 9, this.g0);
        f.F(parcel0, 10, this.h0);
        f.J(v1, parcel0);
    }
}

