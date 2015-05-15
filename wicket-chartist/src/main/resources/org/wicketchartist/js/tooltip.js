/*
 *   Copyright 2015 Wicked Chartist
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

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