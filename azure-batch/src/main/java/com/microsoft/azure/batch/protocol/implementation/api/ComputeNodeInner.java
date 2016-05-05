/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import org.joda.time.DateTime;
import java.util.List;

/**
 * A compute node in the Batch service.
 */
public class ComputeNodeInner {
    /**
     * Gets or sets the id of the compute node.
     */
    private String id;

    /**
     * Gets or sets the URL of the compute node.
     */
    private String url;

    /**
     * Gets or sets the current state of the compute node. Possible values
     * include: 'idle', 'rebooting', 'reimaging', 'running', 'unusable',
     * 'creating', 'starting', 'waitingforstarttask', 'starttaskfailed',
     * 'unknown', 'leavingpool', 'offline'.
     */
    private ComputeNodeState state;

    /**
     * Gets or sets whether the compute node should be available for task
     * scheduling. Possible values include: 'enabled', 'disabled'.
     */
    private SchedulingState schedulingState;

    /**
     * Gets or sets the time at which the compute node entered its current
     * state.
     */
    private DateTime stateTransitionTime;

    /**
     * Gets or sets the time at which the compute node was started.
     */
    private DateTime lastBootTime;

    /**
     * Gets or sets the time at which this compute node was allocated to the
     * pool.
     */
    private DateTime allocationTime;

    /**
     * Gets or sets the IP address that other compute nodes can use to
     * communicate with this compute node.
     */
    private String ipAddress;

    /**
     * Gets or sets an identifier which can be passed in the Add Task API to
     * request that the task be scheduled close to this compute node.
     */
    private String affinityId;

    /**
     * Gets or sets the size of the virtual machine hosting the compute node.
     */
    private String vmSize;

    /**
     * Gets or sets the total number of job tasks completed on the compute
     * node. This includes Job Preparation, Job Release and Job Manager
     * tasks, but not the pool start task.
     */
    private Integer totalTasksRun;

    /**
     * Gets or sets the list of tasks that are currently running on the
     * compute node.
     */
    private List<TaskInformation> recentTasks;

    /**
     * Gets or sets the task specified to run on the compute node as it joins
     * the pool.
     */
    private StartTask startTask;

    /**
     * Gets or sets runtime information about the execution of the start task
     * on the compute node.
     */
    private StartTaskInformation startTaskInfo;

    /**
     * Gets or sets the list of certificates installed on the compute node.
     */
    private List<CertificateReference> certificateReferences;

    /**
     * Gets or sets the list of errors that are currently being encountered by
     * the compute node.
     */
    private List<ComputeNodeError> errors;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public ComputeNodeState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setState(ComputeNodeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the schedulingState value.
     *
     * @return the schedulingState value
     */
    public SchedulingState schedulingState() {
        return this.schedulingState;
    }

    /**
     * Set the schedulingState value.
     *
     * @param schedulingState the schedulingState value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setSchedulingState(SchedulingState schedulingState) {
        this.schedulingState = schedulingState;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get the lastBootTime value.
     *
     * @return the lastBootTime value
     */
    public DateTime lastBootTime() {
        return this.lastBootTime;
    }

    /**
     * Set the lastBootTime value.
     *
     * @param lastBootTime the lastBootTime value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setLastBootTime(DateTime lastBootTime) {
        this.lastBootTime = lastBootTime;
        return this;
    }

    /**
     * Get the allocationTime value.
     *
     * @return the allocationTime value
     */
    public DateTime allocationTime() {
        return this.allocationTime;
    }

    /**
     * Set the allocationTime value.
     *
     * @param allocationTime the allocationTime value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setAllocationTime(DateTime allocationTime) {
        this.allocationTime = allocationTime;
        return this;
    }

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the affinityId value.
     *
     * @return the affinityId value
     */
    public String affinityId() {
        return this.affinityId;
    }

    /**
     * Set the affinityId value.
     *
     * @param affinityId the affinityId value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setAffinityId(String affinityId) {
        this.affinityId = affinityId;
        return this;
    }

    /**
     * Get the vmSize value.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize value.
     *
     * @param vmSize the vmSize value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the totalTasksRun value.
     *
     * @return the totalTasksRun value
     */
    public Integer totalTasksRun() {
        return this.totalTasksRun;
    }

    /**
     * Set the totalTasksRun value.
     *
     * @param totalTasksRun the totalTasksRun value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setTotalTasksRun(Integer totalTasksRun) {
        this.totalTasksRun = totalTasksRun;
        return this;
    }

    /**
     * Get the recentTasks value.
     *
     * @return the recentTasks value
     */
    public List<TaskInformation> recentTasks() {
        return this.recentTasks;
    }

    /**
     * Set the recentTasks value.
     *
     * @param recentTasks the recentTasks value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setRecentTasks(List<TaskInformation> recentTasks) {
        this.recentTasks = recentTasks;
        return this;
    }

    /**
     * Get the startTask value.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set the startTask value.
     *
     * @param startTask the startTask value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the startTaskInfo value.
     *
     * @return the startTaskInfo value
     */
    public StartTaskInformation startTaskInfo() {
        return this.startTaskInfo;
    }

    /**
     * Set the startTaskInfo value.
     *
     * @param startTaskInfo the startTaskInfo value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setStartTaskInfo(StartTaskInformation startTaskInfo) {
        this.startTaskInfo = startTaskInfo;
        return this;
    }

    /**
     * Get the certificateReferences value.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set the certificateReferences value.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<ComputeNodeError> errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the ComputeNodeInner object itself.
     */
    public ComputeNodeInner setErrors(List<ComputeNodeError> errors) {
        this.errors = errors;
        return this;
    }

}