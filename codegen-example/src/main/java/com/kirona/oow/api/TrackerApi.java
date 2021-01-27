/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.kirona.oow.api;

import com.kirona.oow.api.model.LocationUpdateRequest;
import java.util.Map;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-27T09:06:29.016Z[Europe/London]")
public interface TrackerApi {

    TrackerApiDelegate getDelegate();

    @Operation(summary = "Get Mobile App Configuration", description = "Get the tracking application configuration for the specfied organisation.", tags={ "configuration-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request - invalid or insufficient data supplied", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorised - invalid license key supplied", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Map.class)))),
        
        @ApiResponse(responseCode = "500", description = "Internal Error", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Map.class)))) })
    @RequestMapping(value = "/tracker/{organisationId}/configuration",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Map<String, String>> getConfiguration(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("organisationId") String organisationId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "licenseKey", required = true) String licenseKey) {
        return getDelegate().getConfiguration(organisationId, licenseKey);
    }


    @Operation(summary = "Update operative location", description = "Update current position for a specific operative in a specific organisation.", tags={ "location-update-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request - invalid or insufficient data supplied", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorised - invalid license key supplied", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Error", content = @Content(schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/tracker/{organisationId}/location",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> update(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "licenseKey", required = true) String licenseKey, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("organisationId") String organisationId, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LocationUpdateRequest body) {
        return getDelegate().update(licenseKey, organisationId, body);
    }

}

