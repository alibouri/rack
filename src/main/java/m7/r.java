package m7;

public final class r {
    public final Class a;
    public final Class b;

    public r(Class class0, Class class1) {
        this.a = class0;
        this.b = class1;
    }

    public static r a(Class class0) {
        return new r(q.class, class0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return r.class == class0 && this.b.equals(((r)object0).b) ? this.a.equals(((r)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return this.a == q.class ? this.b.getName() : "@" + this.a.getName() + " " + this.b.getName();
    }
}

