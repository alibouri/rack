package q3;

import n3.a;

public final class d extends b {
    public int b;

    public d() {
        this.b = -1;
    }

    public d(int v) {
        super(v);
        this.b = -1;
    }

    @Override  // q3.b
    public final void a(int v) {
        if((v & 0x100) > 0 && (v & 0x200) > 0) {
            throw new a("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if((v & 2) > 0 && (v & 0x300) > 0) {
            throw new a("Structs and arrays can\'t have \"value\" options", 103);
        }
    }

    @Override  // q3.b
    public final int d() {
        return 0xA0001FF2;
    }

    public final boolean f() {
        return (this.a & 0x300) > 0;
    }

    public final void g(boolean z) {
        this.e(0x100, z);
    }
}

