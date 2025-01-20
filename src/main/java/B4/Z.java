package b4;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

public abstract class z extends Z implements X {
    public ArrayList h;
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    public z() {
        this.h = new ArrayList();
    }

    @Override  // b4.X
    public final List f() {
        return this.h;
    }

    @Override  // b4.X
    public final void l(b0 b00) {
        if(!(b00 instanceof S)) {
            throw new B0("Gradient elements cannot contain " + b00 + " elements.");  // initializer: Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V
        }
        this.h.add(b00);
    }
}

