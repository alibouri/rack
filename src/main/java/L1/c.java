package l1;

public final class c implements d {
    public boolean a;
    public String b;
    public String c;
    public float d;
    public float e;

    @Override  // l1.d
    public final float value() {
        float f = this.d;
        if(f >= this.e) {
            this.a = true;
        }
        if(!this.a) {
            this.d = f + 1.0f;
        }
        return this.d;
    }
}

