/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobCollectionProperties model.
 */
public class JobCollectionProperties {
    /**
     * Gets or sets the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Gets or sets the state. Possible values include: 'Enabled', 'Disabled',
     * 'Suspended', 'Deleted'.
     */
    @JsonProperty(value = "state")
    private JobCollectionState state;

    /**
     * Gets or sets the job collection quota.
     */
    @JsonProperty(value = "quota")
    private JobCollectionQuota quota;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the JobCollectionProperties object itself.
     */
    public JobCollectionProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public JobCollectionState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the JobCollectionProperties object itself.
     */
    public JobCollectionProperties withState(JobCollectionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the quota value.
     *
     * @return the quota value
     */
    public JobCollectionQuota quota() {
        return this.quota;
    }

    /**
     * Set the quota value.
     *
     * @param quota the quota value to set
     * @return the JobCollectionProperties object itself.
     */
    public JobCollectionProperties withQuota(JobCollectionQuota quota) {
        this.quota = quota;
        return this;
    }

}
