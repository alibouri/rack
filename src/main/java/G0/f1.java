package G0;

import Pb.a;
import T4.l;
import Xb.J;
import Zb.i;
import ac.o0;
import ac.r0;
import ac.z0;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings.Global;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import dc.e;
import dc.o;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;

public abstract class f1 {
    public static final LinkedHashMap a;

    static {
        f1.a = new LinkedHashMap();
    }

    public static final z0 a(Context context0) {
        Object object0;
        LinkedHashMap linkedHashMap0 = f1.a;
        synchronized(linkedHashMap0) {
            object0 = linkedHashMap0.get(context0);
            if(object0 == null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                Uri uri0 = Settings.Global.getUriFor("animator_duration_scale");
                i i0 = l.i(-1, 6, null);
                object0 = o0.D(new N2.l(new d1(contentResolver0, uri0, new e1(i0, a.w(Looper.getMainLooper())), i0, context0, null)), new e(DefaultImpls.d(J.c(), o.a)), r0.a(3, 0L), Settings.Global.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f));
                linkedHashMap0.put(context0, object0);
            }
        }
        return (z0)object0;
    }

    public static final CompositionContext b(View view0) {
        Object object0 = view0.getTag(0x7F0A006C);  // id:androidx_compose_ui_view_composition_context
        return object0 instanceof CompositionContext ? ((CompositionContext)object0) : null;
    }
}

