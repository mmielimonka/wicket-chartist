function drawLineChart(id, data, options)
{
	var chart = new Chartist.Line(id,data, options);
	charts.push(chart);
}

function addSVGPathAnimation(id)
{
	var chart = charts[id];
	chart.on('draw', function(data) {
		  if(data.type === 'line' || data.type === 'area') {
		    data.element.animate({
		      d: {
		        begin: 2000 * data.index,
		        dur: 2000,
		        from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
		        to: data.path.clone().stringify(),
		        easing: Chartist.Svg.Easing.easeOutQuint
		      }
		    });
		  }
		});
}

function drawBarChart(id, data, options)
{
	var chart = new Chartist.Bar(id,data, options);
	charts.push(chart);
}

function drawPieChart(id, data, options)
{
	var chart = new Chartist.Pie(id,data, options);
	charts.push(chart);
}

function showLineLegend(id, data)
{
	var legend = $(id);

	$.each(data.series, function(i, val) {
	    var listItem = $('<li />')
	        .addClass('ct-series-' + i)
	        .html('<strong>' + val.name + '</strong>')
	        .appendTo(legend);
	});
}

function showPieLegend(id, data)
{
	var legend = $(id);

	$.each(data.labels, function(i, val) {
	    var listItem = $('<li />')
	        .addClass('ct-series-' + i)
	        .html('<strong>' + val + '</strong>: ' + data.series[i])
	        .appendTo(legend);
	});
}

function update(id , data)
{
	var chart = charts[id];	
	chart.update(data);
}