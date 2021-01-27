package com.kirona.oow.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kirona.oow.api.model.LatLng;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StartRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-27T09:06:29.016Z[Europe/London]")


public class StartRequest   {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("jobDescription")
  private String jobDescription = null;

  @JsonProperty("jobCoordinate")
  private LatLng jobCoordinate = null;

  @JsonProperty("jobSlotStart")
  private String jobSlotStart = null;

  @JsonProperty("jobSlotEnd")
  private String jobSlotEnd = null;

  @JsonProperty("jobSlotName")
  private String jobSlotName = null;

  @JsonProperty("trackingExpiryMinutes")
  private Integer trackingExpiryMinutes = null;

  @JsonProperty("operativeId")
  private String operativeId = null;

  @JsonProperty("operativeName")
  private String operativeName = null;

  @JsonProperty("operativeContactNumber")
  private String operativeContactNumber = null;

  @JsonProperty("doNotTrackMinutes")
  private Long doNotTrackMinutes = null;

  @JsonProperty("customerNotifyEmailAddress")
  private String customerNotifyEmailAddress = null;

  @JsonProperty("customerNotifySMSNumber")
  private String customerNotifySMSNumber = null;

  @JsonProperty("extraData")
  @Valid
  private Map<String, String> extraData = null;

  public StartRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public StartRequest jobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
    return this;
  }

  /**
   * Get jobDescription
   * @return jobDescription
   **/
  @Schema(description = "")
  
    public String getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
  }

  public StartRequest jobCoordinate(LatLng jobCoordinate) {
    this.jobCoordinate = jobCoordinate;
    return this;
  }

  /**
   * Get jobCoordinate
   * @return jobCoordinate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LatLng getJobCoordinate() {
    return jobCoordinate;
  }

  public void setJobCoordinate(LatLng jobCoordinate) {
    this.jobCoordinate = jobCoordinate;
  }

  public StartRequest jobSlotStart(String jobSlotStart) {
    this.jobSlotStart = jobSlotStart;
    return this;
  }

  /**
   * Slot Start Time. Must be supplied together with jobSlotEnd.
   * @return jobSlotStart
   **/
  @Schema(example = "13:45", description = "Slot Start Time. Must be supplied together with jobSlotEnd.")
  
    public String getJobSlotStart() {
    return jobSlotStart;
  }

  public void setJobSlotStart(String jobSlotStart) {
    this.jobSlotStart = jobSlotStart;
  }

  public StartRequest jobSlotEnd(String jobSlotEnd) {
    this.jobSlotEnd = jobSlotEnd;
    return this;
  }

  /**
   * Slot End Time. Must be supplied together with jobSlotStart.
   * @return jobSlotEnd
   **/
  @Schema(example = "13:45", description = "Slot End Time. Must be supplied together with jobSlotStart.")
  
    public String getJobSlotEnd() {
    return jobSlotEnd;
  }

  public void setJobSlotEnd(String jobSlotEnd) {
    this.jobSlotEnd = jobSlotEnd;
  }

  public StartRequest jobSlotName(String jobSlotName) {
    this.jobSlotName = jobSlotName;
    return this;
  }

  /**
   * Get jobSlotName
   * @return jobSlotName
   **/
  @Schema(description = "")
  
    public String getJobSlotName() {
    return jobSlotName;
  }

  public void setJobSlotName(String jobSlotName) {
    this.jobSlotName = jobSlotName;
  }

  public StartRequest trackingExpiryMinutes(Integer trackingExpiryMinutes) {
    this.trackingExpiryMinutes = trackingExpiryMinutes;
    return this;
  }

  /**
   * Override the default expiry timer for this tracking request. Expires the tracking link X minutes after it is created, even when no stop is received.
   * @return trackingExpiryMinutes
   **/
  @Schema(description = "Override the default expiry timer for this tracking request. Expires the tracking link X minutes after it is created, even when no stop is received.")
  
    public Integer getTrackingExpiryMinutes() {
    return trackingExpiryMinutes;
  }

  public void setTrackingExpiryMinutes(Integer trackingExpiryMinutes) {
    this.trackingExpiryMinutes = trackingExpiryMinutes;
  }

  public StartRequest operativeId(String operativeId) {
    this.operativeId = operativeId;
    return this;
  }

  /**
   * Get operativeId
   * @return operativeId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOperativeId() {
    return operativeId;
  }

  public void setOperativeId(String operativeId) {
    this.operativeId = operativeId;
  }

  public StartRequest operativeName(String operativeName) {
    this.operativeName = operativeName;
    return this;
  }

  /**
   * Get operativeName
   * @return operativeName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOperativeName() {
    return operativeName;
  }

  public void setOperativeName(String operativeName) {
    this.operativeName = operativeName;
  }

  public StartRequest operativeContactNumber(String operativeContactNumber) {
    this.operativeContactNumber = operativeContactNumber;
    return this;
  }

  /**
   * Contact phone number for the operative. Include if you want an option to call the operative on the tracking page.
   * @return operativeContactNumber
   **/
  @Schema(description = "Contact phone number for the operative. Include if you want an option to call the operative on the tracking page.")
  
    public String getOperativeContactNumber() {
    return operativeContactNumber;
  }

  public void setOperativeContactNumber(String operativeContactNumber) {
    this.operativeContactNumber = operativeContactNumber;
  }

  public StartRequest doNotTrackMinutes(Long doNotTrackMinutes) {
    this.doNotTrackMinutes = doNotTrackMinutes;
    return this;
  }

  /**
   * Do not show any operative location having a timestamp before the tracking start time plus this many minutes.
   * @return doNotTrackMinutes
   **/
  @Schema(description = "Do not show any operative location having a timestamp before the tracking start time plus this many minutes.")
  
    public Long getDoNotTrackMinutes() {
    return doNotTrackMinutes;
  }

  public void setDoNotTrackMinutes(Long doNotTrackMinutes) {
    this.doNotTrackMinutes = doNotTrackMinutes;
  }

  public StartRequest customerNotifyEmailAddress(String customerNotifyEmailAddress) {
    this.customerNotifyEmailAddress = customerNotifyEmailAddress;
    return this;
  }

  /**
   * An e-mail address to send the tracking link to the customer. Either this OR customerNotifySMSNumber must be supplied.
   * @return customerNotifyEmailAddress
   **/
  @Schema(description = "An e-mail address to send the tracking link to the customer. Either this OR customerNotifySMSNumber must be supplied.")
  
    public String getCustomerNotifyEmailAddress() {
    return customerNotifyEmailAddress;
  }

  public void setCustomerNotifyEmailAddress(String customerNotifyEmailAddress) {
    this.customerNotifyEmailAddress = customerNotifyEmailAddress;
  }

  public StartRequest customerNotifySMSNumber(String customerNotifySMSNumber) {
    this.customerNotifySMSNumber = customerNotifySMSNumber;
    return this;
  }

  /**
   * An phone number to send the tracking link SMS to the customer. Either this OR customerNotifyEmailAddress must be supplied.
   * @return customerNotifySMSNumber
   **/
  @Schema(description = "An phone number to send the tracking link SMS to the customer. Either this OR customerNotifyEmailAddress must be supplied.")
  
    public String getCustomerNotifySMSNumber() {
    return customerNotifySMSNumber;
  }

  public void setCustomerNotifySMSNumber(String customerNotifySMSNumber) {
    this.customerNotifySMSNumber = customerNotifySMSNumber;
  }

  public StartRequest extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public StartRequest putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

  /**
   * Additional data related to the job. Can be refered to if you use custom e-mail / SMS / tracking page templates. Add an 'avatarUrl' value to include an operative image on the tracking page.
   * @return extraData
   **/
  @Schema(description = "Additional data related to the job. Can be refered to if you use custom e-mail / SMS / tracking page templates. Add an 'avatarUrl' value to include an operative image on the tracking page.")
  
    public Map<String, String> getExtraData() {
    return extraData;
  }

  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartRequest startRequest = (StartRequest) o;
    return Objects.equals(this.externalId, startRequest.externalId) &&
        Objects.equals(this.jobDescription, startRequest.jobDescription) &&
        Objects.equals(this.jobCoordinate, startRequest.jobCoordinate) &&
        Objects.equals(this.jobSlotStart, startRequest.jobSlotStart) &&
        Objects.equals(this.jobSlotEnd, startRequest.jobSlotEnd) &&
        Objects.equals(this.jobSlotName, startRequest.jobSlotName) &&
        Objects.equals(this.trackingExpiryMinutes, startRequest.trackingExpiryMinutes) &&
        Objects.equals(this.operativeId, startRequest.operativeId) &&
        Objects.equals(this.operativeName, startRequest.operativeName) &&
        Objects.equals(this.operativeContactNumber, startRequest.operativeContactNumber) &&
        Objects.equals(this.doNotTrackMinutes, startRequest.doNotTrackMinutes) &&
        Objects.equals(this.customerNotifyEmailAddress, startRequest.customerNotifyEmailAddress) &&
        Objects.equals(this.customerNotifySMSNumber, startRequest.customerNotifySMSNumber) &&
        Objects.equals(this.extraData, startRequest.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, jobDescription, jobCoordinate, jobSlotStart, jobSlotEnd, jobSlotName, trackingExpiryMinutes, operativeId, operativeName, operativeContactNumber, doNotTrackMinutes, customerNotifyEmailAddress, customerNotifySMSNumber, extraData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
    sb.append("    jobCoordinate: ").append(toIndentedString(jobCoordinate)).append("\n");
    sb.append("    jobSlotStart: ").append(toIndentedString(jobSlotStart)).append("\n");
    sb.append("    jobSlotEnd: ").append(toIndentedString(jobSlotEnd)).append("\n");
    sb.append("    jobSlotName: ").append(toIndentedString(jobSlotName)).append("\n");
    sb.append("    trackingExpiryMinutes: ").append(toIndentedString(trackingExpiryMinutes)).append("\n");
    sb.append("    operativeId: ").append(toIndentedString(operativeId)).append("\n");
    sb.append("    operativeName: ").append(toIndentedString(operativeName)).append("\n");
    sb.append("    operativeContactNumber: ").append(toIndentedString(operativeContactNumber)).append("\n");
    sb.append("    doNotTrackMinutes: ").append(toIndentedString(doNotTrackMinutes)).append("\n");
    sb.append("    customerNotifyEmailAddress: ").append(toIndentedString(customerNotifyEmailAddress)).append("\n");
    sb.append("    customerNotifySMSNumber: ").append(toIndentedString(customerNotifySMSNumber)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
