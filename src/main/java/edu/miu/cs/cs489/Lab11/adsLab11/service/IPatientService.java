package edu.miu.cs.cs489.Lab11.adsLab11.service;

import edu.miu.cs.cs489.Lab11.adsLab11.dto.patient.PatientRequest;
import edu.miu.cs.cs489.Lab11.adsLab11.models.Patient;

import java.util.List;

public interface IPatientService {
    Patient save(Patient dentist);
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    void deletePatientById(int id);
    Patient updatePatient(int id, PatientRequest patient);
   List<Patient> getPatientsWithSearchString(String searchString);
}
