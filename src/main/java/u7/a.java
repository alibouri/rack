package U7;

import m5.b;

public final class a {
    public final String a;
    public final String b;

    public a(String s, String s1) {
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = s1;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof a && (this.a.equals(((a)object0).a) && this.b.equals(((a)object0).b));
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LibraryVersion{libraryName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", version=");
        return b.y(stringBuilder0, this.b, "}");
    }
}

