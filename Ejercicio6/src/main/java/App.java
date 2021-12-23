import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    static String fichero;
    static String escribe="";
           ArrayList<String> etiquetas;
            {writePDF(fichero,etiquetas);}

    public static void writePDF(String fichero,ArrayList<String> etiquetas) {

        Document document = new Document();

        try {
            String path = new File(".").getCanonicalPath();
            String FILE_NAME = path +"/"+fichero + ".pdf";

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            document.open();

            Paragraph Nombre = new Paragraph();
            Nombre.add("Nombre del candidato: " + fichero);
            Nombre.setAlignment(Element.ALIGN_LEFT);
            document.add(Nombre);
            document.add(Chunk.NEWLINE);

            Font f = new Font();
            f.setFamily(Font.FontFamily.COURIER.name());
            f.setStyle(Font.UNDERLINE);
            f.setSize(24);
            Paragraph curriculum = new Paragraph();
            curriculum.setFont(f);
            curriculum.add("Curriculum Vitae");
            document.add(curriculum);
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);


           Paragraph parrafoEtiquetas = new Paragraph();

           for (String etiqueta : etiquetas){
               parrafoEtiquetas.add(etiqueta);
               parrafoEtiquetas.add(Chunk.NEWLINE);
           }
           parrafoEtiquetas.add(Chunk.NEWLINE);
           document.add(parrafoEtiquetas);

            String FOTO_NAME = path +"/"+fichero + ".jpg";
            Image foto = Image.getInstance(FOTO_NAME);
            foto.scaleAbsolute(120f,150f);

            document.add(foto);
            document.close();

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}