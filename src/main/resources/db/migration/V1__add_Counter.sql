CREATE TABLE IF NOT EXISTS counter
(
    counterId        VARCHAR(10) PRIMARY KEY,
    increment_value  BIGINT NOT NULL,
    result           BIGINT NOT NULL
);