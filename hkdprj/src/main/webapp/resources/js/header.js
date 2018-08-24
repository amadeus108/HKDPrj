window.addEventListener("load", function(event) {
	
	var header = document.querySelector("#header");
	var mainMenu = header.querySelector("#main-menu");
	var hamButton = header.querySelector(".hamburger-button");

	header.onclick = function(e) {
		if (e.target.nodeName == "HEADER" && e.target != hamButton)
			header.classList.remove("menu-show");
	}
	
	hamButton.onclick = function(e) {
		header.classList.add("menu-show");
		e.stopPropagation();
	}

});