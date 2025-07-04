-- Insert categories if none exist
INSERT INTO categories (name)
SELECT 'Electronics' UNION SELECT 'Books' UNION SELECT 'Clothing'
WHERE NOT EXISTS (SELECT 1 FROM categories);

-- Insert 3 users
INSERT INTO users (name, email, password)
VALUES
    ('Alice Smith', 'alice@example.com', 'hashedpassword1'),
    ('Bob Johnson', 'bob@example.com', 'hashedpassword2'),
    ('Charlie Davis', 'charlie@example.com', 'hashedpassword3');

-- Insert corresponding profiles (1-to-1 with users)
INSERT INTO profiles (id, bio, phone_number, date_of_birth, loyalty_points)
SELECT id, 'Just a random user.', '1234567890', '1990-01-01', 100
FROM users
WHERE id NOT IN (SELECT id FROM profiles);

-- Insert addresses for users
INSERT INTO addresses (street, city, state, zip, user_id)
SELECT '123 Main St', 'Tokyo', 'Tokyo', '100-0001', id FROM users
WHERE id NOT IN (SELECT user_id FROM addresses);

-- Insert products using existing categories
INSERT INTO products (name, price, description, category_id)
SELECT 'Wireless Mouse', 29.99, 'A high precision wireless mouse.', id FROM categories WHERE name = 'Electronics'
UNION
SELECT 'Novel Book', 14.95, 'A bestselling novel.', id FROM categories WHERE name = 'Books'
UNION
SELECT 'T-shirt', 9.99, 'Cotton T-shirt.', id FROM categories WHERE name = 'Clothing';

-- Insert wishlist items for each user (at most 1 product per user)
INSERT INTO wishlist (product_id, user_id)
SELECT p.id, u.id
FROM products p
         JOIN users u ON MOD(p.id + u.id, 3) = 0
WHERE NOT EXISTS (
    SELECT 1 FROM wishlist w WHERE w.product_id = p.id AND w.user_id = u.id
);