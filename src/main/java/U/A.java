package u;

import m5.b;

public final class a {
    public final float a;
    public final float b;

    public a(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return Float.compare(this.a, ((a)object0).a) == 0 ? Float.compare(this.b, ((a)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FlingResult(distanceCoefficient=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", velocityCoefficient=");
        return b.x(stringBuilder0, this.b, ')');
    }
}

