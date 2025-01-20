package B2;

import android.animation.TypeEvaluator;
import m5.b;

public final class g implements TypeEvaluator {
    public static final g a;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object object0, Object object1) {
        int v = (int)(((Integer)object0));
        float f1 = ((float)(v >> 24 & 0xFF)) / 255.0f;
        int v1 = (int)(((Integer)object1));
        float f2 = (float)Math.pow(((float)(v >> 16 & 0xFF)) / 255.0f, 2.2);
        float f3 = (float)Math.pow(((float)(v >> 8 & 0xFF)) / 255.0f, 2.2);
        float f4 = (float)Math.pow(((float)(v & 0xFF)) / 255.0f, 2.2);
        return (int)(Math.round(((float)Math.pow(b.o(((float)Math.pow(((float)(v1 & 0xFF)) / 255.0f, 2.2)), f4, f, f4), 0.454545)) * 255.0f) | (Math.round(((float)Math.pow(b.o(((float)Math.pow(((float)(v1 >> 16 & 0xFF)) / 255.0f, 2.2)), f2, f, f2), 0.454545)) * 255.0f) << 16 | Math.round(b.o(((float)(v1 >> 24 & 0xFF)) / 255.0f, f1, f, f1) * 255.0f) << 24 | Math.round(((float)Math.pow(b.o(((float)Math.pow(((float)(v1 >> 8 & 0xFF)) / 255.0f, 2.2)), f3, f, f3), 0.454545)) * 255.0f) << 8));
    }
}

