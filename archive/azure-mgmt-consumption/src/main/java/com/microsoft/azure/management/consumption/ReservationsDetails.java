/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption;

import .models.ErrorResponseException;
import .models.ReservationDetails;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ReservationsDetails.
 */
public interface ReservationsDetails {
    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetails&gt; object if successful.
     */
    PagedList<ReservationDetails> listByReservationOrder(final String reservationOrderId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ReservationDetails>> listByReservationOrderAsync(final String reservationOrderId, final String filter, final ListOperationCallback<ReservationDetails> serviceCallback);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<Page<ReservationDetails>> listByReservationOrderAsync(final String reservationOrderId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<ServiceResponse<Page<ReservationDetails>>> listByReservationOrderWithServiceResponseAsync(final String reservationOrderId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetails&gt; object if successful.
     */
    PagedList<ReservationDetails> listByReservationOrderAndReservation(final String reservationOrderId, final String reservationId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ReservationDetails>> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final String filter, final ListOperationCallback<ReservationDetails> serviceCallback);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<Page<ReservationDetails>> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The filter supports 'le' and  'ge'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<ServiceResponse<Page<ReservationDetails>>> listByReservationOrderAndReservationWithServiceResponseAsync(final String reservationOrderId, final String reservationId, final String filter);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetails&gt; object if successful.
     */
    PagedList<ReservationDetails> listByReservationOrderNext(final String nextPageLink);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ReservationDetails>> listByReservationOrderNextAsync(final String nextPageLink, final ServiceFuture<List<ReservationDetails>> serviceFuture, final ListOperationCallback<ReservationDetails> serviceCallback);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<Page<ReservationDetails>> listByReservationOrderNextAsync(final String nextPageLink);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<ServiceResponse<Page<ReservationDetails>>> listByReservationOrderNextWithServiceResponseAsync(final String nextPageLink);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ReservationDetails&gt; object if successful.
     */
    PagedList<ReservationDetails> listByReservationOrderAndReservationNext(final String nextPageLink);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ReservationDetails>> listByReservationOrderAndReservationNextAsync(final String nextPageLink, final ServiceFuture<List<ReservationDetails>> serviceFuture, final ListOperationCallback<ReservationDetails> serviceCallback);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<Page<ReservationDetails>> listByReservationOrderAndReservationNextAsync(final String nextPageLink);

    /**
     * Lists the reservations details for provided date range.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ReservationDetails&gt; object
     */
    Observable<ServiceResponse<Page<ReservationDetails>>> listByReservationOrderAndReservationNextWithServiceResponseAsync(final String nextPageLink);

}
