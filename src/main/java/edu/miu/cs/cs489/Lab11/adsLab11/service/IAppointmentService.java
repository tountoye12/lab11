package edu.miu.cs.cs489.Lab11.adsLab11.service;

import edu.miu.cs.cs489.Lab11.adsLab11.models.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(Appointment appointment);

    List<Appointment> findAll();
}