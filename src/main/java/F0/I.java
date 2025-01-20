package F0;

import Nb.k;
import androidx.compose.ui.node.LayoutNode;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

public final class i extends k implements Function0 {
    public final int X;
    public static final i Y;
    public static final i Z;
    public static final i b0;

    static {
        i.Y = new i(0, 0);
        i.Z = new i(0, 1);
        i.b0 = new i(0, 2);
    }

    public i(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return new LayoutNode(2, 0, true);
            }
            case 1: {
                return new LinkedHashMap();
            }
            default: {
                return new LayoutNode(3, 0, false);
            }
        }
    }
}

