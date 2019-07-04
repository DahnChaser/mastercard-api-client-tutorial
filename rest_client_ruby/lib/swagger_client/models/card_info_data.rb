=begin
#MDES for Merchants

#The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously.  

OpenAPI spec version: 1.2.7

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require 'date'

module SwaggerClient
  class CardInfoData
    # __(Required as minimum for Tokenization)__ The account number to be encrypted for tokenization. Only supplied if panUniqueReference or tokenUniqueReferenceForPanInfo is not present.   __Min Length:9__<br> __Max Length:19__ 
    attr_accessor :account_number

    # __(Required as minimum for Tokenization)__ The expiry month for the account. Only supplied if panUniqueReference or tokenUniqueReferenceForPanInfo is not present. Two numeric digits must be supplied. __Format: MM__<br> __Exact Length:2__ 
    attr_accessor :expiry_month

    # __(Required as minimum for Tokenization)__  The expiry year for the account. Only supplied if panUniqueReference or tokenUniqueReferenceForPanInfo is not present. <br> __Format: YY__<br> __Exact Length:2__ 
    attr_accessor :expiry_year

    # (__Required as minimum for Tokenization__)  The source of the account.   __Max Length:32__ 
    attr_accessor :source

    # __(OPTIONAL)__ The name of the cardholder<br> __Max Length:27__ 
    attr_accessor :cardholder_name

    # __(OPTIONAL)__ The security code for the account can optionally be provided for Tokenization. If provided, the validity will be checked.  __Max Length:3__ 
    attr_accessor :security_code

    attr_accessor :billing_address

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'account_number' => :'accountNumber',
        :'expiry_month' => :'expiryMonth',
        :'expiry_year' => :'expiryYear',
        :'source' => :'source',
        :'cardholder_name' => :'cardholderName',
        :'security_code' => :'securityCode',
        :'billing_address' => :'billingAddress'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_number' => :'String',
        :'expiry_month' => :'String',
        :'expiry_year' => :'String',
        :'source' => :'String',
        :'cardholder_name' => :'String',
        :'security_code' => :'String',
        :'billing_address' => :'BillingAddress'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'accountNumber')
        self.account_number = attributes[:'accountNumber']
      end

      if attributes.has_key?(:'expiryMonth')
        self.expiry_month = attributes[:'expiryMonth']
      end

      if attributes.has_key?(:'expiryYear')
        self.expiry_year = attributes[:'expiryYear']
      end

      if attributes.has_key?(:'source')
        self.source = attributes[:'source']
      end

      if attributes.has_key?(:'cardholderName')
        self.cardholder_name = attributes[:'cardholderName']
      end

      if attributes.has_key?(:'securityCode')
        self.security_code = attributes[:'securityCode']
      end

      if attributes.has_key?(:'billingAddress')
        self.billing_address = attributes[:'billingAddress']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_number == o.account_number &&
          expiry_month == o.expiry_month &&
          expiry_year == o.expiry_year &&
          source == o.source &&
          cardholder_name == o.cardholder_name &&
          security_code == o.security_code &&
          billing_address == o.billing_address
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [account_number, expiry_month, expiry_year, source, cardholder_name, security_code, billing_address].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end