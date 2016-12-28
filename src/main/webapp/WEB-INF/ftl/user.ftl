<#-- @ftlvariable name="user" type="eu.karols.domain.User" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User details</title>
</head>
<body>
<nav role="navigation">
    <ul>
        <li><a href="/">Home</a></li>
    </ul>
</nav>

<h1>User details</h1>

<p>Name: ${user.login}</p>

<p>Name: ${user.name}</p>

<p>E-mail: ${user.email}</p>

<p>Role: ${user.role}</p>
</body>
</html>