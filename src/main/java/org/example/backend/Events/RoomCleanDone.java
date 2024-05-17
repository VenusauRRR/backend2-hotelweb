package org.example.backend.Events;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class RoomCleanDone extends RoomEvent {
    @JsonProperty(value = "CleaningByUser")
    String cleaner;

    public RoomCleanDone(Long id, int roomno, LocalDateTime timestamp, String cleaner) {
        super(id,roomno, timestamp);
        this.cleaner = cleaner;
    }

    @Override
    public String toString() {
        return "RoomStatus{" +
                "room=" + roomno +
                ", dateTime='" + timestamp +
                ", cleaner='" + cleaner +
                '\'' +
                '}';
    }

    @Override
    public String getCleaner() {
        return cleaner;
    }
}
