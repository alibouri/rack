package k1;

import Y8.o;
import java.util.Arrays;
import java.util.Objects;

public abstract class c implements Cloneable {
    public final char[] X;
    public long Y;
    public long Z;
    public b b0;

    public c(char[] arr_c) {
        this.Y = -1L;
        this.Z = 0x7FFFFFFFFFFFFFFFL;
        this.X = arr_c;
    }

    public c c() {
        try {
            return (c)super.clone();
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new AssertionError();
        }
    }

    @Override
    public Object clone() {
        return this.c();
    }

    public final String d() {
        String s = new String(this.X);
        if(s.length() < 1) {
            return "";
        }
        long v = this.Z;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            return v < this.Y ? s.substring(((int)this.Y), ((int)this.Y) + 1) : s.substring(((int)this.Y), ((int)v) + 1);
        }
        return s.substring(((int)this.Y), ((int)this.Y) + 1);
    }

    // Deobfuscation rating: LOW(20)
    public float e() {
        return this instanceof e ? ((e)this).e() : NaNf;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(this.Y != ((c)object0).Y) {
            return false;
        }
        if(this.Z != ((c)object0).Z) {
            return false;
        }
        return Arrays.equals(this.X, ((c)object0).X) ? Objects.equals(this.b0, ((c)object0).b0) : false;
    }

    // Deobfuscation rating: LOW(20)
    public int g() {
        return this instanceof e ? ((e)this).g() : 0;
    }

    @Override
    public int hashCode() {
        int v = ((Arrays.hashCode(this.X) * 0x1F + ((int)(this.Y ^ this.Y >>> 0x20))) * 0x1F + ((int)(this.Z ^ this.Z >>> 0x20))) * 0x1F;
        return this.b0 == null ? v * 0x1F : (v + this.b0.hashCode()) * 0x1F;
    }

    public final String i() {
        String s = this.getClass().toString();
        return s.substring(s.lastIndexOf(46) + 1);
    }

    @Override
    public String toString() {
        if(this.Y <= this.Z && this.Z != 0x7FFFFFFFFFFFFFFFL) {
            String s = new String(this.X).substring(((int)this.Y), ((int)this.Z) + 1);
            return this.i() + " (" + this.Y + " : " + this.Z + ") <<" + s + ">>";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass());
        stringBuilder0.append(" (INVALID, ");
        stringBuilder0.append(this.Y);
        stringBuilder0.append("-");
        return o.w(this.Z, ")", stringBuilder0);
    }
}

