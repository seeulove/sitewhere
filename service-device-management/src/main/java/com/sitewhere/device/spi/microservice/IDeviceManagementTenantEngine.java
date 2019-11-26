/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.device.spi.microservice;

import com.sitewhere.device.configuration.DeviceManagementTenantConfiguration;
import com.sitewhere.device.spi.kafka.IDeviceInteractionEventsProducer;
import com.sitewhere.grpc.service.DeviceManagementGrpc;
import com.sitewhere.microservice.api.device.IDeviceManagement;
import com.sitewhere.spi.microservice.multitenant.IMicroserviceTenantEngine;

/**
 * Extends {@link IMicroserviceTenantEngine} with features specific to device
 * management.
 */
public interface IDeviceManagementTenantEngine extends IMicroserviceTenantEngine<DeviceManagementTenantConfiguration> {

    /**
     * Get associated device management implementation.
     * 
     * @return
     */
    public IDeviceManagement getDeviceManagement();

    /**
     * Get implementation class that wraps device management with GRPC conversions.
     * 
     * @return
     */
    public DeviceManagementGrpc.DeviceManagementImplBase getDeviceManagementImpl();

    /**
     * Get Kafka producer for events generated by device interactions.
     * 
     * @return
     */
    public IDeviceInteractionEventsProducer getDeviceInteractionEventsProducer();
}