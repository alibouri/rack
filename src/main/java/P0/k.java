package P0;

import java.text.CharacterIterator;

public final class k implements CharacterIterator {
    public final CharSequence X;
    public final int Y;
    public int Z;

    public k(int v, CharSequence charSequence0) {
        this.X = charSequence0;
        this.Y = v;
        this.Z = 0;
    }

    @Override
    public final Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new InternalError();
        }
    }

    @Override
    public final char current() {
        return this.Z == this.Y ? '\uFFFF' : this.X.charAt(this.Z);
    }

    @Override
    public final char first() {
        this.Z = 0;
        return this.current();
    }

    @Override
    public final int getBeginIndex() {
        return 0;
    }

    @Override
    public final int getEndIndex() {
        return this.Y;
    }

    @Override
    public final int getIndex() {
        return this.Z;
    }

    @Override
    public final char last() {
        int v = this.Y;
        if(v == 0) {
            this.Z = 0;
            return '\uFFFF';
        }
        this.Z = v - 1;
        return this.X.charAt(v - 1);
    }

    @Override
    public final char next() {
        int v = this.Z + 1;
        this.Z = v;
        int v1 = this.Y;
        if(v >= v1) {
            this.Z = v1;
            return '\uFFFF';
        }
        return this.X.charAt(v);
    }

    @Override
    public final char previous() {
        int v = this.Z;
        if(v <= 0) {
            return '\uFFFF';
        }
        this.Z = v - 1;
        return this.X.charAt(v - 1);
    }

    @Override
    public final char setIndex(int v) {
        if(v > this.Y || v < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.Z = v;
        return this.current();
    }
}

