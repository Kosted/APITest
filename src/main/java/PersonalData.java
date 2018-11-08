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
    "id",
    "active",
    "email",
    "email_confirmed",
    "last_name",
    "first_name",
    "middle_name",
    "middle_name_empty",
    "phone",
    "birth_date",
    "passport_series",
    "passport_number",
    "city_id",
    "digital_signature",
    "readonly"
})
public class PersonalData {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("email")
    private String email;
    @JsonProperty("email_confirmed")
    private Boolean emailConfirmed;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("middle_name_empty")
    private Boolean middleNameEmpty;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("passport_series")
    private String passportSeries;
    @JsonProperty("passport_number")
    private String passportNumber;
    @JsonProperty("city_id")
    private String cityId;
    @JsonProperty("digital_signature")
    private String digitalSignature;
    @JsonProperty("readonly")
    private Boolean readonly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("email_confirmed")
    public Boolean getEmailConfirmed() {
        return emailConfirmed;
    }

    @JsonProperty("email_confirmed")
    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("middle_name_empty")
    public Boolean getMiddleNameEmpty() {
        return middleNameEmpty;
    }

    @JsonProperty("middle_name_empty")
    public void setMiddleNameEmpty(Boolean middleNameEmpty) {
        this.middleNameEmpty = middleNameEmpty;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("passport_series")
    public String getPassportSeries() {
        return passportSeries;
    }

    @JsonProperty("passport_series")
    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    @JsonProperty("passport_number")
    public String getPassportNumber() {
        return passportNumber;
    }

    @JsonProperty("passport_number")
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @JsonProperty("city_id")
    public String getCityId() {
        return cityId;
    }

    @JsonProperty("city_id")
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("digital_signature")
    public String getDigitalSignature() {
        return digitalSignature;
    }

    @JsonProperty("digital_signature")
    public void setDigitalSignature(String digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    @JsonProperty("readonly")
    public Boolean getReadonly() {
        return readonly;
    }

    @JsonProperty("readonly")
    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
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
