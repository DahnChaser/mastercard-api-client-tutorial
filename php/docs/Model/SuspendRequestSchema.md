# # SuspendRequestSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_host** | **string** | The host that originated the request. Future calls in the same conversation may be routed to this host. | [optional] 
**request_id** | **string** | Unique identifier for the request. | 
**payment_app_instance_id** | **string** | Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \&quot;-\&quot;, underscore \&quot;_\&quot;) up to a maximum length of 48, &#x3D; should not be URL encoded. Conditional - not applicable for server based tokens but required otherwise.     __Max Length:48__ | [optional] 
**token_unique_references** | **string[]** | The specific Token to be suspended. Array of more or more valid references as assigned by MDES | 
**caused_by** | **string** | Who or what caused the Token to be suspended. Must be either the &#39;CARDHOLDER&#39; (operation requested by the Cardholder) or &#39;TOKEN_REQUESTOR&#39; (operation requested by the token requestor).     __Max Length:64__ | 
**reason** | **string** | Free form reason why the Tokens are being suspended.     __Max Length:256__ | [optional] 
**reason_code** | **string** | The reason for the action to be suspended. Must be one of &#39;SUSPECTED_FRAUD&#39; (suspected fraudulent token transactions), &#39;OTHER&#39; (Other - default used if value not provided).     __Max Length:64__ | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


