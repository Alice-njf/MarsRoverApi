document.querySelectorAll("label[id*='marsApi'").forEach(
	label=> {
		label.addEventListener('click', function(){
			const labelId = this.id;
			const roverId = labelId.split('marsApi')[1];
			//alert(roverId + " is clicked");
			let apiData = document.getElementById('marsApiRoverData');
			apiData.value = roverId;
			document.getElementById("frmRoverType").submit();
			}
		)
	}
);

function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

const marsRoverType = getUrlParameter("marsApiRoverData");
console.log(marsRoverType);
if (marsRoverType == "Curiosity") {
	document.getElementById('marsApiCuriosity').classList.remove('btn-outline-danger');
}  else if (marsRoverType == "Opportunity") {
	document.getElementById('marsApiOpportunity').classList.remove('btn-outline-danger');

}  else if (marsRoverType == "Sprit") {
	document.getElementById('marsApiSprit').classList.remove('btn-outline-danger');
} else {
	
}


