/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption;

import .models.ErrorResponseException;
import .models.PriceSheetResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PriceSheets.
 */
public interface PriceSheets {
    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResult object if successful.
     */
    PriceSheetResult get();

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PriceSheetResult> getAsync(final ServiceCallback<PriceSheetResult> serviceCallback);

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<PriceSheetResult> getAsync();

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<ServiceResponse<PriceSheetResult>> getWithServiceResponseAsync();
    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResult object if successful.
     */
    PriceSheetResult get(String expand, String skiptoken);

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PriceSheetResult> getAsync(String expand, String skiptoken, final ServiceCallback<PriceSheetResult> serviceCallback);

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<PriceSheetResult> getAsync(String expand, String skiptoken);

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<ServiceResponse<PriceSheetResult>> getWithServiceResponseAsync(String expand, String skiptoken);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResult object if successful.
     */
    PriceSheetResult getByBillingPeriod(String billingPeriodName);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName, final ServiceCallback<PriceSheetResult> serviceCallback);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<ServiceResponse<PriceSheetResult>> getByBillingPeriodWithServiceResponseAsync(String billingPeriodName);
    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResult object if successful.
     */
    PriceSheetResult getByBillingPeriod(String billingPeriodName, String expand, String skiptoken);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName, String expand, String skiptoken, final ServiceCallback<PriceSheetResult> serviceCallback);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName, String expand, String skiptoken);

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    Observable<ServiceResponse<PriceSheetResult>> getByBillingPeriodWithServiceResponseAsync(String billingPeriodName, String expand, String skiptoken);

}
