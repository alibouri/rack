package Aa;

import Gb.b;
import Nb.j;
import java.util.Locale;

public enum x0 {
    PERSONAL_HOME,
    VAULT_HOME,
    VAULT_LOCK_EXPLAINER,
    VAULT_LOCK_SELECT_DURATION,
    VAULT_LOCK_CONFIRM,
    VAULT_CONFIRM_UNLOCK;

    static {
        x0.e0 = arr_x0;
        new b(arr_x0);
    }

    @Override
    public final String toString() {
        String s = super.toString().toLowerCase(Locale.ROOT);
        j.e(s, "toLowerCase(...)");
        return s;
    }
}

