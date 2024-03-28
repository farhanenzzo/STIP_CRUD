CREATE TABLE pokemon (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    type VARCHAR(255),
    level INT,
    species VARCHAR(255),
    trainer_id BIGINT,
    FOREIGN KEY (trainer_id) REFERENCES trainer(id)
);

INSERT INTO pokemon (name, type, level, species, trainer_id) VALUES
('Pikachu', 'Electric', 25, 'Mouse', 1),
('Bulbasaur', 'Grass', 20, 'Seed', 1),
('Squirtle', 'Water', 18, 'Tiny Turtle', 2),
('Charmander', 'Fire', 15, 'Lizard', 3);
