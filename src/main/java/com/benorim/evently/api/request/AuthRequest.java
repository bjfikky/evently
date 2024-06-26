package com.benorim.evently.api.request;

import jakarta.validation.constraints.NotBlank;

public record AuthRequest(
        @NotBlank String email,
        @NotBlank String password,
        String organizationName,
        String organizationEmail) {
}
