package pl.yellowribbon.core.dto;

import java.util.UUID;

public record CustomerResponse(UUID uuid, String firstName, String lastName) {
}
