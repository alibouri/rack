package I2;

public final class w extends y {
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return w.class == class0;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return w.class.getName().hashCode();
    }

    @Override
    public final String toString() {
        return "Retry";
    }
}

