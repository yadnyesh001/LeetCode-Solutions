# Write your MySQL query statement below
SELECT class
FROM Courses
HAVING COUNT(DISTINCT student) >= 5;