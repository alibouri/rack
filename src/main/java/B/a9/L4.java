package a9;

import M.J;

public final class l4 {
    public final int a;
    public final int b;

    public l4(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l4)) {
            return false;
        }
        return this.a == ((l4)object0).a ? this.b == ((l4)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LinkedAccountTransferCounts(toWallet=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", fromWallet=");
        return J.f(stringBuilder0, this.b, ")");
    }
}

