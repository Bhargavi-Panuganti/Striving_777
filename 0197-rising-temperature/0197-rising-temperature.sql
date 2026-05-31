-- select w1.id
-- from Weather w1
-- join Weather w2
-- on DATEDIFF(w1.recordDate, w2.recordDate)=1
-- where w1.temperature>w2.temperature;

SELECT id
FROM (
    SELECT
        id,
        recordDate,
        temperature,
        LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date,
        LAG(temperature) OVER (ORDER BY recordDate) AS prev_temp
    FROM Weather
) t
WHERE DATEDIFF(recordDate, prev_date) = 1
  AND temperature > prev_temp;