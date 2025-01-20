package c8;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.w;
import W1.e;
import W5.f;
import android.util.Log;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends j implements Function2 {
    public w c0;
    public w d0;
    public int e0;
    public Object f0;
    public final d g0;

    public b(d d0, g g0) {
        this.g0 = d0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b)this.t(((JSONObject)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new b(this.g0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object11;
        w w4;
        w w3;
        Boolean boolean0;
        w w1;
        Object object1 = a.X;
        Object object2 = t.a;
        e e0 = n.f;
        n n0 = this.g0.d;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                JSONObject jSONObject0 = (JSONObject)this.f0;
                Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject0);
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w w2 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                if(jSONObject0.has("app_quality")) {
                    Object object3 = jSONObject0.get("app_quality");
                    Nb.j.d(object3, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject1 = (JSONObject)object3;
                    try {
                        boolean0 = jSONObject1.has("sessions_enabled") ? ((Boolean)jSONObject1.get("sessions_enabled")) : null;
                    }
                    catch(JSONException jSONException0) {
                        boolean0 = null;
                        goto label_34;
                    }
                    try {
                        if(jSONObject1.has("sampling_rate")) {
                            w0.X = (Double)jSONObject1.get("sampling_rate");
                        }
                        if(jSONObject1.has("session_timeout_seconds")) {
                            w1.X = (Integer)jSONObject1.get("session_timeout_seconds");
                        }
                        if(jSONObject1.has("cache_duration")) {
                            w2.X = (Integer)jSONObject1.get("cache_duration");
                        }
                        goto label_37;
                    }
                    catch(JSONException jSONException0) {
                    }
                label_34:
                    Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", jSONException0);
                }
                else {
                    boolean0 = null;
                }
            label_37:
                if(boolean0 == null) {
                    w4 = w0;
                    w3 = w2;
                }
                else {
                    this.f0 = w0;
                    this.c0 = w1;
                    this.d0 = w2;
                    this.e0 = 1;
                    Object object4 = n0.c(n.c, boolean0, this);
                    if(object4 != a.X) {
                        object4 = object2;
                    }
                    if(object4 == object1) {
                        return object1;
                    }
                    w3 = w2;
                    w1 = w1;
                    w4 = w0;
                }
                goto label_60;
            }
            case 1: {
                w3 = this.d0;
                w w5 = this.c0;
                w w6 = (w)this.f0;
                f.b0(object0);
                w1 = w5;
                w4 = w6;
            label_60:
                Object object5 = w1.X;
                if(((Integer)object5) != null) {
                    this.f0 = w4;
                    this.c0 = w3;
                    this.d0 = null;
                    this.e0 = 2;
                    Object object6 = n0.c(n.e, ((Integer)object5), this);
                    if(object6 != a.X) {
                        object6 = object2;
                    }
                    if(object6 == object1) {
                        return object1;
                    }
                }
                goto label_74;
            }
            case 2: {
                w3 = this.c0;
                w4 = (w)this.f0;
                f.b0(object0);
            label_74:
                Object object7 = w4.X;
                if(((Double)object7) != null) {
                    this.f0 = w3;
                    this.c0 = null;
                    this.d0 = null;
                    this.e0 = 3;
                    Object object8 = n0.c(n.d, ((Double)object7), this);
                    if(object8 != a.X) {
                        object8 = object2;
                    }
                    if(object8 == object1) {
                        return object1;
                    }
                }
                goto label_87;
            }
            case 3: {
                w3 = (w)this.f0;
                f.b0(object0);
            label_87:
                Object object9 = w3.X;
                if(((Integer)object9) == null) {
                    object11 = null;
                }
                else {
                    this.f0 = null;
                    this.c0 = null;
                    this.d0 = null;
                    this.e0 = 4;
                    Object object10 = n0.c(e0, ((Integer)object9), this);
                    if(object10 != a.X) {
                        object10 = object2;
                    }
                    if(object10 == object1) {
                        return object1;
                    }
                    object11 = object2;
                }
                goto label_104;
            }
            case 4: {
                f.b0(object0);
                object11 = object2;
            label_104:
                if(object11 == null) {
                    this.f0 = null;
                    this.c0 = null;
                    this.d0 = null;
                    this.e0 = 5;
                    Object object12 = n0.c(e0, new Integer(86400), this);
                    if(object12 != a.X) {
                        object12 = object2;
                    }
                    if(object12 == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 5: {
                f.b0(object0);
                break;
            }
            case 6: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.f0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = 6;
        Object object13 = n0.c(n.g, new Long(System.currentTimeMillis()), this);
        if(object13 != a.X) {
            object13 = object2;
        }
        return object13 == object1 ? object1 : object2;
    }
}

