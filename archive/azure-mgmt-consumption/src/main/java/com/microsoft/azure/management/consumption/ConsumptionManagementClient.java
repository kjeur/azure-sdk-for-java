/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for ConsumptionManagementClient class.
 */
public interface ConsumptionManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Version of the API to be used with the client request. The current version is 2018-01-31..
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Gets Azure Subscription ID..
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Sets Azure Subscription ID..
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    ConsumptionManagementClient withSubscriptionId(String subscriptionId);

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    ConsumptionManagementClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    ConsumptionManagementClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    ConsumptionManagementClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the UsageDetails object to access its operations.
     * @return the UsageDetails object.
     */
    UsageDetails usageDetails();

    /**
     * Gets the Marketplaces object to access its operations.
     * @return the Marketplaces object.
     */
    Marketplaces marketplaces();

    /**
     * Gets the ReservationsSummaries object to access its operations.
     * @return the ReservationsSummaries object.
     */
    ReservationsSummaries reservationsSummaries();

    /**
     * Gets the ReservationsDetails object to access its operations.
     * @return the ReservationsDetails object.
     */
    ReservationsDetails reservationsDetails();

    /**
     * Gets the Budgets object to access its operations.
     * @return the Budgets object.
     */
    Budgets budgets();

    /**
     * Gets the Operations object to access its operations.
     * @return the Operations object.
     */
    Operations operations();

    /**
     * Gets the PriceSheets object to access its operations.
     * @return the PriceSheets object.
     */
    PriceSheets priceSheets();

}