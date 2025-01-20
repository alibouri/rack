package i1;

import M.J;

public final class a {
    public String a;
    public int b;
    public int c;
    public float d;

    @Override
    public final String toString() {
        String s = J.g(new StringBuilder(), this.a, ':');
        switch(this.b) {
            case 900: {
                StringBuilder stringBuilder0 = J.i(s);
                stringBuilder0.append(this.c);
                return stringBuilder0.toString();
            }
            case 901: {
                StringBuilder stringBuilder1 = J.i(s);
                stringBuilder1.append(this.d);
                return stringBuilder1.toString();
            }
            case 902: {
                StringBuilder stringBuilder2 = J.i(s);
                String s1 = "00000000" + Integer.toHexString(this.c);
                stringBuilder2.append("#" + s1.substring(s1.length() - 8));
                return stringBuilder2.toString();
            }
            case 903: {
                return s + null;
            }
            default: {
                return s + "????";
            }
        }
    }
}

