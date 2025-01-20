package M4;

import Bb.n;
import Nb.j;
import Vb.q;
import a5.w;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import io.sentry.hints.i;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class t {
    public final AccessToken a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public String e;
    public final String f;
    public p g;
    public x h;
    public boolean i;
    public static final String j;
    public static final Pattern k;
    public static volatile String l;

    static {
        char[] arr_c = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        j.e(arr_c, "(this as java.lang.String).toCharArray()");
        StringBuilder stringBuilder0 = new StringBuilder();
        SecureRandom secureRandom0 = new SecureRandom();
        int v = secureRandom0.nextInt(11);
        if(v + 30 > 0) {
            int v1 = 0;
            while(true) {
                ++v1;
                stringBuilder0.append(arr_c[secureRandom0.nextInt(arr_c.length)]);
                if(v1 >= v + 30) {
                    break;
                }
            }
        }
        String s = stringBuilder0.toString();
        j.e(s, "buffer.toString()");
        t.j = s;
        t.k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public t(AccessToken accessToken0, String s, Bundle bundle0, x x0, p p0) {
        this.a = accessToken0;
        this.b = s;
        this.f = null;
        this.j(p0);
        if(x0 == null) {
            x0 = x.X;
        }
        this.h = x0;
        this.d = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        Arrays.copyOf(new Object[]{l.k}, 1);
        this.f = l.k;
    }

    public final void a() {
        Bundle bundle0 = this.d;
        String s = this.e();
        boolean z = s == null ? false : Vb.j.R(s, "|", false);
        int v = 1;
        if(s != null && q.O(s, "IG", false) && !z && this.i()) {
            bundle0.putString("access_token", t.f());
        }
        else {
            if(j.a(l.d(), "instagram.com")) {
                v = true ^ this.i();
            }
            if(v != 0 || z) {
                String s1 = this.e();
                if(s1 != null) {
                    bundle0.putString("access_token", s1);
                }
            }
            else {
                bundle0.putString("access_token", t.f());
            }
        }
        if(!bundle0.containsKey("access_token")) {
            N4.j.J();
            String s2 = l.f;
            if(s2 == null) {
                throw new h("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
            if(w.P(s2)) {
                Log.w("t", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle0.putString("sdk", "android");
        bundle0.putString("format", "json");
    }

    public final String b(String s, boolean z) {
        if(!z && this.h == x.Y) {
            return s;
        }
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        for(Object object0: this.d.keySet()) {
            String s1 = (String)object0;
            Object object1 = this.d.get(s1);
            if(object1 == null) {
                object1 = "";
            }
            if(i.B(object1)) {
                uri$Builder0.appendQueryParameter(s1, i.k(object1).toString());
            }
            else {
                if(this.h != x.X) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{object1.getClass().getSimpleName()}, 1)));
                }
                if(false) {
                    break;
                }
            }
        }
        String s2 = uri$Builder0.toString();
        j.e(s2, "uriBuilder.toString()");
        return s2;
    }

    public final M4.w c() {
        ArrayList arrayList0 = i.p(new v(n.y0(new t[]{this})));
        if(arrayList0.size() != 1) {
            throw new h("invalid state: expected a single response");
        }
        return (M4.w)arrayList0.get(0);
    }

    public final void d() {
        v v0 = new v(n.y0(new t[]{this}));
        N4.j.C(v0);
        new u(v0).executeOnExecutor(l.c(), new Void[0]);
    }

    public final String e() {
        AccessToken accessToken0 = this.a;
        if(accessToken0 != null) {
            if(!this.d.containsKey("access_token")) {
                a5.q.c.K(accessToken0.c0);
                return accessToken0.c0;
            }
            return this.d.getString("access_token");
        }
        return this.d.containsKey("access_token") ? this.d.getString("access_token") : t.f();
    }

    public static String f() {
        String s = l.b();
        N4.j.J();
        String s1 = l.f;
        if(s1 == null) {
            throw new h("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        return s.length() <= 0 || s1.length() <= 0 ? null : s + '|' + s1;
    }

    public final String g() {
        String s;
        if(this.h != x.Y || (this.b == null || !q.I(this.b, "/videos", false))) {
            String s1 = l.d();
            j.f(s1, "subdomain");
            s = String.format("https://graph.%s", Arrays.copyOf(new Object[]{s1}, 1));
        }
        else {
            s = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{l.d()}, 1));
        }
        String s2 = this.h(s);
        this.a();
        return this.b(s2, false);
    }

    public final String h(String s) {
        int v = j.a(l.d(), "instagram.com") ? !this.i() : 1;
        if(v == 0) {
            s = String.format("https://graph.%s", Arrays.copyOf(new Object[]{l.m}, 1));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{s, (t.k.matcher(this.b).matches() ? this.b : String.format("%s/%s", Arrays.copyOf(new Object[]{this.f, this.b}, 2)))}, 2));
    }

    public final boolean i() {
        String s = this.b;
        if(s == null) {
            return false;
        }
        String s1 = "^/?" + l.b() + "/?.*";
        return this.i || Pattern.matches(s1, s) || Pattern.matches("^/?app/?.*", s);
    }

    public final void j(p p0) {
        synchronized(l.b) {
        }
        this.g = p0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("{Request:  accessToken: ");
        AccessToken accessToken0 = this.a;
        if(accessToken0 == null) {
            accessToken0 = "null";
        }
        stringBuilder0.append(accessToken0);
        stringBuilder0.append(", graphPath: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", graphObject: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", httpMethod: ");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", parameters: ");
        stringBuilder0.append(this.d);
        stringBuilder0.append("}");
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return s;
    }
}

