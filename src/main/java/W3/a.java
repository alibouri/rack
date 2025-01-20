package w3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;
import r3.l;

public final class a {
    public final Context a;
    public final String b;
    public final Map c;
    public static final Object d;

    static {
        a.d = new Object();
    }

    public a(Drawable.Callback drawable$Callback0, Map map0) {
        if(!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.b = null;
        this.c = map0;
        if(!(drawable$Callback0 instanceof View)) {
            this.a = null;
            return;
        }
        this.a = ((View)drawable$Callback0).getContext().getApplicationContext();
    }

    public final void a(String s, Bitmap bitmap0) {
        synchronized(a.d) {
            ((l)this.c.get(s)).f = bitmap0;
        }
    }
}

