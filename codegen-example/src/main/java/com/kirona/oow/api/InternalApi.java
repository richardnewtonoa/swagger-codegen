/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.kirona.oow.api;

import com.kirona.oow.api.model.StartRequest;
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
public interface InternalApi {

    InternalApiDelegate getDelegate();

    @Operation(summary = "start tracking a job", description = "Start tracking a specific job, sending a tracking page link (via e-mail or SMS) to the customer", tags={ "tracking-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request - invalid or insufficient data supplied", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Error", content = @Content(schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/internal/tracker/{organisationId}/track",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> start(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("organisationId") String organisationId, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody StartRequest body) {
        return getDelegate().start(organisationId, body);
    }


    @Operation(summary = "Check the tracking status of a job", description = "Check the tracking status of a particular job. Result will either be STARTED or NOTSTARTED.", tags={ "tracking-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request - invalid or insufficient data supplied", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Error", content = @Content(schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/internal/tracker/{organisationId}/track/{externalId}/status",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    default ResponseEntity<String> status(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("organisationId") String organisationId, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("externalId") String externalId) {
        return getDelegate().status(organisationId, externalId);
    }


    @Operation(summary = "Stop tracking a job", description = "Stop tracking a specific job. Any tracking page link for this job will become invalid.", tags={ "tracking-controller" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request - invalid or insufficient data supplied", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Error", content = @Content(schema = @Schema(implementation = String.class))) })
    @RequestMapping(value = "/internal/tracker/{organisationId}/track/{externalId}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<String> stop(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("organisationId") String organisationId, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("externalId") String externalId) {
        return getDelegate().stop(organisationId, externalId);
    }

}

