package la;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.N;
import Y8.R9;
import ac.B0;
import ac.h0;
import com.sendwave.backend.type.IdPhotoType.GOV_ID;
import com.sendwave.backend.type.IdPhotoType.GOV_ID_BACK;
import com.sendwave.shared.PhotoActivityResult;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;
import o9.F1;
import q9.r1;

public final class i extends j implements Function2 {
    public Object c0;
    public Object d0;
    public Object e0;
    public AtomicInteger f0;
    public int g0;
    public final la.j h0;

    public i(la.j j0, g g0) {
        this.h0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new i(this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        h0 h00;
        la.j j1;
        AtomicInteger atomicInteger0;
        PhotoActivityResult photoActivityResult0;
        h0 h01;
        Object object3;
        PhotoActivityResult photoActivityResult1;
        Object object4;
        Object object1 = a.X;
        Object object2 = t.a;
        la.j j0 = this.h0;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                j0.b0.d("click ID photo button", null);
                String s = r1.d(0x7F120414, new Object[0]);  // string:take_photo_of_your_id_front "Please take a photo of your ID"
                this.g0 = 1;
                object4 = F1.b(j0.c0, s, this);
                if(object4 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                object4 = object0;
                break;
            }
            case 2: {
                photoActivityResult1 = (PhotoActivityResult)this.c0;
                f.b0(object0);
                object3 = object0;
                goto label_39;
            }
            case 3: {
                atomicInteger0 = this.f0;
                j0 = (la.j)this.e0;
                h01 = (h0)this.d0;
                photoActivityResult0 = (PhotoActivityResult)this.c0;
                try {
                    f.b0(object0);
                    goto label_65;
                }
                catch(Throwable throwable0) {
                    h00 = h01;
                    goto label_83;
                }
            }
            case 4: {
                atomicInteger0 = (AtomicInteger)this.e0;
                j1 = (la.j)this.d0;
                h00 = (h0)this.c0;
                try {
                    f.b0(object0);
                    goto label_78;
                }
                catch(Throwable throwable0) {
                    goto label_83;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        photoActivityResult1 = (PhotoActivityResult)object4;
        if(photoActivityResult1 == null) {
            return object2;
        }
        String s1 = r1.d(0x7F120413, new Object[0]);  // string:take_photo_of_your_id_back "Please take a photo of the back of your ID"
        this.c0 = photoActivityResult1;
        this.g0 = 2;
        object3 = F1.b(j0.c0, s1, this);
        if(object3 == object1) {
            return object1;
        }
    label_39:
        photoActivityResult0 = (PhotoActivityResult)object3;
        if(photoActivityResult0 == null) {
            return object2;
        }
        B0 b00 = j0.d0;
        Map map0 = N.a;
        Object object5 = map0.get(b00);
        if(object5 == null) {
            object5 = b.E(0, map0, b00);
        }
        AtomicInteger atomicInteger1 = (AtomicInteger)object5;
        do {
            Object object6 = b00.getValue();
            ((Boolean)object6).getClass();
        }
        while(!b00.j(object6, Boolean.valueOf(atomicInteger1.incrementAndGet() > 0)));
        try {
            this.c0 = photoActivityResult0;
            this.d0 = b00;
            this.e0 = j0;
            this.f0 = atomicInteger1;
            this.g0 = 3;
            if(F1.e(j0.Y, photoActivityResult1, j0.Z.X, GOV_ID.X, this) == object1) {
                return object1;
            }
        }
        catch(Throwable throwable0) {
            h00 = b00;
            atomicInteger0 = atomicInteger1;
            goto label_83;
        }
        h01 = b00;
        atomicInteger0 = atomicInteger1;
        try {
        label_65:
            this.c0 = h01;
            this.d0 = j0;
            this.e0 = atomicInteger0;
            this.f0 = null;
            this.g0 = 4;
            if(F1.e(j0.Y, photoActivityResult0, j0.Z.X, GOV_ID_BACK.X, this) == object1) {
                return object1;
            }
        }
        catch(Throwable throwable0) {
            h00 = h01;
            goto label_83;
        }
        h00 = h01;
        j1 = j0;
        try {
        label_78:
            j1.b0.d("user ID photo upload initiated", null);
            h h0 = new h(false, j1, null);
            N.k(j1, j1.c0, true, h0);
            goto label_87;
        }
        catch(Throwable throwable0) {
        }
        do {
        label_83:
            Object object7 = ((B0)h00).getValue();
            ((Boolean)object7).getClass();
        }
        while(!((B0)h00).j(object7, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_87:
            Object object8 = ((B0)h00).getValue();
            ((Boolean)object8).getClass();
        }
        while(!((B0)h00).j(object8, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        return object2;
    }
}

