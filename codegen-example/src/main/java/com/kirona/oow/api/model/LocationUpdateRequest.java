package com.kirona.oow.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kirona.oow.api.model.Location;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LocationUpdateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-27T09:06:29.016Z[Europe/London]")


public class LocationUpdateRequest   {
  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("operativeId")
  private String operativeId = null;

  public LocationUpdateRequest location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public LocationUpdateRequest operativeId(String operativeId) {
    this.operativeId = operativeId;
    return this;
  }

  /**
   * Id of the operative to update the location of.
   * @return operativeId
   **/
  @Schema(required = true, description = "Id of the operative to update the location of.")
      @NotNull

    public String getOperativeId() {
    return operativeId;
  }

  public void setOperativeId(String operativeId) {
    this.operativeId = operativeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationUpdateRequest locationUpdateRequest = (LocationUpdateRequest) o;
    return Objects.equals(this.location, locationUpdateRequest.location) &&
        Objects.equals(this.operativeId, locationUpdateRequest.operativeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, operativeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationUpdateRequest {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    operativeId: ").append(toIndentedString(operativeId)).append("\n");
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
