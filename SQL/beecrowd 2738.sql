SELECT c.name, 
       CAST(((s.math * 2) + (s.specific * 3) + (s.project_plan * 5)) / 10 AS NUMERIC(15, 2)) AS pontuacao_final
FROM candidate c
INNER JOIN score s ON c.id = s.candidate_id
ORDER BY pontuacao_final DESC;


----------------------------OUTRA SOLUÇÃO POSSIVEL---------------------------------

SELECT c.name, 
       ROUND(((s.math * 2) + (s.specific * 3) + (s.project_plan * 5)) / 10, 2) AS pontuacao_final
FROM candidate c
INNER JOIN score s ON c.id = s.candidate_id
ORDER BY pontuacao_final DESC;

