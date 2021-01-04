package com.bezkoder.spring.jwt.mongodb.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UpdateUserRequest {

		@NotBlank
		@Size(max = 20)
		private String username;
	
	    @NotBlank
	    @Size(min = 3, max = 40)
	    private String name;
	 
	 	@NotBlank
	    @Size(max = 50)
	    @Email
	    private String email;
	 	
	 	@NotBlank
	    @Size(min = 10, max = 10)
	    private String phoneNumber;
	 	
	 	@NotBlank
	    @Size(min = 5, max = 120)
	    private String address;

		public UpdateUserRequest() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UpdateUserRequest(@NotBlank @Size(max = 20) String username, @NotBlank @Size(min = 3, max = 40) String name,
				@NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(min = 10, max = 10) String phoneNumber,
				@NotBlank @Size(min = 5, max = 120) String address
				) {
			super();
			this.username = username;
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.address = address;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	 	
	 	
}
