package case2.solution;

public class ReportService {
	
	private final ReportExporter exporter;

    public ReportService(ReportExporter exporter) {
        this.exporter = exporter;
    }

    public void generateReport(String data) {
        exporter.export(data);
    }
}
