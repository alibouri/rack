package j6;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

public final class l {
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;
    public static final l f;

    static {
        l.f = new l(null, 100, null, null);
    }

    public l(Boolean boolean0, int v, Boolean boolean1, String s) {
        s0 s00;
        EnumMap enumMap0 = new EnumMap(p0.class);
        this.e = enumMap0;
        p0 p00 = p0.b0;
        if(boolean0 == null) {
            s00 = s0.Y;
        }
        else {
            s00 = boolean0.booleanValue() ? s0.c0 : s0.b0;
        }
        enumMap0.put(p00, s00);
        this.a = v;
        this.b = this.e();
        this.c = boolean1;
        this.d = s;
    }

    public l(EnumMap enumMap0, int v, Boolean boolean0, String s) {
        EnumMap enumMap1 = new EnumMap(p0.class);
        this.e = enumMap1;
        enumMap1.putAll(enumMap0);
        this.a = v;
        this.b = this.e();
        this.c = boolean0;
        this.d = s;
    }

    public static l a(int v, Bundle bundle0) {
        Boolean boolean0 = null;
        if(bundle0 == null) {
            return new l(null, v, null, null);
        }
        EnumMap enumMap0 = new EnumMap(p0.class);
        p0[] arr_p0 = r0.Z.X;
        for(int v1 = 0; v1 < arr_p0.length; ++v1) {
            p0 p00 = arr_p0[v1];
            enumMap0.put(p00, q0.f(bundle0.getString(p00.X)));
        }
        if(bundle0.containsKey("is_dma_region")) {
            boolean0 = Boolean.valueOf(bundle0.getString("is_dma_region"));
        }
        return new l(enumMap0, v, boolean0, bundle0.getString("cps_display_str"));
    }

    public static l b(String s) {
        if(s != null && s.length() > 0) {
            String[] arr_s = s.split(":");
            int v = Integer.parseInt(arr_s[0]);
            EnumMap enumMap0 = new EnumMap(p0.class);
            p0[] arr_p0 = r0.Z.X;
            int v2 = 0;
            for(int v1 = 1; v2 < arr_p0.length; ++v1) {
                enumMap0.put(arr_p0[v2], q0.e(arr_s[v1].charAt(0)));
                ++v2;
            }
            return new l(enumMap0, v, null, null);
        }
        return l.f;
    }

    public static Boolean c(Bundle bundle0) {
        if(bundle0 == null) {
            return null;
        }
        switch(o.a[q0.f(bundle0.getString("ad_personalization")).ordinal()]) {
            case 3: {
                return Boolean.FALSE;
            }
            case 4: {
                return Boolean.TRUE;
            }
            default: {
                return null;
            }
        }
    }

    public final s0 d() {
        s0 s00 = (s0)this.e.get(p0.b0);
        return s00 == null ? s0.Y : s00;
    }

    public final String e() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        p0[] arr_p0 = r0.Z.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            stringBuilder0.append(":");
            stringBuilder0.append(q0.a(((s0)this.e.get(p00))));
        }
        return stringBuilder0.toString();
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof l)) {
            return false;
        }
        if(!this.b.equalsIgnoreCase(((l)object0).b)) {
            return false;
        }
        return Objects.equals(this.c, ((l)object0).c) ? Objects.equals(this.d, ((l)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        Boolean boolean0 = this.c;
        if(boolean0 == null) {
            return this.d == null ? 0x970 + this.b.hashCode() : this.d.hashCode() * 0x89 + (87 + this.b.hashCode());
        }
        int v = boolean0 == Boolean.TRUE ? 7 : 13;
        return this.d == null ? 0x919 + (v * 29 + this.b.hashCode()) : this.d.hashCode() * 0x89 + (v * 29 + this.b.hashCode());
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(q0.g(this.a));
        p0[] arr_p0 = r0.Z.X;
        for(int v = 0; v < arr_p0.length; ++v) {
            p0 p00 = arr_p0[v];
            stringBuilder0.append(",");
            stringBuilder0.append(p00.X);
            stringBuilder0.append("=");
            s0 s00 = (s0)this.e.get(p00);
            if(s00 == null) {
                stringBuilder0.append("uninitialized");
            }
            else {
                switch(o.a[s00.ordinal()]) {
                    case 1: {
                        stringBuilder0.append("uninitialized");
                        break;
                    }
                    case 2: {
                        stringBuilder0.append("eu_consent_policy");
                        break;
                    }
                    case 3: {
                        stringBuilder0.append("denied");
                        break;
                    }
                    case 4: {
                        stringBuilder0.append("granted");
                    }
                }
            }
        }
        Boolean boolean0 = this.c;
        if(boolean0 != null) {
            stringBuilder0.append(",isDmaRegion=");
            stringBuilder0.append(boolean0);
        }
        String s = this.d;
        if(s != null) {
            stringBuilder0.append(",cpsDisplayStr=");
            stringBuilder0.append(s);
        }
        return stringBuilder0.toString();
    }
}

