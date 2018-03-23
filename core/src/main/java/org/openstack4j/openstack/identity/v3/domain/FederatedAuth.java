package org.openstack4j.openstack.identity.v3.domain;

import org.openstack4j.model.identity.AuthStore;
import org.openstack4j.model.identity.AuthVersion;
import org.openstack4j.model.identity.v3.Authentication;
import org.openstack4j.openstack.common.Auth.Type;

/**
 * an v3 auth object
 *
 * @author Johannes hiemer.
 * @see <a href="http://developer.openstack.org/api-ref-identity-v3.html#authenticate">API reference</a>
 */
public class FederatedAuth implements Authentication, AuthStore {

    private static final long serialVersionUID = 1L;

    private String idpId;
    private String protocolId;
    private String accessToken;

    private Type type;

    public FederatedAuth(String idpId, String protocolId, String accessToken) {
        super();
        this.idpId = idpId;
        this.protocolId = protocolId;
        this.accessToken = accessToken;
        this.type = Type.TOKEN;
    }

    protected FederatedAuth(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public AuthVersion getVersion() {
        return AuthVersion.V3_FEDERATION;
    }

    @Override
    public Identity getIdentity() {
        return null;
    }

    @Override
    public Scope getScope() {
        return null;
    }

}
