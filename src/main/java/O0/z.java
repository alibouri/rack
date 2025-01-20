package O0;

import com.apollographql.apollo.api.b;

public final class z {
    public final boolean a;
    public static final z b;

    static {
        z.b = new z(0, false);
    }

    public z(int v, boolean z) {
        this.a = z;
    }

    public z(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z ? this.a == ((z)object0).a : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x9511 : 0x95CB;
    }

    @Override
    public final String toString() {
        return b.r(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }
}

