/* Write your T-SQL query statement below */
SELECT name as Customers from Customers 
where id not in
(SELECT c.id from Customers as c join Orders as o on c.id = o.customerId);
