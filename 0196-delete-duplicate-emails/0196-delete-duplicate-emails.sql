# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE per2 FROM Person per1, Person per2 WHERE per1.email = per2.email AND per1.id < per2.id;