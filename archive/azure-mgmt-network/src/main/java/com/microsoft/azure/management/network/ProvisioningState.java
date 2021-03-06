/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ProvisioningState.
 */
public final class ProvisioningState {
    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = new ProvisioningState("Succeeded");

    /** Static value Updating for ProvisioningState. */
    public static final ProvisioningState UPDATING = new ProvisioningState("Updating");

    /** Static value Deleting for ProvisioningState. */
    public static final ProvisioningState DELETING = new ProvisioningState("Deleting");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = new ProvisioningState("Failed");

    private String value;

    /**
     * Creates a custom value for ProvisioningState.
     * @param value the custom value
     */
    public ProvisioningState(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProvisioningState)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ProvisioningState rhs = (ProvisioningState) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
