import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
 
public class OnlineStore {
  private static void createXMLStreamBad(final BufferedOutputStream outStream,
      final String quantity) throws IOException {
    String xmlString = "<item>\n<description>Widget</description>\n"
        + "<price>500</price>\n" + "<quantity>" + quantity
        + "</quantity></item>";
    outStream.write(xmlString.getBytes());
    outStream.flush();
  }
}

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
 
public class OnlineStore {
  private static void createXMLStream(final BufferedOutputStream outStream,
      final String quantity) throws IOException, NumberFormatException {
    // Write XML string only if quantity is an unsigned integer (count).
    int count = Integer.parseUnsignedInt(quantity);
    String xmlString = "<item>\n<description>Widget</description>\n"
        + "<price>500</price>\n" + "<quantity>" + count + "</quantity></item>";
    outStream.write(xmlString.getBytes());
    outStream.flush();
  }
}
