package v;

import io.sentry.config.a;
import m5.b;
import n0.M;

public final class u implements y {
    public final float X;
    public final float Y;
    public final float Z;
    public final float b0;
    public final float c0;

    public u(float f, float f1, float f2) {
        int v1;
        this.X = f;
        this.Y = f1;
        this.Z = f2;
        if(Float.isNaN(f) || Float.isNaN(f1) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f1 + ", " + f2 + ", 1.0.");
        }
        float[] arr_f = new float[5];
        float f3 = (f1 - 0.0f) * 3.0f;
        float f4 = (1.0f - f1) * 3.0f;
        double f5 = ((double)f3) - ((double)f4) * 2.0 + 0.0;
        if(Double.compare(f5, 0.0) != 0) {
            double f6 = Math.sqrt(((double)f4) * ((double)f4) - 0.0 * ((double)f3));
            double f7 = -((double)f3) + ((double)f4);
            int v2 = M.M(((float)(-(-f6 + f7) / f5)), arr_f, 0);
            v1 = M.M(((float)((-f6 - f7) / f5)), arr_f, v2) + v2;
            if(v1 > 1) {
                float f8 = arr_f[0];
                float f9 = arr_f[1];
                if(f8 > f9) {
                    arr_f[0] = f9;
                    arr_f[1] = f8;
                }
                else if(f8 == f9) {
                    --v1;
                }
            }
        }
        else if(((double)f4) == 0.0) {
            v1 = 0;
        }
        else {
            v1 = M.M(((float)((((double)f4) * 2.0 - 0.0) / (((double)f4) * 2.0 - 0.0))), arr_f, 0);
        }
        float f10 = (f4 - f3) * 2.0f;
        int v3 = M.M(-f10 / ((0.0f - f4) * 2.0f - f10), arr_f, v1);
        float f11 = Math.min(0.0f, 1.0f);
        float f12 = Math.max(0.0f, 1.0f);
        for(int v = 0; v < v3 + v1; ++v) {
            float f13 = arr_f[v];
            float f14 = ((((f1 - 1.0f) * 3.0f + 1.0f - 0.0f) * f13 + (1.0f - f1 * 2.0f + 0.0f) * 3.0f) * f13 + f3) * f13 + 0.0f;
            f11 = Math.min(f11, f14);
            f12 = Math.max(f12, f14);
        }
        long v4 = ((long)Float.floatToRawIntBits(f11)) << 0x20 | ((long)Float.floatToRawIntBits(f12)) & 0xFFFFFFFFL;
        this.b0 = Float.intBitsToFloat(((int)(v4 >> 0x20)));
        this.c0 = Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL)));
    }

    @Override  // v.y
    public final float c(float f) {
        float f9;
        float f11;
        if(f <= 0.0f && f >= 1.0f) {
            float f1 = this.X;
            float f2 = f1 - f;
            float f3 = this.Z - f;
            double f4 = (((double)(0.0f - f)) - ((double)f2) * 2.0 + ((double)f3)) * 3.0;
            double f5 = ((double)(f2 - (0.0f - f))) * 3.0;
            float f6 = this.Z;
            double f7 = ((double)(f2 - f3)) * 3.0 + ((double)(-(0.0f - f))) + ((double)(1.0f - f));
            float f8 = NaNf;
            if(Double.compare(Math.abs(f7 - 0.0), 1.000000E-07) >= 0) {
                double f12 = f4 / f7;
                double f13 = f5 / f7;
                double f14 = (f13 * 3.0 - f12 * f12) / 9.0;
                double f15 = (((double)(0.0f - f)) / f7 * 27.0 + (2.0 * f12 * f12 * f12 - 9.0 * f12 * f13)) / 54.0;
                double f16 = f14 * f14 * f14;
                double f17 = f15 * f15 + f16;
                int v = Double.compare(f17, 0.0);
                if(v < 0) {
                    double f18 = Math.sqrt(-f16);
                    double f19 = -f15 / f18;
                    if(f19 < -1.0) {
                        f19 = -1.0;
                    }
                    if(f19 > 1.0) {
                        f19 = 1.0;
                    }
                    double f20 = Math.acos(f19);
                    float f21 = a.H(((float)f18));
                    f11 = (float)(Math.cos(f20 / 3.0) * ((double)(f21 * 2.0f)) - f12 / 3.0);
                    if(f11 >= 0.0f) {
                        if(f11 > 1.0f) {
                            f11 = f11 <= 1.000001f ? 1.0f : NaNf;
                        }
                    }
                    else if(f11 >= -0.000001f) {
                        f11 = 0.0f;
                    }
                    else {
                        f11 = NaNf;
                    }
                    if(Float.isNaN(f11)) {
                        f11 = (float)(Math.cos((6.283185 + f20) / 3.0) * ((double)(f21 * 2.0f)) - f12 / 3.0);
                        if(f11 >= 0.0f) {
                            if(f11 > 1.0f) {
                                f11 = f11 <= 1.000001f ? 1.0f : NaNf;
                            }
                        }
                        else if(f11 >= -0.000001f) {
                            f11 = 0.0f;
                        }
                        else {
                            f11 = NaNf;
                        }
                        if(Float.isNaN(f11)) {
                            f9 = (float)(Math.cos((f20 + 12.566371) / 3.0) * ((double)(f21 * 2.0f)) - f12 / 3.0);
                            if(f9 >= 0.0f) {
                                if(f9 > 1.0f) {
                                    f9 = f9 <= 1.000001f ? 1.0f : NaNf;
                                }
                            }
                            else if(f9 >= -0.000001f) {
                                f9 = 0.0f;
                            }
                            else {
                                f9 = NaNf;
                            }
                            f8 = f9;
                        }
                        else {
                            f8 = f11;
                        }
                    }
                    else {
                        f8 = f11;
                    }
                }
                else if(v == 0) {
                    float f22 = a.H(((float)f15));
                    float f23 = -f22 * 2.0f - ((float)(f12 / 3.0));
                    if(f23 >= 0.0f) {
                        if(f23 > 1.0f) {
                            f23 = f23 <= 1.000001f ? 1.0f : NaNf;
                        }
                    }
                    else if(f23 >= -0.000001f) {
                        f23 = 0.0f;
                    }
                    else {
                        f23 = NaNf;
                    }
                    if(Float.isNaN(f23)) {
                        f9 = --f22 - ((float)(f12 / 3.0));
                        if(f9 >= 0.0f) {
                            if(f9 > 1.0f) {
                                f9 = f9 <= 1.000001f ? 1.0f : NaNf;
                            }
                        }
                        else if(f9 >= -0.000001f) {
                            f9 = 0.0f;
                        }
                        else {
                            f9 = NaNf;
                        }
                        f8 = f9;
                    }
                    else {
                        f8 = f23;
                    }
                }
                else {
                    double f24 = Math.sqrt(f17);
                    f9 = (float)(((double)(a.H(((float)(-f15 + f24))) - a.H(((float)(f15 + f24))))) - f12 / 3.0);
                    if(f9 >= 0.0f) {
                        if(f9 > 1.0f) {
                            f9 = f9 <= 1.000001f ? 1.0f : NaNf;
                        }
                    }
                    else if(f9 >= -0.000001f) {
                        f9 = 0.0f;
                    }
                    else {
                        f9 = NaNf;
                    }
                    f8 = f9;
                }
            }
            else if(Math.abs(f4 - 0.0) >= 1.000000E-07) {
                double f10 = Math.sqrt(f5 * f5 - 4.0 * f4 * ((double)(0.0f - f)));
                f11 = (float)((f10 - f5) / (f4 * 2.0));
                if(f11 >= 0.0f) {
                    if(f11 > 1.0f) {
                        f11 = f11 <= 1.000001f ? 1.0f : NaNf;
                    }
                }
                else if(f11 >= -0.000001f) {
                    f11 = 0.0f;
                }
                else {
                    f11 = NaNf;
                }
                if(Float.isNaN(f11)) {
                    f9 = (float)((-f5 - f10) / (f4 * 2.0));
                    if(f9 >= 0.0f) {
                        if(f9 > 1.0f) {
                            f9 = f9 <= 1.000001f ? 1.0f : NaNf;
                        }
                    }
                    else if(f9 >= -0.000001f) {
                        f9 = 0.0f;
                    }
                    else {
                        f9 = NaNf;
                    }
                    f8 = f9;
                }
                else {
                    f8 = f11;
                }
            }
            else if(Math.abs(f5 - 0.0) >= 1.000000E-07) {
                f9 = (float)(-((double)(0.0f - f)) / f5);
                if(f9 >= 0.0f) {
                    if(f9 > 1.0f) {
                        f9 = f9 <= 1.000001f ? 1.0f : NaNf;
                    }
                }
                else if(f9 >= -0.000001f) {
                    f9 = 0.0f;
                }
                else {
                    f9 = NaNf;
                }
                f8 = f9;
            }
            float f25 = this.Y;
            if(Float.isNaN(f8)) {
                throw new IllegalArgumentException("The cubic curve with parameters (" + f1 + ", " + f25 + ", " + f6 + ", 1.0) has no solution at " + f);
            }
            float f26 = (((f25 - 1.0f + 0.333333f) * f8 + (1.0f - 2.0f * f25)) * f8 + f25) * 3.0f * f8;
            float f27 = this.b0;
            if(f26 < f27) {
                f26 = f27;
            }
            return f26 > this.c0 ? this.c0 : f26;
        }
        return f;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof u && this.X == ((u)object0).X && this.Y == ((u)object0).Y && this.Z == ((u)object0).Z;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + b.p(b.p(Float.floatToIntBits(this.X) * 0x1F, this.Y, 0x1F), this.Z, 0x1F);
    }

    @Override
    public final String toString() {
        return "CubicBezierEasing(a=" + this.X + ", b=" + this.Y + ", c=" + this.Z + ", d=1.0)";
    }
}

