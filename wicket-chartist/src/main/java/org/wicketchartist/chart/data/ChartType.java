package org.wicketchartist.chart.data;

public enum ChartType {
    LINE("Line"), BAR("Bar"), PIE("PIE");

    private final String chartType;

    private ChartType(final String chartType) {
        this.chartType = chartType;
    }

    public String getDisplayName() {
        return chartType;
    }

}
