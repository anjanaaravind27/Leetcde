# Write your MySQL query statement below
SELECT emp.name AS Employee
FROM Employee emp
JOIN Employee m
ON emp.managerId = m.id
WHERE emp.salary > m.salary;