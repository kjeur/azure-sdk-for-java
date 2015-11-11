/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.models;

import com.microsoft.rest.BaseResource;

/**
 * The status code and count of the virtual machine scale set instance view
 * status summary.
 */
public class VirtualMachineStatusCodeCount {
    /**
     * Gets the instance view status code.
     */
    private String code;

    /**
     * Gets the number of instances having a particular status code.
     */
    private Integer count;

    /**
     * Get the code value.
     *
     * @return the code value
     */ 
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */ 
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

}