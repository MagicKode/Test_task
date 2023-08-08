CREATE TABLE IF NOT EXISTS numbers_counter
(
    counter_id        VARCHAR(10) PRIMARY KEY,
    increment_value  BIGINT NOT NULL,
    result           BIGINT NOT NULL
);