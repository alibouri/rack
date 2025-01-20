package com.wave.components;

import Fb.c;
import I2.v;
import I2.w;
import I2.x;
import J9.a;
import J9.b;
import J9.l;
import J9.p;
import Nb.j;
import W5.f;
import Xb.J;
import Xb.V;
import Y8.B7;
import Y8.G6;
import Y8.R6;
import Y8.T;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import hb.n;
import io.sentry.i1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import q9.r1;

public final class AssociateTokenWithUserWorker extends CoroutineWorker {
    public final l g;
    public final p h;
    public final String i;

    public AssociateTokenWithUserWorker(Context context0, WorkerParameters workerParameters0) {
        j.f(context0, "appContext");
        j.f(workerParameters0, "params");
        super(context0, workerParameters0);
        l l0 = (l)r1.b(context0);
        this.g = l0;
        this.h = (p)l0.u0.getValue();
        this.i = workerParameters0.b.b("mobile");
    }

    @Override  // androidx.work.CoroutineWorker
    public final Object c(g g0) {
        b b0 = new b(this, null);
        return J.y(V.c, b0, g0);
    }

    public static final Object e(AssociateTokenWithUserWorker associateTokenWithUserWorker0, c c0) {
        String s3;
        AssociateTokenWithUserWorker associateTokenWithUserWorker1;
        a a0;
        associateTokenWithUserWorker0.getClass();
        if(c0 instanceof a) {
            a0 = (a)c0;
            int v = a0.f0;
            if((v & 0x80000000) == 0) {
                a0 = new a(associateTokenWithUserWorker0, c0);
            }
            else {
                a0.f0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(associateTokenWithUserWorker0, c0);
        }
        Object object0 = a0.d0;
        Object object1 = Eb.a.X;
        switch(a0.f0) {
            case 0: {
                f.b0(object0);
                a0.b0 = associateTokenWithUserWorker0;
                a0.f0 = 1;
                object0 = associateTokenWithUserWorker0.h.b(a0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                associateTokenWithUserWorker0 = a0.b0;
                f.b0(object0);
            label_22:
                String s = (String)object0;
                if(s == null) {
                    return new w();  // initializer: Ljava/lang/Object;-><init>()V
                }
                String s1 = associateTokenWithUserWorker0.i;
                if(s1 != null) {
                    B9.b b0 = associateTokenWithUserWorker0.g.d().a(s1);
                    if(b0 != null) {
                        String s2 = associateTokenWithUserWorker0.i;
                        if(s.equals(((String)associateTokenWithUserWorker0.h.b.get(s2)))) {
                            return new x();
                        }
                        hd.c.a.g("Associating user " + s2 + " with token [" + s + "]", new Object[0]);
                        B7 b70 = new B7(s);
                        try {
                            R6 r60 = b0.a();
                            a0.b0 = associateTokenWithUserWorker0;
                            a0.c0 = s;
                            a0.f0 = 2;
                            if(r60.f(b70, G6.Z, a0) != object1) {
                                associateTokenWithUserWorker1 = associateTokenWithUserWorker0;
                                s3 = s;
                                goto label_47;
                            }
                            return object1;
                        }
                        catch(T unused_ex) {
                            break;
                        }
                        catch(CancellationException unused_ex) {
                            return new w();  // initializer: Ljava/lang/Object;-><init>()V
                        }
                        catch(Exception exception0) {
                            n.b(new Exception("Could not associate user with push notification token", exception0), i1.WARNING, null, 12);
                            return new v();
                        }
                    }
                }
                return new x();
            }
            case 2: {
                try {
                    s3 = a0.c0;
                    associateTokenWithUserWorker1 = a0.b0;
                    f.b0(object0);
                label_47:
                    associateTokenWithUserWorker1.h.b.put(associateTokenWithUserWorker1.i, s3);
                    return new x();
                }
                catch(T unused_ex) {
                    break;
                }
                catch(CancellationException unused_ex) {
                    return new w();  // initializer: Ljava/lang/Object;-><init>()V
                }
                catch(Exception exception0) {
                    n.b(new Exception("Could not associate user with push notification token", exception0), i1.WARNING, null, 12);
                    return new v();
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        n.a("BackendNetworkError was thrown when trying to associate user with push notification token.", null, null, null, null, 30);
        return new w();  // initializer: Ljava/lang/Object;-><init>()V
    }
}

