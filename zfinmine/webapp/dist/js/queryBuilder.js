// ***********************************************************
// * Disables form fields based on user toggle
// ***********************************************************

function swapInputs(open) {

    // different constraints available to the user
    var constraints = new Array("attribute","subclass","loopQuery","bag","empty","bagUpload");
    // field names, different fields will be visible for different constraints
    var maxVariableCount = 7; // there are seven attribute variables

    for (var i = 0; i < constraints.length; i++) {

        // if this constraint exists, it may not
        if(document.getElementById(constraints[i] + 'Submit')) {

            // enable if this is what the user just selected
            if (constraints[i] == open) {
                document.getElementById(constraints[i] + 'Submit').disabled = false;
                document.getElementById(constraints[i] + 'Toggle').src = 'images/disclosed.gif';

                // loop through other fields that may exist
                for (var j = 0; j < maxVariableCount; j++) {
                    if(document.getElementById(constraints[i] + j)) {
                        document.getElementById(constraints[i] + j).disabled = false;
                    }
                }

                // disable everything else
            } else {
                document.getElementById(constraints[i] + 'Submit').disabled = true;
                document.getElementById(constraints[i] + 'Toggle').src = 'images/undisclosed.gif';

                // loop through other fields that may exist
                for (var k = 0; k < maxVariableCount; k++) {
                    if(document.getElementById(constraints[i] + k)) {
                        document.getElementById(constraints[i] + k).disabled = true;
                    }
                }
            }
        }
    }
    // If we've got a loop query, disable the join type selection
    if(open == 'loopQuery') {
        jQuery('#inner').attr("checked", true);
    	//jQuery('#useJoin').attr("disabled", true);
    	jQuery('#outer').attr("disabled", true);
    	jQuery('#inner').attr("disabled", true);
    	jQuery('#joinStyleSubmit').attr("disabled", true);
    } else {
        jQuery('#outer').attr("disabled", false);
        jQuery('#inner').attr("disabled", false);
        jQuery('#joinStyleSubmit').attr("disabled", false);
    }
}



      /***********************************************************
       * Called when user chooses a constraint operator. If the
       * user picks an operator contained in fixedOptionsOps then
       * the input box is hidden and the user can only choose
       **********************************************************/
      function updateConstraintForm(index, attrOpElement, attrOptsElement, attrValElement, fixedOps)
      {
        if (attrOptsElement == null)
          return;

        for (var i=0 ; i<fixedOps[index].length ; i++)
        {
          if (attrOpElement.value == fixedOps[index][i])
          {
            document.getElementById("operandEditSpan" + index).style.display = "none";
            attrValElement.value = attrOptsElement.value; // constrain value
            return;
          }
        }

		if (document.getElementById("operandEditSpan" + index)) {
	        document.getElementById("operandEditSpan" + index).style.display = "";
	    }
      }

      /***********************************************************
       * Init attribute value with selected item and hide input box if
       * required
       **********************************************************/
      function initConstraintForm(index, attrOpElement, attrOptsElement, attrValElement, fixedOps)
      {
        if (attrOptsElement == null)
          return;

        var init = attrValElement.value;
        attrValElement.value = (init != '') ? init : attrOptsElement.value;

        updateConstraintForm(index, attrOpElement, attrOptsElement, attrValElement, fixedOps);
      }

      //Copied and modified from template.jsp because there is no clever way to reuse it
      function filterByTag(tag) {
          if (tag != "") {
              if (origSelectValues == null) {
           	    saveOriginalSelect();
              }
              var callBack = function(filteredList) {
                  setSelectElement('bag2', '', filteredList);
              }
              AjaxServices.filterByTag('bag', tag, callBack);          
          } else {
       	   restoreOriginalSelect();
          }
      }

      var origSelectValues = null;
      
      function saveOriginalSelect() {
          origSelectValues = getSelectValues('bag2');    
      }

      function restoreOriginalSelect() {
   	    if (origSelectValues != null) {
   		    setSelectElement('bag2', '', origSelectValues);
   		}	    
      }