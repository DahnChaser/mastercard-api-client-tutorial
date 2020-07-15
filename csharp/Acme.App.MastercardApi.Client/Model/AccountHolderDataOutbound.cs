/* 
 * MDES for Merchants
 *
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.2.10
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using OpenAPIDateConverter = Acme.App.MastercardApi.Client.Client.OpenAPIDateConverter;

namespace Acme.App.MastercardApi.Client.Model
{
    /// <summary>
    /// __(CONDITIONAL)__&lt;br&gt; Present in tokenize response if supported by the Merchant, if using a pushAccountReceipt and if there is account holder data associated with the pushAccountReceipt in case that the issuer decision is APPROVED. Refer to &lt;a href&#x3D;\&quot;https://developer.mastercard.com/devzone/api/portal/download/0000016a-f9a1-d055-ad7a-f9efc8d50000\&quot;&gt;MDES Token Connect Token Requestor Implementation Guide and Specification &lt;/a&gt; for more details. &lt;/br&gt; 
    /// </summary>
    [DataContract]
    public partial class AccountHolderDataOutbound :  IEquatable<AccountHolderDataOutbound>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountHolderDataOutbound" /> class.
        /// </summary>
        /// <param name="accountHolderName">__(OPTIONAL)__ The name of the cardholder&lt;br&gt; __Max Length:27__ .</param>
        /// <param name="accountHolderAddress">accountHolderAddress.</param>
        /// <param name="accountHolderEmailAddress">__(OPTIONAL)__ The e-mail address of the Account Holder&lt;br&gt; __Max Length:320__ .</param>
        /// <param name="accountHolderMobilePhoneNumber">accountHolderMobilePhoneNumber.</param>
        public AccountHolderDataOutbound(string accountHolderName = default(string), BillingAddress accountHolderAddress = default(BillingAddress), string accountHolderEmailAddress = default(string), PhoneNumber accountHolderMobilePhoneNumber = default(PhoneNumber))
        {
            this.AccountHolderName = accountHolderName;
            this.AccountHolderAddress = accountHolderAddress;
            this.AccountHolderEmailAddress = accountHolderEmailAddress;
            this.AccountHolderMobilePhoneNumber = accountHolderMobilePhoneNumber;
        }
        
        /// <summary>
        /// __(OPTIONAL)__ The name of the cardholder&lt;br&gt; __Max Length:27__ 
        /// </summary>
        /// <value>__(OPTIONAL)__ The name of the cardholder&lt;br&gt; __Max Length:27__ </value>
        [DataMember(Name="accountHolderName", EmitDefaultValue=false)]
        public string AccountHolderName { get; set; }

        /// <summary>
        /// Gets or Sets AccountHolderAddress
        /// </summary>
        [DataMember(Name="accountHolderAddress", EmitDefaultValue=false)]
        public BillingAddress AccountHolderAddress { get; set; }

        /// <summary>
        /// __(OPTIONAL)__ The e-mail address of the Account Holder&lt;br&gt; __Max Length:320__ 
        /// </summary>
        /// <value>__(OPTIONAL)__ The e-mail address of the Account Holder&lt;br&gt; __Max Length:320__ </value>
        [DataMember(Name="accountHolderEmailAddress", EmitDefaultValue=false)]
        public string AccountHolderEmailAddress { get; set; }

        /// <summary>
        /// Gets or Sets AccountHolderMobilePhoneNumber
        /// </summary>
        [DataMember(Name="accountHolderMobilePhoneNumber", EmitDefaultValue=false)]
        public PhoneNumber AccountHolderMobilePhoneNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AccountHolderDataOutbound {\n");
            sb.Append("  AccountHolderName: ").Append(AccountHolderName).Append("\n");
            sb.Append("  AccountHolderAddress: ").Append(AccountHolderAddress).Append("\n");
            sb.Append("  AccountHolderEmailAddress: ").Append(AccountHolderEmailAddress).Append("\n");
            sb.Append("  AccountHolderMobilePhoneNumber: ").Append(AccountHolderMobilePhoneNumber).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AccountHolderDataOutbound);
        }

        /// <summary>
        /// Returns true if AccountHolderDataOutbound instances are equal
        /// </summary>
        /// <param name="input">Instance of AccountHolderDataOutbound to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountHolderDataOutbound input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountHolderName == input.AccountHolderName ||
                    (this.AccountHolderName != null &&
                    this.AccountHolderName.Equals(input.AccountHolderName))
                ) && 
                (
                    this.AccountHolderAddress == input.AccountHolderAddress ||
                    (this.AccountHolderAddress != null &&
                    this.AccountHolderAddress.Equals(input.AccountHolderAddress))
                ) && 
                (
                    this.AccountHolderEmailAddress == input.AccountHolderEmailAddress ||
                    (this.AccountHolderEmailAddress != null &&
                    this.AccountHolderEmailAddress.Equals(input.AccountHolderEmailAddress))
                ) && 
                (
                    this.AccountHolderMobilePhoneNumber == input.AccountHolderMobilePhoneNumber ||
                    (this.AccountHolderMobilePhoneNumber != null &&
                    this.AccountHolderMobilePhoneNumber.Equals(input.AccountHolderMobilePhoneNumber))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AccountHolderName != null)
                    hashCode = hashCode * 59 + this.AccountHolderName.GetHashCode();
                if (this.AccountHolderAddress != null)
                    hashCode = hashCode * 59 + this.AccountHolderAddress.GetHashCode();
                if (this.AccountHolderEmailAddress != null)
                    hashCode = hashCode * 59 + this.AccountHolderEmailAddress.GetHashCode();
                if (this.AccountHolderMobilePhoneNumber != null)
                    hashCode = hashCode * 59 + this.AccountHolderMobilePhoneNumber.GetHashCode();
                return hashCode;
            }
        }
    }

}