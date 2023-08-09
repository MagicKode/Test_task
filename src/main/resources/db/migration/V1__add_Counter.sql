CREATE TABLE IF NOT EXISTS numbers_counter
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    counter_id       VARCHAR(10) UNIQUE,
    result           BIGINT NOT NULL
);