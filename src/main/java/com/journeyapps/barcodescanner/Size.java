package com.journeyapps.barcodescanner;

public final class Size implements Comparable {
    public final int X;
    public final int Y;

    public Size(int v, int v1) {
        this.X = v;
        this.Y = v1;
    }

    public final Size a(Size size0) {
        return this.X * size0.Y > size0.X * this.Y ? new Size(this.X * size0.Y / this.Y, size0.Y) : new Size(size0.X, this.Y * size0.X / this.X);
    }

    public final Size b(Size size0) {
        return this.X * size0.Y < size0.X * this.Y ? new Size(this.X * size0.Y / this.Y, size0.Y) : new Size(size0.X, this.Y * size0.X / this.X);
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.Y * this.X;
        int v1 = ((Size)object0).Y * ((Size)object0).X;
        if(v1 < v) {
            return 1;
        }
        return v1 <= v ? 0 : -1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Size.class == class0 && (this.X == ((Size)object0).X && this.Y == ((Size)object0).Y);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.X * 0x1F + this.Y;
    }

    @Override
    public final String toString() {
        return this.X + "x" + this.Y;
    }
}

