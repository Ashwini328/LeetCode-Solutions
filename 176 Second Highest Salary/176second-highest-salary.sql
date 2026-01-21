# Write your MySQL query statement below
Select
(select distinct salary as SecondHighestSalary from Employee
Order By Salary Desc
Limit 1 offset 1) as SecondHighestSalary;