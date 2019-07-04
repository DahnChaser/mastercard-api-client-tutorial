/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously.  
 *
 * OpenAPI spec version: 1.2.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardInfo;
import java.io.IOException;

/**
 * SearchTokensRequestSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-29T13:19:04.981+01:00")
public class SearchTokensRequestSchema {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("responseHost")
  private String responseHost = null;

  @SerializedName("cardInfo")
  private CardInfo cardInfo = null;

  @SerializedName("tokenRequestorId")
  private String tokenRequestorId = null;

  public SearchTokensRequestSchema requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request. 
   * @return requestId
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Unique identifier for the request. ")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public SearchTokensRequestSchema responseHost(String responseHost) {
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @return responseHost
  **/
  @ApiModelProperty(example = "site2.payment-app-provider.com", value = "The host that originated the request. Future calls in the same conversation may be routed to this host. ")
  public String getResponseHost() {
    return responseHost;
  }

  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }

  public SearchTokensRequestSchema cardInfo(CardInfo cardInfo) {
    this.cardInfo = cardInfo;
    return this;
  }

   /**
   * Get cardInfo
   * @return cardInfo
  **/
  @ApiModelProperty(value = "")
  public CardInfo getCardInfo() {
    return cardInfo;
  }

  public void setCardInfo(CardInfo cardInfo) {
    this.cardInfo = cardInfo;
  }

  public SearchTokensRequestSchema tokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * Identifies the Token Requestor. Only tokens associated with the token requestor will be returned. Length - 11.  
   * @return tokenRequestorId
  **/
  @ApiModelProperty(example = "98765432101", value = "Identifies the Token Requestor. Only tokens associated with the token requestor will be returned. Length - 11.  ")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTokensRequestSchema searchTokensRequestSchema = (SearchTokensRequestSchema) o;
    return Objects.equals(this.requestId, searchTokensRequestSchema.requestId) &&
        Objects.equals(this.responseHost, searchTokensRequestSchema.responseHost) &&
        Objects.equals(this.cardInfo, searchTokensRequestSchema.cardInfo) &&
        Objects.equals(this.tokenRequestorId, searchTokensRequestSchema.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseHost, cardInfo, tokenRequestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTokensRequestSchema {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
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
