function askQuantity(productId){
//	alert(productId);
	$("#productId").val(productId);
	$("#pQuantity").show();	
}

var contextRoot = "/" + window.location.pathname.split( '/' )[1];

function ajaxCall(){
	var dataToSend = JSON.stringify(serializeObject($('#quantityForm')));
		
	$.ajax({
		type: 'POST',
		url: contextRoot + '/order/addToCart',
		dataType: 'json',
		data:dataToSend,
		contentType: 'application/json', 
		success: function(successDataObject) {			
			alert("Product successfully added to the cart!")		
		},
		error: function(errorDataObject) {
			alert("Error!")			
		}
	});
}

function removeProduct(productId){
//	alert(productId);
	$.ajax({
		type: 'GET',
		url: contextRoot + '/order/removeFromCart',
		dataType: '',
		data: {'productId':productId},
		contentType: '', 
		success: function(successDataObject) {			
			alert("Product successfully removed from the cart!");
			location.reload();
		},
		error: function(errorDataObject) {
			alert("Remove operation is failed!")			
		}
		
	});
}

function serializeObject (form){
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;
};