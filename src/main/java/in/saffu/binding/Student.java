package in.saffu.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Student {
	
	@NotBlank(message = "name can't be empty")
	@Size(min = 3,max = 25,  message = "name should be min 3 and max 25")
	private String name;
	
	@NotBlank(message = "Department is mandatroy ")
	private String depart;
	
	@NotEmpty(message = "Email is not empty")
	@Email(message = "Email should be valid")
	private String email;
	
	@NotEmpty(message = "This field is mandatroy")
	private String course;
	
	@NotEmpty(message = "Number is required")
	@Size(min = 10, message = "number should be atleast 10 digit")
	private String phno;

}
