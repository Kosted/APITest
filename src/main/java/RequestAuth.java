

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.builder.ToStringBuilder;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "email",
        "password",
        "reset_pin"
})
public class RequestAuth {

    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("reset_pin")
    private String resetPin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public RequestAuth withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public RequestAuth withPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("reset_pin")
    public String getResetPin() {
        return resetPin;
    }

    @JsonProperty("reset_pin")
    public void setResetPin(String resetPin) {
        this.resetPin = resetPin;
    }

    public RequestAuth withResetPin(String resetPin) {
        this.resetPin = resetPin;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RequestAuth withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("email", email).append("password", password).append("resetPin", resetPin).append("additionalProperties", additionalProperties).toString();
    }

}
//import java.util.HashMap;
//import java.util.Map;
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "email",
//        "password",
//        "reset_pin"
//})
//public class RequestAuth {
//
//    @JsonProperty("email")
//    private String email;
//    @JsonProperty("password")
//    private String password;
//    @JsonProperty("reset_pin")
//    private String resetPin;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("email")
//    public String getEmail() {
//        return email;
//    }
//
//    @JsonProperty("email")
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @JsonProperty("password")
//    public String getPassword() {
//        return password;
//    }
//
//    @JsonProperty("password")
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @JsonProperty("reset_pin")
//    public String getResetPin() {
//        return resetPin;
//    }
//
//    @JsonProperty("reset_pin")
//    public void setResetPin(String resetPin) {
//        this.resetPin = resetPin;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("email", email).append("password", password).append("resetPin", resetPin).append("additionalProperties", additionalProperties).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(email).append(additionalProperties).append(resetPin).append(password).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof RequestAuth) == false) {
//            return false;
//        }
//        RequestAuth rhs = ((RequestAuth) other);
//        return new EqualsBuilder().append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(resetPin, rhs.resetPin).append(password, rhs.password).isEquals();
//    }
//
//}