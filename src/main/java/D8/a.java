package D8;

import android.content.Intent;
import android.os.Bundle;
import c2.x;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class a {
    public final x a;
    public final HashMap b;
    public List c;
    public Class d;

    static {
        Collections.unmodifiableList(Arrays.asList(new String[]{"UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14"}));
        Collections.unmodifiableList(Arrays.asList(new String[]{"UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED"}));
    }

    public a(x x0) {
        this.b = new HashMap(3);
        this.a = x0;
    }

    public final Intent a() {
        if(this.d == null) {
            this.d = CaptureActivity.class;
        }
        Intent intent0 = new Intent(this.a, this.d);
        intent0.setAction("com.google.zxing.client.android.SCAN");
        if(this.c != null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: this.c) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(',');
                }
                stringBuilder0.append(((String)object0));
            }
            intent0.putExtra("SCAN_FORMATS", stringBuilder0.toString());
        }
        intent0.addFlags(0x4000000);
        intent0.addFlags(0x80000);
        for(Object object1: this.b.entrySet()) {
            String s = (String)((Map.Entry)object1).getKey();
            Object object2 = ((Map.Entry)object1).getValue();
            if(object2 instanceof Integer) {
                intent0.putExtra(s, ((Integer)object2));
            }
            else if(object2 instanceof Long) {
                intent0.putExtra(s, ((Long)object2));
            }
            else if(object2 instanceof Boolean) {
                intent0.putExtra(s, ((Boolean)object2));
            }
            else if(object2 instanceof Double) {
                intent0.putExtra(s, ((Double)object2));
            }
            else if(object2 instanceof Float) {
                intent0.putExtra(s, ((Float)object2));
            }
            else if(object2 instanceof Bundle) {
                intent0.putExtra(s, ((Bundle)object2));
            }
            else if(object2 instanceof int[]) {
                intent0.putExtra(s, ((int[])object2));
            }
            else if(object2 instanceof long[]) {
                intent0.putExtra(s, ((long[])object2));
            }
            else if(object2 instanceof boolean[]) {
                intent0.putExtra(s, ((boolean[])object2));
            }
            else if(object2 instanceof double[]) {
                intent0.putExtra(s, ((double[])object2));
            }
            else if(object2 instanceof float[]) {
                intent0.putExtra(s, ((float[])object2));
            }
            else if(object2 instanceof String[]) {
                intent0.putExtra(s, ((String[])object2));
            }
            else {
                intent0.putExtra(s, object2.toString());
            }
        }
        return intent0;
    }
}

