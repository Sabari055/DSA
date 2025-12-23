Write an SQL query to fetch employees who belong to a department named 'IT'
(use subquery or EXISTS).
--Employee(emp_id, name, dept_id)
--Department(dept_id, dept_name)

select * from employee where 
dept_id = (select dept_id from department 
           where dept_name = 'IT'); 
