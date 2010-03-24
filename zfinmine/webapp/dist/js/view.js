var previousOrder = '';

jQuery(document).ready(function(){
	jQuery('#viewDivs').sortable({dropOnEmpty:true,update:function() {
    	    reorderOnServer();
        }
	});
    recordCurrentOrder();
});
  

function recordCurrentOrder() {
    previousOrder = jQuery('#viewDivs').sortable('serialize');
}

/**
* Send the previous order and the new order to the server.
*/
function reorderOnServer() {
	var newOrder = jQuery('#viewDivs').sortable('serialize');
    AjaxServices.reorder(newOrder, previousOrder);
    recordCurrentOrder();
}

// called from viewElement.jsp
function updateSortOrder(pathString) {
	 if(jQuery('#btn_' + pathString.replace(/[\.:]/g,'_')).attr('src').match('none')) {
        AjaxServices.addToSortOrder(pathString, 'asc', function() {
       		reDrawSorter(pathString,'asc');
        });
	 } else if(jQuery('#btn_' + pathString.replace(/[\.:]/g,'_')).attr('src').match('asc')) {
        AjaxServices.addToSortOrder(pathString, 'desc', function() {
       		reDrawSorter(pathString,'desc');
        });
	 } else if(jQuery('#btn_' + pathString.replace(/[\.:]/g,'_')).attr('src').match('desc')) {
	    AjaxServices.addToSortOrder(pathString, 'asc', function() {
    		reDrawSorter(pathString,'asc');
	    });	
	 } else {
	 	return;
	 }
}

function reDrawSorter(name,order) {
	jQuery('.sortbutton').each(function(index) {
        if(this.id == 'btn_' + name.replace(/[\.:]/g,'_')) {
        	jQuery(this).attr('src','images/sort_'+order+'.png');
        } else if(jQuery(this).attr('src').indexOf("disabled")<0){
            jQuery(this).attr('src','images/sort_none.png');
        }
    });
}
