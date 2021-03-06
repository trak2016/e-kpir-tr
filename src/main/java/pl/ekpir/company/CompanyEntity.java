package pl.ekpir.company;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import pl.ekpir.user.UserEntity;

import javax.persistence.*;


@Entity
@Table(name = "company")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class CompanyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long companyId;

	@Column
	private String companyName;

	@Column
	private String ownerFirstName;

	@Column
	private String ownerLastName;

	@Column
	private Long nip;

	@Column
	private Long regon;

	@Column
	private String phone;

	@Column
	private String street;

	@Column
	private String city;

	@Column
	private String postalCode;

	@OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", nullable=false)
	private UserEntity user;

	public CompanyEntity() {
	}

	public CompanyEntity(UserEntity user) {
		this.user = user;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public Long getNip() {
		return nip;
	}

	public void setNip(Long nip) {
		this.nip = nip;
	}

	public Long getRegon() {
		return regon;
	}

	public void setRegon(Long regon) {
		this.regon = regon;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public UserEntity getUser() {
		return user;
	}


}
