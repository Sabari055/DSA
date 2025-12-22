--Employee(emp_id, name, dept_id)
--Department(dept_id, dept_name)
--select employee name and department name

select name,dept_name from Employee e 
join Department d on e.dept_id = d.dept_id;
