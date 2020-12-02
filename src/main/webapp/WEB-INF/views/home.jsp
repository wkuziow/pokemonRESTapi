<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>Pokemon attack type</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">


      <form>

            <div class="form-group row">
                <label for="pokemonListId" class="col-sm-2 col-form-label">Aktywny:</label>
                <div class="col-sm-10">
                    <form:radiobuttons path="pokemonList" items="${pokemonList}" itemLabel="${pokemonList.getName()}" id="pokemonListId" class="form-control"/>
                </div>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Zapisz</button>
      </form>


    </ul>
</div>

</body>
</html>