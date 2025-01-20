package R2;

import Bb.F;
import N4.o;
import Nb.j;
import P4.c;
import X1.r;
import X1.u;
import Y1.a;
import Y1.b;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.E1;
import j6.L;
import j6.V;
import j6.d0;
import j6.s;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m8.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C;
import s.J;

public final class h {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public h(h h0, e e0) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = h0;
        this.b = e0;
    }

    public h(Typeface typeface0, b b0) {
        int v7;
        int v3;
        this.d = typeface0;
        this.a = b0;
        this.c = new r(0x400);
        int v = b0.a(6);
        if(v == 0) {
            v3 = 0;
        }
        else {
            int v1 = v + b0.X;
            int v2 = ((ByteBuffer)b0.b0).getInt(v1);
            v3 = ((ByteBuffer)b0.b0).getInt(v2 + v1);
        }
        this.b = new char[v3 * 2];
        int v4 = b0.a(6);
        if(v4 == 0) {
            v7 = 0;
        }
        else {
            int v5 = v4 + b0.X;
            int v6 = ((ByteBuffer)b0.b0).getInt(v5);
            v7 = ((ByteBuffer)b0.b0).getInt(v6 + v5);
        }
        for(int v8 = 0; v8 < v7; ++v8) {
            u u0 = new u(this, v8);
            a a0 = u0.c();
            int v9 = a0.a(4);
            if(v9 != 0) {
                ((ByteBuffer)a0.b0).getInt(v9 + a0.X);
            }
            char[] arr_c = (char[])this.b;
            F.l("invalid metadata codepoint length", u0.b() > 0);
            int v10 = u0.b();
            ((r)this.c).a(u0, 0, v10 - 1);
        }
    }

    public h(V v0, String s) {
        this.d = v0;
        N5.r.f(s);
        this.a = s;
        if(((d0)v0.Y).e0.B(null, s.k1)) {
            this.b = new Bundle();
            return;
        }
        this.b = new Bundle();
    }

    public void a(Object object0, ArrayList arrayList0, HashSet hashSet0) {
        if(arrayList0.contains(object0)) {
            return;
        }
        if(hashSet0.contains(object0)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet0.add(object0);
        ArrayList arrayList1 = (ArrayList)((J)this.b).get(object0);
        if(arrayList1 != null) {
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.a(arrayList1.get(v1), arrayList0, hashSet0);
            }
        }
        hashSet0.remove(object0);
        arrayList0.add(object0);
    }

    public q8.e b(String s) {
        if(!((ConcurrentHashMap)this.d).containsKey(s)) {
            synchronized(this) {
                if(((ConcurrentHashMap)this.d).containsKey(s)) {
                    return (q8.a)this.c;
                }
                try {
                    InputStream inputStream0 = ((p8.a)this.a).a(s);
                    ((p8.b)this.b).getClass();
                    List list0 = p8.b.a(inputStream0);
                }
                catch(IllegalArgumentException | IllegalStateException illegalArgumentException0) {
                    throw new IllegalStateException("Failed to read file " + s, illegalArgumentException0);
                }
                for(Object object0: list0) {
                    d d0 = (d)object0;
                    q8.a a0 = (q8.a)this.c;
                    E1 e10 = a0.Y;
                    if(((String)((q8.d)e10.Z).a(d0)).equals("001")) {
                        a0.X.g(d0);
                    }
                    else {
                        e10.g(d0);
                    }
                }
                ((ConcurrentHashMap)this.d).put(s, s);
            }
            return (q8.a)this.c;
        }
        return (q8.a)this.c;
    }

    public g c(i i0) {
        j.f(i0, "id");
        C c0 = M6.b.o(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        c0.c(1, i0.a);
        c0.H(2, ((long)i0.b));
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.a;
        workDatabase_Impl0.b();
        Cursor cursor0 = c.O(workDatabase_Impl0, c0, false);
        try {
            int v1 = o.E(cursor0, "work_spec_id");
            int v2 = o.E(cursor0, "generation");
            int v3 = o.E(cursor0, "system_id");
            return cursor0.moveToFirst() ? new g(cursor0.getString(v1), cursor0.getInt(v2), cursor0.getInt(v3)) : null;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public void d(g g0) {
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.a;
        workDatabase_Impl0.b();
        workDatabase_Impl0.c();
        try {
            ((R2.b)this.b).f(g0);
            workDatabase_Impl0.q();
        }
        finally {
            workDatabase_Impl0.k();
        }
    }

    public h e() {
        return new h(this, ((e)this.b));
    }

    // This method was un-flattened
    public Bundle f() {
        String s2;
        String s1;
        JSONObject jSONObject0;
        int v1;
        JSONArray jSONArray0;
        Bundle bundle1;
        Bundle bundle0 = (Bundle)this.c;
        V v0 = (V)this.d;
        if(bundle0 == null) {
            String s = v0.y().getString(((String)this.a), null);
            if(s != null) {
                try {
                    bundle1 = new Bundle();
                    jSONArray0 = new JSONArray(s);
                    v1 = 0;
                label_8:
                    while(v1 >= jSONArray0.length()) {
                        this.c = bundle1;
                        goto label_53;
                    }
                }
                catch(JSONException unused_ex) {
                    goto label_51;
                }
                try {
                    jSONObject0 = jSONArray0.getJSONObject(v1);
                    s1 = jSONObject0.getString("n");
                    s2 = jSONObject0.getString("t");
                    switch(s2) {
                        case "d": {
                            goto label_18;
                        }
                        case "ia": {
                            goto label_20;
                        }
                        case "l": {
                            goto label_32;
                        }
                        case "la": {
                            goto label_34;
                        }
                        case "s": {
                            goto label_46;
                        }
                    }
                }
                catch(JSONException | NumberFormatException unused_ex) {
                    goto label_48;
                }
                d0 d00 = (d0)v0.Y;
                try {
                    v0.b().e0.b(s2, "Unrecognized persisted bundle type. Type");
                    ++v1;
                    goto label_8;
                label_18:
                    bundle1.putDouble(s1, Double.parseDouble(jSONObject0.getString("v")));
                    ++v1;
                    goto label_8;
                }
                catch(JSONException | NumberFormatException unused_ex) {
                    goto label_48;
                }
            label_20:
                d00 = (d0)v0.Y;
                try {
                    if(d00.e0.B(null, s.I0)) {
                        JSONArray jSONArray1 = new JSONArray(jSONObject0.getString("v"));
                        int v2 = jSONArray1.length();
                        int[] arr_v = new int[v2];
                        for(int v3 = 0; v3 < v2; ++v3) {
                            arr_v[v3] = jSONArray1.optInt(v3);
                        }
                        bundle1.putIntArray(s1, arr_v);
                        ++v1;
                        goto label_8;
                    label_32:
                        bundle1.putLong(s1, Long.parseLong(jSONObject0.getString("v")));
                    }
                    ++v1;
                    goto label_8;
                }
                catch(JSONException | NumberFormatException unused_ex) {
                    goto label_48;
                }
            label_34:
                d00 = (d0)v0.Y;
                try {
                    if(d00.e0.B(null, s.I0)) {
                        JSONArray jSONArray2 = new JSONArray(jSONObject0.getString("v"));
                        int v4 = jSONArray2.length();
                        long[] arr_v1 = new long[v4];
                        for(int v5 = 0; v5 < v4; ++v5) {
                            arr_v1[v5] = jSONArray2.optLong(v5);
                        }
                        bundle1.putLongArray(s1, arr_v1);
                        ++v1;
                        goto label_8;
                    label_46:
                        bundle1.putString(s1, jSONObject0.getString("v"));
                    }
                    ++v1;
                    goto label_8;
                }
                catch(JSONException | NumberFormatException unused_ex) {
                    try {
                    label_48:
                        v0.b().e0.d("Error reading value from SharedPreferences. Value dropped");
                        ++v1;
                        goto label_8;
                    }
                    catch(JSONException unused_ex) {
                    }
                }
            label_51:
                v0.b().e0.d("Error loading bundle from SharedPreferences. Values will be lost");
            }
        label_53:
            if(((Bundle)this.c) == null) {
                this.c = (Bundle)this.b;
            }
        }
        if(((d0)v0.Y).e0.B(null, s.k1)) {
            Bundle bundle2 = (Bundle)this.c;
            N5.r.j(bundle2);
            return new Bundle(bundle2);
        }
        Bundle bundle3 = (Bundle)this.c;
        N5.r.j(bundle3);
        return bundle3;
    }

    public com.google.android.gms.internal.measurement.o g(com.google.android.gms.internal.measurement.e e0) {
        com.google.android.gms.internal.measurement.o o0 = com.google.android.gms.internal.measurement.o.e;
        Iterator iterator0 = e0.z();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o0 = ((e)this.b).n(this, e0.s(((int)(((Integer)object0)))));
            if(o0 instanceof com.google.android.gms.internal.measurement.i) {
                break;
            }
        }
        return o0;
    }

    public com.google.android.gms.internal.measurement.o h(com.google.android.gms.internal.measurement.o o0) {
        return ((e)this.b).n(this, o0);
    }

    public com.google.android.gms.internal.measurement.o i(String s) {
        h h0 = this;
        do {
            if(((HashMap)h0.c).containsKey(s)) {
                return (com.google.android.gms.internal.measurement.o)((HashMap)h0.c).get(s);
            }
            h0 = (h)h0.a;
        }
        while(h0 != null);
        throw new IllegalArgumentException(s + " is not defined");
    }

    public void j(Bundle bundle0) {
        Bundle bundle1;
        V v0 = (V)this.d;
        if(bundle0 == null) {
            bundle1 = new Bundle();
        }
        else {
            bundle1 = ((d0)v0.Y).e0.B(null, s.k1) ? new Bundle(bundle0) : bundle0;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = v0.y().edit();
        String s = (String)this.a;
        if(bundle1.size() == 0) {
            sharedPreferences$Editor0.remove(s);
        }
        else {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: bundle1.keySet()) {
                String s1 = (String)object0;
                Object object1 = bundle1.get(s1);
                if(object1 != null) {
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("n", s1);
                        if(((d0)v0.Y).e0.B(null, s.I0)) {
                            if(!(object1 instanceof String)) {
                                if(!(object1 instanceof Long)) {
                                    if(!(object1 instanceof int[])) {
                                        if(object1 instanceof long[]) {
                                            jSONObject0.put("v", Arrays.toString(((long[])object1)));
                                            jSONObject0.put("t", "la");
                                            jSONArray0.put(jSONObject0);
                                        }
                                        else if(object1 instanceof Double) {
                                            jSONObject0.put("v", String.valueOf(object1));
                                            jSONObject0.put("t", "d");
                                            jSONArray0.put(jSONObject0);
                                        }
                                        else {
                                            L l0 = v0.b();
                                            Class class0 = object1.getClass();
                                            l0.e0.b(class0, "Cannot serialize bundle value to SharedPreferences. Type");
                                        }
                                        continue;
                                    }
                                    jSONObject0.put("v", Arrays.toString(((int[])object1)));
                                    jSONObject0.put("t", "ia");
                                    jSONArray0.put(jSONObject0);
                                    continue;
                                }
                                jSONObject0.put("v", String.valueOf(object1));
                                jSONObject0.put("t", "l");
                                jSONArray0.put(jSONObject0);
                                continue;
                            }
                            jSONObject0.put("v", String.valueOf(object1));
                            jSONObject0.put("t", "s");
                            jSONArray0.put(jSONObject0);
                            continue;
                        }
                        else {
                            jSONObject0.put("v", String.valueOf(object1));
                            if(object1 instanceof String) {
                                jSONObject0.put("t", "s");
                            }
                            else {
                                if(object1 instanceof Long) {
                                    jSONObject0.put("t", "l");
                                    jSONArray0.put(jSONObject0);
                                }
                                else if(object1 instanceof Double) {
                                    jSONObject0.put("t", "d");
                                    jSONArray0.put(jSONObject0);
                                }
                                else {
                                    L l1 = v0.b();
                                    Class class1 = object1.getClass();
                                    l1.e0.b(class1, "Cannot serialize bundle value to SharedPreferences. Type");
                                }
                                continue;
                            }
                        }
                        jSONArray0.put(jSONObject0);
                        continue;
                    }
                    catch(JSONException jSONException0) {
                    }
                    v0.b().e0.b(jSONException0, "Cannot serialize bundle value to SharedPreferences");
                }
            }
            sharedPreferences$Editor0.putString(s, jSONArray0.toString());
        }
        sharedPreferences$Editor0.apply();
        this.c = bundle1;
    }

    public void k(String s, com.google.android.gms.internal.measurement.o o0) {
        if(!((HashMap)this.d).containsKey(s)) {
            HashMap hashMap0 = (HashMap)this.c;
            if(o0 == null) {
                hashMap0.remove(s);
                return;
            }
            hashMap0.put(s, o0);
        }
    }

    public boolean l(String s) {
        h h0 = this;
        do {
            if(((HashMap)h0.c).containsKey(s)) {
                return true;
            }
            h0 = (h)h0.a;
        }
        while(h0 != null);
        return false;
    }

    public void m(String s, com.google.android.gms.internal.measurement.o o0) {
        h h0;
        for(h0 = this; !((HashMap)h0.c).containsKey(s); h0 = h1) {
            h h1 = (h)h0.a;
            if(h1 == null || !h1.l(s)) {
                break;
            }
        }
        if(!((HashMap)h0.d).containsKey(s)) {
            HashMap hashMap0 = (HashMap)h0.c;
            if(o0 == null) {
                hashMap0.remove(s);
                return;
            }
            hashMap0.put(s, o0);
        }
    }
}

