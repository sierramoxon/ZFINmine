var lastOpen;

function toggleToolBarMenu(button) {
	if(button == null) {
	    return;
	}
	if (lastOpen) {
	    hideMenu(lastOpen);
	}
	var item_name = "#"+jQuery(button).attr('id').replace(/li/,'item');
	if (jQuery(item_name).is(":visible")) {
		hideMenu(item_name);
		return;
	}
	if(jQuery(button).attr('id').indexOf('widget') < 0) {
        jQuery(button).addClass('tb_button_active');
	}
	var posArray = findPosition(button);
    jQuery(item_name).css('left', posArray[0] +"px");
    jQuery(item_name).css('top', posArray[1] + 25 +"px");
	jQuery(item_name).show();
	lastOpen = jQuery(item_name).attr('id');
}
function hideMenu(id) {
	jQuery("#"+id).hide();
	if(jQuery("#"+id).attr('id').indexOf('widget') < 0) {
        jQuery("#"+id.replace(/item/,'li')).removeClass('tb_button_active');
    }
}

// Uses findPosition(obj) defined in imutils.js