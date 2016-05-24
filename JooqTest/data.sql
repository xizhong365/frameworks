
-- https://blog.bertvanlangen.com/software-development/java-object-oriented-querying-jooq/

-- mysql

CREATE DATABASE jooqtest;
USE jooqtest;
 
CREATE TABLE food (
  id BIGINT PRIMARY KEY,
  kind VARCHAR(255)
);
 
CREATE TABLE dinner_guests(
  id BIGINT PRIMARY KEY,
  name VARCHAR(255)
);
 
CREATE TABLE dinner_favorites (
  foodid BIGINT NOT NULL,
  dinner_guest_id BIGINT NOT NULL,
  FOREIGN KEY fk_food(foodid) REFERENCES food(id),
  FOREIGN KEY fk_dinner_guests(dinner_guest_id) REFERENCES dinner_guests(id)
);

INSERT INTO food VALUES
  (1, 'Fruit snack'),
  (2, 'Indonesian food'),
  (3, 'Candy'),
  (4, 'Vegetables, potatoes with gravy and a piece of meat')
;
 
INSERT INTO dinner_guests VALUES
  (1, 'Bert'),
  (2, 'Jacky'),
  (3, 'Lindsay'),
  (4, 'Suus')
;
 
INSERT INTO dinner_favorites VALUES
  (1,4), -- Suus loves Fruit snacks
  (4,4), -- Suus loves Vegetables, potatoes with gravy and a piece of meat  
  (1,2), -- Jacky loves Fruit snacks
  (2,2), -- Jacky loves Indonesian food
  (3,3), -- Lindsay loves candy
  (4,1)  -- Bert loves Vegetables, potatoes with gravy and a piece of meat
;

