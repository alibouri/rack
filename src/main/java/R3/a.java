package r3;

import E3.d;
import E3.l;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import s.K;
import s.f;
import s.o;

public final class a {
    public final p a;
    public final HashSet b;
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public K h;
    public o i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public int p;

    public a() {
        p p0 = new p();  // initializer: Ljava/lang/Object;-><init>()V
        new f(0);
        new HashMap();
        this.a = p0;
        this.b = new HashSet();
        this.p = 0;
    }

    public final void a(String s) {
        d.b(s);
        this.b.add(s);
    }

    public final float b() {
        return (float)(((long)((this.m - this.l) / this.n * 1000.0f)));
    }

    public final Map c() {
        float f = l.c();
        if(f != this.e) {
            for(Object object0: this.d.entrySet()) {
                HashMap hashMap0 = this.d;
                String s = (String)((Map.Entry)object0).getKey();
                r3.l l0 = (r3.l)((Map.Entry)object0).getValue();
                float f1 = this.e / f;
                int v = (int)(((float)l0.a) * f1);
                int v1 = (int)(((float)l0.b) * f1);
                r3.l l1 = new r3.l(v, v1, l0.c, l0.d, l0.e);
                Bitmap bitmap0 = l0.f;
                if(bitmap0 != null) {
                    l1.f = Bitmap.createScaledBitmap(bitmap0, v, v1, true);
                }
                hashMap0.put(s, l1);
            }
        }
        this.e = f;
        return this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LottieComposition:\n");
        for(Object object0: this.j) {
            stringBuilder0.append(((A3.f)object0).a("\t"));
        }
        return stringBuilder0.toString();
    }
}

