# Write your MySQL query statement below
-- select player_id, event_date as first_login
-- from (
--    select player_id, event_date,dense_rank() over(
--     partition by player_id 
--     order by event_date asc) as rnk
--    from Activity
-- )t
-- where rnk=1;

SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;