package v;

public final class i {
    public final l a;
    public final int b;

    public i(l l0, int v) {
        this.a = l0;
        this.b = v;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("AnimationResult(endReason=");
        switch(this.b) {
            case 1: {
                s = "BoundReached";
                break;
            }
            case 2: {
                s = "Finished";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", endState=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

