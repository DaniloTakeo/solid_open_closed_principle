package case2.solution;

public class JsonExporter implements ReportExporter {

	@Override
    public void export(String data) {
        System.out.println("Exportando relatório em JSON: " + data);
    }
}
