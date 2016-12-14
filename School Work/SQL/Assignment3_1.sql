/*
* CIST 308
* Mitch Meyer
* 4/4/2016
* Assignment 3.1
*/

//  Write a query to display the name, department number, and department name for all employees.

SELECT ENAME, DNAME, DEPT.DEPTNO
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

//  Create a unique listing of all jobs that are in department 30.  Include the location of the department 30 in the output.

SELECT UNIQUE JOB, LOC
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
AND EMP.DEPTNO = '30';

//  Write a query to display the employee name, department name, and location of all employees who earn a commission.

SELECT ENAME, DNAME, LOC
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
AND EMP.COMM >= 0;

//  Display the employee name and department name for all employees who have an 'A' in their name.

SELECT ENAME, DNAME
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
AND ENAME LIKE '%A%';

//  Write a query to display the name, job, department number, and department name for all employees who work in DALLAS.

SELECT ENAME, JOB, EMP.DEPTNO, DNAME
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
AND DEPT.LOC = 'DALLAS';

//  Display the employee name and employee number along with their manager's name and manager number.  
//  Label the columns Employee, Emp#, Manager, and Mgr#, respectively.

SELECT e.ENAME "Employee", e.EMPNO "Emp#", m.ENAME "Manager", e.MGR "Mgr#"
FROM EMP e, EMP m
WHERE e.MGR = m.EMPNO;

//  Modify the previous query to display all employees including King, who has no manager.  
//  Note, the 3rd and 4th fields for King will display as empty.

SELECT e.ENAME "Employee", e.EMPNO "Emp#", m.ENAME "Manager", e.MGR "Mgr#"
FROM EMP e, EMP m
WHERE e.MGR = m.EMPNO(+);

//  Create a query that will display the employee name, department number, and all the employees that work in the same department 
//  as a given employee.  Give each column an appropriate label.

SELECT e.ENAME "Employee", DNAME "Dept", c.ENAME "Co-Workers"
FROM EMP e, EMP c, DEPT
WHERE  e.DEPTNO = DEPT.DEPTNO
AND e.ENAME != c.ENAME
AND c.DEPTNO = e.DEPTNO
ORDER BY e.ENAME;

//  Show the structure of the SALGRADE table.

DESCRIBE SALGRADE;

//  Create a query that will display the name, job, department name, salary, and grade for all employees.

SELECT ENAME, JOB, DNAME, SAL, GRADE
FROM EMP, DEPT, SALGRADE
WHERE SAL
BETWEEN LOSAL AND HISAL
AND EMP.DEPTNO = DEPT.DEPTNO;

//  Create a query to display the name and hire date of any employee hired after employee Blake.

SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE > (SELECT HIREDATE FROM EMP WHERE EMPNO = 7698);

//  Display all employees' names and hire dates along with their manager's name and hire date for all employees 
//  who were hired before their managers.  Label the columns Employee, Emp Hire Date, Manager, and Mgr Hire Date, respectively.

SELECT e.ENAME "Employee", e.HIREDATE "Emp Hire Date", m.ENAME "Manager", m.HIREDATE "Mgr Hire Date"
FROM EMP e, EMP m
WHERE e.MGR = m.EMPNO
AND e.HIREDATE < m.HIREDATE;
























