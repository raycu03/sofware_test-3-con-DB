# sofware_test-3-con-DB
project grails Ray Antonio Narváez, Jeison Alonso Hernández y Jaime Uriel Zuluaga Osorio

Download Project

--------------Way 1----------------

1. If you haven't downloaded Git already, download and install Git through this link https://git-scm.com/downloads.
2. Once downloaded and installed, open Git Bash.
3. select the directory where you want download this project, use cd later the directory.
4. Enter the following line in Git Bash:
 git clone https://github.com/raycu03/sofware_test-3-con-DB.git

--------------Way 2----------------

1.Download as a zip and extract anywhere on your computer.

Download grails.

1. Download grails 3.3.10 from https://grails.org/
2. Extract anywhere on your computer.
3. add the path “$\grails-3.3.9\bin” on environment variables. #note in the $ put the directory where you extracted the file. this in windows

Install mysql server.

Download MySql installer from https://dev.mysql.com/downloads/windows/installer/8.0.html
In the step of choosing a setup type, select custom and install only MySql Server 8.0.16 - X64 

Run project

1. Make sure your Sql server is working.
2. Open MySQL 8.0 command line client, enter your database password, and execute this command “create database docentes;”.
3. In the archive application.yml ubicated in sofware_test-3-con-DB/grails-app/conf, change user and password in the following code segment.

dataSource:

	pooled: true
	jmxExport: true
	driverClassName: com.mysql.cj.jdbc.Driver
	dialect: org.hibernate.dialect.MySQL8InnoDBDialect
	username: "root" # user of your database
	password: "" 	# password of your database



4. Open CLIi of your computer, change to the directory of project. use cd. 
5. Enter command  “grails”
6. Later enter command “compile”
7. Later enter command “run-app”
8. Enter to the Url that grails show;


in case it goes "error | Error occurred running Grails CLI: No profile found for name [web]. (Use --stacktrace to see the full trace)". enter to the file build.gradle and uncomment the instruction profile "org.grails.profiles: web-plugin"

