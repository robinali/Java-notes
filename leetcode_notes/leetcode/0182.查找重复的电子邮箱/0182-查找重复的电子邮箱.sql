# Write your MySQL query statement below
# Using GROUP BY and HAVING
SELECT Email
FROM Person
GROUP BY Email
HAVING count(Email) > 1;
;