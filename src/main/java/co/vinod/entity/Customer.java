package co.vinod.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String phone;
}
