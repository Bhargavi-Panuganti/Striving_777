# Write your MySQL query statement below
-- select d.name as Department, e.name as Employee, e.salary as Salary from 
-- Employee e inner join Department d
-- on e.departmentId = d.id
-- where e.salary= (
--   select Max(salary)
--   from Employee
--   where departmentId = e.departmentId
-- );

SELECT Department, Employee, Salary
FROM (
    SELECT d.name AS Department,
           e.name AS Employee,
           e.salary AS Salary,
           RANK() OVER(PARTITION BY d.id ORDER BY e.salary DESC) AS rnk
    FROM Employee e
    JOIN Department d
    ON e.departmentId = d.id
) t
WHERE rnk = 1;