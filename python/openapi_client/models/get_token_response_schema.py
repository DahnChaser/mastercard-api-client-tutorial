# coding: utf-8

"""
    MDES for Merchants

    The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java)   # noqa: E501

    The version of the OpenAPI document: 1.2.10
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class GetTokenResponseSchema(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'response_id': 'str',
        'token': 'Token',
        'token_detail': 'TokenDetailGetTokenOnly'
    }

    attribute_map = {
        'response_id': 'responseId',
        'token': 'token',
        'token_detail': 'tokenDetail'
    }

    def __init__(self, response_id=None, token=None, token_detail=None, local_vars_configuration=None):  # noqa: E501
        """GetTokenResponseSchema - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._response_id = None
        self._token = None
        self._token_detail = None
        self.discriminator = None

        if response_id is not None:
            self.response_id = response_id
        if token is not None:
            self.token = token
        if token_detail is not None:
            self.token_detail = token_detail

    @property
    def response_id(self):
        """Gets the response_id of this GetTokenResponseSchema.  # noqa: E501

        Unique identifier for the response.   # noqa: E501

        :return: The response_id of this GetTokenResponseSchema.  # noqa: E501
        :rtype: str
        """
        return self._response_id

    @response_id.setter
    def response_id(self, response_id):
        """Sets the response_id of this GetTokenResponseSchema.

        Unique identifier for the response.   # noqa: E501

        :param response_id: The response_id of this GetTokenResponseSchema.  # noqa: E501
        :type: str
        """

        self._response_id = response_id

    @property
    def token(self):
        """Gets the token of this GetTokenResponseSchema.  # noqa: E501


        :return: The token of this GetTokenResponseSchema.  # noqa: E501
        :rtype: Token
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this GetTokenResponseSchema.


        :param token: The token of this GetTokenResponseSchema.  # noqa: E501
        :type: Token
        """

        self._token = token

    @property
    def token_detail(self):
        """Gets the token_detail of this GetTokenResponseSchema.  # noqa: E501


        :return: The token_detail of this GetTokenResponseSchema.  # noqa: E501
        :rtype: TokenDetailGetTokenOnly
        """
        return self._token_detail

    @token_detail.setter
    def token_detail(self, token_detail):
        """Sets the token_detail of this GetTokenResponseSchema.


        :param token_detail: The token_detail of this GetTokenResponseSchema.  # noqa: E501
        :type: TokenDetailGetTokenOnly
        """

        self._token_detail = token_detail

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, GetTokenResponseSchema):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GetTokenResponseSchema):
            return True

        return self.to_dict() != other.to_dict()
