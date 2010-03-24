function refreshTagSelect(selectId, type) {
    var select = document.getElementById(selectId);
	displayTagSelect(getSelectTitle(select), selectId, type);
}

function callOnChangeFunction(selectId, onChangeFunction) {
    var select = document.getElementById(selectId);
    var value = select[select.selectedIndex].value;
    eval(onChangeFunction + '(value)');
}

function displayTagSelect(title, selectId, type) {
	var callBack = function(tags) {
		setSelectElement(selectId, title, tags);
    }
    AjaxServices.getTags(type, callBack);	
}

function getSelectTitle(select) {
	if (select.length != 0 && select[0].value == "") {
		return select[0].text;
	} else {
		return title = "";
	}
}
