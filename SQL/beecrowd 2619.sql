SELECT p.name, f.name, p.price
FROM products p
INNER JOIN categories c ON p.id_categories = c.id
INNER JOIN providers f ON p.id_providers = f.id
WHERE p.price > 1000 AND c.name = 'Super Luxury'
