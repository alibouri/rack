package j6;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class g0 implements Runnable {
    public final int X;
    public w0 Y;

    public g0(int v) {
        this.X = v;
        super();
    }

    public g0(w0 w00) {
        this.X = 2;
        super();
        this.Y = w00;
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                this.Y.O();
                return;
            }
            case 1: {
                w0 w00 = this.Y;
                w00.q();
                if(w00.o().t0.b()) {
                    w00.b().l0.d("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                long v = w00.o().u0.a();
                w00.o().u0.b(1L + v);
                if(v >= 5L) {
                    w00.b().h0.d("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    w00.o().t0.a(true);
                    return;
                }
                if(w00.r0 == null) {
                    w00.r0 = new C0(w00, ((d0)w00.Y), 2);
                }
                w00.r0.b(0L);
                return;
            }
            case 2: {
                W w0 = this.Y.p0;
                d0 d00 = w0.b;
                d0.h(d00.h0);
                d00.h0.q();
                if(w0.c()) {
                    boolean z = w0.d();
                    w0 w01 = d00.n0;
                    V v1 = d00.f0;
                    if(z) {
                        d0.e(v1);
                        v1.w0.y(null);
                        Bundle bundle0 = new Bundle();
                        bundle0.putString("source", "(not set)");
                        bundle0.putString("medium", "(not set)");
                        bundle0.putString("_cis", "intent");
                        bundle0.putLong("_cc", 1L);
                        d0.g(w01);
                        w01.U("auto", "_cmpx", bundle0);
                    }
                    else {
                        d0.e(v1);
                        String s = v1.w0.x();
                        if(TextUtils.isEmpty(s)) {
                            d0.h(d00.g0);
                            d00.g0.f0.d("Cache still valid but referrer not found");
                        }
                        else {
                            d0.e(v1);
                            long v2 = v1.x0.a();
                            Uri uri0 = Uri.parse(s);
                            Bundle bundle1 = new Bundle();
                            Pair pair0 = new Pair(uri0.getPath(), bundle1);
                            for(Object object0: uri0.getQueryParameterNames()) {
                                bundle1.putString(((String)object0), uri0.getQueryParameter(((String)object0)));
                            }
                            ((Bundle)pair0.second).putLong("_cc", (v2 / 3600000L - 1L) * 3600000L);
                            String s1 = pair0.first == null ? "app" : ((String)pair0.first);
                            d0.g(w01);
                            w01.U(s1, "_cmp", ((Bundle)pair0.second));
                        }
                        d0.e(v1);
                        v1.w0.y(null);
                    }
                    d0.e(v1);
                    v1.x0.b(0L);
                }
                return;
            }
            default: {
                this.Y.O();
            }
        }
    }
}

