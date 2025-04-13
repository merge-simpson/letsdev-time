package me.letsdev.time.exception;

import java.time.Instant;

import static java.time.temporal.ChronoField.MILLI_OF_SECOND;

public class ClockBackwardException extends RuntimeException {

    private final Instant currentTimestamp;
    private final Instant lastTimestamp;

    public ClockBackwardException(long timestamp, long lastTimestamp) {
        this(Instant.ofEpochMilli(timestamp), Instant.ofEpochMilli(lastTimestamp));
    }

    public ClockBackwardException(Instant currentTimestamp, Instant lastTimestamp) {
        super(
                """
                Clock moved backwards. Refusing to generate id for %d milliseconds.
                 Current Timestamp: %d (%s)
                 Last timestamp: %d (%s)""".formatted(
                        lastTimestamp.getLong(MILLI_OF_SECOND),
                        currentTimestamp.toEpochMilli(),
                        currentTimestamp,
                        lastTimestamp.toEpochMilli(),
                        lastTimestamp
                )
        );

        this.currentTimestamp = currentTimestamp;
        this.lastTimestamp = lastTimestamp;
    }

    public Instant getCurrentInstant() {
        return currentTimestamp;
    }

    public Instant getLastInstant() {
        return lastTimestamp;
    }
}
