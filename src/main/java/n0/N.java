package n0;

import android.graphics.ColorFilter;
import v1.r;

public final class n {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public n(long v, int v1, ColorFilter colorFilter0) {
        this.a = colorFilter0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        return v.c(this.b, ((n)object0).b) ? M.p(this.c, ((n)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.b) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("BlendModeColorFilter(color=");
        r.h(this.b, ", blendMode=", stringBuilder0);
        switch(this.c) {
            case 0: {
                s = "Clear";
                break;
            }
            case 1: {
                s = "Src";
                break;
            }
            case 2: {
                s = "Dst";
                break;
            }
            case 3: {
                s = "SrcOver";
                break;
            }
            case 4: {
                s = "DstOver";
                break;
            }
            case 5: {
                s = "SrcIn";
                break;
            }
            case 6: {
                s = "DstIn";
                break;
            }
            case 7: {
                s = "SrcOut";
                break;
            }
            case 8: {
                s = "DstOut";
                break;
            }
            case 9: {
                s = "SrcAtop";
                break;
            }
            case 10: {
                s = "DstAtop";
                break;
            }
            case 11: {
                s = "Xor";
                break;
            }
            case 12: {
                s = "Plus";
                break;
            }
            case 13: {
                s = "Modulate";
                break;
            }
            case 14: {
                s = "Screen";
                break;
            }
            case 15: {
                s = "Overlay";
                break;
            }
            case 16: {
                s = "Darken";
                break;
            }
            case 17: {
                s = "Lighten";
                break;
            }
            case 18: {
                s = "ColorDodge";
                break;
            }
            case 19: {
                s = "ColorBurn";
                break;
            }
            case 20: {
                s = "HardLight";
                break;
            }
            case 21: {
                s = "Softlight";
                break;
            }
            case 22: {
                s = "Difference";
                break;
            }
            case 23: {
                s = "Exclusion";
                break;
            }
            case 24: {
                s = "Multiply";
                break;
            }
            case 25: {
                s = "Hue";
                break;
            }
            case 26: {
                s = "Saturation";
                break;
            }
            case 27: {
                s = "Color";
                break;
            }
            case 28: {
                s = "Luminosity";
                break;
            }
            default: {
                s = "Unknown";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

