/* Write your T-SQL query statement below */
SELECT Email from (
SELECT count(*) as count, email from Person group by email having count(*) > 1
) as f;