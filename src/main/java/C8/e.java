package c8;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import a8.Q;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

public final class e extends j implements Function2 {
    public int c0;
    public final Q d0;
    public final Object e0;
    public final b f0;
    public final c g0;

    public e(Q q0, Map map0, b b0, c c0, g g0) {
        this.d0 = q0;
        this.e0 = map0;
        this.f0 = b0;
        this.g0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.d0, ((Map)this.e0), this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        c c0 = this.g0;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    URLConnection uRLConnection0 = Q.e(this.d0).openConnection();
                    Nb.j.d(uRLConnection0, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    ((HttpsURLConnection)uRLConnection0).setRequestMethod("GET");
                    ((HttpsURLConnection)uRLConnection0).setRequestProperty("Accept", "application/json");
                    for(Object object3: ((Map)this.e0).entrySet()) {
                        ((HttpsURLConnection)uRLConnection0).setRequestProperty(((String)((Map.Entry)object3).getKey()), ((String)((Map.Entry)object3).getValue()));
                    }
                    int v = ((HttpsURLConnection)uRLConnection0).getResponseCode();
                    if(v == 200) {
                        InputStream inputStream0 = ((HttpsURLConnection)uRLConnection0).getInputStream();
                        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
                        StringBuilder stringBuilder0 = new StringBuilder();
                        String s;
                        while((s = bufferedReader0.readLine()) != null) {
                            stringBuilder0.append(s);
                        }
                        bufferedReader0.close();
                        inputStream0.close();
                        this.c0 = 1;
                        return this.f0.j(new JSONObject(stringBuilder0.toString()), this) == object1 ? object1 : object2;
                    }
                    this.c0 = 2;
                    c0.j("Bad response code: " + v, this);
                    return object2 == object1 ? object1 : object2;
                label_31:
                    f.b0(object0);
                    return object2;
                }
                catch(Exception exception0) {
                    this.c0 = 3;
                    c0.j((exception0.getMessage() == null ? exception0.toString() : exception0.getMessage()), this);
                    return object2 == object1 ? object1 : object2;
                }
            }
            case 1: 
            case 2: {
                goto label_31;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

