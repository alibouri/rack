package I6;

import E7.B;
import J5.i;
import J5.j;
import N5.r;
import N5.x;
import N5.y;
import N5.z;
import T8.b;
import T8.k;
import T8.p;
import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import io.sentry.g1;
import java.util.ArrayList;
import java.util.HashMap;
import l9.f;
import r8.h;
import r8.m;
import r8.o;

public final class c implements Handler.Callback {
    public final int a;
    public final Object b;

    public c(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final boolean a(Message message0) {
        j j0;
        int v = message0.arg1;
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + v);
        }
        i i0 = (i)this.b;
        synchronized(i0) {
            j0 = (j)i0.c0.get(v);
            if(j0 == null) {
                Log.w("MessengerIpcClient", "Received response for unknown request: " + v);
                return true;
            }
            i0.c0.remove(v);
            i0.c();
        }
        Bundle bundle0 = message0.getData();
        if(bundle0.getBoolean("unsupported", false)) {
            j0.b(new B("Not supported by GmsCore", null));  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            return true;
        }
        if(j0.e != 0) {
            Bundle bundle1 = bundle0.getBundle("data");
            if(bundle1 == null) {
                bundle1 = Bundle.EMPTY;
            }
            j0.c(bundle1);
            return true;
        }
        if(bundle0.getBoolean("ack", false)) {
            j0.c(null);
            return true;
        }
        j0.b(new B("Invalid response to one way request", null));  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        return true;
    }

    private final boolean b(Message message0) {
        switch(message0.what) {
            case 0: {
                HashMap hashMap0 = ((z)this.b).a;
                synchronized(hashMap0) {
                    x x0 = (x)message0.obj;
                    y y0 = (y)((z)this.b).a.get(x0);
                    if(y0 != null && y0.X.isEmpty()) {
                        if(y0.Z) {
                            y0.e0.c.removeMessages(1, y0.c0);
                            y0.e0.d.c(y0.e0.b, y0);
                            y0.Z = false;
                            y0.Y = 2;
                        }
                        ((z)this.b).a.remove(x0);
                    }
                    return true;
                }
            }
            case 1: {
                HashMap hashMap1 = ((z)this.b).a;
                synchronized(hashMap1) {
                    x x1 = (x)message0.obj;
                    y y1 = (y)((z)this.b).a.get(x1);
                    if(y1 != null && y1.Y == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + x1, new Exception());
                        ComponentName componentName0 = y1.d0;
                        if(componentName0 == null) {
                            x1.getClass();
                            componentName0 = null;
                        }
                        if(componentName0 == null) {
                            r.j(x1.b);
                            componentName0 = new ComponentName(x1.b, "unknown");
                        }
                        y1.onServiceDisconnected(componentName0);
                    }
                    return true;
                }
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        m m1;
        p p1;
        r8.j j0;
        switch(this.a) {
            case 0: {
                if(message0.what != 0) {
                    return false;
                }
                d d0 = (d)this.b;
                if(message0.obj == null) {
                    synchronized(d0.a) {
                        throw null;
                    }
                }
                throw new ClassCastException();
            }
            case 1: {
                return this.a(message0);
            }
            case 2: {
                return this.b(message0);
            }
            case 3: {
                int v1 = message0.what;
                T8.m m0 = (T8.m)this.b;
                if(v1 == 0x7F0A033D) {  // id:zxing_decode
                    T8.r r0 = (T8.r)message0.obj;
                    m0.getClass();
                    long v2 = System.currentTimeMillis();
                    r0.d = (Rect)m0.h;
                    p p0 = r0.a;
                    if(((Rect)m0.h) == null) {
                        j0 = null;
                    }
                    else {
                        byte[] arr_b = p0.a;
                        int v3 = p0.c;
                        int v4 = p0.b;
                        switch(r0.c) {
                            case 90: {
                                byte[] arr_b1 = new byte[v4 * v3];
                                int v6 = 0;
                                for(int v5 = 0; v5 < v4; ++v5) {
                                    for(int v7 = v3 - 1; v7 >= 0; --v7) {
                                        arr_b1[v6] = arr_b[v7 * v4 + v5];
                                        ++v6;
                                    }
                                }
                                p1 = new p(arr_b1, v3, v4);
                                break;
                            }
                            case 180: {
                                int v8 = v4 * v3;
                                byte[] arr_b2 = new byte[v8];
                                int v9 = v8 - 1;
                                for(int v10 = 0; v10 < v8; ++v10) {
                                    arr_b2[v9] = arr_b[v10];
                                    --v9;
                                }
                                p1 = new p(arr_b2, v4, v3);
                                break;
                            }
                            case 270: {
                                int v11 = v4 * v3;
                                byte[] arr_b3 = new byte[v11];
                                int v12 = v11 - 1;
                                for(int v13 = 0; v13 < v4; ++v13) {
                                    for(int v14 = v3 - 1; v14 >= 0; --v14) {
                                        arr_b3[v12] = arr_b[v14 * v4 + v13];
                                        --v12;
                                    }
                                }
                                p1 = new p(arr_b3, v3, v4);
                                break;
                            }
                            default: {
                                p1 = p0;
                            }
                        }
                        Rect rect0 = r0.d;
                        int v15 = rect0.width();
                        int v16 = rect0.height();
                        int v17 = rect0.top;
                        byte[] arr_b4 = new byte[v15 * v16];
                        int v18 = p1.b;
                        int v19 = v17 * v18 + rect0.left;
                        for(int v20 = 0; v20 < v16; ++v20) {
                            System.arraycopy(p1.a, v19, arr_b4, v20 * v15, v15);
                            v19 += v18;
                        }
                        j0 = new r8.j(arr_b4, v15, v16, v15, v16);
                    }
                    if(j0 == null) {
                        m1 = null;
                    }
                    else {
                        k k0 = (k)m0.g;
                        g1 g10 = k0.b(j0);
                        h h0 = k0.a;
                        k0.b.clear();
                        try {
                            if(!(h0 instanceof h)) {
                                h0.c(null);
                            }
                            else if(h0.b == null) {
                                h0.c(null);
                            }
                            m1 = h0.b(g10);
                        }
                        catch(Exception unused_ex) {
                            h0.reset();
                            m1 = null;
                        }
                        finally {
                            h0.reset();
                        }
                    }
                    Handler handler0 = (Handler)m0.f;
                    if(m1 != null) {
                        Log.d("m", "Found barcode in " + (System.currentTimeMillis() - v2) + " ms");
                        if(handler0 != null) {
                            b b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
                            b0.a = m1;
                            b0.b = r0;
                            Message message1 = Message.obtain(handler0, 0x7F0A033F, b0);  // id:zxing_decode_succeeded
                            message1.setData(new Bundle());
                            message1.sendToTarget();
                        }
                    }
                    else if(handler0 != null) {
                        Message.obtain(handler0, 0x7F0A033E).sendToTarget();  // id:zxing_decode_failed
                    }
                    if(handler0 != null) {
                        k k1 = (k)m0.g;
                        k1.getClass();
                        ArrayList arrayList0 = new ArrayList(k1.b);
                        ArrayList arrayList1 = new ArrayList(arrayList0.size());
                        for(Object object1: arrayList0) {
                            Rect rect1 = r0.d;
                            float f1 = ((o)object1).a * 1.0f + ((float)rect1.left);
                            float f2 = ((o)object1).b * 1.0f + ((float)rect1.top);
                            if(r0.e) {
                                f1 = ((float)p0.b) - f1;
                            }
                            arrayList1.add(new o(f1, f2));
                        }
                        Message.obtain(handler0, 0x7F0A0340, arrayList1).sendToTarget();  // id:zxing_possible_result_points
                    }
                    ((CameraInstance)m0.c).h.post(new U8.d(((CameraInstance)m0.c), ((B3.d)m0.j), 0));
                    return true;
                }
                if(v1 == 0x7F0A0341) {  // id:zxing_preview_failed
                    ((CameraInstance)m0.c).h.post(new U8.d(((CameraInstance)m0.c), ((B3.d)m0.j), 0));
                }
                return true;
            }
            case 4: {
                int v22 = message0.what;
                U8.b b1 = (U8.b)this.b;
                b1.getClass();
                if(v22 == 1) {
                    b1.b();
                    return true;
                }
                return false;
            }
            default: {
                int v = message0.what;
                f f0 = (f)this.b;
                f0.getClass();
                if(v == 1) {
                    f0.b();
                    return true;
                }
                return false;
            }
        }
    }
}

