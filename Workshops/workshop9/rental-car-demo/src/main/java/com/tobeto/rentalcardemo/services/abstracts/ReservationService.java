package com.tobeto.rentalcardemo.services.abstracts;

import com.tobeto.rentalcardemo.entity.Reservation;
import com.tobeto.rentalcardemo.services.dto.reservation.requests.AddReservationRequest;
import com.tobeto.rentalcardemo.services.dto.reservation.responses.AddReservationResponse;
import com.tobeto.rentalcardemo.services.dto.reservation.responses.GetAllReservationResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ReservationService {

    AddReservationResponse add(AddReservationRequest request);
    List<GetAllReservationResponse> getAll();
    GetAllReservationResponse getById(Integer reservationId);
    void delete(Integer reservationId);
    void update(Integer reservationId, AddReservationRequest request);
    List<Reservation> getReservationStatus(String status);
    List<GetAllReservationResponse> getDropOffDateBefore(LocalDate dropOffDate);
}
