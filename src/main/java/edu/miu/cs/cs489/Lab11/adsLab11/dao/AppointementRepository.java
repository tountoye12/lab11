package edu.miu.cs.cs489.Lab11.adsLab11.dao;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointementRepository extends JpaRepository<Appointment, Long> {
}
