var editingTag;
var inputType;

function getAddedTag(editorId, type) {
	if (getInputType(editorId, type) == 'select') {
		return getSelectValue('tagSelect-' + editorId);
	} else {
		return $('tagValue-' + editorId).value;
	}
}

function startEditingTag(editorId) {
	if (editingTag) {
		stopEditingTag();
	}
	editingTag = editorId;
	showEl('switchLink-' + editorId);
	hideEl('addLink-' + editingTag);
	setInputType(editorId, 'select');
	showEl('tagsEdit-' + editorId);
}

function setInputType(editorId, type) {
	inputType = type;
	if (type == 'select') {
		var title = 'New tag';
		showEl('tagSelect-' + editorId);
		hideEl('tagValue-' + editorId);
	} else {
		var title = 'Select tag';
		showEl('tagValue-' + editorId);
		hideEl('tagSelect-' + editorId);
		$('tagValue-' + editorId).focus();
	}
	$('switchLink-' + editorId).innerHTML = title;
}

function switchTagInput(editorId) {
	if (getInputType(editorId) == 'select') {
		setInputType(editorId, 'new');
	} else {
		setInputType(editorId, 'select');
	}
}

function getInputType(editorId) {
	return inputType;
}

function stopEditingTag() {
	if (editingTag) {
		hideEl('tagsEdit-' + editingTag);
		showEl('addLink-' + editingTag);
		hideEl('switchLink-' + editingTag);
	}
	editingTag = '';
}

function addTag(editorId, type) {
	var tag = getAddedTag(editorId, type);
	var callBack = function(returnStr) {
		if (returnStr == 'ok') {
			refreshTags(editorId, type);
		} else {
			window.alert(returnStr);
		}
	}
	taggedObject = parseTagged(editorId);
	if (taggedObject == '') {
		window.alert('Adding tag failed. It is not possible to tag this item.');
	}
	if (tag != '') {
		AjaxServices.addTag(tag, taggedObject, type, callBack);
	}
}

function deleteTag(tag, editorId, type) {
	var callBack = function(returnStr) {
		if (returnStr == 'ok') {
			refreshTags(editorId, type);
		} else {
			window.alert(returnStr);
		}
	}
	taggedObject = parseTagged(editorId);
	if (taggedObject == '') {
		window.alert('Deleting tag failed. It is not possible delete tag for this item.');
	}
	AjaxServices.deleteTag(tag, taggedObject, type, callBack);
}

function displayTags(editorId, type, tags) {
	var parent = $('currentTags-' + editorId);
	parent.innerHTML = '';
	for (var i = 0; i < tags.length; i++) {
		var tag = tags[i];
		addTagSpan(editorId, type, tag);
	}
}

function addTagSpan(editorId, type, tag) {
	var parent = $('currentTags-' + editorId);
	var span = document.createElement('span');
	span.setAttribute('class', 'tag');
	// for IE
	span.setAttribute('className', 'tag');
	span.innerHTML = tag + '<a class="deleteTagLink" onclick="javascript:deleteTag(\'' + tag + '\', \'' + editorId + '\', \'' + type + '\')">[x]</a>&nbsp;';
	parent.appendChild(span);
}

// Refreshes displayed tags for specified tagged object and refreshes selects in InlineTagEditors 
function refreshTags(editorId, type) {
	refreshObjectTags(parseTagged(editorId), type);
	refreshTagSelects(type);
}

function refreshObjectTags(tagged, type) {
	var callBack = function(tags) {
		var els = document.getElementsByTagName("*");
		for (var i = 0; i < els.length; i++) {
			var el = els[i];
			if (el.id.indexOf('currentTags-' + tagged + '@') == 0) { 
					//&& el.id.indexOf(tagged) != -1) {
				var editorId = el.id.replace('currentTags-', '');
				displayTags(editorId, type, tags);		
			}
		}
	}
	AjaxServices.getObjectTags(type, tagged, callBack);	
}

function refreshTagSelects(type) {
	var callBack = function(tags) {
		var selects = document.getElementsByTagName('select');
		for (var i = 0; i < selects.length; i++) {
			var select = selects[i];
			if (select.id.indexOf('tagSelect-') == 0) {
				setSelectElement(select.id, getSelectTitle(select), tags);
			}
		}			
	}
	AjaxServices.getTags(type, callBack);
}

// retrieves tagged object id from editorId where it is hidden
function parseTagged(editorId) {
	var parts = editorId.split("@");
	if (parts.length == 2) {
		return parts[0];
	} else {
		return "";
	}
}