package f3;

import Bb.p;
import Vb.j;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import i3.m;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import m3.g;
import pc.r;

public final class a {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    public final Object a(Object object0, m m0) {
        switch(this.a) {
            case 0: {
                return ByteBuffer.wrap(((byte[])object0));
            }
            case 1: {
                if(!g.d(((Uri)object0))) {
                    String s = ((Uri)object0).getScheme();
                    if(s == null || s.equals("file")) {
                        String s1 = ((Uri)object0).getPath();
                        if(s1 == null) {
                            s1 = "";
                        }
                        if(j.s0(s1, '/') && ((String)p.q0(((Uri)object0).getPathSegments())) != null) {
                            if(!Nb.j.a(((Uri)object0).getScheme(), "file")) {
                                return new File(((Uri)object0).toString());
                            }
                            String s2 = ((Uri)object0).getPath();
                            if(s2 != null) {
                                return new File(s2);
                            }
                        }
                    }
                }
                return null;
            }
            case 2: {
                return ((r)object0).h;
            }
            case 3: {
                int v = ((Number)object0).intValue();
                try {
                    if(m0.a.getResources().getResourceEntryName(v) != null) {
                        return Uri.parse(("android.resource://com.wave.personal" + '/' + v));
                    }
                }
                catch(Resources.NotFoundException unused_ex) {
                }
                return null;
            }
            case 4: {
                if(Nb.j.a(((Uri)object0).getScheme(), "android.resource")) {
                    String s3 = ((Uri)object0).getAuthority();
                    if(s3 != null && !j.c0(s3) && ((Uri)object0).getPathSegments().size() == 2) {
                        String s4 = ((Uri)object0).getAuthority();
                        if(s4 == null) {
                            s4 = "";
                        }
                        Resources resources0 = m0.a.getPackageManager().getResourcesForApplication(s4);
                        List list0 = ((Uri)object0).getPathSegments();
                        String s5 = (String)list0.get(0);
                        int v1 = resources0.getIdentifier(((String)list0.get(1)), s5, s4);
                        if(v1 == 0) {
                            throw new IllegalStateException(("Invalid android.resource URI: " + ((Uri)object0)).toString());
                        }
                        return Uri.parse(("android.resource://" + s4 + '/' + v1));
                    }
                }
                return null;
            }
            default: {
                return Uri.parse(((String)object0));
            }
        }
    }
}

