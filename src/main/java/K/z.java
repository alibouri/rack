package K;

import Nb.h;
import android.view.View;
import kotlin.jvm.functions.Function1;

public final class z extends h implements Function1 {
    public static final z g0;

    static {
        z.g0 = new z(1, v.class, "<init>", "<init>(Landroid/view/View;)V", 0);  // initializer: LNb/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return new v(((View)object0));
    }
}

