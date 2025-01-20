package P4;

import Bb.K;
import M4.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class j {
    public static final HashSet a;
    public static final HashSet b;
    public static i c;
    public static List d;
    public static int e;

    static {
        j.a = K.J(new Integer[]{200, 202});
        j.b = K.J(new Integer[]{503, 504, 429});
    }

    public static final void a(String s, String s1, String s2) {
        Nb.j.f(s1, "url");
        io.sentry.hints.i.D(y.b0, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", new Object[]{s, s1, s2});
        j.c = new i(s, s1, s2);
        j.d = new ArrayList();
    }

    public static List b() {
        List list0 = j.d;
        if(list0 != null) {
            return list0;
        }
        Nb.j.p("transformedEvents");
        throw null;
    }
}

