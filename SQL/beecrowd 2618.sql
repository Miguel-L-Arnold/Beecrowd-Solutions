SELECT p.name, f.name, c.name
FROM products p
INNER JOIN providers f ON p.id_providers = f.id
INNER JOIN categories c ON p.id_categories = c.id
WHERE f.name = 'Sansul SA' AND c.name = 'Imported'