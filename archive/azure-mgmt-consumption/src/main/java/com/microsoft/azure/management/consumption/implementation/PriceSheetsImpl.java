/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.implementation;

import retrofit2.Retrofit;
import .PriceSheets;
import .models.ErrorResponseException;
import .models.PriceSheetResult;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PriceSheets.
 */
public class PriceSheetsImpl implements PriceSheets {
    /** The Retrofit service to perform REST calls. */
    private PriceSheetsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of PriceSheetsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PriceSheetsImpl(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(PriceSheetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PriceSheets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PriceSheetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: .PriceSheets get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Consumption/pricesheets/default")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Query("$expand") String expand, @Query("$skiptoken") String skiptoken, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: .PriceSheets getByBillingPeriod" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/providers/Microsoft.Consumption/pricesheets/default")
        Observable<Response<ResponseBody>> getByBillingPeriod(@Path("subscriptionId") String subscriptionId, @Path("billingPeriodName") String billingPeriodName, @Query("$expand") String expand, @Query("$skiptoken") String skiptoken, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResult object if successful.
     */
    public PriceSheetResult get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResult> getAsync(final ServiceCallback<PriceSheetResult> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<PriceSheetResult> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<PriceSheetResult>, PriceSheetResult>() {
            @Override
            public PriceSheetResult call(ServiceResponse<PriceSheetResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<ServiceResponse<PriceSheetResult>> getWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String skiptoken = null;
        return service.get(this.client.subscriptionId(), expand, skiptoken, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResult>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResult> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public PriceSheetResult get(String expand, String skiptoken) {
        return getWithServiceResponseAsync(expand, skiptoken).toBlocking().single().body();
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResult> getAsync(String expand, String skiptoken, final ServiceCallback<PriceSheetResult> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(expand, skiptoken), serviceCallback);
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<PriceSheetResult> getAsync(String expand, String skiptoken) {
        return getWithServiceResponseAsync(expand, skiptoken).map(new Func1<ServiceResponse<PriceSheetResult>, PriceSheetResult>() {
            @Override
            public PriceSheetResult call(ServiceResponse<PriceSheetResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<ServiceResponse<PriceSheetResult>> getWithServiceResponseAsync(String expand, String skiptoken) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), expand, skiptoken, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResult>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResult> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PriceSheetResult> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PriceSheetResult, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PriceSheetResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PriceSheetResult object if successful.
     */
    public PriceSheetResult getByBillingPeriod(String billingPeriodName) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName).toBlocking().single().body();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName, final ServiceCallback<PriceSheetResult> serviceCallback) {
        return ServiceFuture.fromResponse(getByBillingPeriodWithServiceResponseAsync(billingPeriodName), serviceCallback);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName).map(new Func1<ServiceResponse<PriceSheetResult>, PriceSheetResult>() {
            @Override
            public PriceSheetResult call(ServiceResponse<PriceSheetResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<ServiceResponse<PriceSheetResult>> getByBillingPeriodWithServiceResponseAsync(String billingPeriodName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (billingPeriodName == null) {
            throw new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String skiptoken = null;
        return service.getByBillingPeriod(this.client.subscriptionId(), billingPeriodName, expand, skiptoken, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResult>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResult> clientResponse = getByBillingPeriodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public PriceSheetResult getByBillingPeriod(String billingPeriodName, String expand, String skiptoken) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName, expand, skiptoken).toBlocking().single().body();
    }

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
    public ServiceFuture<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName, String expand, String skiptoken, final ServiceCallback<PriceSheetResult> serviceCallback) {
        return ServiceFuture.fromResponse(getByBillingPeriodWithServiceResponseAsync(billingPeriodName, expand, skiptoken), serviceCallback);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName, String expand, String skiptoken) {
        return getByBillingPeriodWithServiceResponseAsync(billingPeriodName, expand, skiptoken).map(new Func1<ServiceResponse<PriceSheetResult>, PriceSheetResult>() {
            @Override
            public PriceSheetResult call(ServiceResponse<PriceSheetResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PriceSheetResult object
     */
    public Observable<ServiceResponse<PriceSheetResult>> getByBillingPeriodWithServiceResponseAsync(String billingPeriodName, String expand, String skiptoken) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (billingPeriodName == null) {
            throw new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByBillingPeriod(this.client.subscriptionId(), billingPeriodName, expand, skiptoken, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PriceSheetResult>>>() {
                @Override
                public Observable<ServiceResponse<PriceSheetResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PriceSheetResult> clientResponse = getByBillingPeriodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PriceSheetResult> getByBillingPeriodDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PriceSheetResult, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PriceSheetResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
