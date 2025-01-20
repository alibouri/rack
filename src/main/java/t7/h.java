package t7;

import q7.b;
import q7.c;
import q7.g;

public final class h implements g {
    public boolean a;
    public boolean b;
    public c c;
    public final f d;

    public h(f f0) {
        this.a = false;
        this.b = false;
        this.d = f0;
    }

    @Override  // q7.g
    public final g b(String s) {
        if(this.a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.a = true;
        this.d.h(this.c, s, this.b);
        return this;
    }

    @Override  // q7.g
    public final g c(boolean z) {
        if(this.a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.a = true;
        this.d.c(this.c, ((int)z), this.b);
        return this;
    }
}

