package org.openstack4j.openstack.telemetry.internal;

import org.openstack4j.api.types.ServiceType;

public class PankoEventServiceImpl extends EventServiceImpl {
    public PankoEventServiceImpl() {
        super(ServiceType.PANKO);
    }
}
