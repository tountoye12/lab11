package edu.miu.cs.cs489.Lab11.adsLab11.dto.patient;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientRequest{

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;
}
