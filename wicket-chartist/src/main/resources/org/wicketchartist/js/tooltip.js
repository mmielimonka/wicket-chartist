function enableTooltip(id)
{	
    var $chart = $('#'+id);
	
	var $toolTip = $chart
	    .append('<div class="charttooltip"></div>')
	    .find('.charttooltip').hide();
	
	$chart.on('mouseenter', '.ct-point', function() {
	    var $point = $(this),
	        value = $point.attr('ct:value'),
	        seriesName = $point.parent().attr('ct:series-name');
	    var text = '';
	    if(typeof(seriesName) != "undefined")
	    {
	    	text += seriesName + '<br>';
	    }
	    text += value;
	    $toolTip.html(text).show();
	});
	
	$chart.on('mouseleave', '.ct-point', function() {
	    $toolTip.hide();
	});
	
	$chart.on('mousemove', function(event) {
	    $toolTip.css({
	        left: (event.offsetX || event.originalEvent.layerX) - $toolTip.width() / 2 - 10,
	        top: (event.offsetY || event.originalEvent.layerY) - $toolTip.height() - 40
	    });
	});
}

function enablePieTooltip(id)
{	
    var $chart = $('#'+id);
	
	var $toolTip = $chart
	    .append('<div class="charttooltip"></div>')
	    .find('.charttooltip').hide();
	
	$chart.on('mouseenter', '.ct-slice', function() {
	    var $point = $(this),
	        value = $point.attr('ct:value');
	    
	    $toolTip.html(value).show();
	});
	
	$chart.on('mouseleave', '.ct-slice', function() {
	    $toolTip.hide();
	});
	
	$chart.on('mousemove', function(event) {
	    $toolTip.css({
	        left: (event.offsetX || event.originalEvent.layerX) - $toolTip.width() / 2 - 10,
	        top: (event.offsetY || event.originalEvent.layerY) - $toolTip.height() - 40
	    });
	});
}