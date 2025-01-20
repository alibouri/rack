package M4;

import Nb.j;
import com.facebook.FacebookRequestError;

public final class n extends h {
    public final FacebookRequestError X;

    public n(FacebookRequestError facebookRequestError0, String s) {
        j.f(facebookRequestError0, "requestError");
        super(s);
        this.X = facebookRequestError0;
    }

    @Override  // M4.h
    public final String toString() {
        String s = "{FacebookServiceException: httpResponseCode: " + this.X.X + ", facebookErrorCode: " + this.X.Y + ", facebookErrorType: " + this.X.b0 + ", message: " + this.X.b() + "}";
        j.e(s, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return s;
    }
}

