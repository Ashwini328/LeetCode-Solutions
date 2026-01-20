# Write your MySQL query statement below
Select P.firstName,P.lastName,A.city,A.state
From Person P
LEFT JOIN Address A on A.personId=P.personId;