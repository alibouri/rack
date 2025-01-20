package u0;

import Nb.j;
import Y8.o;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import g3.b;

public final class a {
    public final XmlResourceParser a;
    public int b;
    public final b c;

    public a(XmlResourceParser xmlResourceParser0) {
        this.a = xmlResourceParser0;
        this.b = 0;
        b b0 = new b(15, false);
        b0.Y = new float[0x40];
        this.c = b0;
    }

    public final float a(TypedArray typedArray0, String s, int v, float f) {
        if(y1.b.f(this.a, s)) {
            f = typedArray0.getFloat(v, f);
        }
        this.b(typedArray0.getChangingConfigurations());
        return f;
    }

    public final void b(int v) {
        this.b |= v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return j.a(this.a, ((a)object0).a) ? this.b == ((a)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AndroidVectorParser(xmlParser=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", config=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

