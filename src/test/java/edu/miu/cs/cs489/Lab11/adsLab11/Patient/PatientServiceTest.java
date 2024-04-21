package edu.miu.cs.cs489.Lab11.adsLab11.Patient;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Patient;
import edu.miu.cs.cs489.Lab11.adsLab11.service.IPatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private IPatientService patientService;

    @Test
    void getPatientById_whenPatientExists_returnsPatient() {
        // Preload an example patient or use an existing ID known to be in the test DB
        int existingPatientId = 1; // Ensure this ID exists in your test setup
        Patient result = patientService.getPatientById(existingPatientId);
        assertNotNull(result);
        assertEquals(existingPatientId, result.getPatNo());
    }

    @Test
    void getPatientById_whenPatientDoesNotExist_returnsNull() {
        // Use a non-existing ID
        int nonExistingPatientId = 9999; // Ensure this ID does not exist
        Patient result = patientService.getPatientById(nonExistingPatientId);
        assertEquals(result, null);
    }
}
