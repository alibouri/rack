package r8;

import m5.b;

public class o {
    public final float a;
    public final float b;

    public o(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public static float a(o o0, o o1) {
        float f = o0.a - o1.a;
        float f1 = o0.b - o1.b;
        return (float)Math.sqrt(f1 * f1 + f * f);
    }

    public static void b(o[] arr_o) {
        o o2;
        o o1;
        o o0;
        float f = o.a(arr_o[0], arr_o[1]);
        float f1 = o.a(arr_o[1], arr_o[2]);
        float f2 = o.a(arr_o[0], arr_o[2]);
        if(f1 >= f && f1 >= f2) {
            o0 = arr_o[0];
            o1 = arr_o[1];
            o2 = arr_o[2];
        }
        else if(f2 < f1 || f2 < f) {
            o0 = arr_o[2];
            o1 = arr_o[0];
            o2 = arr_o[1];
        }
        else {
            o0 = arr_o[1];
            o1 = arr_o[0];
            o2 = arr_o[2];
        }
        if((o1.b - o0.b) * (o2.a - o0.a) - (o1.a - o0.a) * (o2.b - o0.b) < 0.0f) {
            o o3 = o2;
            o2 = o1;
            o1 = o3;
        }
        arr_o[0] = o1;
        arr_o[1] = o0;
        arr_o[2] = o2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof o && this.a == ((o)object0).a && this.b == ((o)object0).b;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        stringBuilder0.append(this.a);
        stringBuilder0.append(',');
        return b.x(stringBuilder0, this.b, ')');
    }
}

