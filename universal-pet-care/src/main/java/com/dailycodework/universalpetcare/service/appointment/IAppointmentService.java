package com.dailycodework.universalpetcare.service.appointment;

import com.dailycodework.universalpetcare.dto.AppointmentDto;
import com.dailycodework.universalpetcare.model.Appointment;
import com.dailycodework.universalpetcare.request.AppointmentUpdateRequest;
import com.dailycodework.universalpetcare.request.BookAppointmentRequest;

import java.util.List;

public interface IAppointmentService {
    Appointment createAppointment(BookAppointmentRequest appointment, Long sender, Long recipient);
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Long id, AppointmentUpdateRequest request);


    void deleteAppointment(Long id);
    Appointment getAppointmentById(Long id);
    Appointment getAppointmentByNo(String appointmentNo);


    List<AppointmentDto> getUserAppointments(Long userId);
}
