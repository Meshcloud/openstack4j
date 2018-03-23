package org.openstack4j.model.network.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.NetQuota;

/**
 * A Builder which creates a NetQuota entity
 * 
 * @author Jeremy Unruh
 */
public interface NetQuotaBuilder extends Builder<NetQuotaBuilder, NetQuota>{

    /**
     * See {@link NetQuota#getSubnet()} for details
     * 
     * @param subnet the max subnets allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder subnet(int subnet);

    /**
     * See {@link NetQuota#getSubnetpool()} for details
     *
     * @param subnetpool the max subnet pools allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder subnetpool(int subnetpool);
 
    /**
     * See {@link NetQuota#getRouter()} for details
     * 
     * @param router the max routers allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder router(int router);
    
    /**
     * See {@link NetQuota#getPort()} for details
     * 
     * @param port the max ports allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder port(int port);
    
    /**
     * See {@link NetQuota#getNetwork()} for details
     * 
     * @param network the max networks allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder network(int network);
    
    /**
     * See {@link NetQuota#getFloatingIP()} for details
     * 
     * @param floatingIP the max floating IPAddresses allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder floatingIP(int floatingIP);

    /**
     * See {@link NetQuota#getSecurityGroup()} for details
     *
     * @param securityGroup the max security group allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder securityGroup(int securityGroup);

    /**
     * See {@link NetQuota#getSecurityGroupRule()} for details
     *
     * @param securityGroupRule the max security group rules allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder securityGroupRule(int securityGroupRule);

    /**
     * See {@link NetQuota#getL7policy()} ()} for details
     *
     * @param l7policy the max LBaaS L7 policies allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder l7policy(int l7policy);

    /**
     * See {@link NetQuota#getListener()} ()} for details
     *
     * @param listener the max LBaaS listeners allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder listener(int listener);

    /**
     * See {@link NetQuota#getLoadbalancer()} ()} for details
     *
     * @param loadbalancer the max LBaaS load balancers allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder loadbalancer(int loadbalancer);

    /**
     * See {@link NetQuota#getHealthmonitor()} ()} for details
     *
     * @param healthmonitor the max LBaaS health monitors allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder healthmonitor(int healthmonitor);

    /**
     * See {@link NetQuota#getPool()} ()} for details
     *
     * @param pool the max LBaaS pools allowed
     * @return NetQuotaBuilder
     */
    NetQuotaBuilder pool(int pool);
}
