SELECT p.firstName, p.lastName, a.City, a.State 
FROM Person as p 
LEFT JOIN Address as a
ON p.personId = a.personId;
