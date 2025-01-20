package b4;

public abstract class m0 extends W {
    @Override  // b4.W
    public final void l(b0 b00) {
        if(!(b00 instanceof l0)) {
            throw new B0("Text content elements cannot contain " + b00 + " elements.");  // initializer: Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V
        }
        this.i.add(b00);
    }
}

