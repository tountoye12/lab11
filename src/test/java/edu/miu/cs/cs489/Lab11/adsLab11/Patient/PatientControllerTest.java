package edu.miu.cs.cs489.Lab11.adsLab11.Patient;

import edu.miu.cs.cs489.Lab11.adsLab11.controller.PatientController;
import edu.miu.cs.cs489.Lab11.adsLab11.models.Patient;
import edu.miu.cs.cs489.Lab11.adsLab11.service.IDentistService;
import edu.miu.cs.cs489.Lab11.adsLab11.service.IPatientService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.iterableWithSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(MockitoExtension.class)
public class PatientControllerTest {

    @InjectMocks
    PatientController patientController;

    @Mock
    private IPatientService patientService;

    protected Logger logger = LoggerFactory.getLogger(this.getClass());


    @AfterEach
    public void tearDown() {
        logger.info("PatientControllerTest completed");
    }


//    @BeforeEach
//    void setUp() {
//        logger.info("PatientControllerTest started");
//        MockitoAnnotations.openMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(patientController).build();
//    }

    @Test
    void getAllPatients_returnsPatientsList() throws Exception {
        // Setup
        Patient patient = new Patient(); // Consider adding setter methods to populate the patient details
        patient.setPatNo(1L);
        patient.setFirstName("John");
        patient.setLastName("Doe");
        Patient patient2 = new Patient(); // Consider adding setter methods to populate the patient details
        patient.setPatNo(2L);
        patient.setFirstName("Abel");
        patient.setLastName("Seyoum");
        List<Patient> patients = List.of(patient, patient2);

        // Mocking
        when(patientService.getAllPatients()).thenReturn(patients);

        // Execute and Assert
//        mockMvc.perform(get("/adsweb/api/v1/patient/list")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].id").value(1))
//                .andExpect(jsonPath("$[0].firstName").value("John"));
//        when(employeeDAO.getAllEmployees()).thenReturn(employees);

        ResponseEntity<List<Patient>> result = patientController.getAllPatients();

        assertThat(Objects.requireNonNull(result.getBody()).size()).isEqualTo(2);
        assertThat(result.getBody().get(0).getFirstName()).isEqualTo(patient.getFirstName());
        assertThat(result.getBody().get(1).getFirstName()).isEqualTo(patient2.getFirstName());
    }
//    @BeforeEach
//    public void setUp() {
//        List<Patient> patients = Arrays.asList(
//                new Patient(1L, "John", "Doe", "john.doe@example.com", "1234567890", new Address(), new ArrayList<>()),
//                new Patient(2L, "Jane", "Doe", "jane.doe@example.com", "0987654321", new Address(), new ArrayList<>())
//        );
//        Mockito.when(patientService.getAllPatients()).thenReturn(patients);
//    }

    @Test
    public void testListPatients() throws Exception {
        // Setup
        Patient patient = new Patient(); // Consider adding setter methods to populate the patient details
        patient.setPatNo(1L);
        patient.setFirstName("John");
        patient.setLastName("Doe");
        List<Patient> patients = List.of(patient);

        when(patientService.getAllPatients()).thenReturn(patients);

//        mockMvc.perform(get("/adsweb/api/v1/patient/list"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("patient/list"))
//                .andExpect(model().attributeExists("patients"))
//                .andExpect(model().attribute("patients", iterableWithSize(2)));
    }
}
