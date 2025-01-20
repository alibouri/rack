package p3;

public final class a {
    public String a;
    public int b;
    public boolean c;
    public int d;

    public a(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final String toString() {
        switch(this.b) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return this.a;
            }
            case 5: 
            case 6: {
                return this.a;
            }
            default: {
                return this.a;
            }
        }
    }
}

