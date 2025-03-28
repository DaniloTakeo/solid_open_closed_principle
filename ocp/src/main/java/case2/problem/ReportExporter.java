package case2.problem;

public class ReportExporter {
    public void export(String format, String data) {
        if (format.equals("PDF")) {
            System.out.println("Exportando relatório em PDF: " + data);
        } else if (format.equals("CSV")) {
            System.out.println("Exportando relatório em CSV: " + data);
        } else if (format.equals("JSON")) {
            System.out.println("Exportando relatório em JSON: " + data);
        } else {
            throw new IllegalArgumentException("Formato não suportado");
        }
    }
}