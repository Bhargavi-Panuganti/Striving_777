# Write your MySQL query statement below
-- select num as ConsecutiveNums  
-- from(
--     select num, lag(num) over(order by id) as prev
--     from Logs
-- )n
-- where prev>2;

SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT num,
           LAG(num, 1) OVER(ORDER BY id) AS prev1,
           LAG(num, 2) OVER(ORDER BY id) AS prev2
    FROM Logs
) t
WHERE num = prev1
AND num = prev2;