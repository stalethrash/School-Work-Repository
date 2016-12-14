/*
* CIST 308
* Mitch Meyer
* 4/11/16
* Assignment 4.1
*/



//  Display the highest, lowest, sum, and average salary of all employees.  
//  Label the columns Maximum, Minimum, Sum, and Average, respectively.  
//  Round your results to the nearest whole number.

SELECT TO_CHAR(MAX(SAL), '$9999') "Maximum", TO_CHAR(MIN(SAL), '$9999') "Minimum", 
TO_CHAR(SUM(SAL), '$99999') "Sum", TO_CHAR(AVG(SAL), '$9999') "Average"
FROM EMP;

//  Modify the previous SQL statement to display the minimum, maximum, sum and average salary for each job type.

SELECT JOB, TO_CHAR(MAX(SAL), '$9999') "Maximum", TO_CHAR(MIN(SAL), '$9999') "Minimum", 
TO_CHAR(SUM(SAL), '$99999') "Sum", TO_CHAR(AVG(SAL), '$9999') "Average"
FROM EMP
GROUP BY JOB;

//  Write a query to display the number of people with the same job.  Example: Analyst 2, Clerk 4

SELECT JOB, COUNT(JOB) "Numbers"
FROM EMP
GROUP BY JOB;

//  Determine the number of managers without listing them.  Label the column Number of Managers.

SELECT COUNT(UNIQUE MGR) "Number of Managers"
FROM EMP;

//  Write a query that will display the difference between the highest and lowest salaries.  Label the column DIFFERENCE.

SELECT TO_CHAR(MAX(SAL) - MIN(SAL), '$9999') "Difference"
FROM EMP;

//  Display the manager number and the salary of the lowest paid employee for that manager.  Exclude anyone whose manager is not known.  
//  Exclude any group where the minimum salary is less than $1000.  Sort the output in descending order of salary.

SELECT MGR, MIN(SAL) "SAL"
FROM EMP
WHERE REGEXP_LIKE(MGR, '[0-9]{4}')
GROUP BY MGR
ORDER BY SAL DESC;

//  Write a query to display the department name, location name, number of employees, and the average salary for all employees in that department.  
//  Label the columns DName, Loc, Number of People, and Salary, respectively.  Round the average salary to two decimal places.

SELECT DNAME, LOC, COUNT(EMP.DEPTNO) "Number of People", TO_CHAR(AVG(SAL), '$9999.99') "Salary"
FROM DEPT, EMP
WHERE DEPT.DEPTNO = EMP.DEPTNO
GROUP BY (LOC, DNAME);

//  Create a query that will display the total number of employees and of that total the number who were hired in 1980, 1981, 1982, and 1983.  
//  Use appropriate column heading.

SELECT COUNT(EMPNO) "Total", COUNT(CASE WHEN HIREDATE >= '01/01/1980' AND HIREDATE <= '12/31/1980' THEN 1 END) "1980",
COUNT(CASE WHEN HIREDATE >= '01/01/1981' AND HIREDATE <= '12/31/1981' THEN 1 END) "1981", COUNT(CASE WHEN HIREDATE >= '01/01/1982' AND
HIREDATE <= '12/31/1982' THEN 1 END) "1982", COUNT(CASE WHEN HIREDATE >= '01/01/1983' AND HIREDATE <= '12/31/1983' THEN 1 END) "1983"
FROM EMP;

//  Create a matrix query to display the job, the salary for that job based on department number, 
//  and the total salary for that job for all departments, giving each column an appropriate heading.

SELECT JOB, DEPT10 "Dept 10", DEPT20 "Dept 20", DEPT30 "Dept 30"
FROM (SELECT JOB, SUM(DECODE(DEPTNO, 10, SAL)) "DEPT10",
SUM(DECODE(DEPTNO, 20, SAL)) "DEPT20", SUM(DECODE(DEPTNO, 30, SAL)) "DEPT30" FROM EMP GROUP BY ROLLUP (JOB))
ORDER BY JOB;

