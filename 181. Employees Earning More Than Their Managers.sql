select e.name as employee 
from employee as e , employee as m 
where e.managerid = m.id and e.salary > m.salary;
