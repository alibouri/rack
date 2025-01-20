package i2;

import R2.e;
import a8.O;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class b {
    public final Context a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final O e;
    public static final Object f;
    public static b g;

    static {
        b.f = new Object();
    }

    public b(Context context0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.a = context0;
        this.e = new O(this, context0.getMainLooper());
    }

    public static b a(Context context0) {
        synchronized(b.f) {
            if(b.g == null) {
                b.g = new b(context0.getApplicationContext());
            }
            return b.g;
        }
    }

    public final void b(BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        synchronized(this.b) {
            a a0 = new a(broadcastReceiver0, intentFilter0);
            ArrayList arrayList0 = (ArrayList)this.b.get(broadcastReceiver0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList(1);
                this.b.put(broadcastReceiver0, arrayList0);
            }
            arrayList0.add(a0);
            for(int v1 = 0; v1 < intentFilter0.countActions(); ++v1) {
                String s = intentFilter0.getAction(v1);
                ArrayList arrayList1 = (ArrayList)this.c.get(s);
                if(arrayList1 == null) {
                    arrayList1 = new ArrayList(1);
                    this.c.put(s, arrayList1);
                }
                arrayList1.add(a0);
            }
        }
    }

    public final void c(Intent intent0) {
        String s5;
        String s4;
        int v2;
        ArrayList arrayList2;
        synchronized(this.b) {
            String s = intent0.getAction();
            String s1 = intent0.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri uri0 = intent0.getData();
            String s2 = intent0.getScheme();
            Set set0 = intent0.getCategories();
            boolean z = (intent0.getFlags() & 8) != 0;
            if(z) {
                Log.v("LocalBroadcastManager", "Resolving type " + s1 + " scheme " + s2 + " of intent " + intent0);
            }
            String s3 = intent0.getAction();
            ArrayList arrayList0 = (ArrayList)this.c.get(s3);
            if(arrayList0 != null) {
                if(z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList0);
                }
                ArrayList arrayList1 = null;
                int v1 = 0;
                while(v1 < arrayList0.size()) {
                    a a0 = (a)arrayList0.get(v1);
                    if(z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + a0.a);
                    }
                    if(a0.c) {
                        if(z) {
                            Log.v("LocalBroadcastManager", "  Filter\'s target already added");
                        }
                        arrayList2 = arrayList0;
                        v2 = v1;
                        s4 = s;
                    }
                    else {
                        arrayList2 = arrayList0;
                        v2 = v1;
                        s4 = s;
                        int v3 = a0.a.match(s, s1, s2, uri0, set0, "LocalBroadcastManager");
                        if(v3 >= 0) {
                            if(z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(v3));
                            }
                            if(arrayList1 == null) {
                                arrayList1 = new ArrayList();
                            }
                            arrayList1.add(a0);
                            a0.c = true;
                        }
                        else if(z) {
                            switch(v3) {
                                case -4: {
                                    s5 = "category";
                                    break;
                                }
                                case -3: {
                                    s5 = "action";
                                    break;
                                }
                                case -2: {
                                    s5 = "data";
                                    break;
                                }
                                case -1: {
                                    s5 = "type";
                                    break;
                                }
                                default: {
                                    s5 = "unknown reason";
                                }
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + s5);
                        }
                    }
                    v1 = v2 + 1;
                    arrayList0 = arrayList2;
                    s = s4;
                }
                if(arrayList1 != null) {
                    for(int v4 = 0; v4 < arrayList1.size(); ++v4) {
                        ((a)arrayList1.get(v4)).c = false;
                    }
                    e e0 = new e(intent0, arrayList1);
                    this.d.add(e0);
                    if(!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver0) {
        synchronized(this.b) {
            ArrayList arrayList0 = (ArrayList)this.b.remove(broadcastReceiver0);
            if(arrayList0 == null) {
                return;
            }
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                a a0 = (a)arrayList0.get(v1);
                a0.d = true;
                for(int v2 = 0; v2 < a0.a.countActions(); ++v2) {
                    String s = a0.a.getAction(v2);
                    ArrayList arrayList1 = (ArrayList)this.c.get(s);
                    if(arrayList1 != null) {
                        for(int v3 = arrayList1.size() - 1; v3 >= 0; --v3) {
                            a a1 = (a)arrayList1.get(v3);
                            if(a1.b == broadcastReceiver0) {
                                a1.d = true;
                                arrayList1.remove(v3);
                            }
                        }
                        if(arrayList1.size() <= 0) {
                            this.c.remove(s);
                        }
                    }
                }
            }
        }
    }
}

