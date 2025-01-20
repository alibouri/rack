package n3;

import R2.m;
import java.util.HashMap;
import java.util.regex.Pattern;

public abstract class c {
    public static final m a;

    static {
        m m0 = new m();  // initializer: Ljava/lang/Object;-><init>()V
        m0.X = new HashMap();
        m0.Y = new HashMap();
        m0.Z = new HashMap();
        m0.b0 = Pattern.compile("[/*?\\[\\]]");
        try {
            m0.s();
            m0.r();
            c.a = m0;
        }
        catch(a unused_ex) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }
}

