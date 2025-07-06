# Write your MySQL query statement below
Select employee_id , department_id 
From Employee
where primary_flag ="Y" or employee_id in
(SELECT employee_id 
From Employee 
Group by employee_id 
having count(employee_id)=1)