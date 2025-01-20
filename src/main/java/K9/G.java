package K9;

import Ab.k;
import Ab.t;
import Fb.j;
import Nb.s;
import Vb.h;
import W5.f;
import kotlin.jvm.functions.Function3;
import q9.r1;

public final class g extends j implements Function3 {
    public final int c0;
    public boolean d0;
    public String e0;
    public final Object f0;

    public g(Object object0, kotlin.coroutines.g g0, int v) {
        this.c0 = v;
        this.f0 = object0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        switch(this.c0) {
            case 0: {
                g g1 = new g(((i)this.f0), ((kotlin.coroutines.g)object2), 0);
                g1.d0 = z;
                g1.e0 = (String)object1;
                return g1.v(t.a);
            }
            case 1: {
                g g2 = new g(((i)this.f0), ((kotlin.coroutines.g)object2), 1);
                g2.d0 = z;
                g2.e0 = (String)object1;
                return g2.v(t.a);
            }
            default: {
                g g0 = new g(((s)this.f0), ((kotlin.coroutines.g)object2), 2);
                g0.d0 = z;
                g0.e0 = (String)object1;
                return g0.v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        boolean z = true;
        Object object1 = this.f0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                return this.d0 && !i.o(((i)object1), this.e0) ? r1.d(0x7F12034B, new Object[0]) : null;  // string:please_enter_valid_phone "Please enter a valid phone number"
            }
            case 1: {
                f.b0(object0);
                boolean z3 = this.d0;
                String s = this.e0;
                if(s == null) {
                    String s1 = r1.d(0x7F12034B, new Object[0]);  // string:please_enter_valid_phone "Please enter a valid phone number"
                    if(z3) {
                        return s1;
                    }
                }
                else {
                    Object object2 = null;
                    for(Object object3: ((i)object1).e0) {
                        if(((h)((k)object3).Y).c(s)) {
                            object2 = object3;
                            break;
                        }
                    }
                    if(((k)object2) != null) {
                        return r1.d(0x7F120417, new Object[]{((k)object2).X});  // string:telco_airtime_purchase_unavailable_message "Sorry, %s airtime purchase is 
                                                                                // currently unavailable."
                    }
                }
                return null;
            }
            default: {
                f.b0(object0);
                boolean z1 = this.d0;
                boolean z2 = ((s)object1).X || this.e0.length() > 0;
                ((s)object1).X = z2;
                if(!z1 || !z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
    }
}

