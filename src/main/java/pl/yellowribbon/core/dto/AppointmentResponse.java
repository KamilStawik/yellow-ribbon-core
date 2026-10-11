package pl.yellowribbon.core.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record AppointmentResponse(
        UUID uuid,
        UserResponse user,
        CustomerResponse customer,
        OffsetDateTime date) {
}
