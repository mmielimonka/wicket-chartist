package org.wicketchartist.chart;

import org.apache.wicket.markup.html.IHeaderResponse;
import org.wicketchartist.chart.data.ChartData;
import org.wicketchartist.chart.data.ChartOptions;
import org.wicketchartist.chart.data.ChartType;
import org.wicketchartist.chart.data.PieChartData;
import org.wicketchartist.chart.data.PieChartOptions;
import org.wicketchartist.exceptions.WrongChartDataException;
import org.wicketchartist.exceptions.WrongChartOptionsException;

/**
 * The Class ChartistPieChart.
 * 
 * @author mielimonka
 */
public class ChartistPieChart extends ChartistChart {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new chartist pie chart.
     *
     * @param id
     *            the id
     */
    public ChartistPieChart(String id) {
        super(id);
        setChartType(ChartType.PIE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.wicket.Component#renderHead(org.apache.wicket.markup.html.IHeaderResponse)
     */
    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);

        String chartData = getChartDataJson();

        if (options != null) {
            response.renderOnDomReadyJavaScript("drawPieChart(" + getMarkupId() + ", " + chartData + ", "
                    + getChartOptionsJson() + ")");
        } else {
            response.renderOnDomReadyJavaScript("drawPieChart(" + getMarkupId() + ", " + chartData + ")");
        }

        if (tooltipEnabled) {
            response.renderOnDomReadyJavaScript("enablePieTooltip('" + getMarkupId() + "')");
        }

        if (showLegend == true && legendId != null) {
            response.renderOnDomReadyJavaScript("showPieLegend(" + legendId + "," + chartData + ")");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.wicketchartist.chart.ChartistChart#setChartData(org.wicketchartist.chart.data.ChartData)
     */
    @Override
    public void setChartData(ChartData chartData) throws WrongChartDataException {
        if (chartData instanceof PieChartData) {
            this.chartData = chartData;
        } else {
            throw new WrongChartDataException("Invalid type of chart data given.");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.wicketchartist.chart.ChartistChart#setOptions(org.wicketchartist.chart.data.ChartOptions)
     */
    @Override
    public void setOptions(ChartOptions options) throws WrongChartOptionsException {
        if (options instanceof PieChartOptions) {
            this.options = options;
        } else {
            throw new WrongChartOptionsException("Invalid type of chart options given");
        }
    }
}
