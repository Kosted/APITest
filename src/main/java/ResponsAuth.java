import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "token",
    "session",
    "personal_data",
    "pin_established"
})
public class ResponsAuth {

    @JsonProperty("token")
    private String token;
    @JsonProperty("session")
    private String session;
    @JsonProperty("personal_data")
    private PersonalData personalData;
    @JsonProperty("pin_established")
    private Boolean pinEstablished;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("session")
    public String getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    @JsonProperty("personal_data")
    public PersonalData getPersonalData() {
        return personalData;
    }

    @JsonProperty("personal_data")
    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @JsonProperty("pin_established")
    public Boolean getPinEstablished() {
        return pinEstablished;
    }

    @JsonProperty("pin_established")
    public void setPinEstablished(Boolean pinEstablished) {
        this.pinEstablished = pinEstablished;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
