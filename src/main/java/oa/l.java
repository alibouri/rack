package oa;

import Bb.r;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.H6;
import Y8.N;
import Y8.R6;
import Y8.R9;
import Y8.q3;
import Y8.r3;
import Y8.s3;
import Y8.y6;
import a9.i4;
import ac.B0;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.LinkedAccountKind;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class l extends j implements Function2 {
    public B0 c0;
    public t d0;
    public AtomicInteger e0;
    public int f0;
    public Object g0;
    public final t h0;

    public l(t t0, g g0) {
        this.h0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((R9)object0), ((g)object1))).v(Ab.t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new l(this.h0, g0);
        g1.g0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        AtomicInteger atomicInteger1;
        t t1;
        R9 r91;
        B0 b01;
        Object object4;
        AtomicInteger atomicInteger0;
        Object object1 = a.X;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.g0;
                t t0 = this.h0;
                B0 b00 = t0.g0;
                Map map0 = N.a;
                Object object2 = map0.get(b00);
                if(object2 == null) {
                    object2 = b.E(0, map0, b00);
                }
                atomicInteger0 = (AtomicInteger)object2;
                do {
                    Object object3 = b00.getValue();
                    ((Boolean)object3).getClass();
                }
                while(!b00.j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    s3 s30 = new s3();  // initializer: Ljava/lang/Object;-><init>()V
                    this.g0 = r90;
                    this.c0 = b00;
                    this.d0 = t0;
                    this.e0 = atomicInteger0;
                    this.f0 = 1;
                    object4 = R6.d(t0.Y, s30, H6.b0, null, this, 4);
                }
                catch(Throwable throwable0) {
                    b01 = b00;
                    goto label_78;
                }
                if(object4 == object1) {
                    return object1;
                }
                r91 = r90;
                t1 = t0;
                b01 = b00;
                break;
            }
            case 1: {
                atomicInteger1 = this.e0;
                t1 = this.d0;
                b01 = this.c0;
                r91 = (R9)this.g0;
                try {
                    f.b0(object0);
                    atomicInteger0 = atomicInteger1;
                    object4 = object0;
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_79;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            r3 r30 = ((q3)((y6)object4).b).a;
            N.l(r30, r91.a);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object5: r30.b.b) {
                LinkedAccountKind linkedAccountKind0 = ((i4)object5).b.c;
                Object object6 = linkedHashMap0.get(linkedAccountKind0);
                if(object6 == null) {
                    object6 = new ArrayList();
                    linkedHashMap0.put(linkedAccountKind0, object6);
                }
                ((List)object6).add(object5);
            }
            Cb.g g0 = new Cb.g();
            for(Object object7: linkedHashMap0.entrySet()) {
                LinkedAccountKind linkedAccountKind1 = (LinkedAccountKind)((Map.Entry)object7).getKey();
                Iterable iterable0 = (List)((Map.Entry)object7).getValue();
                ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
                for(Object object8: iterable0) {
                    String s = t1.Z.h(((i4)object8).b.d);
                    FragmentHandle fragmentHandle0 = ((y6)object4).a(((i4)object8).b);
                    arrayList0.add(new oa.b(((i4)object8).b.b, s, ((i4)object8).b.c, fragmentHandle0));
                }
                g0.put(linkedAccountKind1, arrayList0);
            }
            Cb.g g1 = g0.b();
            B0 b02 = t1.h0;
            do {
                Object object9 = b02.getValue();
                Map map1 = (Map)object9;
            }
            while(!b02.j(object9, g1));
            goto label_83;
        label_78:
            atomicInteger1 = atomicInteger0;
        }
        catch(Throwable throwable0) {
            goto label_78;
        }
        do {
        label_79:
            Object object10 = b01.getValue();
            ((Boolean)object10).getClass();
        }
        while(!b01.j(object10, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_83:
            Object object11 = b01.getValue();
            ((Boolean)object11).getClass();
        }
        while(!b01.j(object11, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        return Ab.t.a;
    }
}

