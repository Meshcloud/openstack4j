package org.openstack4j.openstack.identity.v3.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.identity.v3.*;
import org.openstack4j.model.common.Extension;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.openstack.common.ExtensionValue.ExtensionList;
import org.openstack4j.openstack.identity.v3.domain.KeystoneProject.Projects;
import org.openstack4j.openstack.internal.BaseOpenStackService;

import java.util.List;

import static org.openstack4j.core.transport.ClientConstants.PATH_EXTENSIONS;
import static org.openstack4j.core.transport.ClientConstants.PATH_PROJECT_SCOPES;

/**
 * Identity V3 service implementation
 */
public class IdentityServiceImpl extends BaseOpenStackService implements IdentityService {

    @Override
    public CredentialService credentials() {
        return Apis.get(CredentialService.class);
    }

    @Override
    public DomainService domains() {
        return Apis.get(DomainService.class);
    }

    @Override
    public ProjectService projects() {
        return Apis.get(ProjectService.class);
    }

    @Override
    public List<? extends Project> listAuthProjects() {
        return get(Projects.class, PATH_PROJECT_SCOPES).execute().getList();
    }

    @Override
    public UserService users() {
        return Apis.get(UserService.class);
    }

    @Override
    public RoleService roles() {
        return Apis.get(RoleService.class);
    }

    @Override
    public GroupService groups() {
        return Apis.get(GroupService.class);
    }

    @Override
    public PolicyService policies() {
        return Apis.get(PolicyService.class);
    }

    @Override
    public ServiceEndpointService serviceEndpoints() {
        return Apis.get(ServiceEndpointService.class);
    }

    @Override
    public RegionService regions() {
        return Apis.get(RegionService.class);
    }

    @Override
    public TokenService tokens() {
        return Apis.get(TokenService.class);
    }

    @Override
    public FederationService federations() {
        return Apis.get(FederationService.class);
    }

    @Override
    public List<? extends Extension> listExtensions() {
        return get(ExtensionList.class, PATH_EXTENSIONS).execute().getList();
    }

}