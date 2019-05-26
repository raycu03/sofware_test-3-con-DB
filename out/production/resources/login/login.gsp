<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Login</title>
</head>
<body>
	<div id="log" class="content scaffold-create" role="main" align="center">
            <g:form controller="Login" action="loginAuth">
                <fieldset class="form">
                   <input type="text" name="username">
                </fieldset>
                <fieldset class="form">
                   <input type="password" name="password">
                </fieldset> 
                <fieldset class="buttons">
                    <g:submitButton  name="submit" value="submit" />
                </fieldset>
            </g:form>
        </div>
</body>
</html>