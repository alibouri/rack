package b4;

public final class l {
    public n a;
    public T b;
    public int c;

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(String.valueOf(this.a));
        stringBuilder0.append(" {...} (src=");
        switch(this.c) {
            case 1: {
                s = "Document";
                break;
            }
            case 2: {
                s = "RenderOptions";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

