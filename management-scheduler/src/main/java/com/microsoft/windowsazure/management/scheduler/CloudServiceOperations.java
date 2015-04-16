/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.scheduler;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.scheduler.models.CloudServiceCreateParameters;
import com.microsoft.windowsazure.management.scheduler.models.CloudServiceGetResponse;
import com.microsoft.windowsazure.management.scheduler.models.CloudServiceListResponse;
import com.microsoft.windowsazure.management.scheduler.models.CloudServiceOperationStatusResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

public interface CloudServiceOperations {
    /**
    * Create a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @param parameters Required. Parameters supplied to the Create cloud
    * service operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginCreating(String cloudServiceName, CloudServiceCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Create a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @param parameters Required. Parameters supplied to the Create cloud
    * service operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginCreatingAsync(String cloudServiceName, CloudServiceCreateParameters parameters);
    
    /**
    * Delete a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginDeleting(String cloudServiceName) throws IOException, ServiceException;
    
    /**
    * Delete a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginDeletingAsync(String cloudServiceName);
    
    /**
    * Create a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @param parameters Required. Parameters supplied to the Create cloud
    * service operation.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    CloudServiceOperationStatusResponse create(String cloudServiceName, CloudServiceCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Create a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @param parameters Required. Parameters supplied to the Create cloud
    * service operation.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<CloudServiceOperationStatusResponse> createAsync(String cloudServiceName, CloudServiceCreateParameters parameters);
    
    /**
    * Delete a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    CloudServiceOperationStatusResponse delete(String cloudServiceName) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Delete a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<CloudServiceOperationStatusResponse> deleteAsync(String cloudServiceName);
    
    /**
    * Retreive a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Information about a retrieved Cloud Service.
    */
    CloudServiceGetResponse get(String cloudServiceName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Retreive a cloud service.
    *
    * @param cloudServiceName Required. The cloud service name.
    * @return Information about a retrieved Cloud Service.
    */
    Future<CloudServiceGetResponse> getAsync(String cloudServiceName);
    
    /**
    * The List Cloud Services operation enumerates services that are
    * provisioned for a subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response structure for the Cloud Service List operation.
    */
    CloudServiceListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The List Cloud Services operation enumerates services that are
    * provisioned for a subscription.
    *
    * @return The response structure for the Cloud Service List operation.
    */
    Future<CloudServiceListResponse> listAsync();
}
