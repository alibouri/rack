package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import android.os.Parcelable;
import com.sendwave.shared.PhotoActivity;
import com.sendwave.shared.PhotoActivityParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class z1 extends j implements Function2 {
    public int c0;
    public final PhotoActivity d0;

    public z1(PhotoActivity photoActivity0, g g0) {
        this.d0 = photoActivity0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((z1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new z1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        PhotoActivity photoActivity0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(photoActivity0.S(this) == object1) {
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
        Parcelable parcelable0 = photoActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(PhotoActivity.class.getName() + " invoked with no params");
        }
        if(((PhotoActivityParams)parcelable0).j0) {
            photoActivity0.findViewById(0x7F0A01E3).setVisibility(0);  // id:more_pages_dialog
            photoActivity0.findViewById(0x7F0A01E2).setVisibility(0);  // id:more_pages_back
            return t.a;
        }
        photoActivity0.R();
        return t.a;
    }
}

