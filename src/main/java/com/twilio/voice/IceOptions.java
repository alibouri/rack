package com.twilio.voice;

import java.util.HashSet;
import java.util.Set;

public class IceOptions {
    public static class Builder {
        private Set iceServers;
        private IceTransportPolicy iceTransportPolicy;

        public Builder() {
            this.iceTransportPolicy = IceTransportPolicy.ALL;
        }

        public static Set a(Builder iceOptions$Builder0) {
            return iceOptions$Builder0.iceServers;
        }

        public static IceTransportPolicy b(Builder iceOptions$Builder0) {
            return iceOptions$Builder0.iceTransportPolicy;
        }

        public IceOptions build() {
            return new IceOptions(this, 0);
        }

        public Builder iceServers(Set set0) {
            Preconditions.checkNotNull(set0, "iceServers must not be null");
            this.iceServers = set0;
            return this;
        }

        public Builder iceTransportPolicy(IceTransportPolicy iceTransportPolicy0) {
            Preconditions.checkNotNull(iceTransportPolicy0, "iceTransportPolicy must not be null");
            this.iceTransportPolicy = iceTransportPolicy0;
            return this;
        }
    }

    private final Set iceServers;
    private final IceTransportPolicy iceTransportPolicy;

    private IceOptions(Builder iceOptions$Builder0) {
        Set set0 = Builder.a(iceOptions$Builder0) == null ? new HashSet() : Builder.a(iceOptions$Builder0);
        this.iceServers = set0;
        this.iceTransportPolicy = Builder.b(iceOptions$Builder0);
    }

    public IceOptions(Builder iceOptions$Builder0, int v) {
        this(iceOptions$Builder0);
    }

    public Set getIceServers() {
        return this.iceServers;
    }

    public IceServer[] getIceServersArray() {
        return this.iceServers.size() <= 0 ? new IceServer[0] : ((IceServer[])this.iceServers.toArray(new IceServer[this.iceServers.size()]));
    }

    public IceTransportPolicy getIceTransportPolicy() {
        return this.iceTransportPolicy;
    }
}

