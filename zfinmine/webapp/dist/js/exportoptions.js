function updatePathsString() {
    var sorted = jQuery('#pathsList').sortable( "serialize");
    jQuery('#pathsString').val(sorted);
}

function removeElement(elid) {
    var el = document.getElementById(elid);
    el.parentNode.removeChild(el);
}

function removePathElement(path, pathTitle) {
    removeElement(path);
    var index = path.lastIndexOf('_');
    path = path.substr(0, index);
    addSelectItem(path, pathTitle);
}

function addSelectedPath() {
    //var value = document.getElementById("columnToAdd").value;
    
    var index = document.getElementById('columnToAdd').selectedIndex;
    var child = document.getElementById('columnToAdd')[index];
    var path = child.value;
    var pathTitle = child.text;
    
    addPathElement(path, pathTitle);
    
    document.getElementById('columnToAdd').removeChild(child);
    
}

function addSelectItem(path, pathTitle) {
    var select = document.getElementById('columnToAdd');
    var el = document.createElement('option');
    el.setAttribute('value', path);
    el.innerHTML = pathTitle;
    select.appendChild(el);
}

// Functions for creating path element
// It cannot by done by innerHTML, because IE doesn't draw img element 
// contained in innerHTML
//=================================================

function addPathElement(path, pathTitle) {
    var el = document.createElement('li');
    el.setAttribute('id', path + '_' + pathIndex);
    el.appendChild(createPathDiv(path, pathTitle));
    var parent = document.getElementById('pathsList');
    parent.appendChild(el);
    pathIndex = pathIndex + 1;
}

function createPathDiv(path, pathTitle)  {
    var div = document.createElement('div');    
    div.setAttribute('class', 'viewpath');
    div.innerHTML = pathTitle;
    div.appendChild(createLink(path, pathTitle));
    return div;
}

function createLink(path, pathTitle) {
    var link = document.createElement('a');
    link.setAttribute('href', "javascript:removePathElement('" + path + "_" + pathIndex + "','" + pathTitle + "')");
    link.setAttribute('title','Remove ' + path + ' from the export');
    link.appendChild(createImg());
    return link;
}

function createImg() {
    var img = document.createElement('img');    
    img.setAttribute('src', 'images/cross.gif');
    img.setAttribute('align', 'top');
    img.setAttribute('border', '0px');
    img.style.width = '10px';
    img.style.height = '10px';
    img.style.verticalAlign = 'top';
    img.style.position = 'relative';
    img.style.marginTop = '-3px';
    img.style.marginLeft = '2px';
    return img;
}