package com.kirona.oow.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.kirona.oow.api.model.LatLngAccuracy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of the location update.
 */
@Schema(description = "Details of the location update.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-27T09:06:29.016Z[Europe/London]")


public class Location   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("coords")
  private LatLngAccuracy coords = null;

  public Location uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Optionally specify the unique ID of the device sending the coordinate
   * @return uuid
   **/
  @Schema(description = "Optionally specify the unique ID of the device sending the coordinate")
  
    public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Location timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time that the operative was at the specified location.
   * @return timestamp
   **/
  @Schema(required = true, description = "The time that the operative was at the specified location.")
      @NotNull

    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Location coords(LatLngAccuracy coords) {
    this.coords = coords;
    return this;
  }

  /**
   * Get coords
   * @return coords
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LatLngAccuracy getCoords() {
    return coords;
  }

  public void setCoords(LatLngAccuracy coords) {
    this.coords = coords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.uuid, location.uuid) &&
        Objects.equals(this.timestamp, location.timestamp) &&
        Objects.equals(this.coords, location.coords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, timestamp, coords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
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
