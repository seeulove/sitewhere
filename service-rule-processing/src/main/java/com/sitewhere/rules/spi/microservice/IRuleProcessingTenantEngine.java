/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rules.spi.microservice;

import com.sitewhere.rules.configuration.RuleProcessingTenantConfiguration;
import com.sitewhere.rules.spi.IRuleProcessorsManager;
import com.sitewhere.spi.microservice.multitenant.IMicroserviceTenantEngine;

/**
 * Extends {@link IMicroserviceTenantEngine} with features specific to rule
 * processing.
 */
public interface IRuleProcessingTenantEngine extends IMicroserviceTenantEngine<RuleProcessingTenantConfiguration> {

    /**
     * Get manager for rule processors.
     * 
     * @return
     */
    public IRuleProcessorsManager getRuleProcessorsManager();
}