//var contextRoot = "/" + window.location.pathname.split( '/' )[0];
var contextRoot = 'http://localhost:8080';

function deleteProduct(id) {
		$.ajax({
			url : contextRoot + '/products/delete/'+ id,
			//dataType : "json", // Accept header
			// daa:dataToSend,
			//contentType : 'application/json', // Sends - Content-type
			success : function() {
				alert("success");
			},
			error : function(errorObject) {
				alert("Sorry, you cannot delete this product!!! Becuase it was ordered!!!");
			}

		});
	}

function orderProduct(productId,personId) {
	$.ajax({
		url : contextRoot + '/products/delete/'+ id,
		//dataType : "json", // Accept header
		// daa:dataToSend,
		//contentType : 'application/json', // Sends - Content-type
		success : function() {
			alert("success");
		},
		error : function(errorObject) {
			alert("error");
		}

	});
}