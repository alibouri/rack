package Z6;

import N5.r;
import android.content.Context;
import android.text.TextUtils;
import io.sentry.g1;
import io.sentry.internal.debugmeta.c;
import java.util.Arrays;

public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public i(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        r.l("ApplicationId must be set.", ((boolean)(1 ^ (s == null || s.trim().isEmpty() ? 1 : 0))));
        this.b = s;
        this.a = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
    }

    public static i a(Context context0) {
        c c0 = new c(context0);
        String s = c0.f("google_app_id");
        return TextUtils.isEmpty(s) ? null : new i(s, c0.f("google_api_key"), c0.f("firebase_database_url"), c0.f("ga_trackingId"), c0.f("gcm_defaultSenderId"), c0.f("google_storage_bucket"), c0.f("project_id"));
    }

    // Deobfuscation rating: MEDIUM(80)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof i ? r.m(this.b, ((i)object0).b) && r.m(this.a, ((i)object0).a) && r.m(this.c, ((i)object0).c) && r.m(this.d, ((i)object0).d) && r.m(this.e, ((i)object0).e) && r.m(this.f, ((i)object0).f) && r.m(this.g, ((i)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    @Override
    public final String toString() {
        g1 g10 = new g1(this);
        g10.b(this.b, "applicationId");
        g10.b(this.a, "apiKey");
        g10.b(this.c, "databaseUrl");
        g10.b(this.e, "gcmSenderId");
        g10.b(this.f, "storageBucket");
        g10.b(this.g, "projectId");
        return g10.toString();
    }
}

