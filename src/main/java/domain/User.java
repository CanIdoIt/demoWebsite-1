package domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class User {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="id", nullable=false, updatable=false)
	private long id;
	private String userName;
	private String password;
	private String firstName;
	private String LastName;
	private String email;
	private String phone;
	
	private boolean enabled=true;
}
