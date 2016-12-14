/*
* CIST 308
* Mitch Meyer
* 4/25/16
* Assignment 6.1
*/

// Write a query to display the name, department number, and salary of any employee whose department 
// number and salary match the department number and salary of any employee who earns a commission.

SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE COMM > 0)
AND SAL IN (SELECT SAL FROM EMP WHERE COMM > 0);

// Display the name, department name, and salary of any employee whose salary and commission match 
// the salary and commission of any employee located in Dallas.

SELECT ENAME, DNAME, SAL, COMM
FROM EMP, DEPT
WHERE SAL =ANY(SELECT SAL FROM EMP, DEPT WHERE LOC = 'DALLAS' 
               AND EMP.DEPTNO = DEPT.DEPTNO)
AND NVL(COMM, 0) =ANY (SELECT NVL(COMM, 0) FROM EMP, DEPT WHERE LOC = 'DALLAS'
               AND EMP.DEPTNO = DEPT.DEPTNO)
AND EMP.DEPTNO = DEPT.DEPTNO;


// Create a query to display the name, hire date, and salary for all employees who have both the same salary and commission as Scott.

SELECT ENAME, HIREDATE, SAL
FROM EMP
WHERE SAL =ANY(SELECT SAL FROM EMP WHERE ENAME = 'SCOTT')
AND NVL(COMM, 0) =ANY(SELECT NVL(COMM, 0) FROM EMP WHERE ENAME = 'SCOTT');

// Create a query to display the employee that earns a salary that is higher than the salary of all of the clerks.  
// Sort the results on salary from highest to lowest.

SELECT ENAME, SAL
FROM EMP
WHERE SAL >ALL (SELECT SAL FROM EMP WHERE JOB = 'CLERK')
ORDER BY SAL DESC;

