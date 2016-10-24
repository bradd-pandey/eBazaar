function askQuantity(productId){
//	alert(productId);
	$("#productId").val(productId);
	$("#pQuantity").show();	
}

function ajaxCall(){
	var dataToSend = JSON.stringify(serializeObject($('#quantityForm')));
	/*var quantity = $("#quantity").val();
	var productId = $("#productId").val();*/
	
	$.ajax({
		type: 'POST',
		url: 'order/addToCart',
		dataType: 'json',
		/*data: {"productId": productId,
				"quantity" : quantity},*/	
		data:dataToSend,
		contentType: 'application/json', 
		success: function(successDataObject) {			
//			alert("Product successfully added to the cart!")		
		},
		error: function(errorDataObject) {
//			alert("Error!")			
		}
	});
}

function removeProduct(){
	
}

function serializeObject (form){
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;
};