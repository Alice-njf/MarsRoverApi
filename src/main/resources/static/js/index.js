document.querySelectorAll("label[id*='marsApi'").forEach(
	label=> {
		label.addEventListener('click', function(){
			const labelId = this.id;
			const roverId = labelId.split('marsApi')[1];
			alert(roverId + " is clicked");
			}
		)
	}
);