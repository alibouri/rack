package k0;

import Bb.n;
import androidx.compose.ui.graphics.GraphicsContext;
import q0.b;
import s.z;

public final class i implements GraphicsContext {
    public z a;
    public GraphicsContext b;

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final b a() {
        GraphicsContext graphicsContext0 = this.b;
        if(graphicsContext0 != null) {
            b b0 = graphicsContext0.a();
            z z0 = this.a;
            if(z0 == null) {
                z z1 = new z(1);
                z1.a(b0);
                this.a = z1;
                return b0;
            }
            z0.a(b0);
            return b0;
        }
        M6.b.T("GraphicsContext not provided");
        throw null;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final void b(b b0) {
        GraphicsContext graphicsContext0 = this.b;
        if(graphicsContext0 != null) {
            graphicsContext0.b(b0);
        }
    }

    public final void c() {
        z z0 = this.a;
        if(z0 != null) {
            Object[] arr_object = z0.a;
            int v = z0.b;
            for(int v1 = 0; v1 < v; ++v1) {
                this.b(((b)arr_object[v1]));
            }
            n.o0(z0.a, null, 0, z0.b);
            z0.b = 0;
        }
    }
}

