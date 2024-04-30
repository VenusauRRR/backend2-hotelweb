package org.example.backend.Service;

import org.example.backend.DTO.BookingDto;
import org.example.backend.DTO.RoomDto;
import org.example.backend.Model.Booking;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

public interface BookingService {

    public BookingDto bookingToBookingDto (Booking b);

    public Booking bookindDtoToBooking (BookingDto b);

    public List<BookingDto> getAll();

    public void deleteBooking (BookingDto b);

    public void updateBooking (BookingDto b);

    public boolean areDatesOverlapping(List<Date> searchDates, List<Date> bookingDates);

    public List<Date> createDateInterval(Date checkin, Date checkout);

    public Long getNumberOfDaysBetweenTwoDates(Date checkin, Date checkout);

    public int getExtraBedsForBooking(RoomDto room, int guests);

    public boolean areThereConflictingBookingsOnDates(Date checkin, Date checkout);

    public Date convertStringToDate(String date) throws ParseException;
}
