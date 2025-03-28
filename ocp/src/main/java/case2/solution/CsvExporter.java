package case2.solution;

public class CsvExporter implements ReportExporter {

	@Override
    public void export(String data) {
        System.out.println("Exportando relatório em CSV: " + data);
    }

}
