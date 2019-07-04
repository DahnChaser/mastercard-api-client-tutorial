# SwaggerClient::GetDigitalAssetsResponseSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_id** | **String** | Unique identifier for the response.  | [optional] 
**response_host** | **String** | The host that originated the request. Future calls in the same conversation may be routed to this host.  | [optional] 
**brand_logo_asset_id** | **String** | The MasterCard or Maestro brand logo associated with this card. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. Always returned in Product Configuration object &lt;br&gt;    __Max Length: 64__&lt;br&gt; __Required: Yes__  | [optional] 
**issuer_logo_asset_id** | **String** | The logo of the issuing bank. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. Always returned in Product Configuration object &lt;br&gt;     __Max Length:64__&lt;br&gt; __Required: Yes__  | [optional] 
**is_co_branded** | **String** | Whether the product is co-branded. Must be either true (this is a co-branded product) or false (this is not a co-branded product). Always returned in Product Configuration object &lt;br&gt;    __Max Length:5__&lt;br&gt; __Required: Yes__  | [optional] 
**co_brand_name** | **String** | Textual name of the co-brand partner. Required if CoBranded is true, not present otherwise.  &lt;br&gt;   __Max Length:128__&lt;br&gt; __Required: Conditional ? required if isCoBranded &#x3D; \&quot;true\&quot;. Not present otherwise__  | [optional] 
**co_brand_logo_asset_id** | **String** | The co-brand logo (if any) for this product. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. &lt;br&gt;   __Max Length:64__&lt;br&gt; __Required: No__  | [optional] 
**card_background_combined_asset_id** | **String** | The card image used to represent the digital card in the wallet. This ?combined? option contains the MasterCard, bank and any co- brand logos.  Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset.     __Max Length:64__&lt;br&gt; __Required: Conditional ? either CardBackgroundCombined or CardBackground will be provided__  | [optional] 
**card_background_asset_id** | **String** | The card image used to represent the digital card in the wallet. This ?non-combined? option does not contain the MasterCard, bank, or co-brand logos. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. &lt;br&gt;     __Max Length:64__&lt;br&gt; __Required: Conditional ? either CardBackgroundCombined or CardBackground will be provided__  | [optional] 
**icon_asset_id** | **String** | The icon representing the primary brand(s) associated with this product. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. Always returned in Product Configuration object&lt;br&gt;    __Max Length:64__&lt;br&gt; __Required: Yes__  | [optional] 
**foreground_color** | **String** | Foreground color, used to overlay text on top of the card image. Always returned in Product Configuration object&lt;br&gt;    __Max Length:6__ Hexadecimal RGB color format (case-insensitive).&lt;br&gt; __Required: Yes__  | [optional] 
**issuer_name** | **String** | Name of the issuing bank. Always returned in Product Configuration object &lt;br&gt;    __Max Length:64__&lt;br&gt; __Required: Yes__  | [optional] 
**short_description** | **String** | A short description for this product. Always returned in Product Configuration object  &lt;br&gt;   __Max Length:128__&lt;br&gt; __Required: Yes__  | [optional] 
**long_description** | **String** | A long description for this product.  &lt;br&gt;   __Max Length:256__&lt;br&gt; __Required: No__  | [optional] 

