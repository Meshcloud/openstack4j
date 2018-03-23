package org.openstack4j.model.network;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.network.builder.NetQuotaBuilder;

/**
 * Network quotas that are bound to a Tenant
 * 
 * @author Jeremy Unruh
 */
public interface NetQuota extends ModelEntity, Buildable<NetQuotaBuilder> {

    /**
     * Number of subnets allowed per tenant
     * 
     * @return number of subnets
     */
    int getSubnet();

    /**
     * Number of subnet pools allowed per tenant
     *
     * @return number of subnet pools
     */
    int getSubnetpool();
    
    /**
     * Number of routers allowed per tenant
     * 
     * @return number of routers
     */
    int getRouter();
    
    /**
     * Number of ports allowed per tenant
     * 
     * @return number of ports
     */
    int getPort();
    
    /**
     * Number of networks allowed per tenant
     * 
     * @return number of networks
     */
    int getNetwork();
    
    /**
     * Number of floating IpAddresses allowed per tenant
     * 
     * @return number of float IpAddresses
     */
    int getFloatingIP();

    /**
     * Number of security groups per tenant
     *
     * @return number of security groups
     */
    int getSecurityGroup();

    /**
     * Number of security groups rules per security group per tenant
     *
     * @return number of security groups rules
     */
    int getSecurityGroupRule();

    /**
     * IMPORTANT! This property is only available when the LBaaS extension is active
     *
     * Number of LBaaS L7 policies per tenant
     *
     * @return number of LBaaS L7 policies
     */
    Integer getL7policy();

    /**
     * IMPORTANT! This property is only available when the LBaaS extension is active
     *
     * Number of LBaaS listeners per tenant
     *
     * @return number of LBaaS listeners
     */
    Integer getListener();

    /**
     * IMPORTANT! This property is only available when the LBaaS extension is active
     *
     * Number of LBaaS load balancers per tenant
     *
     * @return number of LBaaS load balancers
     */
    Integer getLoadbalancer();

    /**
     * IMPORTANT! This property is only available when the LBaaS extension is active
     *
     * Number of LBaaS health monitors per tenant
     *
     * @return number of LBaaS health monitors
     */
    Integer getHealthmonitor();

    /**
     * IMPORTANT! This property is only available when the LBaaS extension is active
     *
     * Number of LBaaS pools per tenant
     *
     * @return number of LBaaS pools
     */
    Integer getPool();

}
