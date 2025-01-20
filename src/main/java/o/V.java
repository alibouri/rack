package o;

import I5.h;
import J1.N;
import J1.d;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build.VERSION;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public abstract class v {
    public static boolean a(DragEvent dragEvent0, TextView textView0, Activity activity0) {
        h h0;
        activity0.requestDragAndDropPermissions(dragEvent0);
        int v = textView0.getOffsetForPosition(dragEvent0.getX(), dragEvent0.getY());
        textView0.beginBatchEdit();
        try {
            Selection.setSelection(((Spannable)textView0.getText()), v);
            ClipData clipData0 = dragEvent0.getClipData();
            if(Build.VERSION.SDK_INT >= 0x1F) {
                h0 = new h(clipData0, 3);
            }
            else {
                h0 = new d();
                h0.Y = clipData0;
                h0.Z = 3;
            }
            N.g(textView0, h0.b());
            return true;
        }
        finally {
            textView0.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent0, View view0, Activity activity0) {
        h h0;
        activity0.requestDragAndDropPermissions(dragEvent0);
        ClipData clipData0 = dragEvent0.getClipData();
        if(Build.VERSION.SDK_INT >= 0x1F) {
            h0 = new h(clipData0, 3);
        }
        else {
            h0 = new d();
            h0.Y = clipData0;
            h0.Z = 3;
        }
        N.g(view0, h0.b());
        return true;
    }
}

