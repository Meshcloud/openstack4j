/**
 *
 */
package org.openstack4j.api.identity;

import org.openstack4j.api.identity.v3.*;
import org.openstack4j.common.RestService;
import org.openstack4j.model.common.Extension;

import java.util.List;

/**
 * @author Christian Brinker, evoila.
 */
public interface IdentityService extends RestService {
    /**
     * Credential Service API
     *
     * @return the credential service
     */
    CredentialService credentials();

    /**
     * Projects Service API
     *
     * @return the project service
     */
    ProjectService projects();

    /**
     * Users Service API
     *
     * @return the user service
     */
    UserService users();

    /**
     * Role Service API
     *
     * @return the role service
     */
    RoleService roles();

    /**
     * Group Service API
     *
     * @return the group service
     */
    GroupService groups();

    /**
     * Token Service API
     *
     * @return the token service
     */
    TokenService tokens();

    /**
     * Policy Service API
     *
     * @return the policy service
     */
    PolicyService policies();

    /**
     * ServiceEndpoint Service API
     *
     * @return the service and endpoint service
     */
    ServiceEndpointService serviceEndpoints();

    /**
     * Region Service API
     *
     * @return the region service
     */
    RegionService regions();

    /**
     * Federation Service API
     *
     * @return the federation service
     */
    FederationService federations();

    /**
     * List extensions currently available on the OpenStack instance
     *
     * @return List of extensions
     */
    List<? extends Extension> listExtensions();
}
