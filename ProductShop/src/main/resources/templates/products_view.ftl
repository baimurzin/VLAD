<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<head>
    <title>Products</title>

    <script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <script src="js/main.js"></script>
</head>
<body>

<div class="row">

    <div class="col-md-4">
    <#list products as product>
        <br/>
        <div class="container">

            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <tr>
                        <td>${product.name}</td>
                        <td>${product.cost}</td>
                        <br/>
                        <br/>
                        <td>
                            <button type="submit" class="btn btn-outline-info"
                                    onclick="addToBasket(1, ${product.id})">Добавить в корзину
                            </button>
                        </td>
                        <br/>

                    </tr>

                </div>
            </div>
            <br/>
        </div>
    </#list>
    </div>


    <div class="col-md-4">
        <br/>
        <div class="container">
            <ul class="list-group list-group-horizontal-sm">
                <li id="list" class="list-group-item">Корзина</li>
                <ul id="basketItems">
                </ul>
            </ul>
        </div>
    </div>

</div>

</body>
</html>