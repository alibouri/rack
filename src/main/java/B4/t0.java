package b4;

public final class t0 {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public boolean e;

    public t0(float f, float f1, float f2, float f3) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.a = f;
        this.b = f1;
        double f4 = Math.sqrt(f3 * f3 + f2 * f2);
        if(f4 != 0.0) {
            this.c = (float)(((double)f2) / f4);
            this.d = (float)(((double)f3) / f4);
        }
    }

    public final void a(float f, float f1) {
        float f2 = f - this.a;
        float f3 = f1 - this.b;
        double f4 = Math.sqrt(f3 * f3 + f2 * f2);
        if(f4 != 0.0) {
            f2 = (float)(((double)f2) / f4);
            f3 = (float)(((double)f3) / f4);
        }
        float f5 = this.c;
        if(f2 == -f5 && f3 == -this.d) {
            this.e = true;
            this.c = -f3;
            this.d = f2;
            return;
        }
        this.c = f5 + f2;
        this.d += f3;
    }

    public final void b(t0 t00) {
        float f = t00.c;
        float f1 = this.c;
        if(f == -f1) {
            float f2 = t00.d;
            if(f2 == -this.d) {
                this.e = true;
                this.c = -f2;
                this.d = t00.c;
                return;
            }
        }
        this.c = f1 + f;
        this.d += t00.d;
    }

    @Override
    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}

