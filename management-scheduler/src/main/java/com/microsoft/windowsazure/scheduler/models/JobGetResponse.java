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

package com.microsoft.windowsazure.scheduler.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The Get Job operation response.
*/
public class JobGetResponse extends OperationResponse {
    private Job job;
    
    /**
    * Optional. The job definition and status.
    * @return The Job value.
    */
    public Job getJob() {
        return this.job;
    }
    
    /**
    * Optional. The job definition and status.
    * @param jobValue The Job value.
    */
    public void setJob(final Job jobValue) {
        this.job = jobValue;
    }
}
