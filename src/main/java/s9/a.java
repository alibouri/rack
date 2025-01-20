package s9;

import Gb.b;

public enum a {
    SETTINGS("SETTINGS"),
    EMPTYTXHISTORY("EMPTYTXHISTORY"),
    PIN_RECOVERY("PIN_RECOVERY"),
    IN_APP_PIN_RECOVERY("IN_APP_PIN_RECOVERY"),
    ACCOUNT_ACCESS("ACCOUNT_ACCESS"),
    ACCOUNT_CLOSURE("ACCOUNT_CLOSURE"),
    SMS_CODE_HELP("SMS_CODE_HELP"),
    SIGNUP_LOGIN("SIGNUP_LOGIN"),
    REVERSE_TX("REVERSE_TX"),
    UNLOCK_VAULT("UNLOCK_VAULT");

    public final String X;

    static {
        a.j0 = arr_a;
        new b(arr_a);
    }

    public a(String s1) {
        this.X = s1;
    }
}

