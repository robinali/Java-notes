# Write your MySQL query statement below
SELECT FirstName, LastName, City, state
FROM Person LEFT JOIN Address
ON Person.PersonId = Address.PersonId
;