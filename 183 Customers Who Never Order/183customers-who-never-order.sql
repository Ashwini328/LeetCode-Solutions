# Write your MySQL query statement below
select name as Customers 
From Customers
where id not in(select distinct customerId from Orders);