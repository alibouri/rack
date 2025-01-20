package D;

import Nb.j;

public final class w {
    public final int a;
    public final int b;
    public final Object c;

    public w(int v, int v1, Object object0) {
        this.a = v1;
        this.b = v;
        this.c = object0;
        super();
    }

    public w(int v, Object object0) {
        this.a = 2;
        j.f(object0, "key");
        super();
        this.c = object0;
        this.b = v;
    }

    @Override
    public String toString() {
        if(this.a != 1) {
            return super.toString();
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        switch(this.b) {
            case -1: {
                stringBuffer0.append("END OF FILE");
                return stringBuffer0.toString();
            }
            case 0: {
                stringBuffer0.append("VALUE(");
                stringBuffer0.append(this.c);
                stringBuffer0.append(")");
                return stringBuffer0.toString();
            }
            case 1: {
                stringBuffer0.append("LEFT BRACE({)");
                return stringBuffer0.toString();
            }
            case 2: {
                stringBuffer0.append("RIGHT BRACE(})");
                return stringBuffer0.toString();
            }
            case 3: {
                stringBuffer0.append("LEFT SQUARE([)");
                return stringBuffer0.toString();
            }
            case 4: {
                stringBuffer0.append("RIGHT SQUARE(])");
                return stringBuffer0.toString();
            }
            case 5: {
                stringBuffer0.append("COMMA(,)");
                return stringBuffer0.toString();
            }
            case 6: {
                stringBuffer0.append("COLON(:)");
                return stringBuffer0.toString();
            }
            default: {
                return stringBuffer0.toString();
            }
        }
    }
}

