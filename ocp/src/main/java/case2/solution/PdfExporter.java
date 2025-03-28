package case2.solution;

public class PdfExporter implements ReportExporter {

	@Override
    public void export(String data) {
        System.out.println("Exportando relatório em PDF: " + data);
    }

}
