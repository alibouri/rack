package P0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

public abstract class z {
    public static final x a;
    public static final long b;

    static {
        z.a = new x();  // initializer: Landroid/graphics/Canvas;-><init>()V
        z.b = 0L;
    }

    public static final TextDirectionHeuristic a(int v) {
        switch(v) {
            case 0: {
                return TextDirectionHeuristics.LTR;
            }
            case 1: {
                return TextDirectionHeuristics.RTL;
            }
            case 2: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 3: {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            case 4: {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            case 5: {
                return TextDirectionHeuristics.LOCALE;
            }
            default: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }
    }
}

