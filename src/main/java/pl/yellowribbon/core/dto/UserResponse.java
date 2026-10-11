package pl.yellowribbon.core.dto;

import java.util.UUID;

public record UserResponse(UUID uuid, String firstName, String lastName) {
}
