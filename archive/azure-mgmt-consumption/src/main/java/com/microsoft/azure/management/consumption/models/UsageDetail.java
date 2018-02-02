/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import org.joda.time.DateTime;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An usage detail resource.
 */
@JsonFlatten
public class UsageDetail extends Resource {
    /**
     * The id of the billing period resource that the usage belongs to.
     */
    @JsonProperty(value = "properties.billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /**
     * The id of the invoice resource that the usage belongs to.
     */
    @JsonProperty(value = "properties.invoiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceId;

    /**
     * The start of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageStart;

    /**
     * The end of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageEnd;

    /**
     * The name of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /**
     * The uri of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /**
     * The location of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceLocation;

    /**
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * The quantity of usage.
     */
    @JsonProperty(value = "properties.usageQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal usageQuantity;

    /**
     * The billable usage quantity.
     */
    @JsonProperty(value = "properties.billableQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal billableQuantity;

    /**
     * The amount of cost before tax.
     */
    @JsonProperty(value = "properties.pretaxCost", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal pretaxCost;

    /**
     * The estimated usage is subject to change.
     */
    @JsonProperty(value = "properties.isEstimated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEstimated;

    /**
     * The meter id.
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /**
     * The details about the meter. By default this is not populated, unless
     * it's specified in $expand.
     */
    @JsonProperty(value = "properties.meterDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetails meterDetails;

    /**
     * Subscription guid.
     */
    @JsonProperty(value = "properties.subscriptionGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionGuid;

    /**
     * Subscription name.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /**
     * Account name.
     */
    @JsonProperty(value = "properties.accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /**
     * Department name.
     */
    @JsonProperty(value = "properties.departmentName", access = JsonProperty.Access.WRITE_ONLY)
    private String departmentName;

    /**
     * Product name.
     */
    @JsonProperty(value = "properties.product", access = JsonProperty.Access.WRITE_ONLY)
    private String product;

    /**
     * Consumed service name.
     */
    @JsonProperty(value = "properties.consumedService", access = JsonProperty.Access.WRITE_ONLY)
    private String consumedService;

    /**
     * The cost center of this department if it is a department and a
     * costcenter exists.
     */
    @JsonProperty(value = "properties.costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /**
     * Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     */
    @JsonProperty(value = "properties.additionalProperties", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalProperties;

    /**
     * Get the billingPeriodId value.
     *
     * @return the billingPeriodId value
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the invoiceId value.
     *
     * @return the invoiceId value
     */
    public String invoiceId() {
        return this.invoiceId;
    }

    /**
     * Get the usageStart value.
     *
     * @return the usageStart value
     */
    public DateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the usageEnd value.
     *
     * @return the usageEnd value
     */
    public DateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the instanceName value.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Get the instanceId value.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the instanceLocation value.
     *
     * @return the instanceLocation value
     */
    public String instanceLocation() {
        return this.instanceLocation;
    }

    /**
     * Get the currency value.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the usageQuantity value.
     *
     * @return the usageQuantity value
     */
    public BigDecimal usageQuantity() {
        return this.usageQuantity;
    }

    /**
     * Get the billableQuantity value.
     *
     * @return the billableQuantity value
     */
    public BigDecimal billableQuantity() {
        return this.billableQuantity;
    }

    /**
     * Get the pretaxCost value.
     *
     * @return the pretaxCost value
     */
    public BigDecimal pretaxCost() {
        return this.pretaxCost;
    }

    /**
     * Get the isEstimated value.
     *
     * @return the isEstimated value
     */
    public Boolean isEstimated() {
        return this.isEstimated;
    }

    /**
     * Get the meterId value.
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the meterDetails value.
     *
     * @return the meterDetails value
     */
    public MeterDetails meterDetails() {
        return this.meterDetails;
    }

    /**
     * Get the subscriptionGuid value.
     *
     * @return the subscriptionGuid value
     */
    public String subscriptionGuid() {
        return this.subscriptionGuid;
    }

    /**
     * Get the subscriptionName value.
     *
     * @return the subscriptionName value
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get the accountName value.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get the departmentName value.
     *
     * @return the departmentName value
     */
    public String departmentName() {
        return this.departmentName;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Get the consumedService value.
     *
     * @return the consumedService value
     */
    public String consumedService() {
        return this.consumedService;
    }

    /**
     * Get the costCenter value.
     *
     * @return the costCenter value
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public String additionalProperties() {
        return this.additionalProperties;
    }

}
