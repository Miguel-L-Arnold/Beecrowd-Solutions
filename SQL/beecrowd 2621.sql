SELECT p.name
FROM providers f
INNER JOIN products p ON f.id = p.id_providers
WHERE p.amount BETWEEN 10 AND 20 AND f.name LIKE 'P%'