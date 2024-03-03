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

let marsRoverType = getUrlParameter("marsApiRoverData");

highlightBtnRoverType (marsRoverType);
console.log(marsRoverType);

function highlightBtnRoverType(roverType){
	if (marsRoverType == '')
		marsRoverType == 'Opportunity';
	document.getElementById('marsApi' + roverType).classList.remove('btn-outline-danger');
	document.getElementById('marsApi' + roverType).classList.add('btn-dark');

}
