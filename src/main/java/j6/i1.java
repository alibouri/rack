package j6;

import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.I0;
import java.util.HashMap;

public final class i1 extends h1 {
    public final l1 u(String s) {
        d0 d00 = (d0)this.Y;
        l1 l10 = null;
        if(d00.e0.B(null, s.x0)) {
            this.p();
            if(r1.u0(s)) {
                this.b().m0.d("sgtm feature flag enabled.");
                B b0 = this.s().p0(s);
                if(b0 == null) {
                    return new l1(this.w(s), 1);
                }
                String s1 = b0.g();
                I0 i00 = this.t().H(s);
                if(i00 != null) {
                    B b1 = this.s().p0(s);
                    if(b1 != null) {
                        if(i00.G() && i00.x().o() == 100 || this.p().s0(s, b1.l())) {
                            goto label_19;
                        }
                        if(d00.e0.B(null, s.z0)) {
                            if(!TextUtils.isEmpty(s1) && Math.abs(s1.hashCode() % 100) < i00.x().o()) {
                                goto label_19;
                            }
                            return new l1(this.w(s), 1);
                        }
                        if(!TextUtils.isEmpty(s1) && s1.hashCode() % 100 < i00.x().o()) {
                        label_19:
                            if(b0.o()) {
                                this.b().m0.d("sgtm upload enabled in manifest.");
                                I0 i01 = this.t().H(b0.f());
                                if(i01 != null && i01.G()) {
                                    String s2 = i01.x().r();
                                    if(!TextUtils.isEmpty(s2)) {
                                        String s3 = i01.x().q();
                                        L l0 = this.b();
                                        String s4 = TextUtils.isEmpty(s3) ? "Y" : "N";
                                        l0.m0.c(s2, "sgtm configured with upload_url, server_info", s4);
                                        if(TextUtils.isEmpty(s3)) {
                                            l10 = new l1(s2, 3);
                                            return l10 == null ? new l1(this.w(s), 1) : l10;
                                        }
                                        HashMap hashMap0 = new HashMap();
                                        hashMap0.put("x-sgtm-server-info", s3);
                                        if(!TextUtils.isEmpty(b0.l())) {
                                            hashMap0.put("x-gtm-server-preview", b0.l());
                                        }
                                        l10 = new l1(s2, hashMap0, 3);
                                    }
                                }
                            }
                            return l10 == null ? new l1(this.w(s), 1) : l10;
                        }
                    }
                }
                return new l1(this.w(s), 1);
            }
        }
        return new l1(this.w(s), 1);
    }

    public static String v(B b0) {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        String s = b0.j();
        if(TextUtils.isEmpty(s)) {
            s = b0.d();
        }
        uri$Builder0.scheme(((String)s.f.a(null))).encodedAuthority(((String)s.g.a(null))).path("config/app/" + s).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return uri$Builder0.build().toString();
    }

    public final String w(String s) {
        String s1 = this.t().L(s);
        if(!TextUtils.isEmpty(s1)) {
            Uri uri0 = Uri.parse(((String)s.r.a(null)));
            Uri.Builder uri$Builder0 = uri0.buildUpon();
            uri$Builder0.authority(s1 + "." + uri0.getAuthority());
            return uri$Builder0.build().toString();
        }
        return (String)s.r.a(null);
    }
}

