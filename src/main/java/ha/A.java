package Ha;

import V8.d;
import com.sendwave.backend.FragmentHandle;
import com.wave.accounts.AccountEvent;
import com.wave.customer.SignupLoginParams;

public interface a extends d {
    void E(FragmentHandle arg1, AccountEvent arg2);

    void N(String arg1, String arg2);

    void a(SignupLoginParams arg1);
}

