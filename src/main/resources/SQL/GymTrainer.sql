CREATE TABLE gym_trainer (
    gym_id BIGINT,
    trainer_id BIGINT,
    PRIMARY KEY (gym_id, trainer_id),
    FOREIGN KEY (gym_id) REFERENCES gym(id),
    FOREIGN KEY (trainer_id) REFERENCES trainer(id)
);
