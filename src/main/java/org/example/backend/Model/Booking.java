package org.example.backend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Check-in date must be provided")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkinDate;

    @NotNull(message = "Check-out date must be provided")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkoutDate;

    @Min(value = 1, message = "Number of guests must be at least 1")
    @Max(value = 4, message = "Number of guests must be at most 4")
    private int guestAmt;

    @Max(value = 2, message = "Number of extra beds cannot exceed 2")
    private int extraBedAmt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private Room room;

    public Booking(Date checkinDate, Date checkoutDate, int guestAmt, int extraBedAmt, Customer customer, Room room) {
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.guestAmt = guestAmt;
        this.extraBedAmt = extraBedAmt;
        this.customer = customer;
        this.room = room;
    }
}