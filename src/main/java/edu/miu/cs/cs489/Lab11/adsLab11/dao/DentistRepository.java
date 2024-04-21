package edu.miu.cs.cs489.Lab11.adsLab11.dao;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
