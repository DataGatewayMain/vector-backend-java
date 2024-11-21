package app.vdb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;

@Getter
@Setter
@Entity
@Table(name = "vector19")
@Access(AccessType.FIELD)
public class Vector19 implements Serializable {
	
    private static final long serialVersionUID = 1L;
    public Vector19() {
		
	}
    
	 	@Id
	    @Column(name = "id")
	    private Long id;
	 	
	    @Column(name = "pid")
	    private String pid;

	    @Column(name = "first_name")
	    private String first_name;

	    @Column(name = "last_name")
	    private String last_name;

	    @Column(name = "email_address")
	    private String email_address;

	    @Column(name = "company_name")
	    private String company_name;

	    @Column(name = "company_domain")
	    private String company_domain;

	    @Column(name = "job_title")
	    private String job_title;

	    @Column(name = "job_function")
	    private String job_function;

	    @Column(name = "job_level")
	    private String job_level;

	    @Column(name = "company_address")
	    private String company_address;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "state")
	    private String state;

	    @Column(name = "zip_code")
	    private String zip_code;

	    @Column(name = "country")
	    private String country;

	    @Column(name = "telephone_number")
	    private String telephone_number;

	    @Column(name = "employee_size")
	    private String employee_size;

	    @Column(name = "industry")
	    private String industry;

	    @Column(name = "revenue")
	    private String revenue;

	    @Column(name = "sic")
	    private String sic;

	    @Column(name = "naic")
	    private String naic;

	    @Column(name = "company_link")
	    private String company_link;

	    @Column(name = "prospect_link")
	    private String prospect_link;

	    @Column(name = "email_validation")
	    private String email_validation;

	    @Column(name = "api")
	    private String api;

		public Vector19(Long id, String pid, String first_name, String last_name, String email_address,
				String company_name, String company_domain, String job_title, String job_function, String job_level,
				String company_address, String city, String state, String zip_code, String country,
				String telephone_number, String employee_size, String industry, String revenue, String sic, String naic,
				String company_link, String prospect_link, String email_validation, String headquarter_address,
				String head_city, String head_state, String campaign_id, String api, String region) {
			super();
			this.id = id;
			this.pid = pid;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email_address = email_address;
			this.company_name = company_name;
			this.company_domain = company_domain;
			this.job_title = job_title;
			this.job_function = job_function;
			this.job_level = job_level;
			this.company_address = company_address;
			this.city = city;
			this.state = state;
			this.zip_code = zip_code;
			this.country = country;
			this.telephone_number = telephone_number;
			this.employee_size = employee_size;
			this.industry = industry;
			this.revenue = revenue;
			this.sic = sic;
			this.naic = naic;
			this.company_link = company_link;
			this.prospect_link = prospect_link;
			this.email_validation = email_validation;
			this.api = api;
		}

	
}
