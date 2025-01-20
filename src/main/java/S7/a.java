package s7;

import java.util.Map.Entry;
import q7.b;
import q7.d;
import q7.e;
import t7.f;

public final class a implements d {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                throw new b("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            case 1: {
                Object object2 = ((Map.Entry)object0).getKey();
                ((e)object1).a(f.g, object2);
                Object object3 = ((Map.Entry)object0).getValue();
                ((e)object1).a(f.h, object3);
                return;
            }
            default: {
                throw new b("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }
}

