package com.ngo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class NGOPerson {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Authorised Person is required")
    private String authorisedPerson;

    @NotBlank(message = "Organisation Name is required")
    private String organisationName;

    @NotBlank(message = "Organisation Name is required")
    private String typeOfOrganisation;

    @NotBlank(message = "Organisation Email is required")
    @Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", message = "Invalid Organisation Email")
    private String organisationEmail;

    @NotBlank(message = "Authorised Person Email is required")
    @Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", message = "Invalid Authorised Person Email")
    private String authorisedPersonEmail;

    @NotBlank(message = "Website of Organisation is required")
    private String website;

    @NotBlank(message = "Working Area is required")
    private String workingArea;

    @NotBlank(message = "Mobile is required")
    @Size(min = 10, max = 15, message = "Mobile number should be between 10 and 15 digits")
    @Pattern(regexp = "^[0-9]+$", message = "Mobile number should contain only numeric digits")
    private String mobile;

    @NotBlank(message = "Phone is required")
    @Size(min = 10, max = 15, message = "Phone number should be between 10 and 15 digits")
    @Pattern(regexp = "^[0-9]+$", message = "Mobile number should contain only numeric digits")
    private String phone;

    @NotBlank(message = "Organisation Address is required")
    private String organisationAddress;

    @NotBlank(message = "Organisation City is required")
    private String organisationCity;

    @NotBlank(message = "Organisation State is required")
    private String organisationState;

    @NotBlank(message = "Organisation Country is required")
    private String organisationCountry;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthorisedPerson() {
		return authorisedPerson;
	}
	public void setAuthorisedPerson(String authorisedPerson) {
		this.authorisedPerson = authorisedPerson;
	}
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getTypeOfOrganisation() {
		return typeOfOrganisation;
	}
	public void setTypeOfOrganisation(String typeOfOrganisation) {
		this.typeOfOrganisation = typeOfOrganisation;
	}
	public String getOrganisationEmail() {
		return organisationEmail;
	}
	public void setOrganisationEmail(String organisationEmail) {
		this.organisationEmail = organisationEmail;
	}
	public String getAuthorisedPersonEmail() {
		return authorisedPersonEmail;
	}
	public void setAuthorisedPersonEmail(String authorisedPersonEmail) {
		this.authorisedPersonEmail = authorisedPersonEmail;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getWorkingArea() {
		return workingArea;
	}
	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOrganisationAddress() {
		return organisationAddress;
	}
	public void setOrganisationAddress(String organisationAddress) {
		this.organisationAddress = organisationAddress;
	}
	public String getOrganisationCity() {
		return organisationCity;
	}
	public void setOrganisationCity(String organisationCity) {
		this.organisationCity = organisationCity;
	}
	public String getOrganisationState() {
		return organisationState;
	}
	public void setOrganisationState(String organisationState) {
		this.organisationState = organisationState;
	}
	public String getOrganisationCountry() {
		return organisationCountry;
	}
	public void setOrganisationCountry(String organisationCountry) {
		this.organisationCountry = organisationCountry;
	}
    
	public NGOPerson(Long id, @NotBlank(message = "Authorised Person is required") String authorisedPerson,
			@NotBlank(message = "Organisation Name is required") String organisationName, String typeOfOrganisation,
			@NotBlank(message = "Organisation Email is required") @Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", message = "Invalid Organisation Email") String organisationEmail,
			@NotBlank(message = "Authorised Person Email is required") @Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", message = "Invalid Authorised Person Email") String authorisedPersonEmail,
			@NotBlank(message = "Website of Organisation is required") String website,
			@NotBlank(message = "Working Area is required") String workingArea,
			@NotBlank(message = "Mobile is required") @Size(min = 10, max = 15, message = "Mobile number should be between 10 and 15 digits") String mobile,
			@NotBlank(message = "Phone is required") @Size(min = 10, max = 15, message = "Phone number should be between 10 and 15 digits") String phone,
			@NotBlank(message = "Organisation Address is required") String organisationAddress,
			@NotBlank(message = "Organisation City is required") String organisationCity,
			@NotBlank(message = "Organisation State is required") String organisationState,
			@NotBlank(message = "Organisation Country is required") String organisationCountry) {
		super();
		this.id = id;
		this.authorisedPerson = authorisedPerson;
		this.organisationName = organisationName;
		this.typeOfOrganisation = typeOfOrganisation;
		this.organisationEmail = organisationEmail;
		this.authorisedPersonEmail = authorisedPersonEmail;
		this.website = website;
		this.workingArea = workingArea;
		this.mobile = mobile;
		this.phone = phone;
		this.organisationAddress = organisationAddress;
		this.organisationCity = organisationCity;
		this.organisationState = organisationState;
		this.organisationCountry = organisationCountry;
	}
	public NGOPerson() {
		
	}
    
}
