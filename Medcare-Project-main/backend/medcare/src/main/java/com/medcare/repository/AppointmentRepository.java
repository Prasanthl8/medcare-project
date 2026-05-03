package com.medcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medcare.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}