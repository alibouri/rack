package zc;

import Bb.F;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import pc.v;
import xc.f;

public abstract class d {
    public static final CopyOnWriteArraySet a;
    public static final Map b;

    static {
        d.a = new CopyOnWriteArraySet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Class class0 = v.class;
        Package package0 = class0.getPackage();
        String s = package0 == null ? null : package0.getName();
        if(s != null) {
            linkedHashMap0.put(s, "OkHttp");
        }

        linkedHashMap0.put(class0.getName(), "okhttp.OkHttpClient");
        linkedHashMap0.put(f.class.getName(), "okhttp.Http2");
        linkedHashMap0.put(tc.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap0.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        d.b = F.X(linkedHashMap0);
    }
}

