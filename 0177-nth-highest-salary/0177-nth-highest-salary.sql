CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      CASE WHEN N > (SELECT count(distinct(salary)) from Employee) THEN NULL
        ELSE (SELECT min(salary) FROM (SELECT distinct(salary) from Employee order by salary desc limit N ) as sal_tbl)
      END
      
  );
END