$(document).ready(function(){
	$("#labelDevendo").maskMoney();
});

jQuery.validator.setDefaults({
	debug: false,
	success: "valid"
});
	
	$("#formAdicionaCaloteiro").validate({
		rules:{
			nome:{
				required: true,
				maxLength: 45
			},
			email:{
				required: true,
				email: true
			}
		},
		
		messages: {
			nome:{
				required: "Esse campo é obrigatório!",
				maxLength: "O campo nome não pode ter mais que 45 caracteres"				
			},
			email:{
				required: "Esse campo é obrigatório!",
				email: "Este não é um email válido!"
			}
		}
	})