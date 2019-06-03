# sofware_test-3-con-DB
proyecto grails Ray Antonio Narváez, Jeison Alonso Hernández y Jaime Uriel Zuluaga Osorio

Download Project

--------------Way 1----------------

If you haven't downloaded Git already, download and install Git through this link https://git-scm.com/downloads.
Once downloaded and installed, open Git Bash.
select the directory where you want download this project, use cd later the directory.
Enter the following line in Git Bash:
 git clone https://github.com/raycu03/sofware_test-3-con-DB.git

--------------Way 2----------------

Download as a zip and extract anywhere on your computer.
Download grails.

Download grails 3.3.10 from https://grails.org/
Extract anywhere on your computer.
add the path “$\grails-3.3.9\bin” on environment variables. #note in the $ put the directory where you extracted the file. this in windows

Install mysql server.

Download MySql installer from https://dev.mysql.com/downloads/windows/installer/8.0.html
In the step of choosing a setup type, select custom and install only MySql Server 8.0.16 - X64 

Run project

Asegúrese de que su servidor Sql esté funcionando.
Open MySQL 8.0 command line client, enter your database password, and execute this command “create database docentes;”.
In the archive application.yml ubicated in sofware_test-3-con-DB/grails-app/conf, change user and password in the following code segment.

dataSource:

	pooled: true
	jmxExport: true
	driverClassName: com.mysql.cj.jdbc.Driver
	dialect: org.hibernate.dialect.MySQL8InnoDBDialect
	username: "root" # user of your database
	password: "" 	# password of your database



Open CLIi of your computer, change to the directory of project. use cd. 
Enter command  “grails”
Later enter command “compile”
Later enter command “run-app”
Enter to the Url that grails show;

