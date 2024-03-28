CREATE TABLE trainer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    badge VARCHAR(255)
);

INSERT INTO trainer (name, badge) VALUES
('Ash Ketchum', 'Pikachu Badge'),
('Misty', 'Cascade Badge'),
('Brock', 'Boulder Badge');