(
SELECT name, customers_number
FROM lawyers  
ORDER BY customers_number DESC
LIMIT 1
)

UNION ALL

(
SELECT name, customers_number
FROM lawyers  
ORDER BY customers_number ASC
LIMIT 1
)

UNION ALL

(
SELECT 'Average', round(AVG (customers_number),0)
FROM lawyers 
)

------------OUTRA SOLUÇÃO POSSIVEL-----------------

(
SELECT name, customers_number
FROM lawyers  
WHERE customers_number = (SELECT MAX(customers_number) FROM lawyers)
)

UNION ALL

(
SELECT name, customers_number
FROM lawyers  
WHERE customers_number = (SELECT MIN(customers_number) FROM lawyers)
)

UNION ALL

(
SELECT 'Average', round(AVG (customers_number),0)
FROM lawyers 
)


