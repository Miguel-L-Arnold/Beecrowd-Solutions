(
SELECT CONCAT('Podium: ', team) AS name 
FROM league 
WHERE position <= 3
)
UNION ALL
(
SELECT CONCAT('Demoted: ', team) AS name 
FROM league
WHERE position >= 14
)

---------OUTRA POSSIVEL SOLUÇÃO-------------------

(
SELECT CONCAT('Podium: ', team) AS name
from league
ORDER BY position 
LIMIT 3
)
UNION ALL
(
WITH t AS (SELECT * FROM league ORDER BY position DESC LIMIT 2)
SELECT CONCAT('Demoted: ', team) AS name
FROM t
ORDER BY position ASC
)