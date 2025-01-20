package W9;

import Ab.t;
import Nb.j;
import android.content.Intent;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.shared.VerifyAuthCodeActivity;
import com.sendwave.shared.VerifyAuthCodeParams;
import com.sendwave.util.UserRepository;
import com.wave.customer.RecoverPinActivity;
import com.wave.customer.RecoverPinSubmitter.RecoverPinUnlockMutator;
import com.wave.customer.RecoverPinWorkflow.StepVerifyAuthCode;
import kotlin.jvm.functions.Function3;
import q9.d0;

public final class a implements Function3 {
    public final int X;
    public final Object Y;

    public a(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        Object object3 = t.a;
        Object object4 = this.Y;
        switch(this.X) {
            case 0: {
                j.f(((String)object0), "announcementId");
                j.f(((String)object1), "voiceMessageUri");
                if(((Boolean)object2).booleanValue()) {
                    ((d0)object4).h0.e();
                    return object3;
                }
                ((d0)object4).h0.g(((String)object0), ((String)object1));
                return object3;
            }
            case 1: {
                j.f(((String)object0), "announcementId");
                j.f(((String)object1), "voiceMessageUri");
                if(((Boolean)object2).booleanValue()) {
                    ((d0)object4).h0.e();
                    return object3;
                }
                ((d0)object4).h0.g(((String)object0), ((String)object1));
                return object3;
            }
            default: {
                j.f(((String)object0), "mobile");
                j.f(((String)object1), "pin");
                j.f(((FragmentHandle)object2), "tokenHandle");
                VerifyAuthCodeParams verifyAuthCodeParams0 = new VerifyAuthCodeParams(((FragmentHandle)object2), null, new UserRepository(), new RecoverPinSubmitter.RecoverPinUnlockMutator(), ((String)object0), false, 0x3E0);
                StepVerifyAuthCode recoverPinWorkflow$StepVerifyAuthCode0 = new StepVerifyAuthCode(((String)object1));
                Intent intent0 = new Intent(((RecoverPinActivity)object4), VerifyAuthCodeActivity.class);
                intent0.putExtra("com.wave.typeSafeExtras", verifyAuthCodeParams0);
                intent0.putExtra("com.wave.workflowState", recoverPinWorkflow$StepVerifyAuthCode0);
                ((RecoverPinActivity)object4).H0.a(intent0);
                return object3;
            }
        }
    }
}

