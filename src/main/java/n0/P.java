package n0;

import android.graphics.BlendModeColorFilter;

public final class p {
    public static final p a;

    static {
        p.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final BlendModeColorFilter a(long v, int v1) {
        return o.d(M.G(v), M.B(v1));
    }

    public final n b(BlendModeColorFilter blendModeColorFilter0) {
        long v = M.c(blendModeColorFilter0.getColor());
        switch(b.a[blendModeColorFilter0.getMode().ordinal()]) {
            case 1: {
                return new n(v, 0, blendModeColorFilter0);
            }
            case 2: {
                return new n(v, 1, blendModeColorFilter0);
            }
            case 3: {
                return new n(v, 2, blendModeColorFilter0);
            }
            case 5: {
                return new n(v, 4, blendModeColorFilter0);
            }
            case 6: {
                return new n(v, 5, blendModeColorFilter0);
            }
            case 7: {
                return new n(v, 6, blendModeColorFilter0);
            }
            case 8: {
                return new n(v, 7, blendModeColorFilter0);
            }
            case 9: {
                return new n(v, 8, blendModeColorFilter0);
            }
            case 10: {
                return new n(v, 9, blendModeColorFilter0);
            }
            case 11: {
                return new n(v, 10, blendModeColorFilter0);
            }
            case 12: {
                return new n(v, 11, blendModeColorFilter0);
            }
            case 13: {
                return new n(v, 12, blendModeColorFilter0);
            }
            case 14: {
                return new n(v, 13, blendModeColorFilter0);
            }
            case 15: {
                return new n(v, 14, blendModeColorFilter0);
            }
            case 16: {
                return new n(v, 15, blendModeColorFilter0);
            }
            case 17: {
                return new n(v, 16, blendModeColorFilter0);
            }
            case 18: {
                return new n(v, 17, blendModeColorFilter0);
            }
            case 19: {
                return new n(v, 18, blendModeColorFilter0);
            }
            case 20: {
                return new n(v, 19, blendModeColorFilter0);
            }
            case 21: {
                return new n(v, 20, blendModeColorFilter0);
            }
            case 22: {
                return new n(v, 21, blendModeColorFilter0);
            }
            case 23: {
                return new n(v, 22, blendModeColorFilter0);
            }
            case 24: {
                return new n(v, 23, blendModeColorFilter0);
            }
            case 25: {
                return new n(v, 24, blendModeColorFilter0);
            }
            case 26: {
                return new n(v, 25, blendModeColorFilter0);
            }
            case 27: {
                return new n(v, 26, blendModeColorFilter0);
            }
            case 28: {
                return new n(v, 27, blendModeColorFilter0);
            }
            case 29: {
                return new n(v, 28, blendModeColorFilter0);
            }
            default: {
                return new n(v, 3, blendModeColorFilter0);
            }
        }
    }
}

