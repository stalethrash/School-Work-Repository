/*
* CIST 308
* Mitch Meyer
* 4/18/2016
* Assignment 5.1
*/


// Write a query to display the employees name and hire date for all employees in the same department as 'Blake'.  Exclude 'Blake'.

SELECT ENAME, HIREDATE
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'BLAKE')
AND ENAME != 'BLAKE';

// Create a query to display the employee number and name for all employees who earn more than the average salary.  
// Sort the results in descending order of salary.

SELECT EMPNO, ENAME
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
ORDER BY SAL DESC;

// Write a query that will display the employee number and name for all employees who work in a department with any employee whose name contains a 'T'.

SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE ENAME LIKE '%T%');

// Display the employee name, department number, and job title for all employees whose department location is Dallas.

SELECT ENAME, EMP.DEPTNO, JOB
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
AND LOC = 'DALLAS';

// Display the employee name and salary of all employees who report to 'King'.

SELECT ENAME, SAL
FROM EMP
WHERE MGR = (SELECT EMPNO FROM EMP WHERE ENAME = 'KING');

// Display the department number, name, and job for all employees in the Sales department.

SELECT EMP.DEPTNO, ENAME, JOB
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
AND DEPT.DNAME = 'SALES';

// Display the employee number, name, and salary for all employees who earn more than the average salary and who work in a department 
// with any employee with a 'T' in their name.

SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE ENAME LIKE '%T%')
AND SAL > (SELECT AVG(SAL) FROM EMP); 















