package org.example.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
enum Type {
    SINGLE, DOUBLE, LARGE_DOUBLE
}
*/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomType {

    @Id
    private Long id;

    @NotEmpty
    @NotNull
    @Pattern(regexp = "^[A-Za-zÅÄÖåäö\\s]*$", message = "Only letters and whitespace for room type")
    private String type;

    @Max(value = 2, message = "Number of extra beds cannot exceed 2")
    private int maxExtraBed;

    @Max(value = 4, message = "Number of guests cannot exceed 4")
    private int maxPerson;

    @NotNull(message = "Price per night is mandatory")
    @Positive(message = "Price per night must be positive")
    private double pricePerNight;
}