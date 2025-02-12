package de.supernerd;

import java.util.UUID;

public record Person(
        UUID id,
        String name,
        DaysOfWeek favoriteday
) {
}
