SELECT d.name, round(sum((a.hours * 150.0)+ (((a.hours * 150.0) * ws.bonus)/100.0)),1) AS salary
FROM doctors d 
INNER JOIN attendances a ON d.id = a.id_doctor
INNER JOIN work_shifts ws ON a.id_work_shift = ws.id
GROUP BY d.id
ORDER BY salary DESC 