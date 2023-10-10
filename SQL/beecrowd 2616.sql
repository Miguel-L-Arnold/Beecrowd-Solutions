SELECT c.id, c.name
FROM customers c
WHERE c.id NOT IN (SELECT id_customers FROM locations)

-----------OUTRA POSSIVEL SOLUÇÃO----------------

SELECT c.id, c.name
FROM customers c
WHERE NOT EXISTS (SELECT id_customers FROM locations l
                           WHERE c.id = l.id_customers)