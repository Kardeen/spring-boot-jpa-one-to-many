CREATE TABLE IF NOT EXISTS post (
    id INTEGER PRIMARY KEY,
    title VARCHAR(255)
);

INSERT INTO post (id, title) VALUES (1, 'First post');

CREATE TABLE IF NOT EXISTS post_comment (
    id INTEGER PRIMARY KEY,
    review VARCHAR(255),
    post_id INTEGER,
    FOREIGN KEY (post_id) REFERENCES post(id)
);

INSERT INTO post_comment (id, review, post_id) VALUES (1, 'My first review', 1);
INSERT INTO post_comment (id, review, post_id) VALUES (2, 'My second review', 1);
INSERT INTO post_comment (id, review, post_id) VALUES (3, 'My third review', 1);
