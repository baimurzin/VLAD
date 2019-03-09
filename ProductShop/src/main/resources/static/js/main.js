function addToBasket(userId, productId) {
    $.ajax({
        type: "POST",
        url: userId + "/basket?productId=" + productId
    }).done(function (data) {
        let $productsList = $('#basketItems');
        $productsList.html("");
        $.each(data.products, function (i, item) {
            $('<ul>').append($('<li>').html(item.name))
                .appendTo($productsList);
        });
    });
}