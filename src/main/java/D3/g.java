package d3;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y2.c;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache.Key;
import g3.b;
import i3.i;
import i3.m;
import i3.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import m3.l;

public final class g extends j implements Function2 {
    public int c0;
    public final h d0;
    public final i e0;
    public final Object f0;
    public final m g0;
    public final c h0;
    public final MemoryCache.Key i0;
    public final d3.j j0;

    public g(h h0, i i0, Object object0, m m0, c c0, MemoryCache.Key memoryCache$Key0, d3.j j0, kotlin.coroutines.g g0) {
        this.d0 = h0;
        this.e0 = i0;
        this.f0 = object0;
        this.g0 = m0;
        this.h0 = c0;
        this.i0 = memoryCache$Key0;
        this.j0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        boolean z;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = h.b(this.d0, this.e0, this.f0, this.g0, this.h0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l l0 = this.d0.b;
        synchronized(l0) {
            Y2.m m0 = (Y2.m)l0.X.get();
            if(m0 == null) {
                l0.b();
            }
            else if(l0.Y == null) {
                l0.Y = m0.a;
                m0.a.registerComponentCallbacks(l0);
            }
        }
        b b0 = this.d0.d;
        MemoryCache.Key memoryCache$Key0 = this.i0;
        if(this.e0.p.Y) {
            g3.c c0 = (g3.c)((Y2.m)b0.Y).c.getValue();
            if(c0 == null || memoryCache$Key0 == null) {
                z = false;
            }
            else {
                Drawable drawable0 = ((d3.a)object0).a;
                BitmapDrawable bitmapDrawable0 = drawable0 instanceof BitmapDrawable ? ((BitmapDrawable)drawable0) : null;
                if(bitmapDrawable0 == null) {
                    z = false;
                }
                else {
                    Bitmap bitmap0 = bitmapDrawable0.getBitmap();
                    if(bitmap0 == null) {
                        z = false;
                    }
                    else {
                        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                        linkedHashMap0.put("coil#is_sampled", Boolean.valueOf(((d3.a)object0).b));
                        String s = ((d3.a)object0).d;
                        if(s != null) {
                            linkedHashMap0.put("coil#disk_cache_key", s);
                        }
                        Map map0 = N4.h.O(memoryCache$Key0.Y);
                        MemoryCache.Key memoryCache$Key1 = new MemoryCache.Key(memoryCache$Key0.X, map0);
                        Map map1 = N4.h.O(linkedHashMap0);
                        c0.a.d(memoryCache$Key1, bitmap0, map1);
                        z = true;
                    }
                }
            }
        }
        else {
            z = false;
        }
        Drawable drawable1 = ((d3.a)object0).a;
        a3.f f0 = ((d3.a)object0).c;
        MemoryCache.Key memoryCache$Key2 = z ? this.i0 : null;
        String s1 = ((d3.a)object0).d;
        boolean z1 = ((d3.a)object0).b;
        return !(this.j0 instanceof d3.j) || !this.j0.g ? new p(drawable1, this.e0, f0, memoryCache$Key2, s1, z1, false) : new p(drawable1, this.e0, f0, memoryCache$Key2, s1, z1, true);
    }
}

