package L8;

import com.google.android.gms.internal.measurement.E1;

public final class e extends E1 {
    public final boolean c0;

    public e(c c0, boolean z) {
        super(c0);
        this.c0 = z;
    }

    public final a C() {
        b b0 = new b();
        b b1 = new b();
        b b2 = new b();
        b b3 = new b();
        a[] arr_a = (a[])this.Z;
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            if(a0 != null) {
                a0.c();
                int v1 = a0.e % 30;
                int v2 = this.c0 ? a0.f : a0.f + 2;
                switch(v2 % 3) {
                    case 0: {
                        b1.b(v1 * 3 + 1);
                        break;
                    }
                    case 1: {
                        b3.b(v1 / 3);
                        b2.b(v1 % 3);
                        break;
                    }
                    default: {
                        if(v2 % 3 == 2) {
                            b0.b(v1 + 1);
                        }
                    }
                }
            }
        }
        if(b0.a().length != 0 && b1.a().length != 0 && b2.a().length != 0 && b3.a().length != 0 && b0.a()[0] > 0 && b1.a()[0] + b2.a()[0] >= 3 && b1.a()[0] + b2.a()[0] <= 90) {
            a a1 = new a(b0.a()[0], b1.a()[0], b2.a()[0], b3.a()[0], 0);
            this.D(arr_a, a1);
            return a1;
        }
        return null;
    }

    public final void D(a[] arr_a, a a0) {
        for(int v = 0; v < arr_a.length; ++v) {
            a a1 = arr_a[v];
            if(a1 != null) {
                int v1 = a1.e % 30;
                int v2 = a1.f;
                if(v2 > a0.f) {
                    arr_a[v] = null;
                }
                else {
                    if(!this.c0) {
                        v2 += 2;
                    }
                    switch(v2 % 3) {
                        case 0: {
                            if(v1 * 3 + 1 != a0.d) {
                                arr_a[v] = null;
                            }
                            break;
                        }
                        case 1: {
                            if(v1 / 3 != a0.c || v1 % 3 != a0.e) {
                                arr_a[v] = null;
                            }
                            break;
                        }
                        default: {
                            if(v2 % 3 == 2 && v1 + 1 != a0.b) {
                                arr_a[v] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.E1
    public final String toString() {
        return "IsLeft: " + this.c0 + '\n' + super.toString();
    }
}

