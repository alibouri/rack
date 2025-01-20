package I2;

import A3.e;
import Nb.j;
import Nb.k;
import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function1;

public final class l extends k implements Function1 {
    public static final l X;

    static {
        l.X = new l(1);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((Map.Entry)object0), "<name for destructuring parameter 0>");
        String s = (String)((Map.Entry)object0).getKey();
        Object object1 = ((Map.Entry)object0).getValue();
        StringBuilder stringBuilder0 = e.w(s, " : ");
        if(object1 instanceof Object[]) {
            object1 = Arrays.toString(((Object[])object1));
            j.e(object1, "toString(this)");
        }
        stringBuilder0.append(object1);
        return stringBuilder0.toString();
    }
}

