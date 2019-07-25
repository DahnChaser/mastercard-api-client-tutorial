/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously.  
 *
 * The version of the OpenAPI document: 1.2.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NotifyTokenUpdatedResponseSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-25T13:48:59.971+02:00[Europe/Rome]")
public class NotifyTokenUpdatedResponseSchema {
  public static final String SERIALIZED_NAME_RESPONSE_HOST = "responseHost";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HOST)
  private String responseHost;

  public static final String SERIALIZED_NAME_RESPONSE_ID = "responseId";
  @SerializedName(SERIALIZED_NAME_RESPONSE_ID)
  private String responseId;

  public NotifyTokenUpdatedResponseSchema responseHost(String responseHost) {
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @return responseHost
  **/
  @ApiModelProperty(example = "site1.mastercard.com", value = "The host that originated the request. Future calls in the same conversation may be routed to this host. ")
  public String getResponseHost() {
    return responseHost;
  }

  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }

  public NotifyTokenUpdatedResponseSchema responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * Unique identifier for the response. 
   * @return responseId
  **/
  @ApiModelProperty(example = "123456", value = "Unique identifier for the response. ")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyTokenUpdatedResponseSchema notifyTokenUpdatedResponseSchema = (NotifyTokenUpdatedResponseSchema) o;
    return Objects.equals(this.responseHost, notifyTokenUpdatedResponseSchema.responseHost) &&
        Objects.equals(this.responseId, notifyTokenUpdatedResponseSchema.responseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHost, responseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyTokenUpdatedResponseSchema {\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
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
