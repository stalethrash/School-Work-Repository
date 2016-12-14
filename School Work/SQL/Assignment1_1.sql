/*
 * CIST 308
 * Mitch Meyer
 * 3/22/2016
 * Assignment 1.1
 */
 
 // LESSON 1
 
 // Show the structure of the DEPT table
 DESC DEPT
 
 // Select all data from the DEPT table
 SELECT * FROM DEPT;
 
 // Show the structure of the EMP table
 DESC EMP
 
 // Query to display the name, job, hire date, and employee number for each employee starting with employee number
 SELECT EMPNO, ENAME, JOB, HIREDATE FROM EMP;
 
 // Query to display Unique jobs from EMP table
 SELECT UNIQUE JOB from EMP;
 
 // Query to display the employee number, employee name, job, and hire date.  Name the columns: Emp #, Employee, Job, and Hire Date
 SELECT EMPNO AS "Emp #", ENAME AS "Employee", JOB AS "Job", HIREDATE AS "Hire Date" FROM EMP;
 
 // Query that displays the employee name concatenated with the job title, separated by a comma and space, name the column "Employee and Title".
 SELECT ENAME || ', ' || JOB FROM EMP;
 
 // Query to display all the data from the EMP table.  Separate each column by a comma.
 SELECT EMPNO || ', ' || ENAME || ', ' || JOB || ', ' || MGR || ', ' || HIREDATE || ', ' || SAL || ', ' || COMM || ', ' || DEPTNO FROM EMP;
 
 
 
 // LESSON 2
 
 // Query to display the name and salary of employees earning more than $2850
 SELECT ENAME, SAL 
 FROM EMP
 WHERE SAL > '2850';
 
 // Query to display the employee name and department number for each employee number 7566.
 SELECT ENAME, DEPTNO
 FROM EMP
 WHERE EMPNO = 7566;
 
 // Query to display the employee name and salary for each employee whose salary is not in the range of $1500 and $2850. 
 SELECT ENAME, SAL
 FROM EMP
 WHERE SAL > '2850' OR SAL < '1500';
 
 // Query to display the employee name, job and start date of employees hired between February 20, 1981 and May 1, 1981.  Order the query in ascending order by start date.
 SELECT ENAME, JOB, HIREDATE
 FROM EMP
 WHERE HIREDATE <= 'May 1, 1981' AND HIREDATE >= 'February 20, 1981'
 ORDER BY HIREDATE;

 // Query that displays the name and department number of all employees in departments 10 and 30 in alphabetical order.
 SELECT ENAME, DEPTNO
 FROM EMP
 WHERE DEPTNO = 10 OR DEPTNO = 30
 ORDER BY ENAME;
 
 // Query to list the names and salary of employees who earn more than $1500 and are in department 10 or 30.  Label the columns Employee and Monthly Salary, respectively.
 SELECT ENAME "Employee", SAL "Monthly Salary"
 FROM EMP
  WHERE SAL > '1500' AND (DEPTNO = 10 OR DEPTNO = 30);

 // Name and hire date of every employee who was hired in 1982.
 SELECT ENAME, HIREDATE
 FROM EMP
 WHERE HIREDATE >= 'January 1, 1982' AND HIREDATE <= 'December 31, 1982';
 
 // Name and job title of all employees who do not have a manager
 SELECT ENAME, JOB, MGR
 FROM EMP
 WHERE MGR IS NULL;

 // Name, salary, and commission for all employees who earn commissions.  Sort in descending order of salary and commission.
 SELECT ENAME, SAL, COMM
 FROM EMP
 WHERE COMM IS NOT NULL;
 
 // Names of all employees where the third letter of their name is an 'A'.
 SELECT ENAME
 FROM EMP
 WHERE INSTR(ENAME, 'A', 1, 1) = 3;
 
 // Name of all employees who have two 'L's in their name and are in department 30 or their manager is 7782.
  SELECT ENAME
  FROM EMP
  WHERE INSTR(ENAME, 'L', 1, 2) > 1
  AND DEPTNO = '30' 
  AND MGR = '7782';
 // Returns no values as no record meets all of these conditions
 
 // Name, job, salary for all employees whose job is Clerk or Analyst and their salary is not equal to $1000, #3000, or $5000.
 SELECT ENAME, JOB, SAL
 FROM EMP
 WHERE JOB = 'CLERK'
 OR JOB = 'ANALYST' 
 AND SAL != 3000
 AND SAL != 1000
 AND SAL != 5000;
 
 // Name, salary, and commission for all employees whose commission amount is greater than their salary by 10%.
 SELECT ENAME, SAL, COMM
 FROM EMP
 WHERE COMM > (SAL * 1.10);
  