

function SearchProductById(){
	alert();
	var contextRoot = "/" + window.location.pathname.split( '/' )[1];
	var productId = $('#SearchId').val();
	console.log(productId);
	
	$.ajax({
		url: contextRoot + '/product/searchProduct',
		type: 'GET',
		dataType: "json",           // Accepts
 		data:'productId='+productId,
 		contentType: 'application/json',   // Sends
		success: function(product){
			console.log(productId);
			alert("Hi");
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> Product Information <H3>');     
			$('#formInput').append("<H4 align='center'>Product Name:  " + product.name + "</h4>"  );
			$('#formInput').show();
			
		},
		error: function(jqXHR,  textStatus,  exception ){
			alert("error");	
			}
		});
}