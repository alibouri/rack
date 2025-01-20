package P0;

import Nb.j;
import android.text.Layout.Alignment;

public abstract class w {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] arr_layout$Alignment = Layout.Alignment.values();
        Layout.Alignment layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment layout$Alignment1 = layout$Alignment0;
        for(int v = 0; v < arr_layout$Alignment.length; ++v) {
            Layout.Alignment layout$Alignment2 = arr_layout$Alignment[v];
            if(j.a(layout$Alignment2.name(), "ALIGN_LEFT")) {
                layout$Alignment0 = layout$Alignment2;
            }
            else if(j.a(layout$Alignment2.name(), "ALIGN_RIGHT")) {
                layout$Alignment1 = layout$Alignment2;
            }
        }
        w.a = layout$Alignment0;
        w.b = layout$Alignment1;
    }
}

