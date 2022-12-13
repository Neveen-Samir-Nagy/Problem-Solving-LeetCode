# Write your MySQL query statement below
SELECT firstname, lastname, city, state FROM Person p left outer join Address a on p.personId = a.personId;